package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class QuestActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton account;
    Button home;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest);

        home = findViewById(R.id.home);
        account = findViewById(R.id.account);

        home.setOnClickListener(this);
        account.setOnClickListener(this);
    }

//    public void QuestModule1(View v){
//        Intent integer = new Intent(this, Module1Activity.class );
//        startActivity(integer);
//    }
//
//    public void QuestAccount(View v){
//        Intent integer = new Intent(this, Account.class );
//        startActivity(integer);
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.home:
                Intent integer = new Intent(this, Module1Activity.class );
                startActivity(integer);
                finish();
                break;

            case R.id.account:
                Intent integer2 = new Intent(this, AccountActivity.class );
                startActivity(integer2);
                finish();
                break;
        }
    }
}
