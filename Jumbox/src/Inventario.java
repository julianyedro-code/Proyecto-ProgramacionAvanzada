import java.util.ArrayList;
import java.util.*;
import java.time.*;


public class Inventario {
	private int cantidadTotal;
	private int stockMaximo;
	private int stockMinimo;
	private ArrayList<Producto> productos;
	private ArrayList<Categoria>categoria;
	private LocalDateTime fechaActualizacion;
	private ArrayList<AlertaStock> alertasGeneradas;
	
	public Inventario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Inventario(int cantidadTotal, int stockMaximo, int stockMinimo, ArrayList<Producto> productos,
			ArrayList<Categoria> categoria, LocalDateTime fechaActualizacion, ArrayList<AlertaStock> alertasGeneradas) {
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

	public ArrayList<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(ArrayList<Categoria> categoria) {
		this.categoria = categoria;
	}

	public LocalDateTime getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public ArrayList<AlertaStock> getAlertasGeneradas() {
		return alertasGeneradas;
	}

	public void setAlertasGeneradas(ArrayList<AlertaStock> alertasGeneradas) {
		this.alertasGeneradas = alertasGeneradas;
	}
	
	
	public void agregarProducto(Producto producto, int cantidad) {
        if (productos == null) {
            productos = new ArrayList<>();
        }
        
        productos.add(producto);
        this.cantidadTotal += cantidad;
        this.fechaActualizacion = LocalDateTime.now();
    }

    public void eliminarProducto(Producto producto, int cantidad) {
        if (productos != null) {
            productos.remove(producto);
            this.cantidadTotal -= cantidad;
            this.fechaActualizacion = LocalDateTime.now();
        }
    }

    public int actualizarStock(Producto producto, int cantidad) {
        this.cantidadTotal = cantidad;
        this.fechaActualizacion = LocalDateTime.now();
        
        return this.cantidadTotal;
    }

    public int consultarStock(Producto producto) {
      
    	return cantidadTotal;
    }

    public ArrayList<Producto> verificarStockBajo() {
    	
        ArrayList<Producto> productosBajos = new ArrayList<>();
        
        return productosBajos;
    }

    public AlertaStock generarAlerta() {
        AlertaStock alerta = new AlertaStock();
        
        return alerta;
    }

    public ArrayList<Producto> obtenerProductosPorCategoria(Categoria categoria) {
        ArrayList<Producto> productosCategoria = new ArrayList<>();
        if (productos != null) {
            for (Producto producto : productos) {
                if (producto.getCategoria().equals(categoria)) {
                    productosCategoria.add(producto);
                }
            }
        }
        return productosCategoria;
    }

    public ArrayList<AlertaStock> obtenerAlertasRecientes() {
        return alertasGeneradas;
    }

    public ArrayList<Producto> obtenerProductosPorSector(Sector sector) {
        ArrayList<Producto> productosSector = new ArrayList<>();
        
        return productosSector;
    }
	
	
}
