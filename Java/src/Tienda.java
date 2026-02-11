public class Tienda {
    private Pedido[] pedido;
    private Cliente[] cliente;

    public Tienda() {
        this.pedido = new Pedido[5];
        this.cliente = new Cliente[5];
    }

    public void añadircliente(Cliente cliente){cliente.obtenerDetallesclientes();}
}
