package com.java;

public class Metodos {

    public static void main(String[] args) {
        // Metodos en Java = Funcion

        // Caracteristicas de un metodo
        // 1- Siempre pertenece a una clase
        // 2- No se puede definir un metodo dentro de otro metodo
        // 3- Un metodo puede invocar a otro metodo
        // 4- Un metodo puede regresar cualquier tipo de dato (int, String, double, objeto)
        //    Si un metodo no regresa valor se le conoce como un metodo void

        int suma1 = 1 + 1;
        int suma2 = 2 + 2;

        suma1 = suma1 + suma2;

        System.out.println("La suma es: " + suma(5,10) );
        hello();
    }

    // Metodo
    public static int suma(int x, int y) {
        int total = x + y;
        return total;
    }

    public static void hello() {
        System.out.println("Hello");
    }

    // Actividad
    // Crear un metodo que imprima mas de dos numeros y que sea de tipo void
}
