from Producto_electronico import ProductoElectronico
from con_descuento import ConDescuento


class Laptop(ProductoElectronico, ConDescuento):
    def __init__(self, id_producto, nombre, marca, precio, stock, procesador, ram_gb, es_gamer):
        super().__init__(id_producto, nombre, marca, precio, stock)
        self.procesador = procesador
        self.ram_gb = ram_gb
        self.es_gamer = es_gamer
        self.descuento_aplicado = True

    def mostrar_informacion(self):
        print(f" {self.nombre} ({self.marca}) - {self.procesador} - RAM: {self.ram_gb}GB - Gamer: {'Sí' if self.es_gamer else 'No'} - Precio: €{self.precio:.2f} - Stock: {self.stock}")

    def actualizar_precio(self, porcentaje):
        self.precio *= (1 + porcentaje / 100)

    def aplicar_descuento(self, porcentaje):
        if porcentaje < 0 or porcentaje > 100:
            print("Revisa: Porcentaje de descuento inválido.")
            return
        self.precio *= (1 - porcentaje / 100)
        self.descuento_aplicado = True

    def mostrar_precio_con_descuento(self):
        print(f"{self.nombre} (Laptop) con descuento: €{self.precio:.2f}")
