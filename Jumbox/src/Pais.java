
public class Pais {	
	
	private String nombre;
	private ArrayList<Sucursal> sucursales;
    private GerenteRegional gerenteRegional;
	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pais(String nombre, ArrayList<Sucursal> sucursales, GerenteRegional gerenteRegional) {
		super();
		this.nombre = nombre;
		this.sucursales = sucursales;
		this.gerenteRegional = gerenteRegional;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Sucursal> getSucursales() {
		return sucursales;
	}
	public void setSucursales(ArrayList<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}
	public GerenteRegional getGerenteRegional() {
		return gerenteRegional;
	}
	public void setGerenteRegional(GerenteRegional gerenteRegional) {
		this.gerenteRegional = gerenteRegional;
	}
    
	public ArrayList<Sucursal> agregarSucursal( Sucursal sucursal){
		
	}
	
	public ArrayList<Sucursal> eliminarSucursal( Sucursal sucursal){
		
	} 
	public ArrayList<Sucursal> mostrarSucursales(){
		
	}
	public 	 ArrayList<Sucursal>  obtenerSucursalesPorRegion(){
		
	}
	
}
