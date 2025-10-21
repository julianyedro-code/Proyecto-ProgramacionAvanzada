package bll;
import java.util.ArrayList;


import java.util.*;
import java.time.*;

public class Direccion {
	
	private int idDireccion;
	private String calle;
	private int numeroCalle;
	private String ciudad;
	private String provincia;
	
	
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Direccion(String calle, int numeroCalle, String ciudad, String provincia) {
		super();
		this.calle = calle;
		this.numeroCalle = numeroCalle;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}
	
	public Direccion(int idDireccion,String calle, int numeroCalle, String ciudad, String provincia) {
		super();
		this.idDireccion=idDireccion;
		this.calle = calle;
		this.numeroCalle = numeroCalle;
		this.ciudad = ciudad;
		this.provincia = provincia;
	}

	public int getIdDireccion() {
		return idDireccion;
	}
	
	public void setIdDireccion(int idDireccion) {
		this.idDireccion=idDireccion;
	}
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumeroCalle() {
		return numeroCalle;
	}

	public void setNumeroCalle(int numeroCalle) {
		this.numeroCalle = numeroCalle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Direccion  : "+calle + ", " + numeroCalle + ", " + ciudad + ",."
				+ provincia ;
	}
	
	
	
	
}
