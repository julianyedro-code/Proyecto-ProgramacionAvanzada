
public class Categoria {
	private String idCategoria;
    private String nombreCategoria;
    private ArrayList <Producto> productos;
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
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
    
	
	private ArrayList<Producto> obtenerProductos() {
		
	}
    private void agregarProducto(Producto producto) {
    	
    }
    private void eliminarProducto(Producto producto) {
    	
    }
    private int contarProductos(Producto producto) {
    	
    };
    
}
