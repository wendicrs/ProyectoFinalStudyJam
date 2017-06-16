package com.example.wendy.proyectostudyjam;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imglogo;
    private Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imglogo=(ImageView) findViewById(R.id.logopets);
        animation = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        imglogo.setAnimation(animation);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, MainInscripcionActivity.class);
                startActivity(intent);
            }
        },4000);

    }

}
