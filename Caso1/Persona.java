import java.util.ArrayList;
import java.util.List;

class Persona {
    protected String nombre;
    protected int edad;
    protected List<Animal> mascotas;
    protected List<Persona> amigos;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.mascotas = new ArrayList<>();
        this.amigos = new ArrayList<>();
    }

    public void agregarMascota(Animal mascota) {
        mascotas.add(mascota);
    }

    public void agregarAmigo(Persona p) {
        amigos.add(p);
    }

    public void mostrarInfo() {
        System.out.println(nombre + " (" + edad + " años)");
        if (!mascotas.isEmpty()) {
            System.out.println("  Mascotas:");
            for (Animal a : mascotas) {
                System.out.println("   - " + a);
            }
        }
        if (!amigos.isEmpty()) {
            System.out.println("  Amigos:");
            for (Persona a : amigos) {
                System.out.println("   - " + a.nombre);
            }
        }
    }
}