package Caso2;

abstract public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo;
    }
}
