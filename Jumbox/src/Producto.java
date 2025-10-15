import java.util.ArrayList;
import java.util.*;
import java.time.*;

public class Producto {

	private String codigo;
	private String nombre;
	private String descripcion;
	private double precio;
	private String proveedor;
	private Categoria categoria;
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Producto(String codigo, String nombre, String descripcion, double precio, String proveedor,
			Categoria categoria) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.proveedor = proveedor;
		this.categoria = categoria;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getProveedor() {
		return proveedor;
	}


	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
				+ precio + ", proveedor=" + proveedor + ", categoria=" + categoria ;
	}
	
	
	
}


