package com.paquete;

public class Persona {

    private static final char SEXO = 'H';

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        generarDni();
        this.sexo = sexo;
        comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    public Persona(String nombre, int edad, char sexo){
        this(nombre, edad,"", sexo,0,0);
    }
    public Persona(String dni){
        this("",0,dni,SEXO,0,0);
    }
    public Persona(){
        this("",0,"",SEXO,0,0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public char getSexo(){
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public int calcularIMC(){
        int ret = -10;
        double imc = (peso / (Math.pow(altura,2)));
        if(imc < 20){
            ret = -1;
        }else if(imc >=20 && imc<=25){
            ret = 0;
        }else if(imc > 25){
            ret = 1;
        }
        return ret;
    }

    public boolean esMayor(){
        return (edad >= 18);
    }

    private void comprobarSexo(char sexo){
        if(Character.toUpperCase(sexo) != 'M' && Character.toUpperCase(sexo) != 'H'){
            setSexo(SEXO);
        }
    }
    private void generarDni() {
        final int divisor = 23;

        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);

        //Pasamos el DNI a String
        dni = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }

    public void estoyBien(){
        Integer IMC = calcularIMC();
        if(IMC == 0){
            System.out.println("Estas por debajo de tu peso ideal");
        }else if(IMC < 0){
            System.out.println("Estas en tu peso ideal");
        }else {
            System.out.println("Tienes sobrepeso");
        }
    }
}
