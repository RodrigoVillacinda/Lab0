package com.example.rodrigo.lab0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rodrigo on 3/09/2018.
 */

public class Adapter extends BaseAdapter {

    Context contexto;
    List<Canciones> ListaCanciones;

    public Adapter(Context contexto, List<Canciones> listaCanciones) {
        this.contexto = contexto;
        ListaCanciones = listaCanciones;
    }

    @Override
    public int getCount() {
        return ListaCanciones.size(); //retorna la cantidad de elementos de la lista
    }

    @Override
    public Object getItem(int position) {
        return ListaCanciones.get(position); //retornal el objeto de la posición
    }

    @Override
    public long getItemId(int position) {
        return ListaCanciones.get(position).getId(); //id de la posicion indicada
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista = convertView;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.itemlistview, null);

        TextView NomCan = (TextView) vista.findViewById(R.id.Nom);
        NomCan.setText(ListaCanciones.get(position).getNombre().toString());

        TextView dura = (TextView) vista.findViewById(R.id.dur);
        dura.setText(ListaCanciones.get(position).getDuracion().toString());

        return vista;
    }

}
