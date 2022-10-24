package com.miempresa.ejemploadaptadores;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class AdaptadorSpiner implements SpinnerAdapter {
    private final String[] datos;

    public AdaptadorSpiner(String[] datos){
        this.datos=datos;
    }



    @Override
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        CheckedTextView vista = (CheckedTextView) LayoutInflater
                .from(viewGroup.getContext())
                .inflate(android.R.layout.simple_spinner_dropdown_item, viewGroup, false);
        vista.setText(datos[i]);
        return vista;
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
        TextView vista = (TextView) LayoutInflater
                .from(viewGroup.getContext())
                .inflate(android.R.layout.simple_spinner_item, viewGroup, false);
        vista.setText(datos[i]);
        return vista;
    }

    @Override
    public int getItemViewType(int i) {
        return i;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
