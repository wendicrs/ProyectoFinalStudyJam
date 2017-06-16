package com.example.wendy.proyectostudyjam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class colocacion_youtube_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colocacion_youtube_);
        WebView webView=(WebView) this.findViewById(R.id.wvyoutubeC);
        webView.loadUrl("https://www.youtube.com/watch?v=Ic7WA9hJMno");
    }
}
