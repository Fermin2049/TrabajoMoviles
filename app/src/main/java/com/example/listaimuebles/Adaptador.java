package com.example.listaimuebles;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import Modelos.Inmueble;

public class Adaptador extends ArrayAdapter<Inmueble> {

    private Context context;
    private List<Inmueble> lista;
    private LayoutInflater li;
    private int itemAMostrar;
    public Adaptador(@NonNull Context context, int resource, @NonNull List<Inmueble> objects,LayoutInflater li) {
        super(context, resource, objects);
        this.context = context;
        this.lista = objects;
        this.li = li;
        this.itemAMostrar=resource;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if(itemView==null) {
            itemView = li.inflate(itemAMostrar, parent, false);
            Log.d("salida if",itemView.toString());
        }

        ImageView foto = itemView.findViewById(R.id.imagen);
        TextView direccion=itemView.findViewById(R.id.direccionView);
        TextView precio=itemView.findViewById(R.id.precioView);
        
        Inmueble inmueble=lista.get(position);
        direccion.setText(inmueble.getDireccion());
        precio.setText(inmueble.getPrecio()+"");
        foto.setImageResource(inmueble.getImagen());

        return itemView;
    }

    public int getCount(){
        return lista.size();
    }
}
