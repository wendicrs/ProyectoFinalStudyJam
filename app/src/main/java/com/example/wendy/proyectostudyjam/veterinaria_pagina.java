package com.example.wendy.proyectostudyjam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class veterinaria_pagina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veterinaria_pagina);
        WebView webView=(WebView) this.findViewById(R.id.wvveterinaria);
        webView.loadUrl("https://www.google.com/maps/place/Veterinaria+Salud+Animal/@-16.4926613,-68.1471909,17z/data=!4m8!1m2!2m1!1sveterinarias+cercanas!3m4!1s0x0:0x534bc119a743e23f!8m2!3d-16.4926613!4d-68.1450022");
    }
}
