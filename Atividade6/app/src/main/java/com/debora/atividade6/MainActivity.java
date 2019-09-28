package com.debora.atividade6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Lifecycle-MainActivity";
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "OnCreate()");

        b = new Button(this);

        setContentView(b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(i, 0);
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        b.setText(String.format("%d ", resultCode));
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