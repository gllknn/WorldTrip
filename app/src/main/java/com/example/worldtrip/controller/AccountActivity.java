package com.example.worldtrip.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.worldtrip.R;

public class AccountActivity extends AppCompatActivity implements View.OnClickListener {

    Button quest;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account);

        quest = findViewById(R.id.quest_acc);
        home = findViewById(R.id.home_acc);

        quest.setOnClickListener(this);
        home.setOnClickListener(this);
    }

    public void AccountQuest(View v){
        Intent integer = new Intent(this, QuestActivity.class );
        startActivity(integer);
    }

    public void AccountModule1(View v){
        Intent integer = new Intent(this, Module1Activity.class );
        startActivity(integer);
    }

    @Override
    public void onClick(View v) {
        if(home.getId() == v.getId()){
            Intent integer1 = new Intent(this, Module1Activity.class );
            startActivity(integer1);
            finish();
        } else if (quest.getId() == v.getId()) {
            Intent integer2 = new Intent(this, QuestActivity.class );
            startActivity(integer2);
            finish();
        }
    }
}