package com.example.rodrigo.lab0;

/**
 * Created by Rodrigo on 3/09/2018.
 */

public class Canciones implements Comparable<Canciones> {
    public String nombre;
    public String duracion;
    public int segundos;
    public String artista;

    @Override
    public int compareTo(Canciones nuevacancion){
        int compare = nombre.compareTo(nuevacancion.nombre);
        if (compare == 0)
        {
            compare = Integer.compare(segundos, nuevacancion.segundos);
        }
        return compare;
    }

    public int getSegundos(){
        return segundos;
    }

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
        String[] partes = duracion.split(";");
        this.segundos = (Integer.parseInt(partes[0]))*60+(Integer.parseInt(partes[1]));
    }

    public void setArtista(String artista){this.artista = artista;}

    //public void setSegundos(int segundos){this.segundos = segundos;}
}
