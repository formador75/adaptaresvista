package com.miempresa.ejemploadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lista = findViewById(R.id.listaview);
        String[] elementos = new String[]{"Elemento 1", "elemento 2", "Elemento 3", "Elemento 4"};
        AdaptadorLista adaptadorLista = new AdaptadorLista(elementos);
        lista.setAdapter(adaptadorLista);

    }
}