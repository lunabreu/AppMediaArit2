package com.example.lunaabreu.appmediaarit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.content.Intent.*;

public class Resultado extends AppCompatActivity {



    // declara os objetos que serão associados aos elementos de tela

    TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        // Associa os objetos aos elementos de tela
        tvResultado= findViewById(R.id.tvResultado);

        Bundle data = getIntent().getExtras();


        // pega o parametro usado na tela anterior
        double media= data.getDouble("media");

        String msg= "A média aritmética entre estes 3 números é "+ media;
        tvResultado.setText(msg);


    }
}
