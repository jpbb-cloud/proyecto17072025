package SistemaGestionTienda;

public class Tablet extends ProductoElectronico {
    private boolean tieneLapiz;
    private String sistemaOperativo;

    // Constructor con sobrecarga
    public Tablet(String idProducto, String nombre, String marca, double precio,
                  int stock, boolean tieneLapiz, String sistemaOperativo) {
        super(idProducto, nombre, marca, precio, stock);
        this.tieneLapiz = tieneLapiz;
        this.sistemaOperativo = sistemaOperativo;
    }

    // Getters y Setters
    public boolean getTieneLapiz() {
        return tieneLapiz;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setTieneLapiz(boolean tieneLapiz) {
        this.tieneLapiz = tieneLapiz;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tablet: " + getNombre() +
                           " | Marca: " + getMarca() +
                           " | SO: " + sistemaOperativo +
                           " | ¿Tiene lápiz?: " + (tieneLapiz ? "Sí" : "No") +
                           " | Precio: €" + getPrecio() +
                           " | Stock: " + getStock());
    }

    @Override
    public void actualizarPrecio(double porcentaje) {
        double nuevoPrecio = getPrecio() * (1 + porcentaje / 100);
        setPrecio(nuevoPrecio);
    }
}
