package com.test.socialmedia.Datanetwork;

import com.test.socialmedia.Model.data;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitAPI {
    InterFaceAPI interFaceAPI;
    private static final String BASE_URL="https://countriesnow.space/";
    public static RetrofitAPI instans;


    public RetrofitAPI() {
        Retrofit retrofit=new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        interFaceAPI=retrofit.create(InterFaceAPI.class);

    }




    public static RetrofitAPI getInstans() {
        if (null==instans){
            instans=new RetrofitAPI();
        }
        return instans;
    }



    public Call<data> getPosts(){

        return interFaceAPI.getCountries();
    }
}


