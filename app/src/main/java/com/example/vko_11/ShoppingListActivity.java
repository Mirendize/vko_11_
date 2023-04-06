package com.example.vko_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ShoppingListActivity extends AppCompatActivity {
    private Storage storage;
    private RecyclerView recyclerView;
    private ShoppingListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        Button addPurchase = findViewById(R.id.btnAddItem);
        ImageView calenderImage = findViewById(R.id.imgCalender);
        ImageView deleteImage = findViewById(R.id.imgAlphabet);


        storage = Storage.getInstance();
        recyclerView = findViewById(R.id.rvItemList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ShoppingListAdapter(getApplicationContext(), storage.getPurchases());
        recyclerView.setAdapter(adapter);

    }

    public void switchAddToList(View view) {
        Intent intent = new Intent(this, AddToListActivity.class);
        startActivity(intent);
        adapter.notifyDataSetChanged();
    }
}