package com.example.wendy.proyectostudyjam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Sos_pagina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos_pagina);
        WebView webView=(WebView) this.findViewById(R.id.wvsos);
        webView.loadUrl("http://animalessos.org/");
    }
}
