package com.example.vko_11;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShoppingListAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private Context context;
    private ArrayList<Purchase> purchases = new ArrayList<>();

    public ShoppingListAdapter(Context context, ArrayList<Purchase> purchases) {
        this.context = context;
        this.purchases = purchases;
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.itemName.setText(purchases.get(position).getItem());
        holder.itemNotice.setText(purchases.get(position).getNotice());

        holder.removeItem.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();
            Storage.getInstance().removePurchase(purchases.get(pos).getId());
            notifyItemRemoved(pos);
        });

        holder.editItem.setOnClickListener(view -> {
            int pos = holder.getAdapterPosition();

            if(holder.editNotice.getVisibility() == View.VISIBLE) {
                Purchase purchase = Storage.getInstance().getPurchaseById(pos);
                purchase.setNotice(holder.editNotice.getText().toString());
                holder.editNotice.setVisibility(View.GONE);
                notifyDataSetChanged();
            }
            else {
                holder.editNotice.setVisibility(View.VISIBLE);
            }

        });

    }

    @Override
    public int getItemCount() {
        return purchases.size();
    }
}