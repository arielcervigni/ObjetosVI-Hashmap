package com.ObjetosVI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {

    private Scanner in;

    public Keyboard(){
        in = new Scanner(System.in);
    }

    public int scanInteger(){
        int retorno = 0;
        int dow = 0;
        do{
            try{
                retorno = in.nextInt();
                dow = -1;
            }catch(InputMismatchException ime){
                in.nextLine();//Limpia el buffer del teclado
                System.out.println("Try again...");
            }
        }while(dow == 0);
        return retorno;
    }

    public String scanString(){
        String retorno = null;
        int dow = 0;
        do{
            try{
                retorno = in.nextLine();
                dow = -1;
            }catch(InputMismatchException ime){
                in.nextLine();//Limpia el buffer del teclado
                System.out.println("Try again...");
            }
        }while(dow == 0);
        return retorno;
    }

    public boolean scanBoolean(){
        boolean retorno = 0;
        int dow = 0;
        do{
            try{
                retorno = in.nextBoolean();
                dow = -1;
            }catch(InputMismatchException ime){
                in.nextLine();//Limpia el buffer del teclado
                System.out.println("Try again...");
            }
        }while(dow == 0);
        return retorno;
    }

    public char scanCharacter(){
        char retorno = 0;
        String auxRet = null;
        int dow = 0;
        do{
            try{
                auxRet = in.next();
                if(auxRet!=null){
                    retorno = auxRet.charAt(0);
                }
                dow = -1;
            }catch(InputMismatchException ime){
                in.nextLine();//Limpia el buffer del teclado
                System.out.println("Try again...");
            }
        }while(dow == 0);
        return retorno;
    }

    public float scanFloat(){
        float retorno = 0;
        int dow = 0;
        do{
            try{
                retorno = in.nextFloat();
                dow = -1;
            }catch(InputMismatchException ime){
                in.nextLine();//Limpia el buffer del teclado
                System.out.println("Try again...");
            }
        }while(dow == 0);
        return retorno;
    }

    public double scanDouble(){
        double retorno = 0;
        int dow = 0;
        do{
            try{
                retorno = in.nextDouble();
                dow = -1;
            }catch(InputMismatchException ime){
                in.nextLine();//Limpia el buffer del teclado
                System.out.println("Try again...");
            }
        }while(dow == 0);
        return retorno;
    }

    public long scanLong(){
        long retorno = 0;
        int dow = 0;
        do{
            try{
                retorno = in.nextLonf();
                dow = -1;
            }catch(InputMismatchException ime){
                in.nextLine();//Limpia el buffer del teclado
                System.out.println("Try again...");
            }
        }while(dow == 0);
        return retorno;
    }
}
