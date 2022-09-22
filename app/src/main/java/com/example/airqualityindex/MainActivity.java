package com.example.airqualityindex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private JSONObject respons;
    private String aqi;
    private String pm10;
    private String co;
    private String o3;
    private String so2;
    private String no2;
    private String pm25;

    private TextView txtqui;
    private TextView txto3;
    private TextView txtso2;
    private TextView txtpm25;
    private TextView txtpm10;
    private TextView txtco;
    private TextView txtco2;
    private TextView txtno2;
    private SeekBar seekBar;
    private ArrayList<String> cityname;
    AutoCompleteTextView autoCompleteTextView;
    private ImageView condition;
    float a,b,c,d,e,f;

    // variable for our bar chart
    BarChart barChart;
    // variable for our bar data.
    BarData barData;
    // variable for our bar data set.
    BarDataSet barDataSet;
    // array list for storing entries.
    ArrayList barEntriesArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cityname = new ArrayList<>();
        a=10;
        b=30;
        c=90;
        d=70;
        e=50;
        f=65;

//        getBarEntries(a,b,c,d,e,f);
//        setbarchart();






        condition = findViewById(R.id.imagecondition);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.dropdown_item, cityname);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(adapter);
        obj_list();
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, cityname.get(i), Toast.LENGTH_SHORT).show();
                callApi(cityname.get(i));

            }
        });


        seekBar = findViewById(R.id.seekbar);
        seekBar.setMax(500);
        txtqui = findViewById(R.id.aqi);
        txto3 = findViewById(R.id.o3);
        txtso2 = findViewById(R.id.so2);
        txtpm25 = findViewById(R.id.pm25);
        txtpm10 = findViewById(R.id.pm10);
        txtco = findViewById(R.id.co);
        txtno2 = findViewById(R.id.no2);


        txto3.setText("0");
        txtso2.setText("0");
        txtpm25.setText("0");
        txtpm10.setText("0");
        txtco.setText("0");
        txtno2.setText("0");


    }

    public void callApi(String city) {
        StringRequest request = new StringRequest("https://api.weatherbit.io/v2.0/current/airquality?city=" + city + "&country=india&key=b24bd2e5be42466d870896324c5bd82c", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                //intialise variable
                try {
                    JSONObject json = new JSONObject(response);
                    JSONArray json_LL = json.getJSONArray("data");
                    for (int i = 0; i < json_LL.length(); i++) {
                        JSONObject jsonObject = json_LL.getJSONObject(i);
                        aqi = jsonObject.getString("aqi");
                        pm10 = jsonObject.getString("pm10");
                        co = jsonObject.getString("co");
                        o3 = jsonObject.getString("o3");
                        so2 = jsonObject.getString("so2");
                        no2 = jsonObject.getString("no2");
                        pm25 = jsonObject.getString("pm25");

                        Double numo3 = Double.parseDouble(o3);
                        Log.d("myapps",String.valueOf(numo3));


                        setText(aqi, pm10, co, o3, so2, no2, pm25, no2);
                        SetProgress(Integer.parseInt(aqi));
                        setImageconditon(Integer.parseInt(aqi));






                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {


                    }
                });


        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);

        //Log.d("myapp","Integer value of aui"+Integer.parseInt(aqi));
    }

    private void setImageconditon(int parseInt) {
        if(parseInt<=100)
        {
            condition.setImageDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.good));
        }
        else if(parseInt<=200)
        {
            condition.setImageDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.moderate));
        }
//        getBarEntries(0,0,0,0,0,0);
//        setbarchart();

    }

    private void SetProgress(int parseInt) {
        ValueAnimator animator = ValueAnimator.ofInt(0, parseInt);
        animator.setDuration(5000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator animation) {
//                txtqui.setText(animation.getAnimatedValue().toString());
                seekBar.setProgress((Integer) animation.getAnimatedValue());


            }
        });
        animator.start();

    }

    public void setText(String aqi, String pm10, String co, String o3, String so2, String no2, String pm25, String s) {


        ValueAnimator animator = ValueAnimator.ofInt(0, Integer.parseInt(aqi));
        animator.setDuration(5000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator animation) {
                txtqui.setText(animation.getAnimatedValue().toString());


            }
        });
        animator.start();

        txto3.setText(o3);
        txtso2.setText(so2);
        txtpm25.setText(pm25);
        txtpm10.setText(pm10);
        txtco.setText(co);
        txtno2.setText(no2);


    }


    public String getJson() {
        String json = null;
        try {
            // Opening cities.json file
            InputStream is = getAssets().open("cities.json");
            // is there any content in the file
            int size = is.available();
            byte[] buffer = new byte[size];
            // read values in the byte array
            is.read(buffer);
            // close the stream --- very important
            is.close();
            // convert byte to string
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return json;
        }
        return json;
    }


    void obj_list() {
        // Exceptions are returned by JSONObject when the object cannot be created
        try {
            // Convert the string returned to a JSON object
            JSONObject jsonObject = new JSONObject(getJson());
            // Get Json array
            JSONArray array = jsonObject.getJSONArray("array");
            // Navigate through an array item one by one
            for (int i = 0; i < array.length(); i++) {
                // select the particular JSON data
                JSONObject object = array.getJSONObject(i);
                String city = object.getString("name");
                String state = object.getString("state");
                // add to the lists in the specified format
                Log.d("myapp", "City =" + city + " state = " + state);
                cityname.add(city);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }



    private void getBarEntries(float a, float b, float c, float d, float e, float f) {
        // creating a new array list
        barEntriesArrayList = new ArrayList<>();

        // adding new entry to our array list with bar
        // entry and passing x and y axis value to it.
        barEntriesArrayList.add(new BarEntry(1f,a));
        barEntriesArrayList.add(new BarEntry(2f,b));
        barEntriesArrayList.add(new BarEntry(3f,c));
        barEntriesArrayList.add(new BarEntry(4f,d));
        barEntriesArrayList.add(new BarEntry(5f,e));
        barEntriesArrayList.add(new BarEntry(6f,f));




    }

    /*public void setbarchart()
    {
        barChart = findViewById(R.id.idBarChart);

        // creating a new bar data set.
        barDataSet = new BarDataSet(barEntriesArrayList, "AQI Data");

        // creating a new bar data and
        // passing our bar data set.
        barData = new BarData(barDataSet);

        // below line is to set data
        // to our bar chart.
        barChart.setData(barData);

        // adding color to our bar data set.
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);

        // setting text color.
        barDataSet.setValueTextColor(Color.WHITE);


        // setting text size
        barDataSet.setValueTextSize(16f);
        barChart.getDescription().setEnabled(false);
        YAxis yAxis = barChart.getAxisLeft();
        yAxis.setTextColor(Color.WHITE);

        XAxis xAxis = barChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.TOP);
        xAxis.setTextColor(Color.WHITE);
    }*/
}



