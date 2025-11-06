package Caso2;

public class Empleado extends Persona {
    private Departamento departamento;
    private Moto moto;
    private Casa casa;

    public Empleado (String nombre) {
        super(nombre);
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre);
        if (departamento != null)
            System.out.println("  Departamento: " + departamento.getNombre());
        if (moto != null)
            System.out.println("  Moto: " + moto);
        if (casa != null)
            System.out.println("  Casa en condominio: " + casa.getCondominio().getNombre());
    }
}
