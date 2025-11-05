public class Inicializaciones {
    Nino sofia = new Nino("Sofía", 6);
    Nino pablo = new Nino("Pablo", 10);
    Nino pedro = new Nino("Pedro", 10);

    Perro firulais = new Perro("Firulais", "Café");
    Gato misifus = new Gato("Misifus", "Gris");

    public void establecerRelaciones() {
        sofia.agregarMascota(firulais);
        pablo.agregarMascota(firulais);
        pablo.agregarAmigo(pedro);
        pedro.agregarMascota(misifus);
    }

    public void mostrarInformacion() {
        sofia.mostrarInfo();
        System.out.println();
        pablo.mostrarInfo();
        System.out.println();
        pedro.mostrarInfo();
    }
}
