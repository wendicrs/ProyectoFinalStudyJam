package com.example.wendy.proyectostudyjam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class YoutubeSujetarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_sujetar);

        WebView webView=(WebView) this.findViewById(R.id.wvyoutubeTecnica);
        webView.loadUrl("https://www.youtube.com/watch?v=JqgCObo8gBw");

    }

}
