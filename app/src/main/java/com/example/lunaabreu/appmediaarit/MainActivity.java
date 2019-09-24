package com.example.lunaabreu.appmediaarit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    // declara os objetos dos campos na tela
EditText edNum1;
EditText edNum2;
EditText edNum3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        //associa os elementos da tela aos objetos declarados
       edNum1= (EditText) findViewById(R.id.edNum1);
       edNum2= (EditText) findViewById(R.id.edNum2);
       edNum3= (EditText) findViewById(R.id.edNum3);
    }


    public void calcularMedia(View view) {
      // declarando as variaveis que farão o calculo
        double num1= Double.parseDouble(edNum1.getText().toString());
        double num2= Double.parseDouble(edNum2.getText().toString());
        double num3= Double.parseDouble(edNum3.getText().toString());

        double media = (num1+num2+num3) / 2;


        // declara o controle Intent que será usado para identificar a proxima tela
        Intent intent = new Intent(this, Resultado.class);

        // insere um parametro a ser usado na proxima tela
        intent.putExtra("media", media);

        // chama a proxima tela
        startActivity(intent);

    }


}
