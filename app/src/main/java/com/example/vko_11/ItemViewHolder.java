package com.example.vko_11;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    ImageView removeItem, editItem;
    TextView itemName, itemNotice;
    EditText editNotice;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        removeItem = itemView.findViewById(R.id.imgDelete);
        editItem = itemView.findViewById(R.id.imgEdit);
        itemName = itemView.findViewById(R.id.txtItemName);
        itemNotice = itemView.findViewById(R.id.txtItemNotice);
        editNotice = itemView.findViewById(R.id.editText);
    }
}
