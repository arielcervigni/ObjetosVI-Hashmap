package com.paquete;

public class Serie implements Envios, Comparable<Serie>{
    private String titulo;
    private int numeroTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }
    public Serie(String titulo, String creador){
        this(titulo,0,"",creador);
    }
    public Serie() {
        this("",0,"","");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
    @Override
    public void entregar(){
        this.entregado = true;
    }
    @Override
    public void devolver(){
        this.entregado = false;
    }
    @Override
    public boolean isEntregado(){
        return (entregado);
    }
    @Override
    public int compareTo(Serie serie){
        return Integer.compare(numeroTemporadas,serie.numeroTemporadas);
    }
}
