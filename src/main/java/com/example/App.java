package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        /*
         * ¿Que es un array? Es un identificador de variable (el nombre de una variable)
         * que hace referencia a una zona donde se pueden almacenar varios valores del
         * mismo
         * tipo.
         * Un array es de tamaño fijo, que no es lo mismo que inmutable. De tamaño
         * quiere decir
         * que una vez creado no se le pueden agregar mas elementos. Inmutable quiere
         * que no se
         * puede modificar ningun elemento.
         * Para acceder a los elementos del array hace falta un indice, que comienza por
         * el valor
         * cero (0)
         */

        int[] arraydeenteros;

        // ¿Como agregar elementos al array?
        // Rta. Hay dos formas de hacerlo manualmente
        // Una reservando memoria para la cantidad de elementos y Otra asignandolos
        // entra llaves separados por coma.

        // Comenzando por el array de enteros seria:

        // variante 1
        arraydeenteros = new int[5];
        arraydeenteros[0] = 10;
        arraydeenteros[1] = 20;
        arraydeenteros[2] = 25;
        arraydeenteros[3] = 31;
        arraydeenteros[4] = 46;

        // variante 2
        int[] arraydeenteros2 = { 1, 2, 3, 4, 5, 6 };

        String[] marcasDeCoche = { "Renault", "Tiyita" };

        Persona[] personas = { Persona.builder().nombre("Ruben").salario(4500.32).build(),
                Persona.builder().nombre("Juan").salario(2100.32).genero(Genero.HOMBRE).build(),
                Persona.builder().nombre("Antonio").salario(2500.32).genero(Genero.MUJER).build(),
                Persona.builder().nombre("Ivan").salario(3200.32).genero(Genero.MUJER).build()
        };
    }
}
