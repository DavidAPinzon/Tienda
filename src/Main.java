import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> productos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("""
                            
                            -------------Menu-------------
                            1. Agregar Producto Digital
                            2. Agregar Producto Físico
                            3. Agregar Servicio
                            4. Mostrar Productos
                            5. Comprar Productos
                            6. Salir"
                            
                            Seleccione una opción:""");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto digital: ");
                    scanner.nextLine();
                    String nombreDigital = scanner.nextLine();
                    System.out.print("Ingrese el ID: ");
                    int idDigital = scanner.nextInt();
                    System.out.print("Ingrese el precio base: ");
                    double precioDigital = scanner.nextDouble();
                    productos.add(new ProductoDigital(nombreDigital, idDigital, precioDigital));
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto físico: ");
                    scanner.nextLine();
                    String nombreFisico = scanner.nextLine();
                    System.out.print("Ingrese el ID: ");
                    int idFisico = scanner.nextInt();
                    System.out.print("Ingrese el precio base: ");
                    double precioFisico = scanner.nextDouble();
                    System.out.print("Ingrese el costo de envío: ");
                    double envio = scanner.nextDouble();
                    productos.add(new ProductoFisico(nombreFisico, idFisico, precioFisico, envio));
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del servicio: ");
                    scanner.nextLine();
                    String nombreServicio = scanner.nextLine();
                    System.out.print("Ingrese el ID: ");
                    int idServicio = scanner.nextInt();
                    System.out.print("Ingrese las horas del servicio: ");
                    double horas = scanner.nextDouble();
                    System.out.print("Ingrese la tarifa por hora: ");
                    double tarifa = scanner.nextDouble();
                    productos.add(new Servicio(nombreServicio, idServicio, horas, tarifa));
                    break;
                case 4:
                    System.out.println("Lista de Productos:");
                    for (Producto p : productos) {
                        p.mostrarInformacion();
                    }
                    break;
                case 5:
                    System.out.println("Comprando Productos...");
                    double total = 0;
                    for (Producto p : productos) {
                        total += p.calcularPrecioTotal();
                    }
                    System.out.println("Total a pagar: " + total);
                    productos.clear();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}