package org.example;

    class Estudiante {
        String nombre;
        int codigo;
        int semestre;

        void mostrarInfo() {
            System.out.println("Nombre del estudiante: " + nombre);
            System.out.println("Codigo: " + codigo);
            System.out.println("Semestre: " + semestre);
        }
    }

    public class Ejercicio6 {
        public static void main(String[] args){
            Estudiante estudiante1 = new Estudiante();
            estudiante1.nombre = "Juan Mendoza";
            estudiante1.codigo = 750252339;
            estudiante1.semestre = 4;

            estudiante1.mostrarInfo();
        }
    }
