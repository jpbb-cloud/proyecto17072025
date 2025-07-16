from abc import ABC, abstractmethod

class ProductoElectronico(ABC):
    def __init__(self, id_producto, nombre, marca, precio, stock):
        self.id_producto = id_producto
        self.nombre = nombre
        self.marca = marca
        self.precio = precio
        self.stock = stock

    @abstractmethod
    def mostrar_informacion(self):
        pass

    @abstractmethod
    def actualizar_precio(self, porcentaje):
        pass
