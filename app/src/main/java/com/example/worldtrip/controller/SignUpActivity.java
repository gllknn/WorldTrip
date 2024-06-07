package com.example.worldtrip.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.worldtrip.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class SignUpActivity extends AppCompatActivity {

    Button next_su;

    EditText etMail, etPassword, etUsername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AuthController authController = new AuthController();
        if (authController.isRegistered()) {
            startActivity(new Intent(SignUpActivity.this, MainActivity.class));
        }


        setContentView(R.layout.sign_up);

        next_su = findViewById(R.id.nextbtn_sign);
        etMail = findViewById(R.id.mail_su);
        etPassword = findViewById(R.id.password_su);
        etUsername = findViewById(R.id.username_su);


        next_su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString();
                String mail = etMail.getText().toString();
                String password = etPassword.getText().toString();

                authController.registerNewUser(mail, password, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()) {
                            startActivity(new Intent(SignUpActivity.this, ComicActivity.class));
                            finish();
                        }
                    }
                });
            }
        });
    }



}