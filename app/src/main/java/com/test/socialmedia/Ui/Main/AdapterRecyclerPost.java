package com.test.socialmedia.Ui.Main;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;


import com.squareup.picasso.Picasso;
import com.test.socialmedia.Model.DataPost;
import com.test.socialmedia.R;
import com.test.socialmedia.databinding.ItemRecyclerPostBinding;

import java.util.ArrayList;
import java.util.List;

public class AdapterRecyclerPost extends RecyclerView.Adapter<AdapterRecyclerPost.ViewHolder> {

    List<DataPost> list = new ArrayList<>();
//    OnClickRecyclerProducts onClickRecycler;





    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        ItemRecyclerPostBinding bining1 = DataBindingUtil.inflate(inflater, R.layout.item_recycler_post,parent,false);

        return new ViewHolder(bining1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.recyclerBinding.nameperson.setText(list.get(position).getNameperson());
        holder.recyclerBinding.time.setText(list.get(position).getTime());
        Picasso.get().load(list.get(position).getImageprofile()).into(holder.recyclerBinding.imageprofile);
        String casepost=list.get(position).getPost();
        if (casepost.equals("no")){
            holder.recyclerBinding.textpost.setVisibility(View.GONE);
        }
        String casepostimage=list.get(position).getListimage().get(0);
        if (casepostimage.equals("no")){
            holder.recyclerBinding.imagepost.setVisibility(View.GONE);
        }


            holder.recyclerBinding.textpost.setText(list.get(position).getPost());




        holder.recyclerBinding.imagepost.setAdapter(new AdapterViewPagerPost(list.get(position).getListimage()));



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(ArrayList<DataPost> list) {
        this.list = list;
        notifyDataSetChanged();
    }
    protected class ViewHolder extends RecyclerView.ViewHolder{
        private ItemRecyclerPostBinding recyclerBinding;


        public ViewHolder(ItemRecyclerPostBinding binding) {
            super(binding.getRoot());
            this.recyclerBinding=binding;
        }
    }
}
