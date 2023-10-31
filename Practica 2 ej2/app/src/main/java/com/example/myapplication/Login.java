package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText loginUsuario, loginContraseña;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginUsuario = (EditText) findViewById(R.id.idUsuario);
        loginContraseña = (EditText) findViewById(R.id.idPassword);

        btnLogin = (Button) findViewById(R.id.idBoton);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario= loginUsuario.getText().toString();
                String contraseña = loginContraseña.getText().toString();

                if (usuario.equals("admin")&&(contraseña.equals("admin"))){
                    Toast.makeText(Login.this, "Registrado correctamente", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),PantallaMenuPrincipal.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(Login.this, "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}