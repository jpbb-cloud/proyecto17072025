package SistemaGestionTienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    private ArrayList<ProductoElectronico> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Scanner sc) {
        System.out.println("\n--- Agregar nuevo producto ---");
        System.out.println("Selecciona el tipo de producto:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Tablet");
        System.out.print("Opción: ");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.print("ID del producto: ");
        String id = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Precio (€): ");
        double precio = Double.parseDouble(sc.nextLine());
        System.out.print("Stock disponible: ");
        int stock = Integer.parseInt(sc.nextLine());

        ProductoElectronico nuevo = null;

        switch (tipo) {
            case 1: // Smartphone
                System.out.print("Tamaño de pantalla (pulgadas): ");
                double pantalla = Double.parseDouble(sc.nextLine());
                System.out.print("Capacidad de almacenamiento (GB): ");
                int almacenamiento = Integer.parseInt(sc.nextLine());
                System.out.print("¿Es compatible con 5G? (true/false): ");
                boolean es5G = Boolean.parseBoolean(sc.nextLine());

                nuevo = new Smartphone(id, nombre, marca, precio, stock, pantalla, almacenamiento, es5G);
                break;

            case 2: // Laptop
                System.out.print("Procesador: ");
                String procesador = sc.nextLine();
                System.out.print("Memoria RAM (GB): ");
                int ram = Integer.parseInt(sc.nextLine());
                System.out.print("¿Es gamer? (true/false): ");
                boolean gamer = Boolean.parseBoolean(sc.nextLine());

                nuevo = new Laptop(id, nombre, marca, precio, stock, procesador, ram, gamer);
                break;

            case 3: // Tablet
                System.out.print("¿Tiene lápiz? (true/false): ");
                boolean tieneLapiz = Boolean.parseBoolean(sc.nextLine());
                System.out.print("Sistema operativo: ");
                String sistemaOp = sc.nextLine();

                nuevo = new Tablet(id, nombre, marca, precio, stock, tieneLapiz, sistemaOp);
                break;

            default:
                System.out.println("Revisa: Tipo de producto no válido.");
                return;
        }

        productos.add(nuevo);
        System.out.println("Producto agregado correctamente.");
    }


public void buscarProducto(Scanner sc) {
    System.out.println("\n--- Buscar producto por nombre ---");
    System.out.print("Introduce el nombre del producto: ");
    String nombreBuscado = sc.nextLine().trim().toLowerCase();

    boolean encontrado = false;
    for (ProductoElectronico producto : productos) {
        if (producto.getNombre().toLowerCase().contains(nombreBuscado)) {
            producto.mostrarInformacion(); // polimorfismo en acción
            encontrado = true;
            System.out.println("-----------------------------");
        }
    }

    if (!encontrado) {
        System.out.println("Revisa: No se encontró ningún producto con ese nombre.");
    }
}

public void aplicarDescuento(Scanner sc) {
    System.out.println("\n--- Aplicar descuento a producto ---");
    System.out.print("Introduce el ID del producto: ");
    String id = sc.nextLine().trim();

    ProductoElectronico productoEncontrado = null;

    for (ProductoElectronico producto : productos) {
        if (producto.getIdProducto().equalsIgnoreCase(id)) {
            productoEncontrado = producto;
            break;
        }
    }

    if (productoEncontrado == null) {
        System.out.println("Revisa: No se encontró un producto con ese ID.");
        return;
    }

    if (productoEncontrado instanceof ConDescuento) {
        System.out.print("Introduce el porcentaje de descuento (sin %): ");
        double porcentaje = Double.parseDouble(sc.nextLine());

        ConDescuento descuentoAplicable = (ConDescuento) productoEncontrado;
        descuentoAplicable.aplicarDescuento(porcentaje);

        System.out.println("Descuento aplicado.");
        descuentoAplicable.mostrarPrecioConDescuento();
    } else {
        System.out.println("¡Este producto no tiene opción de descuento!.");
    }
}

public void mostrarProductosConDescuento() {
    System.out.println("\n--- Productos con opción de descuento ---");

    boolean hayDescuento = false;

    for (ProductoElectronico producto : productos) {
        if (producto instanceof ConDescuento) {
            ((ConDescuento) producto).mostrarPrecioConDescuento(); // llamado polimórfico
            producto.mostrarInformacion();                          // información general
            System.out.println("-----------------------------");
            hayDescuento = true;
        }
    }

    if (!hayDescuento) {
        System.out.println("No hay productos con descuento aplicable actualmente.");
    }
}

public void actualizarPrecios(Scanner sc) {
    System.out.println("\n--- Actualizar precios del inventario ---");
    System.out.print("Introduce el porcentaje de aumento (sin %): ");
    double porcentaje = Double.parseDouble(sc.nextLine());

    for (ProductoElectronico producto : productos) {
        producto.actualizarPrecio(porcentaje); // polimorfismo en acción
    }

    System.out.println("Todos los precios fueron actualizados en un " + porcentaje + "%.");
}

public void calcularInventarioDinero() {
    System.out.println("\n--- Valor total del inventario ---");

    double total = 0.0;

    for (ProductoElectronico producto : productos) {
        total += producto.getPrecio() * producto.getStock();
    }

    System.out.printf("El valor total estimado del inventario es: €%.2f%n", total);
}


public void listarProductos() {
    System.out.println("\n--- Lista de productos en inventario ---");

    if (productos.isEmpty()) {
        System.out.println("Revisa: No hay productos en el inventario.");
        return;
    }

    for (ProductoElectronico producto : productos) {
        producto.mostrarInformacion(); // polimorfismo: cada producto muestra su versión
        System.out.println("-----------------------------");
    }
}

public void eliminarProducto(Scanner sc) {
    System.out.println("\n--- Eliminar producto del inventario ---");
    System.out.print("Introduce el ID del producto a eliminar: ");
    String idEliminar = sc.nextLine().trim();

    ProductoElectronico productoEncontrado = null;

    for (ProductoElectronico producto : productos) {
        if (producto.getIdProducto().equalsIgnoreCase(idEliminar)) {
            productoEncontrado = producto;
            break;
        }
    }

    if (productoEncontrado != null) {
        productos.remove(productoEncontrado);
        System.out.println("Producto eliminado correctamente.");
    } else {
        System.out.println("Revisa: No se encontró ningún producto con ese ID.");
    }
}

public void cargarDatosIniciales() {
    DatosIniciales.cargarProductos(productos);
}

}
