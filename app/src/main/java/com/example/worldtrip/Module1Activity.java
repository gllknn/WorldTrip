package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Module1Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton quest, account;
    Button lvl1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_first);

        quest = findViewById(R.id.quest);
        account = findViewById(R.id.account);
        lvl1 =findViewById(R.id.lvl);

        quest.setOnClickListener(this);
        account.setOnClickListener(this);
        lvl1.setOnClickListener(this);
    }

//    public void Module1Quest(View v){
//        Intent integer = new Intent(this, Quest.class );
//        startActivity(integer);
//    }
//
//    public void Module1Account(View v){
//        Intent integer = new Intent(this, Account.class );
//        startActivity(integer);
//    }
//
//    public void Module1L1(View v){
//        Intent integer = new Intent(this, Level1.class );
//        startActivity(integer);
//        finish();
//    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.quest:
                Intent integer1 = new Intent(this, QuestActivity.class );
                startActivity(integer1);
                finish();
                break;

            case R.id.account:
                Intent integer2 = new Intent(this, AccountActivity.class );
                startActivity(integer2);
                finish();
                break;

            case R.id.lvl:
                Intent integer3 = new Intent(this, Level1.class );
                startActivity(integer3);
                finish();
                break;
        }
    }
}
