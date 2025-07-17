package SistemaGestionTienda;

import java.util.Scanner;



public class Principal {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.cargarDatosIniciales();
        int opcion;

        do {
            System.out.println("\n===== MENÚ TECHSOLUTIONS =====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Aplicar descuento");
            System.out.println("5. Mostrar productos con descuento");
            System.out.println("6. Eliminar producto por ID");
            System.out.println("7. Actualizar precio de todos");
            System.out.println("8. Calcular inventario total en dinero");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    tienda.agregarProducto(sc);
                    break;
                case 2:
                    tienda.listarProductos();
                    break;
                case 3:
                    tienda.buscarProducto(sc);
                    break;
                case 4:
                    tienda.aplicarDescuento(sc);
                    break;
                case 5:
                    tienda.mostrarProductosConDescuento();
                    break;
                case 6:
                    tienda.eliminarProducto(sc);
                    break;
                case 7:
                    tienda.actualizarPrecios(sc);
                    break;
                case 8:
                    tienda.calcularInventarioDinero();
                    break;
                case 0:
                    System.out.println("¡Gracias por usar TechSolutions!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}