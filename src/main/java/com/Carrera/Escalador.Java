package com.carrera;

public class Escalador extends Ciclista {
    private float aceleracionPromedio;
    private float gradorampa;

    public Escalador(int identificador, String nombre, float aceleracionPromedio, float gradorampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradorampa = gradorampa;
    }

    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradorampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradorampa = gradorampa;
    }

    public String imprimirTipo(){
        return "Es un Escalador";
    }

    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Aceleración promedio: " + aceleracionPromedio);
        System.out.println("Grado rampa: " + gradoRampa);
    }
}