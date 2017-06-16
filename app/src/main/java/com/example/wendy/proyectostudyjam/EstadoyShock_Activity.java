package com.example.wendy.proyectostudyjam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EstadoyShock_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estadoy_shock_);
    }
    public void atras(View v){
        finish();
    }
}
