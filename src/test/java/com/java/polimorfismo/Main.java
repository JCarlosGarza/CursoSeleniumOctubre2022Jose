package com.java.polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal toto = new Perro();
        toto.makeNoise();

        Animal misifus = new Gato();
        misifus.makeNoise();

        toto.comer();
        misifus.comer();
    }
}
