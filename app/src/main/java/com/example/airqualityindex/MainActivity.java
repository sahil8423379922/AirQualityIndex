package com.example.airqualityindex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    String url = "http://api.airvisual.com/v2/cities?state=Uttar Pradesh&country=india&key=ca244d8a-ae1c-459d-8804-5172ce6d9000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://jsonplaceholder.typicode.com/")
//                .addConverterFactory(Gson)



    }



}