package com.debora.atividade15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    public static final String TAG = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView t = new TextView( this);

        Intent i = getIntent();
        Bundle b = i.getExtras();

        if(b!=null)
        {
            String nome = b.getString("chave_nome");
            Log.i(TAG,String.format("Nome: "+nome));
            int idade = b.getInt("chave_idade");
            Log.i(TAG,String.format("Idade %d ",idade));
            float renda = b.getFloat("chave_renda");
            Log.i(TAG,String.format("Renda: %2f",renda));
            String sexo = b.getString("sexo");
            Log.i(TAG,String.format("Sexo: "+sexo));


            t.setText(String.format("Nome: "+nome)
            +String.format("\nIdade: %d" ,(int)idade)
            + String.format("\nRenda:  %.2f",(float)renda)
            +String.format("\nSexo: "+sexo));

        }

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        setContentView(t);

    }
}
