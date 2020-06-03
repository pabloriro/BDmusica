package com.example.emes.bdmusica;

public class producto {

    int id;
    String nombre;
    String album;
    String cancion;

    public producto(int id, String nombre, String album, String cancion)
    {
        this.id = id;
        this.nombre = nombre;
        this.album = album;
        this.cancion = cancion;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }


}
