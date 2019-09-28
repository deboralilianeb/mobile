package com.debora.atividade3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final TextView  t = new TextView(this);

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random r = new Random();
                int num = r.nextInt(99)+1;
                t.setText(String.format("%d", num));

                Log.i(TAG, "Sorteando novo numero");


            }
        });
        setContentView(t);
     Log.i(TAG, "OnCreat");
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
