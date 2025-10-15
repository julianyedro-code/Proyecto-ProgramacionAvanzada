
import java.util.ArrayList;
import java.util.*;
import java.time.*;

public class Estadistica {

	private LocalDateTime periodoInicio;
    private LocalDateTime periodoFin;
    private ArrayList<Sucursal> sucursales;
    private ArrayList<Producto> productos;
    private int productosMasVendidos;
    private ArrayList<Producto> productosMenosVendidos;
    private ArrayList<Categoria> ventasPorCategoria;
    private ArrayList<Sucursal> rendimientoSucursales;
	public Estadistica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Estadistica(LocalDateTime periodoInicio, LocalDateTime periodoFin, ArrayList<Sucursal> sucursales,
			ArrayList<Producto> productos, int productosMasVendidos, ArrayList<Producto> productosMenosVendidos,
			ArrayList<Categoria> ventasPorCategoria, ArrayList<Sucursal> rendimientoSucursales) {
		super();
		this.periodoInicio = periodoInicio;
		this.periodoFin = periodoFin;
		this.sucursales = sucursales;
		this.productos = productos;
		this.productosMasVendidos = productosMasVendidos;
		this.productosMenosVendidos = productosMenosVendidos;
		this.ventasPorCategoria = ventasPorCategoria;
		this.rendimientoSucursales = rendimientoSucursales;
	}
	public LocalDateTime getPeriodoInicio() {
		return periodoInicio;
	}
	public void setPeriodoInicio(LocalDateTime periodoInicio) {
		this.periodoInicio = periodoInicio;
	}
	public LocalDateTime getPeriodoFin() {
		return periodoFin;
	}
	public void setPeriodoFin(LocalDateTime periodoFin) {
		this.periodoFin = periodoFin;
	}
	public ArrayList<Sucursal> getSucursales() {
		return sucursales;
	}
	public void setSucursales(ArrayList<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	public int getProductosMasVendidos() {
		return productosMasVendidos;
	}
	public void setProductosMasVendidos(int productosMasVendidos) {
		this.productosMasVendidos = productosMasVendidos;
	}
	public ArrayList<Producto> getProductosMenosVendidos() {
		return productosMenosVendidos;
	}
	public void setProductosMenosVendidos(ArrayList<Producto> productosMenosVendidos) {
		this.productosMenosVendidos = productosMenosVendidos;
	}
	public ArrayList<Categoria> getVentasPorCategoria() {
		return ventasPorCategoria;
	}
	public void setVentasPorCategoria(ArrayList<Categoria> ventasPorCategoria) {
		this.ventasPorCategoria = ventasPorCategoria;
	}
	public ArrayList<Sucursal> getRendimientoSucursales() {
		return rendimientoSucursales;
	}
	public void setRendimientoSucursales(ArrayList<Sucursal> rendimientoSucursales) {
		this.rendimientoSucursales = rendimientoSucursales;
	}

    public void generarReporteProductosPopulares() {
    
    }

    public void identificarProductosPocaVenta() {
    
    }

    public void calcularRotacionInventario() {
    
    }

    public void generarReporteVentasPorCategoria() {
    
    }

    public void compararRendimientoSucursales() {
    }

    public void agregarSucursal(Sucursal sucursal) {
        if (sucursales == null) {
            sucursales = new ArrayList<>();
        }
        sucursales.add(sucursal);
    }

    
    
}
