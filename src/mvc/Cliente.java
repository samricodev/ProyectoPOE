//Equipo4
package mvc;

public class Cliente {
    private int id;
    private String nombre;
    private int tipo;
    private int compras;
    private boolean incidentes;
    
    //apuntador  
    private Cliente siguiente;
    
    //CONSTRUCTOR

    public Cliente(int id, String nombre, int tipo, int compras, boolean incidentes) {
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
 
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCompras() {
        return compras;
    }

    public void setCompras(int compras) {
        this.compras = compras;
    }

    public boolean isIncidentes() {
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
