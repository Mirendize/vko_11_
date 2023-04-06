package com.example.vko_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddToListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_list);
    }

    public void AddPurchase(View view) {
        EditText addedItem = (EditText) findViewById(R.id.editTxtItem);
        EditText addedNotice = (EditText) findViewById(R.id.editTxtNotice);

        if (addedNotice.getText().toString().isEmpty()) {
            Storage.getInstance().addPurchase(new Purchase(addedItem.getText().toString(), " "));
        }
        else {
            Storage.getInstance().addPurchase(new Purchase(addedItem.getText().toString(), ("Huomio: " + addedNotice.getText().toString())));
        }
    }

    public void switchBackToList(View view) {
        Intent intent = new Intent(this, ShoppingListActivity.class);
        startActivity(intent);
    }
}