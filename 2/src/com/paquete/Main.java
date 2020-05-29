package com.paquete;

import java.util.LinkedHashMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        Keyboard keyboard = new Keyboard();

        System.out.print("Ingrese cuantas password guardara..:");
        Integer val = keyboard.scanInteger();
        Password[] passwords = new Password[val];

        LinkedHashMap<Integer, Password> linkedHashMap = new LinkedHashMap<>();
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for(int i = 0;i<val;i++){
            passwords[i] = new Password();
            hashMap.put(passwords[i].hashCode(), passwords[i].isStrong());
            setToLinkedHashMap(linkedHashMap,passwords[i]);
        }

        for(int j = 0;j<hashMap.size();j++){
            System.out.println("Password "+linkedHashMap.get(passwords[j].hashCode())+" is strong? ->"+hashMap.get(passwords[j].hashCode()));
        }
    }
    public static void setToLinkedHashMap(LinkedHashMap<Integer, Password> hash, Password pw){
        hash.put(pw.hashCode(),pw);
    }
}
