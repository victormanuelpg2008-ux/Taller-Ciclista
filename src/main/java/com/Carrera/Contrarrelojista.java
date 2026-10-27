package com.carrera;

public class Contrarrelojista extends Ciclista {
    private double velocidadmaxima;

    public Contrarrelojista(int id, String nombre, double velocidadmaxima) {
        super(id, nombre);
        this.velocidadmaxima = velocidadmaxima;
    }
    public double getVelocidadmaxima() {
        return velocidadmaxima;
    }
    public void setVelocidadmaxima(double velocidadmaxima) {
        this.velocidadmaxima = velocidadmaxima;
    }
    public String imprimirTipo(){
        return "Es un Contrarrelojista";
    }
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Velocidad máxima: " + velocidadmaxima);
    }



}