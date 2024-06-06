package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ComicActivity extends AppCompatActivity implements View.OnClickListener {

    Button next_comic;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comic);

        next_comic = findViewById(R.id.nextbtn_comic);

        next_comic.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent integer = new Intent(this, Module1Activity.class );
        startActivity(integer);
    }

}
