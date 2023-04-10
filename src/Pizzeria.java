import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Agregar pedido");
            System.out.println("2. Imprimir pedidos por cliente");
            System.out.println("3. Eliminar pedido");
            System.out.println("4. Actualizar cantidad y precio de un pedido");
            System.out.println("5. Imprimir todos los pedidos ordenados por cantidad");
            System.out.println("6. Salir");

            System.out.println("Seleccione una opción:");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> operaciones.agregarPedido();
                case 2 -> operaciones.imprimirPedidosPorCliente();
                case 3 -> operaciones.eliminarPedido();
                case 4 -> operaciones.actualizarCantidadYPrecio();
                case 5 -> operaciones.imprimirPedidosOrdenadosPorCantidad();
                case 6 -> {
                    System.out.println("Gracias por usar la aplicación. ¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opción no válida. Por favor, elija una opción del menú.");
            }
        }
    }
}
