package com.miempresa.ejemploadaptadores;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

public class AdaptadorLista implements ListAdapter {

    private final String[] datos;
    public AdaptadorLista(String[] datos){
        this.datos = datos;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public boolean isEnabled(int i) {
        return true;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public int getCount() {
        return datos.length;
    }

    @Override
    public Object getItem(int i) {
        return datos[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView vista = (TextView) LayoutInflater.from(viewGroup.getContext())
                .inflate(android.R.layout.test_list_item, viewGroup, false);
        vista.setText(datos[i]);
        return vista;
    }

    @Override
    public int getItemViewType(int i) {
        return i;
    }

    @Override
    public int getViewTypeCount() {
        return datos.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
