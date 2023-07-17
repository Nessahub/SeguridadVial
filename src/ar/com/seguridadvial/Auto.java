package ar.com.seguridadvial;

class Auto extends Vehiculo {
    private boolean tieneRuedaAuxilio;

    public Auto(double velocidad, boolean tieneRuedaAuxilio) {
        super(velocidad);
        this.tieneRuedaAuxilio = tieneRuedaAuxilio;
    }

    @Override
    public boolean esSeguro() {
        return tieneRuedaAuxilio && (velocidad <= 140);
    }
}