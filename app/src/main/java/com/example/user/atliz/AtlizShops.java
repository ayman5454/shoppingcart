package com.example.user.atliz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AtlizShops extends AppCompatActivity {

    ImageButton image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atliz_shops);

        image1 = (ImageButton) findViewById(R.id.imageButton2);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AtlizShops.this, Home.class);
                startActivity(intent);
            }
        });

    }
}
