package com.test.socialmedia;

import android.app.Dialog;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.socialmedia.Model.DataPost;
import com.test.socialmedia.Ui.Main.AdapterRecyclerPost;
import com.test.socialmedia.Ui.MoveViewModel;
import com.test.socialmedia.databinding.FragmentPostsBinding;

import java.util.ArrayList;


public class Posts extends Fragment {
    AdapterRecyclerPost post;
    FragmentPostsBinding binding;
    Dialog dialog1;
MoveViewModel viewModel;
    public Posts() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_posts,container,false);
        viewModel= ViewModelProviders.of(this).get(MoveViewModel.class);
        viewModel.getPosts();


        post= new AdapterRecyclerPost();
        binding.rec.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        binding.rec.setAdapter(post);
        binding.post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Navigation.findNavController(binding.getRoot()).navigate(R.id.action_homeAccount_to_createPost2);
//        CreatePost createPost = new CreatePost();
//
//                createPost.show(getChildFragmentManager(),"ahmed");


//                AlertDialog.Builder builder =new AlertDialog.Builder(getContext());
//
//                View view = LayoutInflater.from(getContext()).inflate(R.layout.item_create_post,null);
//                builder.setTitle("Create Post");
////                ProgressBar bar = view.findViewById(R.id.progress_photo);
////                ImageView imageView=view.findViewById(R.id.fillphoto);
////                imageView.setOnClickListener(new View.OnClickListener() {
////                    @Override
////                    public void onClick(View v) {
////
////
////
////                    }
////                });
//
//
//
//
//
//                builder.setView(view);
//
//                dialog1 = builder.create();
//
//                dialog1.show();



            }
        });
        viewModel.mutableLiveDataPosts.observe(getViewLifecycleOwner(), new Observer<ArrayList<DataPost>>() {
            @Override
            public void onChanged(ArrayList<DataPost> dataPosts) {
                if (dataPosts.isEmpty()){
                    binding.emptyView.setVisibility(View.VISIBLE);
                }else {
                    post.setList(dataPosts);

                    binding.emptyView.setVisibility(View.GONE);

                    post.notifyDataSetChanged();
                }
            }
        });


        return binding.getRoot();
    }
}