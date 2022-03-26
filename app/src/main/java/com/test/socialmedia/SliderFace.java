package com.test.socialmedia;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.test.socialmedia.Model.DataSliderFace;
import com.test.socialmedia.Ui.MoveViewModel;
import com.test.socialmedia.databinding.FragmentSliderFaceBinding;

import java.util.ArrayList;


public class SliderFace extends Fragment {
FragmentSliderFaceBinding binding;
MoveViewModel  viewModel;
AdapterSliderFace  adapterSliderFace;
    int positionitem;
    public SliderFace() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_slider_face,container,false);
        viewModel = ViewModelProviders.of(this).get(MoveViewModel.class);
        viewModel.getMyDataSlider();
        adapterSliderFace = new AdapterSliderFace();
        binding.ViewPager.setAdapter(adapterSliderFace);
        binding.Skip.setOnClickListener(v -> {
            NavOptions builder = new NavOptions.Builder().setPopUpTo(R.id.sliderFace, true).build();

            Navigation.findNavController(binding.getRoot()).navigate(R.id.action_sliderFace_to_signUp,savedInstanceState,builder);
        });
        binding.next.setOnClickListener(v -> {

            positionitem=binding.ViewPager.getCurrentItem();
            positionitem++;
            if (positionitem!=adapterSliderFace.getItemCount()){
                binding.ViewPager.setCurrentItem(positionitem,true);
                return;
            }
            if (binding.next.getText().equals("Next")){
                NavOptions builder = new NavOptions.Builder().setPopUpTo(R.id.sliderFace, true).build();

                Navigation.findNavController(binding.getRoot()).navigate(R.id.action_sliderFace_to_signUp,savedInstanceState,builder);
            }


        });


        viewModel.mutableLiveDataSlider.observe(getViewLifecycleOwner(), new Observer<ArrayList<DataSliderFace>>() {
            @Override
            public void onChanged(ArrayList<DataSliderFace> dataSliderFaces) {
                adapterSliderFace.setFragmentList(dataSliderFaces);
                adapterSliderFace.notifyDataSetChanged();



            }
        });



        return binding.getRoot();



    }
}