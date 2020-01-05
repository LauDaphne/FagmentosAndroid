package com.example.fagmentosandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class JuegoDeAciertos extends AppCompatActivity {

    String [] paises;
    final String [] capitales = {"Madrid", "París", "Berlín","Bruselas", "Dublín", "Tokio", "Lisboa","Moscú","Ottawa","Pekín"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);
        Resources res = getResources();
        paises = res.getStringArray(R.array.listPaises);
        ListView lista = findViewById(R.id.listaPaises);
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentPrinPaises, new PaisFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentPrinCapitales, new CapitalFragment()).commit();
    }

    public void verificarPaisCap(View view) {
        final TextView paisUser = findViewById(R.id.lblPaisUsuario);
        final TextView capUser = findViewById(R.id.lblCapUsuario);
        final ImageView imagenResultado = findViewById(R.id.imagenResultadoPaises);
        String pais = paisUser.getText().toString();
        String cap = capUser.getText().toString();
        int indicePais=-1;
        int indiceCap=-1;
        for(int i=0; i<paises.length;i++){
            if(paises[i].equals(pais)){
                indicePais=i;
            }
        }
        for(int i=0; i<capitales.length;i++){
            if(capitales[i].equals(cap)){
                indiceCap=i;
            }
        }
        if(indiceCap==indicePais){
            imagenResultado.setImageResource(R.drawable.acierto);
        }else{
            imagenResultado.setImageResource(R.drawable.error);
        }
    }

}
