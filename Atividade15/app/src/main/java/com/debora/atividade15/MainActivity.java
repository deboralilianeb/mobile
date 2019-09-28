package com.debora.atividade15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    private EditText editTextnome, editTextidade, editTextrenda;
    private Button btnsalvar;
    private RadioButton radioButtonF, radioButtonM;
    private String sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextnome = (EditText) findViewById(R.id.nome);
        editTextidade = (EditText) findViewById(R.id.idade);
        editTextrenda = (EditText) findViewById(R.id.renda);
        btnsalvar = (Button) findViewById(R.id.btnSalvar);
        radioButtonF = (RadioButton) findViewById(R.id.radioFemale);
        radioButtonM = (RadioButton) findViewById(R.id.radioMasc);


    }


    public  void onClickSalvar(View view){
        String nome= editTextnome.getText().toString();

        int idade = Integer.parseInt(editTextidade.getText().toString());
        float renda = Float.parseFloat(editTextrenda.getText().toString());


        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
        Bundle b = new Bundle();

        b.putString("chave_nome", nome);
        b.putInt("chave_idade", idade);
        b.putFloat("chave_renda", renda);



        if(radioButtonM.isSelected()) {
            sexo = "Masculino";
            b.putString("sexo",sexo);
        }
        else {
            sexo = "Feminino";
            b.putString("sexo",sexo);
        }

        intent.putExtras(b);
        startActivity(intent);


    }



}
