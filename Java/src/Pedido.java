public class Pedido {
    String fechapedido;
    private Producto[] producto;

    public Pedido(String fechapedido, Producto[] producto) {
        this.fechapedido = fechapedido;
        this.producto = producto;
    }
}
