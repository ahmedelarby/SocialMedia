package com.test.socialmedia.Datanetwork;


import com.test.socialmedia.Model.data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterFaceAPI {

    @GET("api/v0.1/countries")
    Call<data> getCountries();
}
