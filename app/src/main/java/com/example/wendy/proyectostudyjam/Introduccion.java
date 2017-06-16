package com.example.wendy.proyectostudyjam;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Introduccion extends AppCompatActivity {
    private Button btnllamar;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduccion);
        btnllamar = (Button) findViewById(R.id.btnllamar);


    }

    public void atras(View v) {
        finish();
    }

    public void llamar(View v) {
        //int permissionCheck = ContextCompat.checkSelfPermission(Introduccion.this, Manifest.permission.CALL_PHONE);
        //if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
          //  ActivityCompat.requestPermissions(Introduccion.this, new String[]{Manifest.permission.CALL_PHONE}, 123);
        //} else {
            intent = new Intent(intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel: 22308080"));
            //Si el permiso fue aceptado
        startActivity(intent);
        //}

    }



}