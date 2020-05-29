package com.paquete;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args){
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();

        p3.setNombre("Juan");
        p3.setAltura(170);
        p3.setSexo('m');
        p3.setPeso(60);
        p3.setEdad(19);

        ingresarDato(p1,p2);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        p1.estoyBien();
        p2.estoyBien();
        p3.estoyBien();

        HashMap<String, Persona> hashMap = new HashMap<>();
        hashMap.put(p1.getDni(), p1);
        hashMap.put(p2.getDni(), p2);
        hashMap.put(p3.getDni(), p3);

        System.out.println("|--> hasMap.get(p3.getDni)) = {"+hashMap.get(p3.getDni())+"}");
    }

    public static void ingresarDato(Persona p1, Persona p2){
        Keyboard keyboard = new Keyboard();
        System.out.print("Nombre..: ");
        p1.setNombre(keyboard.scanString());
        System.out.print("Edad....: ");
        p1.setEdad(keyboard.scanInteger());
        System.out.print("Sexo(m/h): ");
        p1.setSexo(keyboard.scanCharacter());
        System.out.print("Peso.....: ");
        p1.setPeso(keyboard.scanDouble());
        System.out.print("Altura...: ");
        p1.setAltura(keyboard.scanDouble());

        p2.setNombre(p1.getNombre());
        p2.setEdad(p1.getEdad());
        p2.setSexo(p1.getSexo());
    }
}
