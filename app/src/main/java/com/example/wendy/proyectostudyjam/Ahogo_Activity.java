package com.example.wendy.proyectostudyjam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ahogo_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahogo_);
    }
    public void atras(View v){
        finish();
    }

    public void ahogoyoutube(View v){
        Intent intent=new Intent(this,Ahogo_youtube.class);
        startActivity(intent);
    }
}
