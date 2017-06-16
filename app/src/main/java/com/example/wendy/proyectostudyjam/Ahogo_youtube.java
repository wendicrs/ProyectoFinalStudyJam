package com.example.wendy.proyectostudyjam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Ahogo_youtube extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahogo_youtube);
        WebView webView=(WebView) this.findViewById(R.id.wvyoutubeAhogo);
        webView.loadUrl("https://www.youtube.com/watch?v=axkISGkOcHE");
    }
}
