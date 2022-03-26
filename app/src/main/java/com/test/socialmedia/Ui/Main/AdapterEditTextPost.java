package com.test.socialmedia.Ui.Main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.test.socialmedia.R;
import com.test.socialmedia.databinding.ItemChoosepostBinding;
import com.test.socialmedia.databinding.ItemEdittextpostBinding;

import java.util.ArrayList;

public class AdapterEditTextPost extends RecyclerView.Adapter<AdapterEditTextPost.ViewHolder> {
ArrayList<Integer> list = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        ItemEdittextpostBinding bining1 = DataBindingUtil.inflate(inflater, R.layout.item_edittextpost,parent,false);

        return new ViewHolder(bining1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.recyclerBinding.itemimage.setImageResource(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void getList(ArrayList<Integer> list) {
        this.list=list;
        notifyDataSetChanged();

    }

    protected class ViewHolder extends RecyclerView.ViewHolder{
        private ItemEdittextpostBinding recyclerBinding;


        public ViewHolder(ItemEdittextpostBinding binding) {
            super(binding.getRoot());
            this.recyclerBinding=binding;
        }
    }
}
