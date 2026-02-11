public class Producto {
    String nombre;
    int producto;
    boolean stock;

    public Producto(String nombre, int producto, boolean stock) {
        this.nombre = nombre;
        this.producto = producto;
        this.stock = stock;
    }
    public String obtenerDetalles() {
        return String.format("%s \nPrecio: %s  \nDisponible: %s ", nombre, producto, stock);
    }


}
