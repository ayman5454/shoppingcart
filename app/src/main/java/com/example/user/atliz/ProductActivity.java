package com.example.user.atliz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.user.atliz.model.Product;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProductActivity extends AppCompatActivity {

    private Product mProduct;

    @BindView(R.id.weightEt)
    EditText weight;

    @BindView(R.id.amountEt)
    EditText amountEt;

    @BindView(R.id.messageEt)
    EditText messageEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        ButterKnife.bind(this);

        mProduct = getIntent().getParcelableExtra(Product.BUNDLE_EXTRA_NAME);
        updateUI();
    }

    private void updateUI() {
        this.setTitle(mProduct.getName());
    }

    @OnClick({R.id.addToCartBtn})
    void onClickButton(View view) {
        switch (view.getId()) {
            case R.id.addToCartBtn:
                addToCart();
                break;
        }
    }

    private void addToCart() {

    }
}
