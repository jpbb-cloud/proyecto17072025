package SistemaGestionTienda;

import java.util.ArrayList;

public class DatosIniciales {

    public static void cargarProductos(ArrayList<ProductoElectronico> productos) {
        // Smartphones
        productos.add(new Smartphone("SP101", "Galaxy S23", "Samsung", 899.99, 7, 6.1, 128, true));
        productos.add(new Smartphone("SP102", "iPhone 14 Pro", "Apple", 1199.99, 5, 6.7, 256, true));
        productos.add(new Smartphone("SP103", "Pixel 7", "Google", 649.99, 4, 6.3, 128, true));
        productos.add(new Smartphone("SP104", "Xiaomi 13", "Xiaomi", 599.99, 10, 6.4, 256, true));
        productos.add(new Smartphone("SP105", "OnePlus 11", "OnePlus", 729.99, 6, 6.7, 256, true));
        productos.add(new Smartphone("SP106", "Motorola Edge 30", "Motorola", 499.99, 3, 6.5, 128, true));
        productos.add(new Smartphone("SP107", "Sony Xperia 5 IV", "Sony", 849.99, 2, 6.1, 128, true));
        productos.add(new Smartphone("SP108", "Huawei P50 Pro", "Huawei", 799.99, 5, 6.6, 256, false));
        productos.add(new Smartphone("SP109", "Nokia X30", "Nokia", 399.99, 7, 6.43, 128, true));
        productos.add(new Smartphone("SP110", "Vivo X90", "Vivo", 699.99, 4, 6.78, 256, true));
        productos.add(new Smartphone("SP111", "Realme GT Neo 3", "Realme", 429.99, 6, 6.7, 256, true));
        productos.add(new Smartphone("SP112", "Asus ROG Phone 7", "Asus", 999.99, 2, 6.78, 512, true));
        productos.add(new Smartphone("SP113", "Honor Magic5 Pro", "Honor", 1099.99, 3, 6.81, 512, true));
        productos.add(new Smartphone("SP114", "Google Pixel Fold", "Google", 1799.99, 1, 7.6, 256, true));
        productos.add(new Smartphone("SP115", "Samsung Z Flip4", "Samsung", 999.99, 4, 6.7, 128, true));
        productos.add(new Smartphone("SP116", "iPhone SE (2022)", "Apple", 429.99, 8, 4.7, 64, false));
        productos.add(new Smartphone("SP117", "Oppo Find X5", "Oppo", 749.99, 3, 6.55, 256, true));
        productos.add(new Smartphone("SP118", "Nothing Phone (1)", "Nothing", 479.99, 5, 6.55, 128, true));
        productos.add(new Smartphone("SP119", "Redmi Note 12", "Xiaomi", 289.99, 12, 6.67, 128, true));
        productos.add(new Smartphone("SP120", "Samsung Galaxy A53", "Samsung", 349.99, 9, 6.5, 128, true));

        // Laptops
        productos.add(new Laptop("LP201", "MacBook Pro 16", "Apple", 2499.99, 3, "Apple M2 Pro", 16, true));
        productos.add(new Laptop("LP202", "Dell XPS 15", "Dell", 1999.99, 2, "Intel Core i7", 16, false));
        productos.add(new Laptop("LP203", "HP Spectre x360", "HP", 1899.99, 4, "Intel Core i7", 16, false));
        productos.add(new Laptop("LP204", "Lenovo Legion 5", "Lenovo", 1399.99, 5, "AMD Ryzen 7", 16, true));
        productos.add(new Laptop("LP205", "Asus TUF Gaming", "Asus", 1299.99, 6, "Intel Core i5", 16, true));
        productos.add(new Laptop("LP206", "Acer Predator Helios", "Acer", 1599.99, 3, "Intel Core i7", 16, true));
        productos.add(new Laptop("LP207", "MSI GF63", "MSI", 999.99, 5, "Intel Core i5", 8, true));
        productos.add(new Laptop("LP208", "Microsoft Surface Laptop 5", "Microsoft", 1299.99, 4, "Intel Core i7", 16, false));
        productos.add(new Laptop("LP209", "Razer Blade 15", "Razer", 2399.99, 2, "Intel Core i7", 16, true));
        productos.add(new Laptop("LP210", "LG Gram 16", "LG", 1499.99, 3, "Intel Core i7", 16, false));
        productos.add(new Laptop("LP211", "Gigabyte Aorus 15", "Gigabyte", 1799.99, 2, "Intel Core i7", 16, true));
        productos.add(new Laptop("LP212", "Alienware x14", "Dell", 1899.99, 2, "Intel Core i7", 16, true));
        productos.add(new Laptop("LP213", "HP Envy 13", "HP", 1099.99, 6, "Intel Core i5", 8, false));
        productos.add(new Laptop("LP214", "Lenovo ThinkBook 14", "Lenovo", 999.99, 4, "Intel Core i5", 8, false));
        productos.add(new Laptop("LP215", "Asus ZenBook Pro Duo", "Asus", 2199.99, 2, "Intel Core i9", 32, true));
        productos.add(new Laptop("LP216", "Acer Swift 3", "Acer", 749.99, 5, "AMD Ryzen 5", 8, false));
        productos.add(new Laptop("LP217", "MSI Prestige 15", "MSI", 1499.99, 2, "Intel Core i7", 16, false));
        productos.add(new Laptop("LP218", "Samsung Galaxy Book2", "Samsung", 1099.99, 3, "Intel Core i7", 16, false));
        productos.add(new Laptop("LP219", "Huawei MateBook D15", "Huawei", 899.99, 4, "Intel Core i5", 8, false));
        productos.add(new Laptop("LP220", "Chuwi HeroBook Pro", "Chuwi", 299.99, 8, "Intel Celeron", 8, false));

        // Tablets
        productos.add(new Tablet("TB301", "iPad Pro 12.9", "Apple", 1199.99, 5, true, "iPadOS"));
        productos.add(new Tablet("TB302", "Galaxy Tab S9", "Samsung", 999.99, 6, true, "Android"));
        productos.add(new Tablet("TB303", "Microsoft Surface Pro 9", "Microsoft", 1399.99, 4, true, "Windows 11"));
        productos.add(new Tablet("TB304", "Lenovo Tab P12", "Lenovo", 499.99, 7, false, "Android"));
        productos.add(new Tablet("TB305", "Huawei MatePad Pro", "Huawei", 699.99, 6, true, "HarmonyOS"));
        productos.add(new Tablet("TB306", "Amazon Fire HD 10", "Amazon", 149.99, 10, false, "FireOS"));
        productos.add(new Tablet("TB307", "Xiaomi Pad 6", "Xiaomi", 399.99, 8, false, "Android"));
        productos.add(new Tablet("TB308", "Nokia T20", "Nokia", 249.99, 5, false, "Android"));
        productos.add(new Tablet("TB309", "Alcatel 3T 10", "Alcatel", 179.99, 6, false, "Android"));
        productos.add(new Tablet("TB310", "iPad Mini 6", "Apple", 599.99, 4, false, "iPadOS"));
        productos.add(new Tablet("TB311", "Asus Vivobook 13 Slate", "Asus", 649.99, 3, true, "Windows 11"));
        productos.add(new Tablet("TB312", "Teclast T40 Pro", "Teclast", 299.99, 7, false, "Android"));
        productos.add(new Tablet("TB313", "Chuwi HiPad Max", "Chuwi", 239.99, 5, false, "Android"));
        productos.add(new Tablet("TB314", "Samsung Tab A8", "Samsung", 229.99, 9,false, "Android"));
                
                System.out.println("Productos iniciales cargados exitosamente.");
    }
}
