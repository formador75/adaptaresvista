package com.miempresa.ejemploadaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptadorRecicler extends RecyclerView.Adapter<AdaptadorRecicler.ViewHolder> {
    private String[] datos;

    public AdaptadorRecicler(String[] datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public AdaptadorRecicler.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View vista = LayoutInflater
               .from(parent.getContext())
               .inflate(R.layout.text_row_item, parent, false);
       return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRecicler.ViewHolder holder, int position) {

        holder.getTextview().setText(datos[position]);
    }

    @Override
    public int getItemCount() {
        return datos.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView textview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textview = itemView.findViewById(R.id.textView);
        }

        public TextView getTextview(){
            return textview;
        }
    }
}
