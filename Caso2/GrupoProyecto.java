package Caso2;

import java.util.ArrayList;
import java.util.List;

public class GrupoProyecto {
    private String nombre;
    private List<Empleado> empleados;

    public GrupoProyecto(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }
}
