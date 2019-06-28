package com.example.nethuyahampath.nakathapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        splash = (ImageView) findViewById(R.id.imgSplash);
        Toast.makeText(getApplicationContext(),"L  O  A  D  I  N  G ......",Toast.LENGTH_LONG).show();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, nakathListActivity.class));
                finish();
            }
        }, 4000);


    }

}
