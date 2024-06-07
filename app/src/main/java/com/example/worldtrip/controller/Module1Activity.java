package com.example.worldtrip.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.worldtrip.R;

public class Module1Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton quest, account;
    ImageButton lvl1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_first);

        quest = findViewById(R.id.quest_m);
        account = findViewById(R.id.account_m);
        lvl1 = findViewById(R.id.lvl);

        quest.setOnClickListener(this);
        account.setOnClickListener(this);
        lvl1.setOnClickListener(this);
    }




    @Override
    public void onClick(View v) {
        if(quest.getId() == v.getId()){
            Intent integer1 = new Intent(Module1Activity.this, QuestActivity.class );
            startActivity(integer1);
            finish();
        } else if (account.getId() == v.getId()) {
            Intent integer2 = new Intent(Module1Activity.this, AccountActivity.class );
            startActivity(integer2);
            finish();
        }else if (lvl1.getId() == v.getId()) {
            Intent integer3 = new Intent(Module1Activity.this, Level1Activity.class );
            startActivity(integer3);
            finish();
        }
    }
}