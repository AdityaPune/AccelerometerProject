package com.shebin.ecommerce;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProductDataAdapter extends RecyclerView.Adapter<ProductDataAdapter.ProductDataHolder> {
    ArrayList<Product> productList;
    Context context;
    public ProductDataAdapter(ArrayList<Product> productList,Context context) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductDataHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.product_item,viewGroup,false);

        ProductDataHolder productDataHolder = new ProductDataHolder(view);
        return productDataHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductDataHolder productDataHolder, int i) {
        Product product = productList.get(i);
        productDataHolder.imageView.setImageDrawable(context.getResources().getDrawable(product.getPic()));
        productDataHolder.textViewPrice.setText(String.valueOf(product.getPrice()));
        productDataHolder.textViewCategory.setText(product.getCategory());
        productDataHolder.textViewName.setText(product.getName());
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductDataHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textViewName, textViewCategory, textViewPrice;
        public  ProductDataHolder(View itemView)
        {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition(); //finds the correct position of the PRODUCT int the list
                    Intent intent = new Intent(context,ViewProduct.class);
                    intent.putExtra("name",productList.get(position).getName());
                    intent.putExtra("category",productList.get(position).getCategory());
                    intent.putExtra("price",productList.get(position).getPrice());
                    intent.putExtra("pic",productList.get(position).getPic());
                    context.startActivity(intent);

                }
            });
            imageView = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.textViewProductName);
            textViewCategory = itemView.findViewById(R.id.textViewProductCategory);
            textViewPrice = itemView.findViewById(R.id.textViewProductPrice);
        }
    }
}
