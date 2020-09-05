package com.copypasteit.monaco.main.data.remote;


import com.copypasteit.monaco.main.model.Post;
import com.copypasteit.monaco.main.model.Slider;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface APIService {
    @GET("/api/monako/post")
    Call<List<Post>> getpost();

    @GET("/api/monako/post")
    Call<List<Post>> getUsers(@Query("name") String keyword);

    @GET("/api/monako/slider")
    Call<List<Slider>> getSlider();
}
