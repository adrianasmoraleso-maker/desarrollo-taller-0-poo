package org.example;

public class Ejercicio2 {

    public class Vehiculo{
        String marca;
        String modelo;
        int velocidadActual;

        void mostrarEstado(){

            System.out.println("Marca del carro: "+ marca);
            System.out.println("Modelo del carro: "+ modelo);
            System.out.println("Velocidad actual: "+ velocidadActual);
        }

        void acelerar() {

            velocidadActual += 10;
            System.out.println("Acelerando... nueva velocidad: " + velocidadActual);
        }
    }
}
