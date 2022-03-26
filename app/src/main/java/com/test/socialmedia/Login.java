package com.test.socialmedia;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.socialmedia.databinding.FragmentLoginBinding;

public class Login extends Fragment {
FragmentLoginBinding binding;


    public Login() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       binding= DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false);
       binding.login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Navigation.findNavController(binding.getRoot()).navigate(R.id.action_login_to_home2);
           }
       });


       return binding.getRoot();
    }
}