//Equipo 4
package mvc;

public class Venta {
    private int id;
    private String titulo;
    private String tipo;
    private float monto;
    private String tipo_pago;
    private Venta siguiente;

    Venta(int id, String titulo, String tipo, float monto, String tipo_pago) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.monto = monto;
        this.tipo_pago = tipo_pago;
        this.siguiente = null;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public float getMonto(){
        return monto;
    }

    public void setMonto(float monto){
        this.monto = monto;
    }

    public String getTipo_pago(){
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago){
        this.tipo_pago = tipo_pago;
    }

    public Venta getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Venta siguiente){
        this.siguiente = siguiente;
    }
    
    
}
