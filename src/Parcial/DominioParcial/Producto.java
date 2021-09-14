package Parcial.DominioParcial;

public class Producto {
    private String nombreProducto;
    private int precio;
    private String tipo;

    public Producto(String nombreProducto,int precio,String tipo){
        this.nombreProducto=nombreProducto;
        this.precio=precio;
        this.tipo=tipo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
