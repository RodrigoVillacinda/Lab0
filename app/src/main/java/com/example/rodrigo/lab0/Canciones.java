package com.example.rodrigo.lab0;

/**
 * Created by Rodrigo on 3/09/2018.
 */

public class Canciones /*Comparable*/ {
    public String nombre;
    public String duracion;
    public String artista;
/*
    @Override
    public int compareTo(compareCan){
        //int comparenom =
    }
*/
    public String getNombre() {
        return nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getArtista(){return artista;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setArtista(String artista){this.artista = artista;}
}
