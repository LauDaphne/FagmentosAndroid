package com.example.fagmentosandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SeleccionandoImagenes extends AppCompatActivity {

    Button bttnRosa;
    Button bttnAzahar;
    Button bttnClavel;
    Button bttnTulipan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);

        bttnRosa = findViewById(R.id.bttnRosa);
        bttnAzahar = findViewById(R.id.bttnAzahar);
        bttnClavel = findViewById(R.id.bttnClavel);
        bttnTulipan = findViewById(R.id.bttnTulipan);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFlores, new RosaFragment()).commit();


        bttnRosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFlores, new RosaFragment()).commit();
            }
        });

        bttnAzahar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFlores, new AzaharFragment()).commit();
            }
        });

        bttnClavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFlores, new ClavelFragment()).commit();
            }
        });

        bttnTulipan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentFlores, new TulipanFragment()).commit();
            }
        });

    }
}
