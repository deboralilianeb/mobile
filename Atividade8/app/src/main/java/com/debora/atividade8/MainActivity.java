package com.debora.atividade8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "LifeCycle";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            Button button = new Button(this);
            button.setText("Realizar operação");
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Random random = new Random();
                    int num = random.nextInt(4);
                    Log.i(TAG,String.format("Operação sorteada %d", num));
                    int op1 = random.nextInt(100);
                    Log.i(TAG,String.format("Operador 1 %d", op1));
                    int op2= random.nextInt(100);
                    Log.i(TAG,String.format("Operador 2 %d", op2));

                    Bundle b = new Bundle();
                    b.putInt("num", num);
                    b.putInt("op1", op1);
                    b.putInt("op2", op2);



                    Intent intent = new Intent(getApplicationContext(),
                            Main2Activity.class);
                    intent.putExtras(b);
                    startActivity(intent);


                }
            });
            setContentView(button);

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


