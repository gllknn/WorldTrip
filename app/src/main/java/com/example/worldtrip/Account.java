package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Account extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account);
    }

    public void AccountQuest(View v){
        Intent integer = new Intent(this, Quest.class );
        startActivity(integer);
    }

    public void AccountModule1(View v){
        Intent integer = new Intent(this, Module1Activity.class );
        startActivity(integer);
    }

}
