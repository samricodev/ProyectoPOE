
package mvc;

public class Sucursal {
    private int id;
    private String localidad;
    private int tipo;
    private int capacidad;
    private float ventas_prom;
    
    //apuntador
    private Sucursal siguiente;

    Sucursal(int id, String localidad, int tipo, int capacidad, float ventas_prom) {
        this.id = id;
        this.localidad = localidad;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ventas_prom = ventas_prom;
        this.siguiente = siguiente;
        this.siguiente = null;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getLocalidad(){
        return localidad;
    }

    public void setLocalidad(String localidad){
        this.localidad = localidad;
    }

    public int getTipo(){
        return tipo;
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public float getVentas_prom(){
        return ventas_prom;
    }

    public void setVentas_prom(float ventas_prom){
        this.ventas_prom = ventas_prom;
    }   

    public Sucursal getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Sucursal siguiente) {
        this.siguiente = siguiente;
    }
    
    
}