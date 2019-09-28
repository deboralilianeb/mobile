package com.debora.atividade_007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button button = new Button(this);
        button.setText("Activity 2");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int numero = random.nextInt(100);
                Bundle b = new Bundle();
                b.putString("num", String.format("%d", numero));

                Intent intent = new Intent(getApplicationContext(),
                        Main2Activity.class);
                intent.putExtras(b);
                startActivity(intent);


            }
        });
        setContentView(button);

    }
}
