import java.util.ArrayList;

public class gestorproductos {

    private ArrayList<producto> productos;

    public gestorproductos() {
        productos = new ArrayList<producto>();
    }

    public void agregarProducto(producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (producto producto : productos) {
            System.out.println(producto);
        }
    }

    public boolean actualizarProducto(int id, double nuevoPrecio) {
        for (producto producto : productos) {
            if (producto.getId() == id) {
                producto.setPrecio(nuevoPrecio);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(int id) {
        for (producto producto : productos) {
            if (producto.getId() == id) {
                productos.remove(producto);
                return true;
            }
        }
        return false;
    }
}