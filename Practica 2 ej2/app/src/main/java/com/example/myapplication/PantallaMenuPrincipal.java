package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaMenuPrincipal extends AppCompatActivity {

    Button btnTemperatura, btnConversor, btnConf, btnCS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_menu_principal);

        //BOTON TEMPERATURA
        btnTemperatura = (Button) findViewById(R.id.idBotonTemp);
        btnTemperatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),FormTemperatura.class);
                startActivity(intent);
            }
        });

        //BOTON CONVERSOR
        btnConversor = (Button) findViewById(R.id.idBotonConv);
        btnConversor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),Conversion.class);
                startActivity(intent1);
            }
        });

        //BOTON CONFIGURACION
        btnConf = (Button) findViewById(R.id.idBotonConf);
        btnConf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(),Configuracion.class);
                startActivity(intent2);
            }
        });

        //BOTON CERRAR SESIÓN
        btnCS = (Button) findViewById(R.id.idBotonCS);
        btnCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(getApplicationContext(), Login.class);
                startActivity(intent3);
            }
        });



    }
}