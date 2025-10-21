import java.util.ArrayList;

import bll.Direccion;
import bll.Inventario;
import bll.Usuario;

import java.util.*;
import java.time.*;


public class Sucursal {
	private String codigoSucursal;
	private Direccion direccion;
	private String telefono;
	private Gerente encargadoGerente;
    private ArrayList<Sector> sectores;
    private ArrayList<Inventario>inventarios;
    private ArrayList<Pedido> pedidosRecibidos;
    private ArrayList<Pedido> pedidosEnviados;
    private ArrayList<Usuario> empleados;
	
    
    public Sucursal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sucursal(String codigoSucursal, Direccion direccion, String telefono, Gerente encargadoGerente,
			ArrayList<Sector> sectores, ArrayList<Inventario> inventarios, ArrayList<Pedido> pedidosRecibidos,
			ArrayList<Pedido> pedidosEnviados, ArrayList<Usuario> empleados) {
		super();
		this.codigoSucursal = codigoSucursal;
		this.direccion = direccion;
		this.telefono = telefono;
		this.encargadoGerente = encargadoGerente;
		this.sectores = sectores;
		this.inventarios = inventarios;
		this.pedidosRecibidos = pedidosRecibidos;
		this.pedidosEnviados = pedidosEnviados;
		this.empleados = empleados;
	}
	public String getCodigoSucursal() {
		return codigoSucursal;
	}
	public void setCodigoSucursal(String codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Gerente getEncargadoGerente() {
		return encargadoGerente;
	}
	public void setEncargadoGerente(Gerente encargadoGerente) {
		this.encargadoGerente = encargadoGerente;
	}
	public ArrayList<Sector> getSectores() {
		return sectores;
	}
	public void setSectores(ArrayList<Sector> sectores) {
		this.sectores = sectores;
	}
	public ArrayList<Inventario> getInventarios() {
		return inventarios;
	}
	public void setInventarios(ArrayList<Inventario> inventarios) {
		this.inventarios = inventarios;
	}
	public ArrayList<Pedido> getPedidosRecibidos() {
		return pedidosRecibidos;
	}
	public void setPedidosRecibidos(ArrayList<Pedido> pedidosRecibidos) {
		this.pedidosRecibidos = pedidosRecibidos;
	}
	public ArrayList<Pedido> getPedidosEnviados() {
		return pedidosEnviados;
	}
	public void setPedidosEnviados(ArrayList<Pedido> pedidosEnviados) {
		this.pedidosEnviados = pedidosEnviados;
	}
	public ArrayList<Usuario> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Usuario> empleados) {
		this.empleados = empleados;
	}
    
	 public boolean solicitarProducto(Pedido pedido) {
	        if (pedidosEnviados == null) {
	            pedidosEnviados = new ArrayList<>();
	        }
	        pedidosEnviados.add(pedido);
	        return true;
	 }

	 public boolean recibirProducto(Pedido pedido) {
	        if (pedidosRecibidos == null) {
	            pedidosRecibidos = new ArrayList<>();
	        }
	        pedidosRecibidos.add(pedido);
	        return true;
	 }

	 public ArrayList<Usuario> obtenerPersonal() {
	        return empleados;
	 
	 }

	 public void agregarSector(Sector sector) {
	        if (sectores == null) {
	            sectores = new ArrayList<>();
	        }
	        sectores.add(sector);
	 }

	 public void agregarEmpleado(Usuario empleado) {
	        if (empleados == null) {
	            empleados = new ArrayList<>();
	        }
	        empleados.add(empleado);
	 }

	 public ArrayList<Pedido> obtenerPedidosPorEstado(String estado) {
	        ArrayList<Pedido> pedidosFiltrados = new ArrayList<>();
	        if (pedidosRecibidos != null) {
	            for (Pedido pedido : pedidosRecibidos) {
	                if (pedido.getEstado().equals(estado)) {
	                    pedidosFiltrados.add(pedido);
	                }
	            }
	        }
	        return pedidosFiltrados;
	 }
    
}
