package com.example.rodrigo.lab0;

/**
 * Created by Rodrigo on 6/09/2018.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.jar.Attributes;

public class Diccionario {

    public Canciones diccionario(String name){

        //creamos el diccionario
        Map<String, String> DiccioanrioCanciones = new HashMap<String, String>(); //objeto,duracion

        List<Canciones> cancionesdisponibles = CancionesDisponibles();
        List<Canciones> listaresultado = new ArrayList<Canciones>();

        DiccioanrioCanciones.put(cancionesdisponibles.get(0).nombre, cancionesdisponibles.get(0).duracion);
        DiccioanrioCanciones.put(cancionesdisponibles.get(1).nombre, cancionesdisponibles.get(1).duracion);
        DiccioanrioCanciones.put(cancionesdisponibles.get(2).nombre, cancionesdisponibles.get(2).duracion);
        DiccioanrioCanciones.put(cancionesdisponibles.get(3).nombre, cancionesdisponibles.get(3).duracion);
        DiccioanrioCanciones.put(cancionesdisponibles.get(4).nombre, cancionesdisponibles.get(4).duracion);
        DiccioanrioCanciones.put(cancionesdisponibles.get(5).nombre, cancionesdisponibles.get(5).duracion);
        DiccioanrioCanciones.put(cancionesdisponibles.get(6).nombre, cancionesdisponibles.get(6).duracion);
        DiccioanrioCanciones.put(cancionesdisponibles.get(7).nombre, cancionesdisponibles.get(7).duracion);
        DiccioanrioCanciones.put(cancionesdisponibles.get(8).nombre, cancionesdisponibles.get(8).duracion);
        DiccioanrioCanciones.put(cancionesdisponibles.get(9).nombre, cancionesdisponibles.get(9).duracion);
       // DiccioanrioCanciones.put(cancionesdisponibles.get(10).nombre, cancionesdisponibles.get(10).duracion);

        String nombre=DiccioanrioCanciones.get(name);

        Canciones can=new Canciones(1,name,DiccioanrioCanciones.get(name));

        return can;
    }


    public List<Canciones> CancionesDisponibles(){

        List<Canciones> ListaCanciones = new ArrayList<Canciones>();

        ListaCanciones.add( new Canciones(1,"One","1:24"));
        ListaCanciones.add( new Canciones(2,"Engel","2:24"));
        ListaCanciones.add( new Canciones(3,"Toxicity","3:24"));
        ListaCanciones.add( new Canciones(4,"Fear of the dark","4:24"));
        ListaCanciones.add( new Canciones(5,"Hallowed","5:24"));
        ListaCanciones.add( new Canciones(6,"Black","6:24"));
        ListaCanciones.add( new Canciones(7,"Dance of death","7:24"));
        ListaCanciones.add( new Canciones(8,"Legendado","8:24"));
        ListaCanciones.add( new Canciones(9,"Your love","9:24"));
        ListaCanciones.add( new Canciones(10,"Painkiller","0:24"));

        return ListaCanciones;

    }

}
