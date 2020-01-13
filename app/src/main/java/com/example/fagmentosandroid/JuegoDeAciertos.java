package com.example.fagmentosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JuegoDeAciertos extends AppCompatActivity {

    String [] paises;
    String [] capitales;
    String [] paisesOrd;
    String [] capitalesOrd;
    ImageView imagenResultado;
    TextView paisUser;
    TextView capUser;
    ListView vistaListaPais;
    ListView vistaListaCap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);
        setTitle(R.string.txtBttnPrnPaises);

        vistaListaPais = findViewById(R.id.listaPaises);
        vistaListaCap = findViewById(R.id.listacapitales);
        paisUser = findViewById(R.id.lblPaisUsuario);
        capUser = findViewById(R.id.lblCapUsuario);
        imagenResultado = findViewById(R.id.imagenResultadoPaises);
        Resources res = getResources();
        paisesOrd = res.getStringArray(R.array.listPaises);
        capitalesOrd = res.getStringArray(R.array.listCapitales);


        paises = res.getStringArray(R.array.listPaises);
        List<String> listaDes = Arrays.asList(paises);
        Collections.shuffle(listaDes);
        ArrayAdapter <String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaDes);
        vistaListaPais.setAdapter(adaptador);

        capitales = res.getStringArray(R.array.listCapitales);
        listaDes = Arrays.asList(capitales);
        Collections.shuffle(listaDes);
        adaptador=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listaDes);
        vistaListaCap.setAdapter(adaptador);

        vistaListaPais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                paisUser.setText(vistaListaPais.getItemAtPosition(position).toString());
            }
        });

        vistaListaCap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                capUser.setText(vistaListaCap.getItemAtPosition(position).toString());
            }
        });
    }

    public void verificarPaisCap(View view) {
        String pais = paisUser.getText().toString();
        String cap = capUser.getText().toString();
        int indicePais=-1;
        int indiceCap=-2;
        if(paisUser.getText().toString().isEmpty()||capUser.getText().toString().isEmpty()){
            Toast.makeText(this, "No ha introducido correctamente el país o la capital", Toast.LENGTH_SHORT).show();
        }else {
            for (int i = 0; i < paisesOrd.length; i++) {
                if (paisesOrd[i].equals(pais)) {
                    indicePais = i;
                }
            }
            for (int i = 0; i < capitalesOrd.length; i++) {
                if (capitalesOrd[i].equals(cap)) {
                    indiceCap = i;
                }
            }
            if (indiceCap == indicePais) {
                imagenResultado.setImageResource(R.drawable.ic_acierto);
            } else {
                imagenResultado.setImageResource(R.drawable.ic_error);
            }
        }
    }

}
