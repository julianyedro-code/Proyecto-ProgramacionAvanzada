import java.util.ArrayList;
import java.util.*;
import java.time.*;


public class Pedido {

	private String idPedido;
    private Sucursal sucursalOrigen;
    private Sucursal sucursalDestino;
    private ArrayList <Producto> productos;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaEntrega;
    private String estado;
    private Usuario usuarioGenerador;
    private ArrayList<Notificacion> notificaciones;
	
    public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(String idPedido, Sucursal sucursalOrigen, Sucursal sucursalDestino, ArrayList<Producto> productos,
			LocalDateTime fechaCreacion, LocalDateTime fechaEntrega, String estado, Usuario usuarioGenerador,
			ArrayList<Notificacion> notificacion) {
		super();
		this.idPedido = idPedido;
		this.sucursalOrigen = sucursalOrigen;
		this.sucursalDestino = sucursalDestino;
		this.productos = productos;
		this.fechaCreacion = fechaCreacion;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
		this.usuarioGenerador = usuarioGenerador;
		this.notificacion = notificacion;
	}

	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public Sucursal getSucursalOrigen() {
		return sucursalOrigen;
	}

	public void setSucursalOrigen(Sucursal sucursalOrigen) {
		this.sucursalOrigen = sucursalOrigen;
	}

	public Sucursal getSucursalDestino() {
		return sucursalDestino;
	}

	public void setSucursalDestino(Sucursal sucursalDestino) {
		this.sucursalDestino = sucursalDestino;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDateTime getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDateTime fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuario getUsuarioGenerador() {
		return usuarioGenerador;
	}

	public void setUsuarioGenerador(Usuario usuarioGenerador) {
		this.usuarioGenerador = usuarioGenerador;
	}

	public ArrayList<Notificacion> getNotificacion() {
		return notificaciones;
	}

	public void setNotificacion(ArrayList<Notificacion> notificacion) {
		this.notificaciones = notificacion;
	}
	
	
	 public boolean validarStockSuficiente() {
	        return true;
	    }

	    public void agregarProducto(Producto producto) {
	        if (productos == null) {
	            productos = new ArrayList<>();
	        }
	        productos.add(producto);
	    }

	    public int elegirCantidad() {
	        return productos != null ? productos.size() : 0;
	    }

	    public void eliminarProducto(Producto producto) {
	        if (productos != null) {
	            productos.remove(producto);
	        }
	    }

	    public void actualizarEstado(String nuevoEstado) {
	        this.estado = nuevoEstado;
	    }

	    public double calcularTotal() {
	        double total = 0;
	        if (productos != null) {
	            for (Producto producto : productos) {
	                total += producto.getPrecio();
	            }
	        }
	        return total;
	    }

	    public int calcularTiempoEntrega() {
	        return 0;
	    }

	    public void agregarNotificacion(Notificacion notificacion) {
	        if (notificaciones == null) {
	            notificaciones = new ArrayList<>();
	        }
	        notificaciones.add(notificacion);
	    }

	    public ArrayList<Producto> obtenerProductosFaltantes() {
	        ArrayList<Producto> faltantes = new ArrayList<>();
	        return faltantes;
	    }

	
    
    

}
