package org.example;

class CuentaBancaria{
    long numero;
    String titular;
    int saldo;

    void mostrarCuenta(){

        System.out.println("Numero de cuenta: "+ numero);
        System.out.println("Titular: "+ titular);
        System.out.println("Saldo: "+ saldo);
    }
}

public class Ejercicio10 {
    public static void main(String[] args){

        System.out.println("\nCuenta 1\n");
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = 801123456;
        cuenta1.titular = "Ana Pérez";
        cuenta1.saldo = 1500000;

        cuenta1.mostrarCuenta();

        System.out.println("\nCuenta 2\n");
        CuentaBancaria   cuenta2 = new CuentaBancaria();
        cuenta2.numero = 1025123523;
        cuenta2.titular = "Carlos López";
        cuenta2.saldo = 320000;

        cuenta2.mostrarCuenta();
    }
}
