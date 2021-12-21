package com.nttdata.desingpattern;

import com.nttdata.desingpattern.patterns.prototype.Moto;
import com.nttdata.desingpattern.patterns.prototype.Vehiculo;
import com.nttdata.desingpattern.patterns.singleton.Coche;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class DesingpatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesingpatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("**************************");
		System.out.println("*****PATRON SINGLETON*****");
		Coche coche1 = Coche.getInstance("BMW");
		System.out.println(coche1.getMarca());
		System.out.println("**************************");

		System.out.println("******************************************");
		System.out.println("************PATRON PROTOTYPE**************");
		Vehiculo coche = new com.nttdata.desingpattern.patterns.prototype.Coche("BMW", 1);
		Vehiculo moto = new Moto("Yamaha", 2);

		Vehiculo v1 = coche.clone();
		Vehiculo v2 = moto.clone();
		System.out.println(v1.getMarca());
		System.out.println(v2.getId());
		System.out.println("******************************************");
	}
}
