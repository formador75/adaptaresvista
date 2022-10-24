package com.miempresa.ejemploadaptadores;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        String[] elementos = new String[]{"Elemento 1", "Slemento 2", "Elemento 3", "Elemento 4","Elemento 1", "Slemento 2", "Elemento 3", "Elemento 4"};
        AdaptadorLista adaptadorLista = new AdaptadorLista(elementos);
        AdaptadorSpiner adaptadorSpiner = new AdaptadorSpiner(elementos);
        AdaptadorRecicler adaptadorRecicler = new AdaptadorRecicler(elementos);
        lista.setAdapter(adaptadorLista);
        spinner.setAdapter(adaptadorSpiner);
        recyclerView.setAdapter(adaptadorRecicler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}