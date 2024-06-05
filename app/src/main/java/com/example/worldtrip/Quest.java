package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Quest extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quest);
    }

    public void QuestModule1(View v){
        Intent integer = new Intent(this, Module1Activity.class );
        startActivity(integer);
    }

    public void QuestAccount(View v){
        Intent integer = new Intent(this, Account.class );
        startActivity(integer);
    }

}
