package com.example.fagmentosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NumerosPrimos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);
        setTitle(R.string.txtBttnPrnPrimos);
    }

    public void calcularPrimo(View view) {
        final EditText numUsuario = (EditText) findViewById(R.id.txtNumeroUsuario);
        if(numUsuario.getText().toString().isEmpty()){
            Toast.makeText(this, "No ha introducido ningún número", Toast.LENGTH_SHORT).show();
        }else {
            int numero= Integer.parseInt(numUsuario.getText().toString());
            int contador = 2;
            String resultado= getString(R.string.solucionInicio)+" "+numero;
            boolean primo=true;
            if (numero < 2) {
                resultado = resultado + getString(R.string.solucionNoPrimo);
            } else {
                while ((primo) && (contador != numero)) {
                    if (numero % contador == 0)
                        primo = false;
                    contador++;
                }
                if (primo) {
                    resultado = resultado + getString(R.string.solucionPrimo);
                } else {
                    resultado = resultado + getString(R.string.solucionNoPrimo);
                }
            }

            Toast.makeText(this, "" + resultado, Toast.LENGTH_LONG).show();
        }
        numUsuario.setText("");
    }
}
