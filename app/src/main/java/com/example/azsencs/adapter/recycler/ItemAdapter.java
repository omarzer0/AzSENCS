package com.example.azsencs.adapter.recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.example.azsencs.R;
import com.example.azsencs.data.Item;

public class ItemAdapter extends ListAdapter<Item, ItemViewHolder> {

    private static final DiffUtil.ItemCallback<Item> CALLBACK = new DiffUtilRepoCallback();

    public ItemAdapter() {
        super(CALLBACK);
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item currentItem = getItem(position);
        holder.tvName.setText(currentItem.getName());
        holder.ivBgImageView.setImageResource(currentItem.getImage());
    }
}
