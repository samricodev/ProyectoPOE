//Equipo4
package mvc;

public class Cliente {
    private int id;
    private String nombre;
    private String tipo;
    private int compras;
    private boolean incidentes;
    private Cliente siguiente;
    
    //CONSTRUCTOR
    public Cliente(int id, String nombre, String tipo, int compras, boolean incidentes) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.compras = compras;
        this.incidentes = incidentes;
        this.siguiente = siguiente;
        this.siguiente = null;
    }
    
    //SETTER N GETTER 

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
 
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public boolean getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(boolean incidentes) {
        this.incidentes = incidentes;
    }

    public Cliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cliente siguiente) {
        this.siguiente = siguiente;
    }
    
}
