package com.example.worldtrip.controller;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.worldtrip.R;

public class QuestActivity extends AppCompatActivity implements View.OnClickListener {

    Button account;
    Button home;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest);

        home = findViewById(R.id.home_qu);
        account = findViewById(R.id.account_qu);

        home.setOnClickListener(this);
        account.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if(home.getId() == v.getId()){
            Intent integer = new Intent(this, Module1Activity.class );
            startActivity(integer);
            finish();
        } else if (account.getId() == v.getId()) {
            Intent integer2 = new Intent(this, AccountActivity.class );
            startActivity(integer2);
            finish();
        }
    }
}