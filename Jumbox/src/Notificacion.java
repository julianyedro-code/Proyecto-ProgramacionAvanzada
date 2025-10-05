
public class Notificacion {
		
	private String id;
    private String mensaje;
    private LocalDateTime fecha;
    private boolean leida; 
    private String tipo;
    private Usuario usuarioDestinatario;
    private ArrayList<Usuario> usuariosNotificados;
    private ArrayList<AlertaStock>Alerta;
	
    public Notificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notificacion(String id, String mensaje, LocalDateTime fecha, boolean leida, String tipo,
			Usuario usuarioDestinatario, ArrayList<Usuario> usuariosNotificados, ArrayList<AlertaStock> alerta) {
		super();
		this.id = id;
		this.mensaje = mensaje;
		this.fecha = fecha;
		this.leida = leida;
		this.tipo = tipo;
		this.usuarioDestinatario = usuarioDestinatario;
		this.usuariosNotificados = usuariosNotificados;
		Alerta = alerta;
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

	public ArrayList<AlertaStock> getAlerta() {
		return Alerta;
	}

	public void setAlerta(ArrayList<AlertaStock> alerta) {
		Alerta = alerta;
	}
	
    public boolean enviarNotificacion() {
    	return true;
    }
    
    public  boolean marcarComoLeida() {
    	return boolean;
    }
    
    public boolean esUrgente(){
    	return boolean;
    }

    public mostrarUsuariosNotif(ArrayList<Usuario> usuarios) {
    	
    }
	
    
}
