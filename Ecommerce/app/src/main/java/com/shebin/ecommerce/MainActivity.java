package com.shebin.ecommerce;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecycleView = findViewById(R.id.my_recycler_view);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(MainActivity.this);
        mRecycleView.setLayoutManager(mLayoutManager);
        ArrayList<Product> list = new ArrayList<Product>();
        Product p1 = new Product("HP Laptop","Electronics",40000,R.drawable.laptop);
        Product p2 = new Product("iPhone","Electronics",100000,R.drawable.iphone);
        Product p3 = new Product("Apple Watch","Accessories",25000,R.drawable.smartwatch);
        Product p4 = new Product("Nike T-Shirt","Clothing",1999,R.drawable.sporttshirt);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        ProductDataAdapter productDataAdapter = new ProductDataAdapter(list,MainActivity.this);
        mRecycleView.setAdapter(productDataAdapter);
    }
}
