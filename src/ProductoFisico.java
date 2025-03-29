class ProductoFisico extends Producto {
    private double precioBase;
    private double costoEnvio;

    public ProductoFisico(String nombre, int id, double precioBase, double costoEnvio) {
        super(nombre, id);
        this.precioBase = precioBase;
        this.costoEnvio = costoEnvio;
    }

    @Override
    public double calcularPrecioTotal() {
        return precioBase + costoEnvio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Físico: " + nombre + " | Precio Total: $" + calcularPrecioTotal());
    }
}