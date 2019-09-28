package com.debora.atividade11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    protected TextView textPalpite;
    protected ImageView imgVerify;
    protected Button btnTentar;
    protected Button btnEncerrar;
    protected static int num;
    protected Bundle bundle;
    protected Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textPalpite = (TextView) findViewById(R.id.textPalpite);
        imgVerify = (ImageView) findViewById(R.id.imgVerify);
        btnEncerrar = (Button) findViewById(R.id.btnEncerrar);
        btnTentar = (Button) findViewById(R.id.btnTentar);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        int[] vetor = new int[2];
        vetor = b.getIntArray("chute");

        Log.v("", String.format("numero sorteado %d | chute: %d", vetor[0], vetor[1]));

        if (vetor[0] == vetor[1]){
            textPalpite.setText(R.string.acertou);
            imgVerify.setImageResource(R.drawable.emojifeliz);
        }
        else{
            textPalpite.setText(R.string.errou);
            imgVerify.setImageResource(R.drawable.emojichorando);
        }

        bundle = new Bundle();
        i = new Intent();

        btnEncerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = 0;

                bundle.putInt("Operacao", num);
                i = getIntent();
                i.putExtras(bundle);

                setResult(0, i);
                finish();
            }
        });

        btnTentar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
