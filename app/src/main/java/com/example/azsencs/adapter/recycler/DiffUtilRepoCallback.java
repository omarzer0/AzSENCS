package com.example.azsencs.adapter.recycler;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.example.azsencs.data.Item;

public class DiffUtilRepoCallback extends DiffUtil.ItemCallback<Item> {

    @Override
    public boolean areItemsTheSame(@NonNull Item oldItem, @NonNull Item newItem) {
        return oldItem.getName().equals(newItem.getName());
    }

    @Override
    public boolean areContentsTheSame(@NonNull Item oldItem, @NonNull Item newItem) {
        return oldItem.getImage() == newItem.getImage();
    }
}
