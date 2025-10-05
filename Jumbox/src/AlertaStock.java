
public class AlertaStock {
	
	 private String idAlerta;
     private Producto producto;
     private int stockActual;
     private int stockMinimoRequerido;
     private String tipoAlerta;
     private LocalDateTime fechaGeneracion;
     private boolean resuelta;
	
     public AlertaStock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlertaStock(String idAlerta, Producto producto, int stockActual, int stockMinimoRequerido, String tipoAlerta,
			LocalDateTime fechaGeneracion, boolean resuelta) {
		super();
		this.idAlerta = idAlerta;
		this.producto = producto;
		this.stockActual = stockActual;
		this.stockMinimoRequerido = stockMinimoRequerido;
		this.tipoAlerta = tipoAlerta;
		this.fechaGeneracion = fechaGeneracion;
		this.resuelta = resuelta;
	}

	public String getIdAlerta() {
		return idAlerta;
	}

	public void setIdAlerta(String idAlerta) {
		this.idAlerta = idAlerta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public int getStockMinimoRequerido() {
		return stockMinimoRequerido;
	}

	public void setStockMinimoRequerido(int stockMinimoRequerido) {
		this.stockMinimoRequerido = stockMinimoRequerido;
	}

	public String getTipoAlerta() {
		return tipoAlerta;
	}

	public void setTipoAlerta(String tipoAlerta) {
		this.tipoAlerta = tipoAlerta;
	}

	public LocalDateTime getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(LocalDateTime fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public boolean isResuelta() {
		return resuelta;
	}

	public void setResuelta(boolean resuelta) {
		this.resuelta = resuelta;
	}
     
	
	public boolean enviarAlertaGerente() {
		return true;
	}
    public boolean requiereAccionInmediata() {
    	return true;
    };
    
    public Inventario generarRecomendacionPedido() {
    	return Inventario;
    	
    }
    
    public boolean marcarComoResuelta() {
    	return true;  
    }
    
    public agregarUsuarioNotificado( Usuario usuario) {
    	
    };
    
     
     
     
     
}
