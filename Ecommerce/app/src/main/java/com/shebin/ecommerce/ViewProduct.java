package com.shebin.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewProduct extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        TextView textViewName, textViewCategory, textViewPrice;
        ImageView imageView;
        textViewName = findViewById(R.id.textView_name);
        textViewName = findViewById(R.id.textView_name);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("name");
        textViewName.setText(name);
    }
}
