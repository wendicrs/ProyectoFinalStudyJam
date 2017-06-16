package com.example.wendy.proyectostudyjam;

import android.annotation.TargetApi;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu2Activity extends AppCompatActivity {
    private SoundPool spmew;
    private SoundPool spguau;
    private int resmew, resguau;


    private Button manual;
    private Button veterinaria;
    private Button centro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        manual=(Button) findViewById(R.id.manual);
        veterinaria=(Button) findViewById(R.id.veterinarias);
        centro=(Button) findViewById(R.id.centrodeayuda);


        manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu2Activity.this, Principal2Activity.class);
                startActivity(i);
            }
        });




        createSoundPool();
    }
    private void createSoundPool() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            createNewSoundPool();
        } else {
            createOldSoundPool();
        }
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    protected void createNewSoundPool(){
        AudioAttributes attributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        spmew = new SoundPool.Builder().setAudioAttributes(attributes).build();
        spguau = new SoundPool.Builder().setAudioAttributes(attributes).build();

        chargeSoundPool();
    }

    @SuppressWarnings("deprecation")
    protected void createOldSoundPool(){
        spmew = new SoundPool(15, AudioManager.STREAM_MUSIC,0);
        spguau = new SoundPool(10,AudioManager.STREAM_MUSIC,0);

        chargeSoundPool();
    }

    public void chargeSoundPool() {
        resmew = spmew.load(getApplicationContext(),R.raw.mew,1);
        resguau=spguau.load(getApplicationContext(),R.raw.cachorro,1);

    }
    public void cachorro(View v){
        if(resguau!=0){  //por si no se carga correctamente el audio
            spguau.play(resguau,1,1,0,0,1);     // los primeros nros para audifonos, izquierdo y derecho
        }
    }
    public void gatito(View v){
        if(resmew!=0){  //por si no se carga correctamente el audio
            spmew.play(resmew,1,1,0,0,1);     // los primeros nros para audifonos, izquierdo y derecho
        }
    }
    public void sos(View v){
        Intent intent=new Intent(this,Sos_pagina.class);
        startActivity(intent);
    }
    public void veterinaria(View v){
        Intent intent=new Intent(this,veterinaria_pagina.class);
        startActivity(intent);
    }
}
