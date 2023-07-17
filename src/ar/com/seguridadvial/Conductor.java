package ar.com.seguridadvial;

class Conductor {
    private boolean tieneRegistro;
    private Vehiculo vehiculo;

    public Conductor(boolean tieneRegistro, Vehiculo vehiculo) {
        this.tieneRegistro = tieneRegistro;
        this.vehiculo = vehiculo;
    }

    public boolean esSeguroConductor() {
        return tieneRegistro && vehiculo.esSeguro();
    }
}
