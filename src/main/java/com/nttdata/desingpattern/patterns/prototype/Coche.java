package com.nttdata.desingpattern.patterns.prototype;

public class Coche extends Vehiculo{

    public Coche(String marca, int id) {
        super(marca, id);
    }

    @Override
    public Vehiculo clone() {
        return new Coche(this.marca, this.id);
    }

}
