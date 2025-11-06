package Caso2;

import java.util.ArrayList;
import java.util.List;

public class Condominio {
    private String nombre;
    private List<Casa> casas;

    public Condominio(String nombre) {
        this.nombre = nombre;
        this.casas = new ArrayList<>();
    }

    public void agregarCasa(Casa casa) {
        casas.add(casa);
    }

    public String getNombre() {
        return nombre;
    }
}
