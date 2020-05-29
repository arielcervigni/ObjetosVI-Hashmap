package com.paquete;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args){

        Serie[] series = new Serie[5];
        Juego[] juegos = new Juego[5];

        llenarSerieJuego(series,juegos);

        series[2].entregar();
        series[4].entregar();

        juegos[0].entregar();
        juegos[3].entregar();

        //esto para practicar, porque no dice nada la consigna
        //guardar en un treemap los entregados y ordenados por horasEstimadas
        TreeMap<Integer,Juego> treeMapJuego = new TreeMap<>();

        llenarTreeMap(treeMapJuego,juegos);

        treeMapJuego.forEach((Integer i, Juego j)->{
            System.out.println(j.toString());
        });
    }

    public static void llenarSerieJuego(Serie[] series, Juego[] juegos){
        series[0] = new Serie("La casa de Flores",3,"MeloDrama","Mexico");
        series[1] = new Serie("Muñeca Rusa",2,"Horror-Humor Negro","Natasha Lyonne");
        series[2] = new Serie("How to sell drugs online (fast),",1,"Drama-Comedia","Aleman");
        series[3] = new Serie("The sinner",4,"Drama","Original Netflix");
        series[4] = new Serie("Monarca",2,"Drama","Salma Hayek");

        juegos[0] = new Juego("Resident Evil 4","Horror","CAPCOM");
        juegos[1] = new Juego("Need For Speed Underground","Accion","EA");
        juegos[2] = new Juego("Skyrim",30,"Accion-Aventura","Bethesda");
        juegos[3] = new Juego("Assasin's Creed",13,"Accion-Aventura","Ubisoft");
        juegos[4] = new Juego("Crysis",9,"Accion","Crytek");
    }

    public static void llenarTreeMap(TreeMap<Integer,Juego> treeMapJuego, Juego[] juegos){
        for(Juego j : juegos){
            if(j.isEntregado()){
                treeMapJuego.put(j.getHorasEstimadas(),j);
            }
        }
    }
}
