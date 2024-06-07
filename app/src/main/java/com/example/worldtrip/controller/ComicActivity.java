package com.example.worldtrip.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.worldtrip.R;

public class ComicActivity extends AppCompatActivity implements View.OnClickListener {

    Button next_comic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comic);

        next_comic = findViewById(R.id.nextbtn_comic);

        next_comic.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent integer = new Intent(ComicActivity.this, Module1Activity.class );
        startActivity(integer);
        finish();
    }

}
