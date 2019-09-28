package com.debora.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected EditText op1, op2;
    TextView resultado, text_msg;
    public int num = 0;
    public String tvop1, tvop2;
    public Double operando1, operando2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op1 = (EditText) findViewById(R.id.edit_operando1);
        op2 = (EditText) findViewById(R.id.edit_operando2);
        resultado = (TextView) findViewById(R.id.resultado);

        Button add = (Button) findViewById(R.id.button_adicionar);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvop1 = op1.getText().toString();
                tvop2 = op2.getText().toString();

                operando1 = Double.valueOf(tvop1);
                operando2 = Double.valueOf(tvop2);

                resultado.setText(String.format("%.2f", operando1 + operando2));
            }
        });

        Button sub = (Button) findViewById(R.id.button_subtrair);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvop1 = op1.getText().toString();
                tvop2 = op2.getText().toString();

                operando1 = Double.valueOf(tvop1);
                operando2 = Double.valueOf(tvop2);

                resultado.setText(String.format("%.2f", operando1 - operando2));
            }
        });

        Button mult = (Button) findViewById(R.id.button_multiplicar);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvop1 = op1.getText().toString();
                tvop2 = op2.getText().toString();

                operando1 = Double.valueOf(tvop1);
                operando2 = Double.valueOf(tvop2);

                resultado.setText(String.format("%.2f", operando1 * operando2));
            }
        });

        Button div = (Button) findViewById(R.id.button_dividir);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvop1 = op1.getText().toString();
                tvop2 = op2.getText().toString();

                operando1 = Double.valueOf(tvop1);
                operando2 = Double.valueOf(tvop2);

                if(operando2 != 0)
                    resultado.setText(String.format("%.2f", operando1 / operando2));
                else
                    resultado.setText("ERRO: Não é possível divisão por 0");
            }
        });
    }
}