package src.main.java;
public class NodoBST{
    int codigo;
    String nombreFinca;
    String municipio;
    NodoBST izquierdo;
    NodoBST derecho;

    public NodoBST(int codigo, String nombreFinca, String municipio){
        this.codigo = codigo;
        this.nombreFinca = nombreFinca;
        this.municipio = municipio;
        this.izquierdo = null;
        this.derecho = null;
    }
}