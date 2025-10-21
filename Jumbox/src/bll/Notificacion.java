package bll;
import java.util.ArrayList;
import java.util.*;
import java.time.*;


public class Notificacion {
    private String id;
    private String mensaje;
    private LocalDateTime fecha;
    private boolean leida; 
    private String tipo;
    private Usuario usuarioDestinatario;
    private ArrayList<Usuario> usuariosNotificados;
	public Notificacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Notificacion(String id, String mensaje, LocalDateTime fecha, boolean leida, String tipo,
			Usuario usuarioDestinatario, ArrayList<Usuario> usuariosNotificados) {
		super();
		this.id = id;
		this.mensaje = mensaje;
		this.fecha = fecha;
		this.leida = leida;
		this.tipo = tipo;
		this.usuarioDestinatario = usuarioDestinatario;
		this.usuariosNotificados = usuariosNotificados;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public boolean isLeida() {
		return leida;
	}
	public void setLeida(boolean leida) {
		this.leida = leida;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Usuario getUsuarioDestinatario() {
		return usuarioDestinatario;
	}
	public void setUsuarioDestinatario(Usuario usuarioDestinatario) {
		this.usuarioDestinatario = usuarioDestinatario;
	}
	
	public ArrayList<Usuario> getUsuariosNotificados() {
		return usuariosNotificados;
	}
	public void setUsuariosNotificados(ArrayList<Usuario> usuariosNotificados) {
		this.usuariosNotificados = usuariosNotificados;
	}
    
	public boolean enviarNotificacion() {
        this.fecha = LocalDateTime.now();
        return true;
    }

    public boolean marcarComoLeida() {
        this.leida = true;
        return true;
    }

    

    public void mostrarUsuariosNotif(ArrayList<Usuario> usuarios) {
        this.usuariosNotificados = usuarios;
    }


}