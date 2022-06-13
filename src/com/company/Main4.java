package com.company;

public class Main4 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        Trabajador trabajador2 = new Trabajador();
        Dani dani = new Dani();
        cliente.nombre = "Daniel";
        dani.apellido = "Ramadan";
        cliente.edad = 31;
        cliente.telefono = 11111111;
        cliente.credito = 1;
        System.out.println("Soy " + cliente.nombre +" "+ dani.apellido + ", tengo " + cliente.edad + " años y mi telefono es " + cliente.telefono
                + " y mi credito es " + cliente.credito + "$");

        trabajador.nombre = "Daniel2 trabajador";
        trabajador.edad = 32;
        trabajador.telefono = 22222;
        trabajador.salario = 1;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "$");

        trabajador2.nombre = "Daniel3 trabajador";
        trabajador2.edad = 33;
        trabajador2.telefono = 333333;
        trabajador2.salario = 1;
        System.out.println("Soy " + trabajador2.nombre + ", tengo " + trabajador2.edad + " años y mi telefono es " + trabajador2.telefono
                + " y mi salario es de " + trabajador2.salario + "$");

    }
}

class Persona2{
    int edad;
    int telefono;
    String nombre;
    public Persona2() {
        System.out.println("soy un constructor");
    }
}

class Cliente extends Persona2{
    double credito;
}

class Trabajador extends Persona2 {
    double salario;
}
class Dani extends Persona2{
    String apellido;
}