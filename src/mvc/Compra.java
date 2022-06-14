//EQUIPO4
package mvc;

public class Compra {
    private int id;
    private String titulo;
    private int tipo_compra;
    private float monto;
    private int tipo_pago;
     
    private Compra siguiente;
    //CONSTRUCTOR 

    public Compra(int id, String titulo, int tipo_compra, float monto, int tipo_pago) {
        this.id = id;
        this.titulo = titulo;
        this.tipo_compra = tipo_compra;
        this.monto = monto;
        this.tipo_pago = tipo_pago;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTipo_compra() {
        return tipo_compra;
    }

    public void setTipo_compra(int tipo_compra) {
        this.tipo_compra = tipo_compra;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(int tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public Compra getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Compra siguiente) {
        this.siguiente = siguiente;
    }
    
}
