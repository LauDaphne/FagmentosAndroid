package com.example.fagmentosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intentBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarActivityPrimos(View view) {
        intentBoton= new Intent(this, NumerosPrimos.class);
        startActivity(intentBoton);
    }

    public void iniciarActivityPaises(View view) {
        intentBoton= new Intent(this, JuegoDeAciertos.class);
        startActivity(intentBoton);
    }

    public void iniciarActivityMascotas(View view) {
        intentBoton= new Intent(this, DesplazandoImagenes.class);
        startActivity(intentBoton);
    }

    public void iniciarActivityFlores(View view) {
        intentBoton= new Intent(this, SeleccionandoImagenes.class);
        startActivity(intentBoton);
    }
}
