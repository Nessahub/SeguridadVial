package ar.com.seguridadvial;

class Moto extends Vehiculo {
    private int cantidadEspejosRetrovisores;

    public Moto(double velocidad, int cantidadEspejosRetrovisores) {
        super(velocidad);
        this.cantidadEspejosRetrovisores = cantidadEspejosRetrovisores;
    }

    @Override
    public boolean esSeguro() {
        return (velocidad <= 160) && (cantidadEspejosRetrovisores >= 2);
    }
}