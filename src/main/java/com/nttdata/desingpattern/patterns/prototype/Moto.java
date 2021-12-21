package com.nttdata.desingpattern.patterns.prototype;

public class Moto extends Vehiculo{

    public Moto(String marca, int id) {
        super(marca, id);
    }

    @Override
    public Vehiculo clone() {
        return new Moto(this.marca, this.id);
    }
}
