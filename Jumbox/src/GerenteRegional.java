import java.util.ArrayList;

import bll.Direccion;
import bll.Notificacion;
import bll.Usuario;

import java.util.*;
import java.time.*;


public class GerenteRegional extends Usuario{

	   private ArrayList<Pedido> pedidosPendientesAprobacion;

	public GerenteRegional() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GerenteRegional(int idUsuario, String nombre, String dni, String email, Direccion direccion, String telefono,
			String contrasenia, boolean activo, ArrayList<Notificacion> notificaciones) {
		super(idUsuario, nombre, dni, email, direccion, telefono, contrasenia, activo, notificaciones);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Pedido> getPedidosPendientesAprobacion() {
		return pedidosPendientesAprobacion;
	}

	public void setPedidosPendientesAprobacion(ArrayList<Pedido> pedidosPendientesAprobacion) {
		this.pedidosPendientesAprobacion = pedidosPendientesAprobacion;
	}
	


    public ArrayList<Usuario> visualizarEmpleados() {
     
    	return new ArrayList<>();
    }

    public boolean aprobarTraspasos(Pedido pedido) {
        if (pedidosPendientesAprobacion != null) {
            pedidosPendientesAprobacion.remove(pedido);
        }
        return true;
    }

    public ArrayList<Sucursal> consultarStockSucursalesNac() {
        
    	return new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        
    }

    public ArrayList<Pedido> obtenerPedidosPendientes() {
        return pedidosPendientesAprobacion;
    }
	    
	
	
	
	
	
}
