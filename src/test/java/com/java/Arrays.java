package com.java;

public class Arrays {

    public static void main(String[] args) {
            /*
        1- Unidimensional
        2- Bidimensional
        3- Multidimensional
     */

        String[] diasSemana = {"L", "M", "Mi", "J", "V", "S", "D"};
        System.out.println("El dia de hoy es: " + diasSemana[3]);

        String[] diasSemana2 = new String[7];
        diasSemana2[0] = "L";
        diasSemana2[1] = "M";

        int[] numeros = new int[1];
        numeros[0] = 15;

        String[][] nombres = new String[4][4];
        nombres[0][0] = "Adilene";
        nombres[0][1] = "Alejandra";
        nombres[0][2] = "Victor";
        nombres[0][3] = "Jose";
        nombres[1][0] = "Ernesto";

        System.out.println("Mi nombre es: " + nombres[1][0]);

        // Actividad: Crear un arreglo unidimensional (como objeto) de 4 posiciones:
        // 1- First Name
        // 2- Last Name
        // 3- Age
        // 4- Email
        // Imprimir el arreglo concatenando cada uno de los valores
    }

}
