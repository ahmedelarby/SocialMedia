package com.test.socialmedia;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.test.socialmedia.Ui.Main.AdapterChoosePost;
import com.test.socialmedia.Ui.Main.AdapterEditTextPost;
import com.test.socialmedia.databinding.FragmentCreatePostBinding;

import java.util.ArrayList;


public class CreatePost extends BottomSheetDialogFragment {
FragmentCreatePostBinding binding;
AdapterEditTextPost adapterEditTextPost;
AdapterChoosePost adapterChoosePost;
ArrayList<Integer> edittext= new ArrayList<>();
    ArrayList<Integer> itemchoosepost= new ArrayList<>();
    boolean CaseShow=true;

    public CreatePost() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_create_post,container,false);
        edittext.add(R.drawable.iconbackgraund);
        edittext.add(R.drawable.iconbold);
        edittext.add(R.drawable.icontextcolor);
        edittext.add(R.drawable.iconsizebigfont);
        edittext.add(R.drawable.iconsizesmollfont);


        adapterEditTextPost = new AdapterEditTextPost();

        binding.recedit.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.recedit.setAdapter(adapterEditTextPost);

        adapterEditTextPost.getList(edittext);

        binding.recedit.setVisibility(View.GONE);

//
        itemchoosepost.add(R.drawable.iconimage);
        itemchoosepost.add(R.drawable.iconmusic);
        itemchoosepost.add(R.drawable.iconvadio);
        itemchoosepost.add(R.drawable.iconlocation);
        adapterChoosePost = new AdapterChoosePost();
        binding.RecyclerChoosepostone.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.RecyclerChoosepostone.setAdapter(adapterChoosePost);

        adapterChoosePost.getList(itemchoosepost);



        binding.edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CaseShow==true){
                    binding.recedit.setVisibility(View.VISIBLE);
                    Animation a1= AnimationUtils.loadAnimation(getActivity(),R.anim.pull_in_left);

                    binding.recedit.startAnimation(a1);
                    binding.edit.setBackground(getResources().getDrawable(R.drawable.iconclosewindow));
                    binding.edit.setText("");
                    CaseShow=false;
                    return;
                }else {

                    binding.recedit.setVisibility(View.GONE);

                    binding.edit.setBackground(getResources().getDrawable(R.drawable.iconedit));
                    binding.edit.setText("Aa");
                    CaseShow= true;
                }

            }
        });




        return binding.getRoot();
    }
}