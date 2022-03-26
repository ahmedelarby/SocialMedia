package com.test.socialmedia.Ui.Main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.test.socialmedia.R;
import com.test.socialmedia.databinding.ItemsliderfaceBinding;
import com.test.socialmedia.databinding.ItemviewpagerpostBinding;


import java.util.ArrayList;
import java.util.List;

public class AdapterViewPagerPost extends RecyclerView.Adapter<AdapterViewPagerPost.ViewHolder> {
   List<String> fragmentList = new ArrayList<>();

    public AdapterViewPagerPost(List<String>list) {
        this.fragmentList=list;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        ItemviewpagerpostBinding bining1 = DataBindingUtil.inflate(inflater, R.layout.itemviewpagerpost,parent,false);

        return new ViewHolder(bining1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Picasso.get().load(fragmentList.get(position)).into(holder.recyclerChooseBinding.ImageSlider);
    }

    @Override
    public int getItemCount() {
        return fragmentList.size();

    }



     class ViewHolder extends RecyclerView.ViewHolder{
        private ItemviewpagerpostBinding recyclerChooseBinding;


        public ViewHolder(ItemviewpagerpostBinding binding) {
            super(binding.getRoot());
            this.recyclerChooseBinding=binding;
        }
   }
}
