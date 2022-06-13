package com.company;

public class Main {
//Ejercicio 1
    public static void main(String[] args) {
	suma(80, 50,30);
    Auto miAuto = new Auto();
    miAuto.agregarPuerta();

    System.out.println("Puertas del auto: " + miAuto.puerta);


    }


    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }

    //Ejercicio 2 Crear una clase coche y dentro de la clase crear una variable numerica.

    static class Auto{
        public int puerta = 0;
        public void agregarPuerta(){
            this.puerta++;
        }
    }

}


