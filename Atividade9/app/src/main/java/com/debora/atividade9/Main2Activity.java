package com.debora.atividade9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    public static final String TAG = "Lifecycle-Main2Activity";
    public static int num, valorRecebido;
    protected TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String vetor[] = {"oi", "Olá", "Hello", "Welcome", "AA", "BB", "CC", "DD", "EE", "FF"};

        Random gerador = new Random();
        num = gerador.nextInt(10);

        Intent i = getIntent();
        Bundle bundle = i.getExtras();

        valorRecebido = bundle.getInt("num");

        t = new TextView(this);
        t.setText(String.format("String sorteada: " + vetor[num]));
        setContentView(t);

        Bundle b = new Bundle();
        b.putString("element", vetor[num]);
        Log.i(TAG, "string sorteada " + num + " String " + vetor[num]);

        Intent intent = getIntent();
        intent.putExtras(b);

        setResult(0, intent);

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
