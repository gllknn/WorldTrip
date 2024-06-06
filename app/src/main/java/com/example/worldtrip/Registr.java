package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Registr extends AppCompatActivity {

    Button sign_up, log_in;
    ImageView registraton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registr);

        sign_up = findViewById(R.id.sign_up);
        log_in = findViewById(R.id.log_in);
        registraton = findViewById(R.id.penguin_read);
    }

    public void RegistrLogin(View v){
        Intent integer = new Intent(this, LogIn.class );
        startActivity(integer);
    }

    public void RegistrSignup(View v){
        Intent integer = new Intent(this, SignUp.class );
        startActivity(integer);
    }

}
