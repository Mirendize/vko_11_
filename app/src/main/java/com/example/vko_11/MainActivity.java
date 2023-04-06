package com.example.vko_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Storage s = Storage.getInstance();
    }

    public void switchToShoppingList(View view) {
        Intent intent = new Intent(this, ShoppingListActivity.class);
        startActivity(intent);
    }
}