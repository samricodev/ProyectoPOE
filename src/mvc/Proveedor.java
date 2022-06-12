//Equipo 4
package mvc;

public class Proveedor {
    private int id;
    private String nombre;
    private String categoria;
    private String productos;
    private float cobro;

    Proveedor(int id, String nombre, String categoria, String productos, float cobro) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.productos = productos;
        this.cobro = cobro;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public String getProductos(){
        return productos;
    }

    public void setProductos(String productos){
        this.productos = productos;
    }

    public float getCobro(){
        return cobro;
    }

    public void setCobro(float cobro){
        this.cobro = cobro;
    }
}
