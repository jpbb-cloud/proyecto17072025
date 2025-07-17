from abc import ABC, abstractmethod

class ConDescuento(ABC):

    @abstractmethod
    def aplicar_descuento(self, porcentaje):
        pass

    @abstractmethod
    def mostrar_precio_con_descuento(self):
        pass
