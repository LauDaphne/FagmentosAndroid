package com.example.fagmentosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class SeleccionandoImagenes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);
    }

    public void seleccionarRosa(View view) {
       getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFlores, new RosaFragment()).commit();
    }
    public void seleccionarAzahar(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFlores, new AzaharFragment()).commit();
    }
    public void seleccionarClavel(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFlores, new ClavelFragment()).commit();
    }

    public void seleccionarTulipan(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFlores, new TulipanFragment()).commit();
    }
}
