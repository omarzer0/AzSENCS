package com.example.azsencs.adapter.recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.azsencs.R;


public class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView tvName;
    ImageView ivBgImageView;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name);
        ivBgImageView = itemView.findViewById(R.id.iv_background_image);
    }
}
