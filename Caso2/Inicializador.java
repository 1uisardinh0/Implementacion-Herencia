package Caso2;

public class Inicializador {
    // Creacion de Empresa Naviera, Adquisiciones y Ventas.
    EmpresaNaviera empresa = new EmpresaNaviera("Tesoros del Mar S.A.");
    Departamento adquisiciones = new Departamento("Adquisiciones");
    Departamento ventas = new Departamento("Ventas");

    void creacionDepartamentos() {
        empresa.agregarDepartamento(adquisiciones);
        empresa.agregarDepartamento(ventas);
    }

    // Crear empleados
    Empleado agustin = new Empleado("Agustín");
    Empleado francisco = new Empleado("Francisco");

    void asignacionEmpleos() {
        agustin.setDepartamento(adquisiciones);
        francisco.setDepartamento(ventas);
    }

    // Crear motos y de Andrea
    Moto harley = new Moto("Harley Davidson", "1200 Custom");
    Moto kawasaki = new Moto("Kawasaki Ninja", "ZX6R 636");
    Persona andrea = new Persona("Andrea");

    void asignacionMotos() {
        agustin.setMoto(harley);
        System.out.println(andrea.getNombre() + " tiene una moto " + kawasaki);
    }

    // Crear condominio y casas
    Condominio nuevoAmanecer = new Condominio("Nuevo Amanecer");
    Casa casaCompartida = new Casa("Casa 1", nuevoAmanecer);

    void asignacionCondominioCasas() {
        agustin.setCasa(casaCompartida);
        francisco.setCasa(casaCompartida);
    }

    void mostrarInformacion() {
        agustin.mostrarInfo();
        System.out.println();
        francisco.mostrarInfo();
    }
}
