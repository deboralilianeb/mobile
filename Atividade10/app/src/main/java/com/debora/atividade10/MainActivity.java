package com.debora.atividade10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected EditText altura, peso;
    protected TextView txtimc;
    public float resultadoimc, peso1, altura1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button imc = (Button) findViewById(R.id.btncalculaimc);

        imc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                altura = (EditText) findViewById(R.id.editaaltura);
                peso = (EditText) findViewById(R.id.editapeso);
                txtimc = (TextView) findViewById(R.id.txtimc);

                altura1 = Float.parseFloat(altura.getText().toString());
                peso1 = Float.parseFloat(peso.getText().toString());
                resultadoimc = peso1 / (altura1 * altura1);

                if (resultadoimc < 18.5){
                    txtimc.setText(String.format("%.2f - Subnutrição ou abaixo do peso ideal ", resultadoimc));
                }else if (resultadoimc >= 18.5 && resultadoimc < 25){
                    txtimc.setText(String.format("%.2f - Saudável", resultadoimc));
                }else if (resultadoimc >= 25 && resultadoimc < 30){
                    txtimc.setText(String.format("%.2f - Sobrepeso", resultadoimc));
                }else if (resultadoimc >= 30 && resultadoimc < 35){
                    txtimc.setText(String.format("%.2f - Obesidade moderada", resultadoimc));
                }else if (resultadoimc >= 35 && resultadoimc < 40){
                    txtimc.setText(String.format("%.2f - Obesidade clínica", resultadoimc));
                }else {
                    txtimc.setText(String.format("%.2f - Obesidade Mórbida", resultadoimc));
                }
            }
        });

    }
}