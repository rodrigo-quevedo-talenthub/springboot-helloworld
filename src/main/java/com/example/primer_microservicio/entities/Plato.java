package com.example.primer_microservicio.entities;

public class Plato {
    private int id;
    private String nombre;
    private float precio;
    private String urlFoto;

    public Plato(int id, String nombre, float precio, String urlFoto) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.urlFoto = urlFoto;
    }

    // Getters (para parsear JSON)
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public float getPrecio() { return precio; }
    public String getUrlFoto() { return urlFoto; }
}