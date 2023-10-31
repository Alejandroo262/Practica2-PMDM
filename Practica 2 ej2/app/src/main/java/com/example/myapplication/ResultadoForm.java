package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResultadoForm extends AppCompatActivity {

    EditText resultNombre, resultApellidos, resultTemperatura, resultCiudad, resultProvincia;
    Button btnMenu;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_form);

        resultNombre = findViewById(R.id.muestraNombre);
        resultApellidos= findViewById(R.id.muestraApellidos);
        resultTemperatura = findViewById(R.id.muestraTemperatura);
        resultCiudad = findViewById(R.id.muestraCiudad);
        resultProvincia = findViewById(R.id.muestraProvincia);
        btnMenu = findViewById(R.id.botonMenu);


        Bundle recibeDatos = getIntent().getExtras();
        String infoNombre = recibeDatos.getString("getNombre");
        String infoApellidos = recibeDatos.getString("getApellidos");
        String infoTemperatura = recibeDatos.getString("getTemperatura");
        String infoCiudad = recibeDatos.getString("getCiudad");
        String infoProvincia = recibeDatos.getString("getProvincia");

        resultNombre.setText(infoNombre);
        resultApellidos.setText(infoApellidos);
        resultTemperatura.setText(infoTemperatura);
        resultCiudad.setText(infoCiudad);
        resultProvincia.setText(infoProvincia);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),PantallaMenuPrincipal.class);
                startActivity(intent);
            }
        });

    }

}