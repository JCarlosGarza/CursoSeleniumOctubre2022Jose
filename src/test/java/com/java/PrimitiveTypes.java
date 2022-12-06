package com.java;

public class PrimitiveTypes {

    public static void main(String[] args) {
        // Datos primitivos

        // 1- Byte - numerico entero
        // 2 - Short - numerico entero
        // 3 - int - numerico entero
        // 4 - long - numerico entero
        // 5 - Float - numerico real
        // 6 - double - numerico real
        // 7 - character - caracteres
        // 8 - boolean - logico (true, false)

        byte a = 5;
        short b = 30000;
        int c = a + b;
        long d = 10000000000L;
        float e;
        double f;
        char g;
        boolean h = true;

        String frase = "HOLA";
        System.out.println(frase.toLowerCase());
    }


    /**
     * Data Type	    Size	    Description
     * byte	            1 byte	    Stores whole numbers from -128 to 127
     * short	        2 bytes	    Stores whole numbers from -32,768 to 32,767
     * int	            4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
     * long	            8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     * float	        4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
     * double	        8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
     * boolean	        1 bit	    Stores true or false values
     * char	            2 bytes	    Stores a single character/letter or ASCII values
     */
}
