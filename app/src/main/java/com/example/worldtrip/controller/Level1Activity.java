package com.example.worldtrip.controller;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.worldtrip.R;
import com.example.worldtrip.model.Exercise;

public class Level1Activity extends AppCompatActivity implements View.OnClickListener{

    Button nextl1;
    TextView l1;
    ImageView img_lvl;


    private Exercise[] exssBank = {
            new Exercise(R.string.title_l1e1, R.drawable.korea_map),
            new Exercise(R.string.title_l1e2, R.drawable.tiger),
            new Exercise(R.string.title_l1e3, R.drawable.seul1),
            new Exercise(R.string.title_l1e4, R.drawable.family),
            new Exercise(R.string.title_l1e5, R.drawable.gyeongbokgung),
            new Exercise(R.string.title_l1e6, R.drawable.tv_tower),
            new Exercise(R.string.title_l1e7, R.drawable.chonme1),
            new Exercise(R.string.title_l1e8, R.drawable.tiger2),

    };

    private int nowID = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l1e1);

        nextl1 = findViewById(R.id.nextbtn_l1);
        l1 = findViewById(R.id.title_l1);
        img_lvl = findViewById(R.id.img_lvl);

        nextl1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        nowID++;
        if (nowID > exssBank.length){
            Intent integer = new Intent(Level1Activity.this, Module1Activity.class );
            startActivity(integer);
            finish();
        }
        updateExs();

    }

    private void updateExs(){
        int exsID = exssBank[nowID].titleID;
        l1.setText(exsID);

        int exsImageID =exssBank[nowID].imgID;
        img_lvl.setImageResource(exsImageID);
    }

}