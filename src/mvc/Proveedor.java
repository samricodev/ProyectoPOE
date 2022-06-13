
//Equipo 4
package mvc;

public class Proveedor {
    private int id;
    private String nombre;
    private int categoria;
    private String productos;
    private float cobro;
    
    //Constructor

    public Proveedor(int id, String nombre, int categoria, String productos, float cobro) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.productos = productos;
        this.cobro = cobro;
    }
    
    // SET N GET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public float getCobro() {
        return cobro;
    }

    public void setCobro(float cobro) {
        this.cobro = cobro;
    }
}
