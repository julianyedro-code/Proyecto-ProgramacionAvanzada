import java.util.ArrayList;

import bll.Direccion;
import bll.Inventario;
import bll.Notificacion;
import bll.Usuario;

import java.util.*;
import java.time.*;


public class Gerente extends Usuario {


	private ArrayList<Pedido> pedidosSucursal;
    private ArrayList<Pedido> pedidosConfirmados;
    private ArrayList<AlertaStock> alertas;

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(int idUsuario, String nombre, String dni, String email, Direccion direccion, String telefono,
			String contrasenia, boolean activo, ArrayList<Notificacion> notificaciones) {
		super(idUsuario, nombre, dni, email, direccion, telefono, contrasenia, activo, notificaciones);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Pedido> getPedidosSucursal() {
		return pedidosSucursal;
	}

	public void setPedidosSucursal(ArrayList<Pedido> pedidosSucursal) {
		this.pedidosSucursal = pedidosSucursal;
	}
	


    public ArrayList<Usuario> visualizarEmpleados() {
        
        return new ArrayList<>();
    }

    public Inventario consultarStockSucursal() {
        
    	return null;
    }

    public boolean confirmarPedido(Pedido pedido) {
        if (pedidosConfirmados == null) {
            pedidosConfirmados = new ArrayList<>();
        }
        pedidosConfirmados.add(pedido);
        return true;
    }

    public void recibirAlerta(AlertaStock alerta) {
        if (alertas == null) {
            alertas = new ArrayList<>();
        }
        alertas.add(alerta);
    }

    public ArrayList<AlertaStock> obtenerAlertasNoResueltas() {
        ArrayList<AlertaStock> noResueltas = new ArrayList<>();
        if (alertas != null) {
            for (AlertaStock alerta : alertas) {
                if (!alerta.isResuelta()) {
                    noResueltas.add(alerta);
                }
            }
        }
        return noResueltas;
    }
	
}
