public class Cliente {
    String nombre;
    String email;
    String direccion;

    public Cliente(String nombre, String email, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }
    public String obtenerDetallesclientes() {
        return String.format("Nombre: %s \nEmail: %s  \nDireccion: %s ", nombre, email, direccion);
    }
}
