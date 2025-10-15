import java.util.ArrayList;
import java.util.*;
import java.time.*;

public class Sector {
	
	private ArrayList<Operario>operarios;
	private ArrayList<Jefe>jefes;
	private ArrayList<Categoria>productosCat;
	private ArrayList<Inventario>inventarios;
	private String idSector;
	private String nombre;
    private String descripcion;
    private String tipo;
    private ArrayList<Producto> productos;
	
    public Sector() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sector(ArrayList<Operario> operarios, ArrayList<Jefe> jefes, ArrayList<Categoria> productosCat,
			ArrayList<Inventario> inventarios, String idSector, String nombre, String descripcion, String tipo,
			ArrayList<Producto> productos) {
		super();
		this.operarios = operarios;
		this.jefes = jefes;
		this.productosCat = productosCat;
		this.inventarios = inventarios;
		this.idSector = idSector;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.productos = productos;
	}

	public ArrayList<Operario> getOperarios() {
		return operarios;
	}

	public void setOperarios(ArrayList<Operario> operarios) {
		this.operarios = operarios;
	}

	public ArrayList<Jefe> getJefes() {
		return jefes;
	}

	public void setJefes(ArrayList<Jefe> jefes) {
		this.jefes = jefes;
	}

	public ArrayList<Categoria> getProductosCat() {
		return productosCat;
	}

	public void setProductosCat(ArrayList<Categoria> productosCat) {
		this.productosCat = productosCat;
	}

	public ArrayList<Inventario> getInventarios() {
		return inventarios;
	}

	public void setInventarios(ArrayList<Inventario> inventarios) {
		this.inventarios = inventarios;
	}

	public String getIdSector() {
		return idSector;
	}

	public void setIdSector(String idSector) {
		this.idSector = idSector;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
    
 
	 public ArrayList<Producto> obtenerProductos() {
	        return productos;
	    }

	    public void agregarProducto(Producto producto) {
	        if (productos == null) {
	            productos = new ArrayList<>();
	        }
	        productos.add(producto);
	    }

	    public void eliminarProducto(Producto producto) {
	        if (productos != null) {
	            productos.remove(producto);
	        }
	    }
	
	
}
