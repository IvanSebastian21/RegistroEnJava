package Clases;

public class Cliente extends Persona{
    //Propiedades
    private String categoria;
    private String codigo;
    
    //Metodos
    public void generarCodigo(){
        this.setCodigo("A" + this.getNombre() + this.getDocumento());
    }

    // Metodos get y set
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
