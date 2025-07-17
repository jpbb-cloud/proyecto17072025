package SistemaGestionTienda;

public abstract class ProductoElectronico {
    
    //VARIABLES DE INSTANCIA
    private String idProducto;
    private String nombre;
    private String marca;
    private double precio;
    private int stock;
    
    // CONSTRUCTORES
    public ProductoElectronico(String idProducto, String nombre, String marca, double precio, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }
    // Getters y Setters (Encapsulamiento)
    public String getIdProducto() { 
        return idProducto; 
    }
    public String getNombre() { 
        return nombre; 
    }
    public String getMarca() { 
        return marca; 
    }
    public double getPrecio() { 
        return precio; 
    }
    public int getStock() { 
        return stock; 
    }

    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }

    // Métodos abstractos
    public abstract void mostrarInformacion();
    public abstract void actualizarPrecio(double porcentaje);
}
