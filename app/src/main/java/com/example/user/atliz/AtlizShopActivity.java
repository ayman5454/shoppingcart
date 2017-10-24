package com.example.user.atliz;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;

import com.example.user.atliz.model.Product;
import com.example.user.atliz.adapters.ProductListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AtlizShopActivity extends AppCompatActivity {

    @BindView(R.id.productsRv)
    RecyclerView productsRv;

    private List<Product> mProducts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atliz_shop);
        ButterKnife.bind(this);

        productsRv.setLayoutManager(new LinearLayoutManager(this));
        productsRv.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        );

        //temp dummy data
        mProducts.add(new Product("iPhone X", 0.0, 0.0, null));
        mProducts.add(new Product("Samsung Galaxy S8", 0.0, 0.0, null));
        mProducts.add(new Product("One + 5", 0.0, 0.0, null));
        mProducts.add(new Product("iPhone 6s Plus", 0.0, 0.0, null));

        ProductListAdapter productListAdapter = new ProductListAdapter(mProducts);
        productsRv.setAdapter(productListAdapter);
    }
}
