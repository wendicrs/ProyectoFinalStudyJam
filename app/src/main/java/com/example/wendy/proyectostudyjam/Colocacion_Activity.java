package com.example.wendy.proyectostudyjam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Colocacion_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colocacion_);
    }
    public void youtubecolocacion(View v){
        Intent intent=new Intent(this,colocacion_youtube_Activity.class);
        startActivity(intent);
    }
    public void atras(View v){
        finish();
    }
}
