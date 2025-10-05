
public class Direccion {
	
	
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
