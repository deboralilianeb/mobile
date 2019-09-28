package com.debora.atividade6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    public static final String TAG = "Lifecycle-Main2Activity";
    static int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "OnCreate()");
        Random random = new Random();

        num = random.nextInt(100);
        setResult(num);
        finish();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "OnStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "OnDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "OnPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "OnResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "OnRestart()");
    }
}
