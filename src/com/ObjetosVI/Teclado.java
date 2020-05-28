package com.ObjetosVI;

import java.util.Scanner;

public class Teclado {

    Scanner scn = new Scanner(System.in);
    private String nombre;
    private int edad;
    private char genero;
    private double peso;
    private Float altura;

    //Pide por teclado el nombre, la edad, sexo, peso y altura.

    public void ingresarDatos(){
        System.out.print("Ingrese su nombre:\t");
        this.nombre = scn.nextLine();
        System.out.print("Ingrese su genero:\t");
        this.genero = scn.next().charAt(0);
        System.out.print("Ingrese su Edad:\t");
        this.edad = scn.nextInt();
        System.out.print("Ingrese su peso:\t");
        this.peso = scn.nextDouble();
        System.out.print("Ingrese su altura:\t");
        this.altura = scn.nextFloat();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public double getPeso() {
        return peso;
    }

    public Float getAltura() {
        return altura;
    }
}
