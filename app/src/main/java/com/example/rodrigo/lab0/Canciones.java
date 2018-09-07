package com.example.rodrigo.lab0;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rodrigo on 3/09/2018.
 */


public class Canciones {
    private int Id;
    public String nombre;
    public String duracion;

    public Canciones(int id, String nombre, String duracion) {
        Id = id;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }


    public int getId(){
        return Id;
    }

    public void seId(int id){
        Id=id;
    }

    public List<Canciones> CancionesDisponibles(){

        List<Canciones> ListaCanciones = new ArrayList<Canciones>();

        ListaCanciones.add( new Canciones(1,"One","2:24"));
        ListaCanciones.add( new Canciones(2,"One","2:24"));
        ListaCanciones.add( new Canciones(3,"One","2:24"));
        ListaCanciones.add( new Canciones(4,"One","2:24"));
        ListaCanciones.add( new Canciones(5,"One","2:24"));
        ListaCanciones.add( new Canciones(6,"One","2:24"));
        ListaCanciones.add( new Canciones(7,"One","2:24"));
        ListaCanciones.add( new Canciones(8,"One","2:24"));
        ListaCanciones.add( new Canciones(9,"One","2:24"));
        ListaCanciones.add( new Canciones(10,"One","2:24"));

        return ListaCanciones;

    }


}
