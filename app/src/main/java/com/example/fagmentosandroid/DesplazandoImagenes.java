package com.example.fagmentosandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.ViewParent;

public class DesplazandoImagenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);

        ViewPager vistadesp = findViewById(R.id.vistaPagina);
        vistadesp.setAdapter(new ClaseDesplazaImagenes(getSupportFragmentManager()));

    }

}
