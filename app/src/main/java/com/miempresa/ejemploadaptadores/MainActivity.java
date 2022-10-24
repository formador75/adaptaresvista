package com.miempresa.ejemploadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lista = findViewById(R.id.listaview);
        Spinner spinner = findViewById(R.id.spinner);
        String[] elementos = new String[]{"Elemento 1", "Slemento 2", "Elemento 3", "Elemento 4","Elemento 1", "Slemento 2", "Elemento 3", "Elemento 4"};
        AdaptadorLista adaptadorLista = new AdaptadorLista(elementos);
        AdaptadorSpiner adaptadorSpiner = new AdaptadorSpiner(elementos);
        lista.setAdapter(adaptadorLista);
        spinner.setAdapter(adaptadorSpiner);
    }
}