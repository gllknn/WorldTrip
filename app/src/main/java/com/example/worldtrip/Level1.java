package com.example.worldtrip;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Level1 extends AppCompatActivity implements View.OnClickListener{

    Button nextl1;
    TextView l1;


    private Exs[] exssBank = {
            new Exs(R.string.title_l1e1, R.drawable.korea_map),
            new Exs(R.string.title_l1e2, R.drawable.tiger),
            new Exs(R.string.title_l1e3, R.drawable.seul1),
            new Exs(R.string.title_l1e4, R.drawable.family),
            new Exs(R.string.title_l1e5, R.drawable.gyeongbokgung),
            new Exs(R.string.title_l1e6, R.drawable.tv_tower),
            new Exs(R.string.title_l1e7, R.drawable.chonme1),
            new Exs(R.string.title_l1e8, R.drawable.tiger2),

    };

    private int nowID = 0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.l1e1);

        nextl1 = findViewById(R.id.nextbtn_l1);
        l1 = findViewById(R.id.title_l1);

        nextl1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        nowID = (nowID + 1) % exssBank.length;
        updateExs();
    }

    private void updateExs(){
        int exsID = exssBank[nowID].titleID;
        l1.setText(exsID);

        int exsImageID =exssBank[nowID].imgID;
        //l1.setImageResource(exsImageID);
    }

}
