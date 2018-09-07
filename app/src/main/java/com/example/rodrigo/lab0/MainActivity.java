package com.example.rodrigo.lab0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    //---------------Declarar--------------------------------
    private ListView ListaCan; //no se utiliza
    private EditText txtBusqueda; //lo que contendra la casilla
    private Button btnBusqueda; //accion del evento
    private Button btnAgregar;
    private ArrayList<Canciones> lista; //no se utiliza
    private ArrayList<Canciones> listaN;
    //-------------Fin declarar------------------------------


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListaCan = (ListView) findViewById(R.id.lsCanciones);

        txtBusqueda = (EditText) findViewById(R.id.txtBusqueda);
        btnBusqueda =  (Button) findViewById(R.id.btnBusqueda);
        btnAgregar = (Button) findViewById(R.id.btnAgregar);

        //obtiene los datos del txt, acciona el evento y lo agrega a la lista
        btnBusqueda.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String dato = txtBusqueda.getText().toString();

                ///aquie se agraga a la lista
                lista = new ArrayList<Canciones>();

                Diccionario diccionario = new Diccionario();
                Canciones resultado=diccionario.diccionario(dato);


                //lista.add(new Canciones(1, dato, "22"));
                lista.add(resultado);

                Adapter miAdaptador = new Adapter(getApplicationContext(), lista);

                ListaCan.setAdapter(miAdaptador);
            }
        } );

        listaN = new ArrayList<Canciones>();
        btnAgregar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String dato = txtBusqueda.getText().toString();

                ///aquie se agraga a la lista


                Diccionario diccionario = new Diccionario();
                Canciones resultado=diccionario.diccionario(dato);


                //lista.add(new Canciones(1, dato, "22"));
                listaN.add(resultado);


                Adapter miAdaptador = new Adapter(getApplicationContext(), listaN);

                ListaCan.setAdapter(miAdaptador);
            }
        } );

       // Collections.sort(listaN, (o1, o2) -> o1.getDuracion().compareTo(o2.getDuracion()));

        //Collections.sort(listaN, new Comparator<Canciones>() {
          //  @Override
            //public int compare(Canciones o1, Canciones o2) {
          //      return 0;
            //}
        //});


    }


    ///lista de canciones disponibles



}
