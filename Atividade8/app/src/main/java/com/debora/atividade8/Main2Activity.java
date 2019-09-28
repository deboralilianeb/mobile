package com.debora.atividade8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView t = new TextView(this);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        int op1=0, op2=0, result=0;

        switch (b.getInt("num")){
            case 0:
                op1=b.getInt("op1");
                op2=b.getInt("op2");
                result = op1+op2;
                t.setText(String.format("%d + %d = %d", op1, op2,result));
                setContentView(t);

                t.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        finish();
                    }
                });
                break;
            case 1:
                op1=b.getInt("op1");
                op2=b.getInt("op2");
                result = op1-op2;
                t.setText(String.format("%d - %d = %d", op1, op2,result));
                setContentView(t);

                t.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        finish();
                    }
                });
                break;
            case 2:
                op1=b.getInt("op1");
                op2=b.getInt("op2");
                result = op1*op2;
                t.setText(String.format("%d * %d = %d", op1, op2,result));
                setContentView(t);

                t.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        finish();
                    }
                });
                break;
            case 3:
                op1=b.getInt("op1");
                op2=b.getInt("op2");
                result = op1/op2;
                t.setText(String.format("%d / %d = %d", op1, op2,result));
                setContentView(t);

                t.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        finish();
                    }
                });
                break;

        }




    }


}