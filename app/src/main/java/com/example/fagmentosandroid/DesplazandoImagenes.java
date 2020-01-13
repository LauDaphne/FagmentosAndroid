package com.example.fagmentosandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class DesplazandoImagenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);
        setTitle(R.string.txtBttnPrnMascotas);
        ViewPager vistadesp = findViewById(R.id.vistaPagina);
        vistadesp.setAdapter(new ClaseDesplazaImagenes(getSupportFragmentManager()));

    }

}
