package com.example.fastrest;

public class producto {
    private String descripcion;
    private String nombre;
    private String precio;

    public producto(String descripcion, String nombre, String precio) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
    }
    public producto(){

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
