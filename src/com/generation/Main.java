package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ciclo for
        /*
        for(contador = 0; contador < numero; contador++) {
            // codigo que se repite;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numero = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero*i));



        Scanner fibo = new Scanner(System.in);
        int fiboa = 0, fibob = 1, fiboc, n;
        System.out.println("Ingrese un numero");
        n= fibo.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(fiboa);
            fiboc = fiboa + fibob;
            fiboa = fibob;
            fibob = fiboc;
        }

         */

        //Ciclo while, mientras la condicion se cumpla se va a repetir el codigo
/*
        while (condicion) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero secreto");
        int numero = sc.nextInt();
        int numerosecreto = 33;

        while (numero != numerosecreto) {
            System.out.println("Adivina el numero secreto");
            numero = sc.nextInt();
        }
        sc.close();
        System.out.println("¡¡Felicidades!! adivinaste el número secreto");



        //ciclo do while

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numerosecreto = 33;

        do {
            System.out.println("Adivina el número secreto");
            numero = sc.nextInt();
        } while (numero != numerosecreto);

        sc.close();
        System.out.println("¡¡Felicidades!! adivinaste el número secreto");

 */

        Scanner sc = new Scanner(System.in);
        int numero=0;
        int factorial = 1;

        System.out.println("Ingresa un número para obtener su factorial");
        numero = sc.nextInt();

        while (numero != 0) {
            factorial *= numero;
            numero --;
        }
        System.out.println("El factorial es: " + factorial);
    }
}
