package com.test.socialmedia.Ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.test.socialmedia.Datanetwork.Firebase;
import com.test.socialmedia.Datanetwork.RetrofitAPI;
import com.test.socialmedia.Model.DataPost;
import com.test.socialmedia.Model.DataSliderFace;
import com.test.socialmedia.Model.data;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoveViewModel extends ViewModel {
    public MutableLiveData<ArrayList<DataSliderFace>> mutableLiveDataSlider = new MutableLiveData<>();
    public MutableLiveData<ArrayList<String>> mutableLiveDataGender = new MutableLiveData<>();
    public MutableLiveData<data> mutableLiveDatacountries= new MutableLiveData<>();
    public MutableLiveData<ArrayList<DataPost>> mutableLiveDataPosts = new MutableLiveData<>();

    Firebase firebase = new Firebase();

    public void getMyDataSlider(){
        firebase.getDataSlider(mutableLiveDataSlider);
    }
    public void getMyDatagender(){
        firebase.getGender(mutableLiveDataGender);
    }
    public void getMyDatacountries(){
       RetrofitAPI.getInstans().getPosts().enqueue(new Callback<data>() {
           @Override
           public void onResponse(Call<data> call, Response<data> response) {
               if (response.isSuccessful()){
               mutableLiveDatacountries.setValue(response.body());
           }}

           @Override
           public void onFailure(Call<data> call, Throwable t) {

           }
       });
    }
    public  void getPosts(){
        firebase.getPosts(mutableLiveDataPosts);
    }

}
