package com.test.socialmedia.Ui.Main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.test.socialmedia.R;
import com.test.socialmedia.databinding.ItemChoosepostBinding;

import java.util.ArrayList;

public class AdapterChoosePost extends RecyclerView.Adapter<AdapterChoosePost.ViewHolder>{
    ArrayList<Integer> list = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        ItemChoosepostBinding bining1 = DataBindingUtil.inflate(inflater, R.layout.item_choosepost,parent,false);

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
        private ItemChoosepostBinding recyclerBinding;


        public ViewHolder(ItemChoosepostBinding binding) {
            super(binding.getRoot());
            this.recyclerBinding=binding;
        }
    }
}
