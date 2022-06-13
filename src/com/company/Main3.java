package com.company;

public class Main3 {
    //Ejercicio 8
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Daniel");

        System.out.println("Mi nombre es " + persona.getNombre());

        persona.setEdad(31);
        System.out.println("Tengo " + persona.getEdad() + " años");

        persona.setTelefono(11111111);
        System.out.println("Mi teléfono es " + persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

}
