package com.example.airqualityindex.Models;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceHolder {

    @GET("?city=kanpur&country=india&key=b24bd2e5be42466d870896324c5bd82c")
    Call<List<Post>> getpost();
}
