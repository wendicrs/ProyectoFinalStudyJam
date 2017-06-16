package com.example.wendy.proyectostudyjam;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainInscripcionActivity extends AppCompatActivity {
    private Button bsuscribirse;
    private EditText edtnombre;
    private EditText edtcorreo;
    private EditText edtnmascota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_inscripcion);


        bsuscribirse = (Button) findViewById(R.id.btnsuscribirse);
        edtnombre = (EditText) findViewById(R.id.edtnombre);
        edtcorreo = (EditText) findViewById(R.id.edtcorreo);
        edtnmascota = (EditText) findViewById(R.id.edtnommascota);



}
public void suscribirse(View v){
    if(edtnombre.getText().toString().equals("") ||
            edtcorreo.getText().toString().equals("") ||
            edtnmascota.getText().toString().equals("")){
        Toast.makeText(getApplicationContext(),"todos los datos deben ser llenados",Toast.LENGTH_LONG).show();
    }else{
        Context context=this;
        SharedPreferences sharedPreferences=getSharedPreferences("ArchivoSP", context.MODE_PRIVATE);

        sharedPreferences = getPreferences(context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("Nombre", edtnombre.getText().toString());
        editor.putString("Correo", edtcorreo.getText().toString());
        editor.putString("Nombre_Masclota", edtnmascota.getText().toString());

        editor.commit();

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Inscripcion Exitosa...!");
        alertDialog.setMessage(edtnombre.getText().toString()+"\n"+edtcorreo.getText().toString()+"\n"+edtnmascota.getText().toString());
        alertDialog.setButton(DialogInterface.BUTTON_NEUTRAL, "aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent bsuscribirse = new Intent(MainInscripcionActivity.this, Menu2Activity.class);
                startActivity(bsuscribirse);

            }
        });
        alertDialog.show();
    }

}

}






