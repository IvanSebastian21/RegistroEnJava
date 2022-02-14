package Clases;

public class Persona {
    // Propiedades
    private String apellido;
    private String nombre;
    private String documento;
    private String estadoCivil;
    private String tipo;

    // Constructores
    public Persona() {

    }

    public Persona(String apellido, String nombre, String documento, String estadoCivil, String tipo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        this.estadoCivil = estadoCivil;
        this.tipo = tipo;
    }

    // Metodo Set y get
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
