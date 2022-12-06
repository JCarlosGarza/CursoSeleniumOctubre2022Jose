package com.java;

public class Main {

    public static void main(String[] args) {

        Coche coche1 = new Coche();
        coche1.setLlantas(4);
        coche1.setAsientos(2);
        coche1.setMotor("gasolina");

        System.out.println("El coche tiene " + coche1.getLlantas() + " llantas y tiene un motor de " + coche1.getMotor() );

        Coche coche2 = new Coche("azul", "honda", "gasolina", 4, 2);
        System.out.println("La marca del coche es: " + coche2.getMarca() + " y tiene " + coche2.getAsientos() + " asientos");

        coche1.encender();
        coche1.acelerar();

        // Actividad
        // Crear una clase que se llama Moto y vamos a crear 3 diferentes tipos de motos con estados y comportamientos

        Motocicleta moto1 = new Motocicleta();
        moto1.encender();
        moto1.acelerar();
    }
}
