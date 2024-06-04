package com.example.worldtrip;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {


    TextView module1_description;
    Button descriptionbtn_one;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        module1_description = (TextView) findViewById(R.id.module1_description);
        descriptionbtn_one = (Button) findViewById(R.id.descriptionbtn_one);

    }

    public void from_comic_to_home(View v){
        Intent intent = new Intent(this, Module1Activity.class);
        startActivity(intent);
    }

}