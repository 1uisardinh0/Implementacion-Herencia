class Gato extends Animal {
    public Gato(String nombre, String color) {
        super(nombre, color);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maúlla: ¡Miau!");
    }
}