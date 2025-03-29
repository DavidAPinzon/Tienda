class ProductoDigital extends Producto {
    private double precioBase;

    public ProductoDigital(String nombre, int id, double precioBase) {
        super(nombre, id);
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecioTotal() {
        return precioBase;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Digital: " + nombre + " | Precio: $" + calcularPrecioTotal());
    }
}
