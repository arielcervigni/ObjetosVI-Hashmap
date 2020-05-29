package com.ObjetosVI;
import java.util.Random;

public class Persona {
    // Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No
    //queremos que se accedan directamente a ellos. Piensa que modificador de acceso
    //es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes
    //hacerlo.

    public final char HOMBRE = 'H';
    public final char MUJER = 'M';
    public final int IDEAL = 0;
    public final int SOBREPESO = 1;
    public final int MUYFLACO = -1;

    private String nombre;
    private int edad;
    private int dni;
    private char genero;
    private double peso;
    private Float altura;

    // Se implantaran varios constructores:
    // Un constructor por defecto.
    // Un constructor con el nombre, edad y sexo, el resto por defecto.
    // Un constructor con todos los atributos como parámetro.


    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.genero = HOMBRE;
        this.peso = 0;
        this.altura = 0f;
    }

    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.genero = genero;
        this.peso = 0;
        this.altura = 0f;
    }

    public Persona(String nombre, int edad, char genero, double peso, Float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularMC () {
    //calcularIMC(): calculara si la persona esta en su peso ideal (peso en
    //kg/(altura^2 en m)), si esta fórmula devuelve un valor menor que 20, la
    //función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos),
    //significa que esta por debajo de su peso ideal la función devuelve un 0 y si
    //devuelve un valor mayor que 25 significa que tiene sobrepeso, la función
    //devuelve un 1. Te recomiendo que uses constantes para devolver estos
    //valores.

        int rta = 2;
        if (this.peso != 0 && this.altura != 0) {
            double mc = this.peso / (double) (this.altura * this.altura);
            if (mc > 20 && mc < 25 )
                rta = IDEAL; // 0
            else {
                if (mc > 25)
                    rta = SOBREPESO; // 1
                else
                    rta = MUYFLACO; // -1
            }
        }
        return rta;
    }

    public boolean esMayorDeEdad ()
    {
        boolean rta = false;
        if (this.edad >= 18)
            rta = true;
        else
            rta = false;

        return rta;
    }

    public void comprobarSexo(char gen){
        if (gen == 'M') {
            System.out.println(gen);
            this.genero = MUJER;
        }
        else
            this.genero = HOMBRE;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre:'" + nombre + '\'' +
                ". Edad:" + edad +
                ". DNI: " + dni +
                ". Género: " + genero +
                ". Peso: " + peso + " kg" +
                ". Altura: " + altura + " m" +
                '}';
    }

    public int generarDNI () {
        Random rnd = new Random();
        return  (int)(rnd.nextDouble() * 50000000 + 5000000);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() { return dni; }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
}
