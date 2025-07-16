from Tienda import Tienda
from Smartphone import Smartphone
from Laptop import Laptop
from Tablet import Tablet
from TechSolutions.Producto_electronico import ProductoElectronico
from datos_iniciales import DatosIniciales

def menu():
    tienda = Tienda()
    tienda.cargar_datos()


    while True:
        print("\n===== MENÚ TECHSOLUTIONS =====")
        print("1. Agregar producto")
        print("2. Listar todos los productos")
        print("3. Buscar producto por nombre")
        print("4. Aplicar descuento a producto")
        print("5. Mostrar productos con descuento")
        print("6. Eliminar producto por ID")
        print("7. Actualizar precios de todos los productos")
        print("8. Calcular valor total del inventario")
        print("0. Salir")
        
        opcion = input("Selecciona una opción: ").strip()

        if opcion == "1":
            agregar_producto(tienda)
        elif opcion == "2":
            tienda.listar_productos()
        elif opcion == "3":
            nombre = input("Nombre a buscar: ").strip()
            tienda.buscar_producto_por_nombre(nombre)
        elif opcion == "4":
            idp = input("ID del producto: ").strip()
            porcentaje = float(input("Porcentaje de descuento: "))
            tienda.aplicar_descuento(idp, porcentaje)
        elif opcion == "5":
            tienda.mostrar_productos_con_descuento()
        elif opcion == "6":
            idp = input("ID del producto a eliminar: ").strip()
            tienda.eliminar_producto_por_id(idp)
        elif opcion == "7":
            porcentaje = float(input("Porcentaje de aumento: "))
            tienda.actualizar_precios(porcentaje)
        elif opcion == "8":
            tienda.calcular_inventario_total()
        elif opcion == "0":
            print("¡Gracias por usar TechSolutions!")
            break
        else:
            print("Revisa: Opción inválida")

def agregar_producto(tienda):
    print("\n--- Agregar nuevo producto ---")
    tipo = input("Tipo (smartphone / laptop / tablet): ").strip().lower()

    idp = input("ID: ")
    nombre = input("Nombre: ")
    marca = input("Marca: ")
    precio = float(input("Precio (€): "))
    stock = int(input("Stock: "))

    if tipo == "smartphone":
        pantalla = float(input("Tamaño de pantalla: "))
        almacenamiento = int(input("Almacenamiento (GB): "))
        es_5g = input("¿Es 5G? (true/false): ").strip().lower() == "true"
        producto = Smartphone(idp, nombre, marca, precio, stock, pantalla, almacenamiento, es_5g)
    elif tipo == "laptop":
        procesador = input("Procesador: ")
        ram = int(input("RAM (GB): "))
        gamer = input("¿Es gamer? (true/false): ").strip().lower() == "true"
        producto = Laptop(idp, nombre, marca, precio, stock, procesador, ram, gamer)
    elif tipo == "tablet":
        lapiz = input("¿Tiene lápiz? (true/false): ").strip().lower() == "true"
        so = input("Sistema operativo: ")
        producto = Tablet(idp, nombre, marca, precio, stock, lapiz, so)
    else:
        print("Revisa: Tipo no reconocido.")
        return

    tienda.agregar_producto(producto)
    print("Producto agregado exitosamente.")

if __name__ == "__main__":
    menu()