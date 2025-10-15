import java.util.ArrayList;
import java.util.*;
import java.time.*;


public class Categoria {

	
	private String idCategoria;
    private String nombreCategoria;
    private ArrayList <Producto> productos;
	
    public Categoria() {
		super();

    }
	
    public Categoria(String idCategoria, String nombreCategoria, ArrayList<Producto> productos) {
		super();
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
		this.productos = productos;
	}
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

    public  ArrayList<Producto> obtenerProductos(){
    	
    	if(this.productos == null) {
            this.productos = new ArrayList<>();  
        }
        return new ArrayList<>(this.productos);
    
    }
    public void agregarProducto(Producto producto) {
    	
    	   if (this.productos == null) {
    	        this.productos = new ArrayList<>();
    	    }
    	    this.productos.add(producto);
    	
    }

    public void eliminarProducto( Producto producto) {
    	   if (this.productos == null) {
    	        this.productos = new ArrayList<>();
    	    }
    	    this.productos.add(producto);
    }
    

     
}
