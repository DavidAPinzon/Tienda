abstract class Producto implements Calculable, Mostrable {
    protected String nombre;
    protected int id;

    public Producto(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
}