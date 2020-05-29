package com.ObjetosVI;

public class Main {

    public static void main(String[] args) {

        Teclado teclado = new Teclado();
        Persona porTeclado = new Persona();
        Persona porDefecto = new Persona();
        Persona sinPesoYAltura = new Persona();

        teclado.ingresarDatos();
        porTeclado.setNombre(teclado.getNombre());
        porTeclado.comprobarSexo(teclado.getGenero());
        porTeclado.setEdad(teclado.getEdad());
        porTeclado.setAltura(teclado.getAltura());
        porTeclado.setPeso(teclado.getPeso());

        //System.out.println(porTeclado.toString());

        sinPesoYAltura.setNombre("persona1");
        sinPesoYAltura.setEdad(25);
        sinPesoYAltura.setGenero('M');

        
    }
}
