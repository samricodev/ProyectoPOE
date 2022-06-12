//Equipo 4
package mvc;

public class Sucursal {
    private int id;
    private String localidad;
    private String tipo;
    private int capacidad;
    private float ventas_prom;

    Sucursal(int id, String localidad, String tipo, int capacidad, float ventas_prom) {
        this.id = id;
        this.localidad = localidad;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.ventas_prom = ventas_prom;
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

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
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
    
    
}
