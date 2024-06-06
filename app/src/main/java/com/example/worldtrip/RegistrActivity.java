package com.example.worldtrip;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrActivity extends AppCompatActivity implements View.OnClickListener {

    Button sign_up, log_in;
    ImageView registraton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registr);

        sign_up = findViewById(R.id.sign_up);
        log_in = findViewById(R.id.log_in);
        registraton = findViewById(R.id.penguin_read);

        sign_up.setOnClickListener(this);
        log_in.setOnClickListener(this);
    }

//    public void registrLogin(View v){
//        Intent integer = new Intent(RegistrActivity.this, LogInActivity.class );
//        startActivity(integer);
//        finish();
//    }
//
//    public void registrSignup(View v){
//        Intent integer = new Intent(RegistrActivity.this, SignUpActivity.class );
//        startActivity(integer);
//        finish();
//    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.log_in:
                Intent integer1 = new Intent(RegistrActivity.this, LogInActivity.class );
                startActivity(integer1);
                finish();
                break;

            case R.id.sign_up:
                Intent integer2 = new Intent(RegistrActivity.this, SignUpActivity.class );
                startActivity(integer2);
                finish();
                break;
        }

    }
}
