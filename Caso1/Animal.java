abstract class Animal {
    protected String nombre;
    protected String color;

    public Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public abstract void hacerSonido();

    @Override
    public String toString() {
        return nombre + " (" + color + ")";
    }
}