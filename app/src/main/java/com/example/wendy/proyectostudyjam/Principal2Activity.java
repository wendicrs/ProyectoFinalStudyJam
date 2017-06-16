package com.example.wendy.proyectostudyjam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal2Activity extends AppCompatActivity {
    private Button btnintroduccion;
    private Button btnsujetar;
    private Button btncolocacion;
    private Button btnevaluar;
    private Button btntecnica;
    private Button btnahogo;
    private Button btnbloqueos;
    private Button btnintoxicacion;
    private Button btndislocacion;
    private Button btnEstado;
    private Button btnhemorragias;
    private Button btnconvulsiones;
    private Button btnquemaduras;
    private Button btnpicaduras;
    private Button btnelectrocucion;
    private Button btndesnutricion;
    private Button btnconcejos;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal2);

        btnintroduccion =(Button) findViewById(R.id.btnintroduccion);
        btnsujetar=(Button) findViewById(R.id.btnsujetar);
        btncolocacion=(Button) findViewById(R.id.btncolocacion);
        btnevaluar=(Button) findViewById(R.id.btnevaluar);
        btntecnica=(Button) findViewById(R.id.btntecnicareanimacion);
        btnahogo=(Button) findViewById(R.id.btnahogo);
        btnbloqueos=(Button) findViewById(R.id.btnbloqueos);
        btnintoxicacion=(Button) findViewById(R.id.btnintoxicacion);
        btndislocacion=(Button) findViewById(R.id.btndislocacion);
        btnEstado=(Button) findViewById(R.id.btnestadoshock);
        btnhemorragias=(Button) findViewById(R.id.btnhemorragias);
        btnconvulsiones=(Button) findViewById(R.id.btnconvulsiones);
        btnquemaduras=(Button) findViewById(R.id.btnquemaduras);
        btnpicaduras=(Button) findViewById(R.id.btnpicaduras);
        btnelectrocucion=(Button) findViewById(R.id.btnelectrocucion);
        btndesnutricion=(Button) findViewById(R.id.btndesnutricion);
        btnconcejos=(Button) findViewById(R.id.btnconcejos);


        btnintroduccion.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnintroduccion =new Intent(Principal2Activity.this, Introduccion.class );
                startActivity(btnintroduccion);
            }
        });

        btnsujetar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnsujetar =new Intent(Principal2Activity.this, Sujetar.class );
                startActivity(btnsujetar);
            }
        });
        btncolocacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btncolocacion=new Intent(Principal2Activity.this, Colocacion_Activity.class);
                startActivity(btncolocacion);
            }
        });
        btnevaluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnevaluar=new Intent(Principal2Activity.this, Evaluar_Activity.class);
                startActivity(btnevaluar);
            }
        });
        btntecnica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btntecnica=new Intent(Principal2Activity.this, Tecnica_Reanimacion_Activity.class);
                startActivity(btntecnica);
            }
        });
        btnahogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnahogo=new Intent(Principal2Activity.this, Ahogo_Activity.class);
                startActivity(btnahogo);
            }
        });
        btnbloqueos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnbloqueos=new Intent(Principal2Activity.this, Bloqueos_Respiratorios_Activity.class);
                startActivity(btnbloqueos);
            }
        });

        btnintoxicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnintoxicacion=new Intent(Principal2Activity.this, Intoxicacion_Activity.class);
                startActivity(btnintoxicacion);
            }
        });

        btndislocacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndislocacion=new Intent(Principal2Activity.this, Dislocacion_Activity.class);
                startActivity(btndislocacion);
            }
        });
        btnEstado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnEstado=new Intent(Principal2Activity.this, EstadoyShock_Activity.class);
                startActivity(btnEstado);
            }
        });
        btnhemorragias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnhemorragias=new Intent(Principal2Activity.this, Hemorragias_Activity.class);
                startActivity(btnhemorragias);
            }
        });
        btnconvulsiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnconvulsiones=new Intent(Principal2Activity.this, Convulsiones_Activity.class);
                startActivity(btnconvulsiones);
            }
        });
        btnquemaduras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnquemaduras=new Intent(Principal2Activity.this, Quemaduras_Activity.class);
                startActivity(btnquemaduras);
            }
        });
        btnpicaduras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnpicaduras=new Intent(Principal2Activity.this, Picaduras_Activity.class);
                startActivity(btnpicaduras);
            }
        });
        btnelectrocucion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnelectrocucion=new Intent(Principal2Activity.this, Electrocucion_Activity.class);
                startActivity(btnelectrocucion);
            }
        });

        btndesnutricion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btndesnutricion=new Intent(Principal2Activity.this, Desnutricion_Activity.class);
                startActivity(btndesnutricion);
            }
        });
        btnconcejos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnconcejos=new Intent(Principal2Activity.this, Concejos_y_botiquin_Activity.class);
                startActivity(btnconcejos);
            }
        });
    }
    public void atras(View v){
        finish();
    }

}
