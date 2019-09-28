package com.debora.atividade9;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Lifecycle-MainActivity";
    private TextView textElemento;
    public static int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        textElemento = new TextView(this);
        textElemento.setText("Escolha uma activity qualquer");
        setContentView(textElemento);
        textElemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                num = random.nextInt(10);

                Bundle b = new Bundle();
                b.putInt("num",num);

                if (num == 2){
                    Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                    intent.putExtras(b);
                    startActivityForResult(intent, 0);
                } else if (num == 3){
                    Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                    intent.putExtras(b);
                    startActivityForResult(intent, 0);
                }else{
                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                    intent.putExtras(b);
                    startActivityForResult(intent, 0);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if(data != null){
            String valor = data.getExtras().getString("element");
            textElemento.setText("Valor: " + valor);
            Log.i(TAG, "valor " + valor);
            setContentView(textElemento);
        }

    }
}
