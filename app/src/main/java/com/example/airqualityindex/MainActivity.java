package com.example.airqualityindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.airqualityindex.Models.JSONPlaceHolder;
import com.example.airqualityindex.Models.Post;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    String url = "http://api.airvisual.com/v2/cities?state=Uttar Pradesh&country=india&key=ca244d8a-ae1c-459d-8804-5172ce6d9000";
    private JSONObject respons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RequestQueue requestQueue;
        requestQueue = Volley.newRequestQueue(this);
//        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, "https://jsonplaceholder.typicode.com/todos/1", null, new Response.Listener<JSONArray>() {
//            @Override
//            public void onResponse(JSONArray response) {
//
//                Log.d("myapp", "The Response is" + response.getString("title"));
//            }
//
//        },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Log.d("myapp", "Something went wrong");
//
//                    }
//                });

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, "https://api.weatherbit.io/v2.0/current/airquality?city=kanpur&country=india&key=b24bd2e5be42466d870896324c5bd82c", null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            Log.d("myapp", "The Response is" + response.getString("aqi"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("myapp", "Something went wrong");
                    }
                });

        requestQueue.add(jsonObjectRequest);


//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://api.weatherbit.io/v2.0/current/airquality/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        JSONPlaceHolder jsonPlaceHolder = retrofit.create(JSONPlaceHolder.class);
//        Call<List<Post>> call = jsonPlaceHolder.getpost();
//        call.enqueue(new Callback<List<Post>>() {
//            @Override
//            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
//
//                List<Post> postList = response.body();
//
//                Toast.makeText(MainActivity.this, "Call", Toast.LENGTH_SHORT).show();
//
//                Toast.makeText(MainActivity.this, postList.get(0).getAqi(), Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onFailure(Call<List<Post>> call, Throwable t) {
//
//                Toast.makeText(MainActivity.this, String.valueOf(t.getStackTrace()), Toast.LENGTH_SHORT).show();
//
//            }
//        });


//        try {
//            respons =getJSONObjectFromURL("https://api.weatherbit.io/v2.0/current/airquality?city=kanpur&country=india&key=b24bd2e5be42466d870896324c5bd82c");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }


    }

//    public static JSONObject getJSONObjectFromURL(String urlString) throws IOException, JSONException {
//
//        HttpURLConnection urlConnection = null;
//
//        URL url = new URL(urlString);
//
//        urlConnection = (HttpURLConnection) url.openConnection();
//
//        urlConnection.setRequestMethod("GET");
//        urlConnection.setReadTimeout(10000 /* milliseconds */);
//        urlConnection.setConnectTimeout(15000 /* milliseconds */);
//
//        urlConnection.setDoOutput(true);
//
//        urlConnection.connect();
//
//        BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
//
//        char[] buffer = new char[1024];
//
//        String jsonString = new String();
//
//        StringBuilder sb = new StringBuilder();
//        String line;
//        while ((line = br.readLine()) != null) {
//            sb.append(line+"\n");
//        }
//        br.close();
//
//        jsonString = sb.toString();
//
//        System.out.println("JSON: " + jsonString);
//        urlConnection.disconnect();
//
//        return new JSONObject(jsonString);
//    }
//
//

}