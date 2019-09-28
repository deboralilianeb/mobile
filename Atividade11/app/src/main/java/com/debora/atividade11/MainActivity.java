package com.debora.atividade11;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    protected EditText edit_chute;
    protected Button btn_chute;
    public int num = 0, chute;
    protected int[] vetor = new int[2];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random gerador = new Random();
        num = gerador.nextInt(11) ;
        Log.v("", String.format("numero sorteado: %d", num));

        edit_chute = (EditText) findViewById(R.id.edit_tentativa);
        btn_chute = (Button) findViewById(R.id.button_adivinhar);

        btn_chute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chute = Integer.parseInt(edit_chute.getText().toString());

                vetor[0] = num;         vetor[1] = chute;
                Log.v("", String.format("numero sorteado %d | chute: %d", num, chute));

                Bundle b = new Bundle();

                b.putIntArray("chute", vetor);

                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtras(b);
                startActivityForResult(intent, 0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        int num;

        if(data != null){
            num = data.getExtras().getInt("Operaçao");

            if (num == 0){
                finish();
            }
        }
    }
}
