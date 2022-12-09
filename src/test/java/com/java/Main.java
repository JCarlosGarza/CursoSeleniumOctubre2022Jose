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

        Motocicleta motocicleta1 = new Motocicleta();
        motocicleta1.encender();
        motocicleta1.acelerar();

        // Actividad
        // Crear una clase que se llama Moto y vamos a crear 3 diferentes tipos de motos con estados y comportamientos

        Moto moto1 = new Moto();
        moto1.setColor("rojo");
        moto1.setMarca("marca1");
        moto1.setMotor("motor1");
        moto1.encender();
        Moto moto2 = new Moto();
        moto2.setColor("azul");
        moto2.setLlantas(3);
        moto2.encender();
        moto2.acelerar();
        Moto moto3 = new Moto();
        moto3.setColor("verde");
        moto3.setAsientos(2);
        moto3.frenar();

        System.out.println("Moto1 color: " + moto1.getColor() + "\n Moto2 llantas:" +  moto2.getLlantas() + "\n Moto3 asientos: " + moto3.getAsientos());
    }
}
