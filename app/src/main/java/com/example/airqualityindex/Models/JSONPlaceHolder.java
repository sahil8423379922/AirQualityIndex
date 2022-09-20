package com.example.airqualityindex.Models;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceHolder {

    @GET("posts")
    Call<List<Post>> getpost();
}
