package Modelos;

public class Inmueble {
    private int imagen;
    private double precio;
    private String direccion;

    public Inmueble(int imagen, double precio, String direccion) {
        this.imagen = imagen;
        this.precio = precio;
        this.direccion = direccion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
