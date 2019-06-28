package com.example.nethuyahampath.nakathapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nakathListActivity extends AppCompatActivity {
    TextView moon , bath , sun , temple , food , work , oil , job;
    Button btnMoon , btnBath , btnSun , btnTemple , btnFood , btnWork , btnOil , btnJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nakath_list);

        btnMoon = (Button)findViewById(R.id.btnMoon);
        btnBath = (Button)findViewById(R.id.btnBath);
        btnSun = (Button)findViewById(R.id.btnSun);
        btnTemple = (Button)findViewById(R.id.btnTemple);
        btnFood = (Button)findViewById(R.id.btnFood);
        btnWork = (Button)findViewById(R.id.btnWork);
        btnOil = (Button)findViewById(R.id.btnOil);
        btnJob = (Button)findViewById(R.id.btnJob);


        moon = (TextView)findViewById(R.id.txtMoon);
        Typeface customFont = Typeface.createFromAsset(getAssets(),"fonts/suanaraga.ttf");
        moon.setTypeface(customFont);

        bath = (TextView)findViewById(R.id.txtBath);
        Typeface customFont2 = Typeface.createFromAsset(getAssets(),"fonts/suanaraga.ttf");
        bath.setTypeface(customFont2);

        sun = (TextView)findViewById(R.id.txtSun);
        Typeface customFont3 = Typeface.createFromAsset(getAssets(),"fonts/suanaraga.ttf");
        sun.setTypeface(customFont3);

        temple = (TextView)findViewById(R.id.txtTemple);
        Typeface customFont4 = Typeface.createFromAsset(getAssets(),"fonts/suanaraga.ttf");
        temple.setTypeface(customFont3);

        food = (TextView)findViewById(R.id.txtFood);
        Typeface customFont5 = Typeface.createFromAsset(getAssets(),"fonts/suanaraga.ttf");
        food.setTypeface(customFont5);

        work = (TextView)findViewById(R.id.txtWork);
        Typeface customFont6 = Typeface.createFromAsset(getAssets(),"fonts/suanaraga.ttf");
        work.setTypeface(customFont6);

        oil = (TextView)findViewById(R.id.txtOil);
        Typeface customFont7 = Typeface.createFromAsset(getAssets(),"fonts/suanaraga.ttf");
        oil.setTypeface(customFont7);

        job = (TextView)findViewById(R.id.txtJob);
        Typeface customFont8 = Typeface.createFromAsset(getAssets(),"fonts/suanaraga.ttf");
        job.setTypeface(customFont8);


        btnMoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(nakathListActivity.this,MoonActivity.class);
                startActivity(main);
            }
        });

        btnBath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(nakathListActivity.this,bathActivity.class);
                startActivity(main);
            }
        });

        btnSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(nakathListActivity.this,sunActivity.class);
                startActivity(main);
            }
        });



    }
    }

