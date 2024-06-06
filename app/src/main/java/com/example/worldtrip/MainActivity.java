package com.example.worldtrip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView penguin_hi;
    TextView hi;
    ConstraintLayout hi_l;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        penguin_hi = findViewById(R.id.penguin_hi);
        hi = findViewById(R.id.hi);
        hi_l = findViewById(R.id.listmain);

        hi_l.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, Registr.class));
    }




}

