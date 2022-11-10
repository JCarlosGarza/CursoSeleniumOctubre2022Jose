package com.java;

public class Ciclos {
    public static void main(String[] args) {
        // while
        // do while
        // for

        // contador del 1-10
        int numero = 1;
        while (numero <= 10) {
            System.out.println(numero);
            numero++;
        }

        // Sumatoria de un numero hasta llegar a 100
        int sumaNumero = 15;
        int suma = 0;
        int cont = 0;

        do {
            suma = suma + sumaNumero;
            cont++;
        } while (suma <= 100);

        System.out.println("El numero se sumo " + cont + " veces");

        // Contador del 1-10
        numero = 10;
        for (int i = 1; i <= numero; i++) {
            System.out.println("El numero es: " + i);
        }

        // Actividad
        // Contador 10 - 1
    }
}
