package com.test.socialmedia;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


import com.test.socialmedia.Model.data;
import com.test.socialmedia.Ui.MoveViewModel;
import com.test.socialmedia.databinding.FragmentSignUpBinding;

import java.util.ArrayList;

public class SignUp extends Fragment {
FragmentSignUpBinding binding;
MoveViewModel viewModel;
ArrayList<String> country = new ArrayList<>();
ArrayList<String> citys = new ArrayList<>();
String getcity;
String getcountry;
String getgender ;
    public SignUp() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    binding= DataBindingUtil.inflate(inflater,R.layout.fragment_sign_up,container,false);
    viewModel = ViewModelProviders.of(this).get(MoveViewModel.class);
    viewModel.getMyDatagender();
    viewModel.getMyDatacountries();
    binding.imageView.startAnimation(AnimationUtils.loadAnimation(getContext(),R.anim.dwon));
viewModel.mutableLiveDataGender.observe(getViewLifecycleOwner(), new Observer<ArrayList<String>>() {
        @Override
        public void onChanged(ArrayList<String> strings) {
            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, strings);
              binding.gender.setAdapter(adapter);
        }
    });
viewModel.mutableLiveDatacountries.observe(getViewLifecycleOwner(), new Observer<data>() {
    @Override
    public void onChanged(data data) {
        for ( int i=0;i<data.getData().size();i++){
            country.add(data.getData().get(i).getCountry());


        }
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, country);
        binding.cuntrey.setAdapter(adapter);

    }
});
binding.gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        getgender = binding.gender.getSelectedItem().toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});
binding.cuntrey.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        getcountry=binding.cuntrey.getSelectedItem().toString();
         getcitys(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});
binding.citys.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
          getcity= binding.citys.getSelectedItem().toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});
binding.signup.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_signUp_to_login);
    }
});

    return binding.getRoot();
    }
    private void  getcitys(int posation){

        viewModel.mutableLiveDatacountries.observe(getViewLifecycleOwner(), new Observer<data>() {
            @Override
            public void onChanged(data data) {
                citys.clear();
                for (int i=0; i<data.getData().get(posation).getCities().size();i++){

                    citys.add(data.getData().get(posation).getCities().get(i));

                }
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item,citys );
                binding.citys.setAdapter(adapter);
            }
        });
    }
}