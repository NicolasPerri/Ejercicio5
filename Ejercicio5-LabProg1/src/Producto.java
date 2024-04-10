
public class Producto {
    private int cod;
    private String descrip;
    private double precio;
    private int stock;
    private String cat;
    
    public Producto() {
    }

    public Producto(int cod, String descrip, double precio, int stock, String cat) {
        this.cod = cod;
        this.descrip = descrip;
        this.precio = precio;
        this.stock = stock;
        this.cat = cat;
    }

    public int getCodigo() {
        return cod;
    }

    public void setCodigo(int codigo) {
        this.cod = codigo;
    }

    public String getDescripcion() {
        return descrip;
    }

    public void setDescripcion(String descripcion) {
        this.descrip = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategorias() {
        return cat;
    }

    public void setCategorias(String categorias) {
        this.cat = categorias;
    }
 
}
