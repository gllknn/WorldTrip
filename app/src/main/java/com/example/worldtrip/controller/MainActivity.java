package com.example.worldtrip.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.worldtrip.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView penguin_hi;
    TextView hi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        penguin_hi = findViewById(R.id.penguin_hi);
        hi = findViewById(R.id.hi);

        hi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this, RegistrActivity.class);
        startActivity(intent);
        finish();
    }


}
