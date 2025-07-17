from datos_iniciales import DatosIniciales
from con_descuento import ConDescuento

class Tienda:
    def __init__(self):
        self.productos = []

    def cargar_datos(self):
        DatosIniciales.cargar(self.productos)

    def agregar_producto(self, producto):
        self.productos.append(producto)

    def listar_productos(self):
        if not self.productos:
            print("Revisa: No hay productos en el inventario.")
            return
        for producto in self.productos:
            producto.mostrar_informacion()

    def buscar_producto_por_nombre(self, nombre):
        encontrados = [p for p in self.productos if nombre.lower() in p.nombre.lower()]
        for producto in encontrados:
            producto.mostrar_informacion()
        if not encontrados:
            print("Revisa: No se encontró ningún producto.")

    def aplicar_descuento(self, id_producto, porcentaje):
        for producto in self.productos:
            if producto.id_producto == id_producto and isinstance(producto, ConDescuento):
                producto.aplicar_descuento(porcentaje)
                producto.mostrar_precio_con_descuento()
                return
        print("Revisa: Producto no encontrado o no elegible para descuento.")

    def mostrar_productos_con_descuento(self):
        encontrados = [
        p for p in self.productos
        if isinstance(p, ConDescuento) and getattr(p, "descuento_aplicado", False)
        ]
        if not encontrados:
            print("No hay productos con descuento aplicado.")
            return
        for producto in encontrados:
            producto.mostrar_precio_con_descuento()

    def eliminar_producto_por_id(self, id_producto):
        original = len(self.productos)
        self.productos = [p for p in self.productos if p.id_producto != id_producto]
        if len(self.productos) < original:
            print(f"Producto con ID '{id_producto}' eliminado.")
        else:
            print("Revisa: No se encontró ningún producto con ese ID.")

    def actualizar_precios(self, porcentaje):
        for producto in self.productos:
            producto.precio *= (1 + porcentaje / 100)
        print(f"Precios aumentados en un {porcentaje:.2f}%.")

    def calcular_inventario_total(self):
        total = sum(p.precio for p in self.productos)
        print(f"Valor total del inventario: €{total:.2f}")



    

