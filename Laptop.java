package SistemaGestionTienda;

public class Laptop extends ProductoElectronico implements ConDescuento {
    private String procesador;
    private int RAM_GB;
    private boolean esGamer;

    // Constructor con sobrecarga
    public Laptop(String idProducto, String nombre, String marca,
              double precio, int stock,
              String procesador, int RAM_GB, boolean esGamer) {
    super(idProducto, nombre, marca, precio, stock);
    this.procesador = procesador;
    this.RAM_GB = RAM_GB;
    this.esGamer = esGamer;
}
    
   // Getters y Setters
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRAM_GB() {
        return RAM_GB;
    }

    public void setRAM_GB(int RAM_GB) {
        this.RAM_GB = RAM_GB;
    }

    public boolean isEsGamer() {
        return esGamer;
    }

    public void setEsGamer(boolean esGamer) {
        this.esGamer = esGamer;
    }

    // Implementación de métodos abstractos
    @Override
    public void mostrarInformacion() {
        System.out.println("Laptop: " + getNombre());
        System.out.println("Marca: " + getMarca());
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + RAM_GB + " GB");
        System.out.println("¿Es gamer?: " + (esGamer ? "Sí" : "No"));
        System.out.println("Precio: €" + getPrecio());
        System.out.println("Stock: " + getStock());
        System.out.println("ID: " + getIdProducto());
    }

    @Override
    public void actualizarPrecio(double porcentaje) {
        double nuevoPrecio = getPrecio() * (1 + porcentaje / 100);
        setPrecio(nuevoPrecio);
    }

    // Implementación de interfaz ConDescuento
    @Override
    public void aplicarDescuento(double porcentaje) {
        double precioConDescuento = getPrecio() * (1 - porcentaje / 100);
        setPrecio(precioConDescuento);
    }

    @Override
    public void mostrarPrecioConDescuento() {
        System.out.println("Precio con descuento aplicado: €" + getPrecio());
    }
}