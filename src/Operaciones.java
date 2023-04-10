import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Operaciones {
    private Map<Integer, Pedido> pedidos;

    public Operaciones() {
        this.pedidos = new HashMap<>();
    }

    public void agregarPedido() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de pedido:");
        Integer numeroPedido = scanner.nextInt();
        scanner.nextLine();

        if (pedidos.containsKey(numeroPedido)) {
            System.out.println("Alerta: El pedido ya existe.");
            return;
        }

        System.out.println("Ingrese el RUC del cliente:");
        String rucCliente = scanner.nextLine();

        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = scanner.nextLine();

        System.out.println("Ingrese la dirección del cliente:");
        String direccionCliente = scanner.nextLine();

        System.out.println("Ingrese el teléfono del cliente:");
        String telefonoCliente = scanner.nextLine();

        System.out.println("Ingrese el tipo de pizza (A, B, C, D, E, F):");
        Character tipoPizza = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.println("Ingrese la cantidad de pizzas pedidas:");
        Integer cantidadPedida = scanner.nextInt();

        Pedido pedido = new Pedido(numeroPedido, rucCliente, nombreCliente, direccionCliente, telefonoCliente, tipoPizza, cantidadPedida);
        pedidos.put(numeroPedido, pedido);

        System.out.println("Pedido agregado con éxito.");
    }

    public void imprimirPedidosPorCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el RUC del cliente:");
        String rucCliente = scanner.nextLine();

        pedidos.values().stream()
                .filter(pedido -> pedido.getRucCliente().equals(rucCliente))
                .forEach(pedido -> System.out.println(pedido.toString()));
    }

    public void eliminarPedido() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de pedido a eliminar:");
        Integer numeroPedido = scanner.nextInt();

        if (pedidos.containsKey(numeroPedido)) {
            pedidos.remove(numeroPedido);
            System.out.println("Pedido eliminado con éxito.");
        } else {
            System.out.println("Alerta: El pedido no existe.");
        }
    }

    public void actualizarCantidadYPrecio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de pedido a actualizar:");
        Integer numeroPedido = scanner.nextInt();

        if (pedidos.containsKey(numeroPedido)) {
            Pedido pedido = pedidos.get(numeroPedido);

            System.out.println("Ingrese la nueva cantidad de pizzas pedidas:");
            Integer nuevaCantidad = scanner.nextInt();
            pedido.setCantidadPedida(nuevaCantidad);

            Integer nuevoPrecio = pedido.calcularPrecioAPagar(pedido.getTipoPizza(), nuevaCantidad);
            pedido.setPrecioAPagar(nuevoPrecio);

            System.out.println("Pedido actualizado con éxito.");
        } else {
            System.out.println("Alerta: El pedido no existe.");
        }
    }

    public void imprimirPedidosOrdenadosPorCantidad() {
        pedidos.values().stream()
                .sorted((p1, p2) -> p1.getCantidadPedida().compareTo(p2.getCantidadPedida()))
                .forEach(pedido -> System.out.println(pedido.toString()));
    }
}

