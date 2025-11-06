package Caso2;

public class Casa {
    private String direccion;
    private Condominio condominio;

    public Casa(String direccion, Condominio condominio) {
        this.direccion = direccion;
        this.condominio = condominio;
        condominio.agregarCasa(this);
    }

    public Condominio getCondominio() {
        return condominio;
    }
}
