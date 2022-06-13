package com.company;

public class Main2 {
    //Ejercicio Tema 4
    public static void main(String[] args) {
        // if, else if y else
        int numeroValor = -1;

        if (numeroValor < 0) {
            System.out.println("La variable numeroValor " + numeroValor + " es negativo");
        } else if (numeroValor > 0) {
            System.out.println("La variable numeroValor " + numeroValor + " es positivo");
        } else {
            System.out.println("La variable numeroValor es 0");
        }
        //while
        int numeroWhile = 2;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("La variable numeroWhile vale: " + numeroWhile);
        }
        //DO WHILE
        //Si no se cumple la condicion, solo entra en el bucle una vez
        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile vale: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        //ciclo for
        for (int numeroFor = 0; numeroFor <= 5; numeroFor++) {
            System.out.println("La variable numeroFor vale: " + numeroFor);
        }
        //switch en java
        String estacion = "Primavera";
        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No es estación");
                break;
        }
        }

}
