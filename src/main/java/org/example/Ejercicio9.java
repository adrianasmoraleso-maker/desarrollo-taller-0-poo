package org.example;

class Mascota{
    String nombre;
    String especie;
    int edad;

    void mostrarMascota(){

        System.out.println("Nombre de la mascota: "+ nombre);
        System.out.println("Especie: "+ especie);
        System.out.println("Edad: "+ edad);
    }
}

public class Ejercicio9 {
    public static void main(String[] args){

        System.out.println("\nEstado Mascota\n");
        Mascota mascota1 = new Mascota();
        mascota1.nombre = "Luna";
        mascota1.especie = "Perro";
        mascota1.edad = 2;

        System.out.println("\nEstado inicial:\n");
        mascota1.mostrarMascota();

        mascota1.edad = 3;
        System.out.println("\nDespués del primer cambio:\n");
        mascota1.mostrarMascota();

        mascota1.edad = 5;
        System.out.println("\nDespués del segundo cambio:\n");
        mascota1.mostrarMascota();
    }
}
