package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    Button next_su;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        next_su = findViewById(R.id.nextbtn_sign);

        next_su.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent integer = new Intent(this, ComicActivity.class );
        startActivity(integer);
    }

}
