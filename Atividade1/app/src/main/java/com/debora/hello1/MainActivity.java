package com.debora.hello1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public  class  Tags{
        public final static  String ATIVITY1 = "Activity1";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(Tags.ATIVITY1,"Entrando no OnCreat");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView rotulo = new TextView( this);


        // 1 - Soma de dois números inteiros;
        Integer numInt1 = 5 , numInt2 = 7;
        Integer somaInt1 = numInt1 + numInt2;
        //printresult = printresult + String.format("1: ", (Integer) somaInt1);

        // 2 - Soma de dois números flutuantes;
        double numf1 = 4.63;
        double numf2 = 5.568;
        double soma2 = numf1 + numf2;
        //printresult = printresult+ String.format("\n 2: ", (double) soma2);


        // 3- Multiplicação de dois números de ponto flutuante;
        double numf3 = 5.47;
        double numf4 = 8.63;
        double multf3 = numf3 * numf4;

        // 4 - Resultado da divisão de dois números de ponto flutuante;
        double div4 = numf1 / numf2;

        // 5. Exiba o resultado da divisão de um número de ponto flutuante por zero (seu app não deve parar de funcionar);
        double div5 = numf4 / 0.0;

        // 6.  Resultado da divisão de um número inteiro por zero.

        rotulo.setGravity(Gravity.CENTER_VERTICAL);
        setContentView(rotulo);
        //setContentView(R.layout.activity_main);

        try{
            int div6 = numInt2 / 0;
            rotulo.setText(String.format("Exercicio 1 -  %d", (int) somaInt1)
                    + String.format("\n Exercício 2 -  %.2f", (double) soma2)
                    + String.format("\n Exercício 3 - %.2f", (double) multf3)
                    + String.format("\n Exercício 4 -  %.2f", (double) div4)
                    + String.format("\n Exercício 5 - %.2f", (double) div5)
                    + String.format("\n Exercício 6 -  %d", (int) div6));
        }catch (ArithmeticException aEx) {
            rotulo.setText(String.format(" Exercício 1 - %d", (int) somaInt1)
                    + String.format("\n Exercício 2 -  %.2f", (double) soma2)
                    + String.format("\n  Exercício 3 -  %.2f", (double) multf3)
                    + String.format("\n  Exercício 4 -  %.2f", (double) div4)
                    + String.format("\n  Exercício 5 -  %.2f", (double) div5)
                    + String.format("\n  Exercício 6 -  Erro na operacao: %s", aEx.getMessage()));
        }

        rotulo.setGravity(Gravity.CENTER);
        setContentView(rotulo);

        Log.v("Main Activity", "Saindo do onCreat");
    }
}
