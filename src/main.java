import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        gestorproductos gestor = new gestorproductos();
        int opcion;

        do {
            System.out.println("1. Crear producto");
            System.out.println("2. Leer productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Precio: ");
                double precio = sc.nextDouble();
                gestor.agregarProducto(new producto(id, nombre, precio));
                System.out.println("Producto agregado.");

            } else if (opcion == 2) {
                gestor.mostrarProductos();

            } else if (opcion == 3) {
                System.out.print("ID del producto a actualizar: ");
                int id = sc.nextInt();
                System.out.print("Nuevo precio: ");
                double nuevoPrecio = sc.nextDouble();
                boolean actualizado = gestor.actualizarProducto(id, nuevoPrecio);
                if (actualizado) {
                    System.out.println("Producto actualizado.");
                } else {
                    System.out.println("Producto no encontrado.");
                }

            } else if (opcion == 4) {
                System.out.print("ID del producto a eliminar: ");
                int id = sc.nextInt();
                boolean eliminado = gestor.eliminarProducto(id);
                if (eliminado) {
                    System.out.println("Producto eliminado.");
                } else {
                    System.out.println("Producto no encontrado.");
                }
            }

        } while (opcion != 5);

        System.out.println("Fin del programa.");
    }
}