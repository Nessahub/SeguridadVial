package ar.com.seguridadvial;

abstract class Vehiculo {
    protected double velocidad;
    
    public Vehiculo(double velocidad) {
        this.velocidad = velocidad;
    }

    public abstract boolean esSeguro();
}
