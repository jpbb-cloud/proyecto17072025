from Producto_electronico import ProductoElectronico

class Tablet(ProductoElectronico):
    def __init__(self, id_producto, nombre, marca, precio, stock, tiene_lapiz, sistema_operativo):
        super().__init__(id_producto, nombre, marca, precio, stock)
        self.tiene_lapiz = tiene_lapiz
        self.sistema_operativo = sistema_operativo

    def mostrar_informacion(self):
        print(f"{self.nombre} ({self.marca}) - SO: {self.sistema_operativo} - Lápiz: {'Sí' if self.tiene_lapiz else 'No'} - Precio: €{self.precio:.2f} - Stock: {self.stock}")

    def actualizar_precio(self, porcentaje):
        self.precio *= (1 + porcentaje / 100)
