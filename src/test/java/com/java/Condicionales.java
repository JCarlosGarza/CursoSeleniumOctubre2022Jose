package com.java;

public class Condicionales {

    public static void main(String[] args) {
        // if
        // if else
        // if else if
        // if nested
        // switch

        // Variables
        int limiteDeVelocidad = 80; // km/hr
        int velocidadActual = 100;
        boolean isCarretera = false;

        if (isCarretera == true) {
            limiteDeVelocidad = 120;
            if (velocidadActual > limiteDeVelocidad) {
                System.out.println("Vas a exceso de velocidad");
            }
            else {
                System.out.println("Vas dentro del limite de velocidad");
            }
        }
        else if(velocidadActual > limiteDeVelocidad) {
            System.out.println("Vas a exceso de velocidad");
        }
        else {
            System.out.println("Vas dentro del limite de velocidad");
        }

        String iniciales = "RS";

        switch(iniciales) {
            case "EA":
                System.out.println("Ernesto Anaya");
                break;
            case "VM":
                System.out.println("Victor Martinez");
                break;
            case "JG":
                System.out.println("Jose Garza");
                break;
            default:
                System.out.println("Desconocido");
                break;
        }
    }

    // Actividades
    // Cambiar el tipo de la variable int por double
    // Agregar la condicional de zona escolar
}
