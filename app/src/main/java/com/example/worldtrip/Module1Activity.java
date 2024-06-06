package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Module1Activity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_first);
    }

    public void Module1Quest(View v){
        Intent integer = new Intent(this, Quest.class );
        startActivity(integer);
    }

    public void Module1Account(View v){
        Intent integer = new Intent(this, Account.class );
        startActivity(integer);
    }

    public void Module1L1(View v){
        Intent integer = new Intent(this, Level1.class );
        startActivity(integer);
        finish();
    }



}
