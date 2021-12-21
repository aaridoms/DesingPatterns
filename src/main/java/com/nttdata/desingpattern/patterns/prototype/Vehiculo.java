package com.nttdata.desingpattern.patterns.prototype;

public abstract class Vehiculo {

    public String marca;
    public int id;

    public Vehiculo(String marca, int id) {
        this.marca = marca;
        this.id = id;
    }

    // Guetters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract Vehiculo clone();
}
