package Caso2;

public class Launcher {
    public static void main(String[] args) {
        Inicializador inicializador = new Inicializador();
        inicializador.creacionDepartamentos();
        inicializador.asignacionEmpleos();
        inicializador.asignacionMotos();
        inicializador.asignacionCondominioCasas();
        inicializador.mostrarInformacion();
    }
}
