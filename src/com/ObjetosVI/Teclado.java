package com.ObjetosVI;

import java.util.Scanner;

public class Teclado {

    private Scanner in;

    public Keyboard(){
        in = new Scanner(System.in);
    }
    public int scanInteger(){
        return in.nextInt();
    }
    public String scanString(){
        return in.nextLine();
    }
    public boolean scanBoolean(){
        return in.nextBoolean();
    }
    public char scanCharacter(){
        return in.next().charAt(0);
    }
    public float scanFloat(){
        return in.nextFloat();
    }
    public double scanDouble(){
        return in.nextDouble();
    }
    public long scanLong(){
        return in.nextLong();
    }
}
