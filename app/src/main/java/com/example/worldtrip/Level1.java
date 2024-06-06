package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Level1 extends AppCompatActivity implements View.OnClickListener{

    Button next;


    private Exs[] ExssBank = {
            new Exs(R.string.title_l1e1),
            new Exs(R.string.title_l1e2),
            new Exs(R.string.title_l1e3),
            new Exs(R.string.title_l1e4),
            new Exs(R.string.title_l1e5),
            new Exs(R.string.title_l1e6),
            new Exs(R.string.title_l1e7),
            new Exs(R.string.title_l1e8),

    };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l1e1);

        next = findViewById(R.id.nextbtn_l1);
    }

    @Override
    public void onClick(View v) {

    }

    private void updateExs(){
        int exsID =
    }

}
