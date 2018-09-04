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
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView Lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void AgregarLista(View Vista){


        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_expandable_list_item_1);

    }

    public void BuscaLista(View Vista){

    }

    public void MostrarCanciones(){

        TextView TextoResultado = (TextView)findViewById(R.id.btnBuscar);


    }

    public void ListaCanciones(){

        List<Canciones> lista = new ArrayList<>();

        Canciones cancion = new Canciones();
        cancion.setNombre("One");
        cancion.setDuracion("3:14");
        lista.add(cancion);

        cancion = new Canciones();
        cancion.setNombre("One");
        cancion.setDuracion("3:14");
        lista.add(cancion);

        cancion = new Canciones();
        cancion.setNombre("One");
        cancion.setDuracion("3:14");
        lista.add(cancion);

        cancion = new Canciones();
        cancion.setNombre("One");
        cancion.setDuracion("3:14");
        lista.add(cancion);

        cancion = new Canciones();
        cancion.setNombre("One");
        cancion.setDuracion("3:14");
        lista.add(cancion);

        cancion = new Canciones();
        cancion.setNombre("One");
        cancion.setDuracion("3:14");
        lista.add(cancion);

        cancion = new Canciones();
        cancion.setNombre("One");
        cancion.setDuracion("3:14");
        lista.add(cancion);
    }


}
