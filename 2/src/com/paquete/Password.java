package com.paquete;

import java.util.Objects;

public class Password implements Comparable<Password>{
    /*Todo
            ascii -> {
                        48 (0) hasta 57 (9)
                        65 (A) hasta 90 (Z)
                        97 (a) hasta 122 (z)
                    }
    */
    private int longitud;
    private String password;

    public Password(int longitud){
        this.longitud = longitud;
        generarPassword();
    }
    public Password(){
        longitud = 8;
        generarPassword();
    }
    public String getPassword(){
        return password;
    }
    public int getLongitud(){
        return longitud;
    }
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }

    private void generarPassword(){
        char[] pw = new char[longitud];
        int val = 0;
        int op = -1;
        while(val < longitud) {
            op = (int) (Math.random() * 3);
            switch (op) {
                case 0:
                    //generar numero
                    pw[val] = (char) (Math.random() * (57 - 48 + 1) + 48);
                    break;
                case 1:
                    //genera letra mayus
                    pw[val] = (char) (Math.random() * (90 - 65 + 1) + 65);
                    break;
                case 2:
                    //genera letra minus
                    pw[val] = (char) (Math.random() * (122 - 97 + 1) + 97);
                    break;
            }
            val++;
        }
        password = String.copyValueOf(pw);
    }

    public boolean isStrong(){

        int contLetra = 0;
        int contLetraMayus = 0;
        int contNumero = 0;

        char[] pw = password.toCharArray();
        for(int i = 0;i < password.length();i++){
            if(Character.isLetter(pw[i])){
                if(Character.isUpperCase(pw[i])){
                    contLetraMayus+=1;
                }else if(Character.isLowerCase(pw[i])){
                    contLetra+=1;
                }
            }else if(Character.isDigit(pw[i])){
                contNumero+=1;
            }
        }
        return (contLetra > 1 && contLetraMayus > 2 && contNumero > 5);
    }

    @Override
    public int hashCode(){
        int hash = (password == null) ? 0 : password.hashCode();
        hash = hash * 31 + longitud;
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Password)){
            return false;
        }
        Password aux = (Password) obj;
        return ((aux.password.equals(this.password)) && (aux.longitud == longitud));
    }

    @Override
    public String toString(){
        return "ATTRIB = { Password = "+password
                +" Loingitud = "+longitud+" }";
    }
    
    @Override
    public int compareTo(Password pw) {
        return (password.compareTo(pw.password));
    }
}
