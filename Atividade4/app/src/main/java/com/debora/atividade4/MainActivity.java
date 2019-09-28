package com.debora.atividade4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "LifeCycle";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView t = new TextView(this);


        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Integer> v = new ArrayList<>();
                for(int i=0; i<6;i++) {
                    Random r = new Random();
                    int num = r.nextInt(60) + 1;
                    v.add(num);
                }
                    t.setText(String.format("%d , %d , %d , %d , %d, %d ", v.get(0) , v.get(1), v.get(2),v.get(3), v.get(4), v.get(5)));
                    Log.i(TAG, "Sorteando novo conjunto de numeros");

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
