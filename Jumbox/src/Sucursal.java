import java.util.ArrayList;
import java.util.*;
import java.time.*;


public class Sucursal {
	private String codigoSucursal;
	private Direccion direccion;
	private String telefono;
	private Gerente encargadoGerente;
    private ArrayList<Sector> sectores;
    private ArrayList<Inventario>inventarios;
    private ArrayList<Pedido> pedidosRecibidos;
    private ArrayList<Pedido> pedidosEnviados;
    private ArrayList<Usuario> empleados;
}
