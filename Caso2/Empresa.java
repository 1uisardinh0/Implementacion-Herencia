package Caso2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    protected String nombre;
    protected List<Departamento> departamentos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento d) {
        departamentos.add(d);
    }
}
