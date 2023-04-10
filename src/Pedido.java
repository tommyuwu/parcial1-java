public class Pedido {
    private Integer numeroPedido;
    private String rucCliente;
    private String nombreCliente;
    private String direccionCliente;
    private String telefonoCliente;
    private Character tipoPizza;
    private Integer cantidadPedida;
    private Integer precioAPagar;

    public Pedido(Integer numeroPedido, String rucCliente, String nombreCliente, String direccionCliente, String telefonoCliente, Character tipoPizza, Integer cantidadPedida) {
        this.numeroPedido = numeroPedido;
        this.rucCliente = rucCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.tipoPizza = tipoPizza;
        this.cantidadPedida = cantidadPedida;
        this.precioAPagar = calcularPrecioAPagar(tipoPizza, cantidadPedida);
    }

    protected Integer calcularPrecioAPagar(Character tipoPizza, Integer cantidadPedida) {
        int precioPizza = 0;

        switch (tipoPizza) {
            case 'A' -> precioPizza = 25000;
            case 'B' -> precioPizza = 45000;
            case 'C' -> precioPizza = 55000;
            case 'D' -> precioPizza = 35000;
            case 'E' -> precioPizza = 45000;
            case 'F' -> precioPizza = 60000;
            default -> System.out.println("Tipo de pizza no válido");
        }

        return cantidadPedida * precioPizza;
    }

    // Getters y setters de los atributos
    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getRucCliente() {
        return rucCliente;
    }

    public void setRucCliente(String rucCliente) {
        this.rucCliente = rucCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public Character getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(Character tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public Integer getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(Integer cantidadPedida) {
        this.cantidadPedida = cantidadPedida;
    }

    public Integer getPrecioAPagar() {
        return precioAPagar;
    }

    public void setPrecioAPagar(Integer precioAPagar) {
        this.precioAPagar = precioAPagar;
    }
}

