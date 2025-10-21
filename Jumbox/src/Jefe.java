import java.util.ArrayList;

import bll.Direccion;
import bll.Notificacion;
import bll.Usuario;

import java.util.*;
import java.time.*;


public class Jefe extends Usuario{

	private ArrayList<Pedido> pedidosGenerados; 
	private ArrayList<Notificacion>notificaciones;
	private ArrayList<Pedido>pedidios;
	
	public Jefe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jefe(int idUsuario, String nombre, String dni, String email, Direccion direccion, String telefono,
			String contrasenia, boolean activo, ArrayList<Notificacion> notificaciones) {
		super(idUsuario, nombre, dni, email, direccion, telefono, contrasenia, activo, notificaciones);
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Pedido> getPedidosGenerados() {
		return pedidosGenerados;
	}
	public void setPedidosGenerados(ArrayList<Pedido> pedidosGenerados) {
		this.pedidosGenerados = pedidosGenerados;
	}
	public ArrayList<Notificacion> getNotificaciones() {
		return notificaciones;
	}
	public void setNotificaciones(ArrayList<Notificacion> notificaciones) {
		this.notificaciones = notificaciones;
	}
	public ArrayList<Pedido> getPedidios() {
		return pedidios;
	}
	public void setPedidios(ArrayList<Pedido> pedidios) {
		this.pedidios = pedidios;
	}

	
    public void generarPedido() {
    	
    }

    public void recibirNotificacion() {
       
    }

    public void enviarNotificacion() {
    
    }

    public void generarReporte() {
    
    }

}
