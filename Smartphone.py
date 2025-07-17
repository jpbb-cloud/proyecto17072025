from Producto_electronico import ProductoElectronico
from con_descuento import ConDescuento

class Smartphone(ProductoElectronico, ConDescuento):
    def __init__(self, id_producto, nombre, marca, precio, stock, tamano_pantalla, capacidad_almacenamiento, es_5g):
        super().__init__(id_producto, nombre, marca, precio, stock)
        self.tamano_pantalla = tamano_pantalla
        self.capacidad_almacenamiento = capacidad_almacenamiento
        self.es_5g = es_5g
        self.descuento_aplicado = False

    def mostrar_informacion(self):
        print(f" {self.nombre} ({self.marca}) - {self.tamano_pantalla} pulgadas - {self.capacidad_almacenamiento}GB - 5G: {'Sí' if self.es_5g else 'No'} - Precio: €{self.precio:.2f} - Stock: {self.stock}")

    def actualizar_precio(self, porcentaje):
        self.precio *= (1 + porcentaje / 100)

    def aplicar_descuento(self, porcentaje):
        if porcentaje < 0 or porcentaje > 100:
            print("Revisa: Porcentaje de descuento inválido.")
            return
        self.precio *= (1 - porcentaje / 100)
        self.descuento_aplicado = True

    def mostrar_precio_con_descuento(self):
        print(f"{self.nombre} (Smartphone) con descuento: €{self.precio:.2f}")
