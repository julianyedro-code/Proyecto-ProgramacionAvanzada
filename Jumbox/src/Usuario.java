import java.util.ArrayList;
import java.util.*;
import java.time.*;


public class Usuario {
	
    private int idUsuario;
    private String nombre;
    private String dni;
    private String email;
    private Direccion direccion;
    private String telefono;
    private String contrasenia;
    private boolean activo;
    private ArrayList<Notificacion> notificaciones;
	
    public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idUsuario, String nombre, String dni, String email, Direccion direccion, String telefono,
			String contrasenia, boolean activo, ArrayList<Notificacion> notificaciones) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.contrasenia = contrasenia;
		this.activo = activo;
		this.notificaciones = notificaciones;
	}

	public Usuario(int idUsuario, String nombre, String dni, String email, Direccion direccion, String telefono,
			String contrasenia, boolean activo) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.contrasenia = contrasenia;
		this.activo = activo;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public boolean getActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public ArrayList<Notificacion> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(ArrayList<Notificacion> notificaciones) {
		this.notificaciones = notificaciones;
	}
    
	public boolean ingresar() {
        
		return true;
    }

    public void cambiarContrasenia(String nuevaContrasenia) {
        this.contrasenia = nuevaContrasenia;
    }

    public Inventario consultarStockSucursal() {
        
    	return null;
    }

    public Inventario consultarStockSector(ArrayList<Inventario> producto) {
        
    	return null;
    }

    public void agregarNotificacion(Notificacion notificacion) {
        if (notificaciones == null) {
            notificaciones = new ArrayList<>();
        }
        notificaciones.add(notificacion);
    }

    public ArrayList<Notificacion> obtenerNotificacionesNoLeidas() {
    
    	ArrayList<Notificacion> noLeidas = new ArrayList<>();
        if (notificaciones != null) {
            for (Notificacion notificacion : notificaciones) {
                if (!notificacion.isLeida()) {
                    noLeidas.add(notificacion);
                }
            }
        }
        return noLeidas;
    }

    
    
}
