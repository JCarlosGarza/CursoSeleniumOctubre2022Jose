package com.java;

public class Condicionales
{
    public static void main(String[] args) {
        // if
        // if else
        // if else if
        // if nested
        // switch

        // Variables
        int limiteVelocidad = 80; // km/h
        int velocidadActual = 100;
        boolean isCarretera = false;

        if (isCarretera == true) {
            limiteVelocidad = 120;
            if (velocidadActual > limiteVelocidad) {
                System.out.println("Vas a exceso de velocidad");
            }
            else {
                System.out.println("Vas dentro del límite de velocidad");
            }
        }
        else if (velocidadActual > limiteVelocidad) {
            System.out.println("Vas a exceso de velocidad");
        }
        else {
            System.out.println("Vas dentro del límite de velocidad");
        }

        String iniciales = "JG";

        switch (iniciales) {
            case "JG":
                System.out.println("Jose Garza");
                break;
            case "VM":
                System.out.println("Victor Martinez");
                break;
            case "EA":
                System.out.println("Ernesto Anaya");
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
