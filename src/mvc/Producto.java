//Equipo 4
package mvc;

public class Producto {
    private int id;
    private String nombre;
    private String contenido;
    private int unidades;
    private float costo;
    
    private Producto siguiente;
    //CONSTRUCTOR 
    public Producto(int id, String nombre, String contenido, int unidades, float costo) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.unidades = unidades;
        this.costo = costo;
        this.siguiente = siguiente;
        this.siguiente = null;
    }
    
    //SET N GET 

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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }   

    public Producto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Producto siguiente) {
        this.siguiente = siguiente;
    }
    
}
