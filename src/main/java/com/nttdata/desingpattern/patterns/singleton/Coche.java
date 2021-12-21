package com.nttdata.desingpattern.patterns.singleton;

public class Coche {

    private String marca;
    private static Coche coche;

    public Coche(String marca) {
        this.marca = marca;
    }

    public static Coche getInstance(String marca) {
        if (coche == null) {
            coche = new Coche(marca);
        } else {
            System.out.println("No se puede crear el objeto");
        }
        return coche;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static Coche getCoche() {
        return coche;
    }

    public static void setCoche(Coche coche) {
        Coche.coche = coche;
    }
}
