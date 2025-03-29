class Servicio extends Producto {
    private double horas;
    private double tarifaHora;

    public Servicio(String nombre, int id, double horas, double tarifaHora) {
        super(nombre, id);
        this.horas = horas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularPrecioTotal() {
        return horas * tarifaHora;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Servicio: " + nombre + " | Costo Total: $" + calcularPrecioTotal());
    }
}