package SistemaGestionTienda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CargadorProductos {

    public static ArrayList<ProductoElectronico> cargarDesdeArchivo(String rutaArchivo) {
        ArrayList<ProductoElectronico> lista = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                String[] campos = linea.split(";");
                String tipo = campos[0];

                switch (tipo) {
                    case "Smartphone":
                        lista.add(new Smartphone(
                            campos[1], campos[2], campos[3],
                            Double.parseDouble(campos[4]),
                            Integer.parseInt(campos[5]),
                            Double.parseDouble(campos[6]),
                            Integer.parseInt(campos[7]),
                            Boolean.parseBoolean(campos[8])
                        ));
                        break;

                    case "Laptop":
                        lista.add(new Laptop(
                            campos[1], campos[2], campos[3],
                            Double.parseDouble(campos[4]),
                            Integer.parseInt(campos[5]),
                            campos[6],
                            Integer.parseInt(campos[7]),
                            Boolean.parseBoolean(campos[8])
                        ));
                        break;

                    case "Tablet":
                        lista.add(new Tablet(
                            campos[1], campos[2], campos[3],
                            Double.parseDouble(campos[4]),
                            Integer.parseInt(campos[5]),
                            Boolean.parseBoolean(campos[6]),
                            campos[7]
                        ));
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar productos: " + e.getMessage());
        }

        return lista;
    }
}
