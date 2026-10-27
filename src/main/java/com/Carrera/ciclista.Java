package com.carrera;

public abstract class Ciclista {

    private int identificador;
    private String nombre;
    private int tiempoacumulado; // valor inicial 0 

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoacumulado = 0;
    }
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoAcumulado() {
        return tiempoacumulado;
    }
     // sirve para modificar o actualizar el tiempo un ejemplo: despues de terminar la etapa
    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoacumulado;
    }

    //Cada especialidad devuelve su tipo. 
    public String imprimirTipo(){
        return "Es un " + this.getClass().getSimpleName();
    }

    public void imprimirDatos() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado (min): " + tiempoacumulado);
        System.out.println("Tipo: " + imprimirTipo());
    }
}