package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton quest;
    Button home;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account);

        quest = findViewById(R.id.quest);
        home = findViewById(R.id.home);

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
        switch (v.getId()) {
            case R.id.home:
                Intent integer1 = new Intent(this, Module1Activity.class );
                startActivity(integer1);
                finish();
                break;

            case R.id.quest:
                Intent integer2 = new Intent(this, QuestActivity.class );
                startActivity(integer2);
                finish();
                break;
        }
    }
}
