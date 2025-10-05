
public class Inventario {

	private int cantidadTotal;
	private int stockMaximo;
	private int stockMinimo;
    private ArrayList<Producto> productos;
    private Array<Categoria>categoria;
    privateLocalDateTime fechaActualizacion;
    private ArrayList<AlertaStock> alertasGeneradas;
	public Inventario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inventario(int cantidadTotal, int stockMaximo, int stockMinimo, ArrayList<Producto> productos,
			Array<Categoria> categoria, privateLocalDateTime fechaActualizacion,
			ArrayList<AlertaStock> alertasGeneradas) {
		super();
		this.cantidadTotal = cantidadTotal;
		this.stockMaximo = stockMaximo;
		this.stockMinimo = stockMinimo;
		this.productos = productos;
		this.categoria = categoria;
		this.fechaActualizacion = fechaActualizacion;
		this.alertasGeneradas = alertasGeneradas;
	}
	public int getCantidadTotal() {
		return cantidadTotal;
	}
	public void setCantidadTotal(int cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}
	public int getStockMaximo() {
		return stockMaximo;
	}
	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}
	public int getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	public Array<Categoria> getCategoria() {
		return categoria;
	}
	public void setCategoria(Array<Categoria> categoria) {
		this.categoria = categoria;
	}
	public privateLocalDateTime getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(privateLocalDateTime fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public ArrayList<AlertaStock> getAlertasGeneradas() {
		return alertasGeneradas;
	}
	public void setAlertasGeneradas(ArrayList<AlertaStock> alertasGeneradas) {
		this.alertasGeneradas = alertasGeneradas;
	}
    
	public Producto agregarProducto(Producto producto, 
			int cantidad) {
		
	}
	public Producto eliminarProducto(Producto producto,int 
			cantidad) {
		
	}
	public int actualizarStock(Producto producto,int 
			cantidad ){
	
	};
			        
	public int consultarStock( Producto producto) {
		
	}
		
	public ArrayList<Producto> verificarStockBajo(){
		
	}
	
	public  AlertaStock generarAlerta() {
		
	}
	
	public  ArrayList<Producto> obtenerProductosPorCategoria(Categoria categoria ) {
		
	}
	
	public ArrayList<AlertaStock> obtenerAlertasRecientes() {
		
	}
	public ArrayList<Producto> obtenerProductosPorSector(Sector sector){
		
	}
			
}
