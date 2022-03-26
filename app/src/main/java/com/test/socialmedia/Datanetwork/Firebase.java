package com.test.socialmedia.Datanetwork;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.test.socialmedia.Model.DataGender;
import com.test.socialmedia.Model.DataPost;
import com.test.socialmedia.Model.DataSliderFace;

import java.util.ArrayList;

public class Firebase {
    FirebaseFirestore firestore=FirebaseFirestore.getInstance();
    ArrayList<DataSliderFace> listSlider= new ArrayList<>();
    ArrayList<String> gender= new ArrayList<>();
    ArrayList<DataPost> ListPost= new ArrayList<>();




    public ArrayList<DataSliderFace> getDataSlider(MutableLiveData<ArrayList<DataSliderFace>> mutableLiveData){
        listSlider.clear();
        firestore.collection("SliderFace").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                for (QueryDocumentSnapshot snapshot:queryDocumentSnapshots){
                    if (snapshot.exists()) {
                        DataSliderFace dataShop = snapshot.toObject(DataSliderFace.class);
                        listSlider.add(dataShop);
                    }

                }
                mutableLiveData.postValue(listSlider);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

        return listSlider;
    }

    public ArrayList<String> getGender(MutableLiveData<ArrayList<String>> mutableLiveData){
        gender.clear();
        firestore.collection("DataGender").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                for (QueryDocumentSnapshot snapshot:queryDocumentSnapshots){
                    if (snapshot.exists()) {
                        DataGender dataGender = snapshot.toObject(DataGender.class);
                        gender.add(dataGender.getSelected());
                        gender.add(dataGender.getMale());
                        gender.add(dataGender.getFemale());
                    }

                }
                mutableLiveData.postValue(gender);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

        return gender;
    }





    public ArrayList<DataPost> getPosts(MutableLiveData<ArrayList<DataPost>> mutableLiveData){
        ListPost.clear();
        firestore.collection("Posts").get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
            @Override
            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                for (QueryDocumentSnapshot snapshot:queryDocumentSnapshots){
                    if (snapshot.exists()) {
                        DataPost Post = snapshot.toObject(DataPost.class);
                        ListPost.add(Post);
                    }

                }
                mutableLiveData.postValue(ListPost);

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

        return ListPost;
    }
}
