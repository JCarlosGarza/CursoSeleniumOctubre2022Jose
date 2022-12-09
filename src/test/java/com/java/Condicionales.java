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
        boolean isZonaEscolar = true;

        if (isCarretera == true) {
            limiteDeVelocidad = 120;
            if (velocidadActual > limiteDeVelocidad) {
                System.out.println("Vas a exceso de velocidad en carretera");
            }
            else {
                System.out.println("Vas dentro del limite de velocidad en carretera");
            }
        }
        else if(isZonaEscolar) {
            limiteDeVelocidad = 30;
            if (velocidadActual > limiteDeVelocidad) {
                System.out.println("Vas a exceso de velocidad en zona escolar");
            }
            else {
                System.out.println("Vas dentro del limite de velocidad en zona escolar");
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

        // Actividades
        // Cambiar el tipo de la variable int por double
        // Agregar la condicional de zona escolar

        double limiteNuevo = (double)limiteDeVelocidad; // km/hr
        double velocidadNueva = (double)velocidadActual; // km/hr

        System.out.println("limiteNuevo: " + limiteNuevo + " velocidadNueva: " + velocidadNueva);// Tedious string concatenation.
    }
}
