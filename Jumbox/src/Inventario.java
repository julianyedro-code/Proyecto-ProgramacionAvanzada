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
}
