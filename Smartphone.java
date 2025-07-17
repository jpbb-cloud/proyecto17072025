package SistemaGestionTienda;

public class Smartphone extends ProductoElectronico implements ConDescuento {
    private double tamanoPantalla;
    private int capacidadAlmacenamiento;
    private boolean es5G;

    // Constructor con sobrecarga
    public Smartphone(String idProducto, String nombre, String marca, double precio, int stock,
                      double tamanoPantalla, int capacidadAlmacenamiento, boolean es5G) {
        super(idProducto, nombre, marca, precio, stock);
        this.tamanoPantalla = tamanoPantalla;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.es5G = es5G;
    }

    // Getters y setters
    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public boolean isEs5G() {
        return es5G;
    }

    public void setEs5G(boolean es5G) {
        this.es5G = es5G;
    }

    // Implementación de métodos abstractos
    @Override
    public void mostrarInformacion() {
        System.out.println("Smartphone: " + getNombre());
        System.out.println("Marca: " + getMarca());
        System.out.println("Pantalla: " + tamanoPantalla + " pulgadas");
        System.out.println("Almacenamiento: " + capacidadAlmacenamiento + " GB");
        System.out.println("Compatible con 5G: " + (es5G ? "Sí" : "No"));
        System.out.println("Precio: €" + getPrecio());
        System.out.println("Stock disponible: " + getStock());
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
