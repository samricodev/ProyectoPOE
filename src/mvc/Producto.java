//Equipo 4
package mvc;

public class Producto {
    private int id;
    private String nombre;
    private float contenido;
    private int unidades;
    private float costo;

    Producto(int id, String nombre, float contenido, int unidades, float costo) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.unidades = unidades;
        this.costo = costo;
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

    public float getContenido(){
        return contenido;
    }

    public void setContenido(float contenido){
        this.contenido = contenido;
    }

    public int getUnidades(){
        return unidades;
    }

    public void setUnidades(int unidades){
        this.unidades = unidades;
    }

    public float getCosto(){
        return costo;
    }

    public void setCosto(float costo){
        this.costo = costo;
    }
}
