public class Producto {
    String nombre;
    int precioproducto;
    boolean stock;

    public Producto(String nombre, int producto, boolean stock) {
        this.nombre = nombre;
        this.precioproducto = producto;
        this.stock = stock;
    }
    public String obtenerDetalles() {
        return String.format("%s \nPrecio: %s  \nDisponible: %s ", nombre, precioproducto, stock);
    }

    @Override
    public String toString() {
        return "\nPRODUCTO\n" +
                "nombre: " + nombre+
                " |precio producto: " + precioproducto +
                " |stock: " + stock;
    }
}
