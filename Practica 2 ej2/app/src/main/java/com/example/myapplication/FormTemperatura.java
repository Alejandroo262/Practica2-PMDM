package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormTemperatura extends AppCompatActivity {

    private EditText NombreForm, ApellidosForm, TemperaturaForm, CiudadForm, ProvinciaForm;
    Button btnFin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_temperatura);

        NombreForm = (EditText) findViewById(R.id.idNombreForm);
        ApellidosForm = (EditText) findViewById(R.id.idApellidosForm);
        TemperaturaForm = (EditText) findViewById(R.id.idTempForm);
        CiudadForm = (EditText) findViewById(R.id.idCiudadForm);
        ProvinciaForm = (EditText) findViewById(R.id.idProvinciaForm);


        btnFin = (Button) findViewById(R.id.idBotonFinForm);
        btnFin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle enviarDatos = new Bundle();
                enviarDatos.putString("getNombre", NombreForm.getText().toString());
                enviarDatos.putString("getApellidos", ApellidosForm.getText().toString());
                enviarDatos.putString("getTemperatura", TemperaturaForm.getText().toString());
                enviarDatos.putString("getCiudad", CiudadForm.getText().toString());
                enviarDatos.putString("getProvincia", ProvinciaForm.getText().toString());






                Intent intent = new Intent(FormTemperatura.this,ResultadoForm.class);
                intent.putExtras(enviarDatos);
                startActivity(intent);
            }
        });




    }
}