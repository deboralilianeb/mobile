package com.debora.atividade5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    public static final String TAG = "LifeCycle";

    public static  int cont=0;
    public String geraContagem(){
        return String.format("%d", ++cont);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button b = new Button(this);
        b.setText("Activity 1");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(intent);
                Log.i(TAG, "Activity 1 chamada");
            }
        });


        setContentView(b);
        Log.i(TAG,"onCreat");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "OnStart" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"OnREstart" );
    }
}
