package com.example.wendy.proyectostudyjam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sujetar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sujetar);
    }
    public void youtubeSujetar(View v){
        Intent intent=new Intent(this,YoutubeSujetarActivity.class);
        startActivity(intent);


    }
    public void atras(View v){
        finish();
    }
}
