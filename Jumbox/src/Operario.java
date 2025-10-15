import java.util.ArrayList;
import java.util.*;
import java.time.*;


public class Operario extends Usuario {

	private Sucursal sucursal;
	private Sector sector;
    private ArrayList<Inventario> inventarios;
	public Operario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Operario(int idUsuario, String nombre, String dni, String email, Direccion direccion, String telefono,
			String contrasenia, boolean activo, ArrayList<Notificacion> notificaciones) {
		super(idUsuario, nombre, dni, email, direccion, telefono, contrasenia, activo, notificaciones);
		// TODO Auto-generated constructor stub
	}
	public Operario(Sucursal sucursal, Sector sector, ArrayList<Inventario> inventarios) {
		super();
		this.sucursal = sucursal;
		this.sector = sector;
		this.inventarios = inventarios;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	public ArrayList<Inventario> getInventarios() {
		return inventarios;
	}
	public void setInventarios(ArrayList<Inventario> inventarios) {
		this.inventarios = inventarios;
	}

	public Inventario consultarStockSector(ArrayList<Inventario> producto) {
        
		return null;
    }

    public void generarReporteInventario() {
    	
    }


    
    
}