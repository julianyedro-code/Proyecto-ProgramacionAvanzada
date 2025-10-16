import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		Conexion.getInstance();
		
		String [] opciones =  {"Registrarse","Ingresar","Salir"};
		
		int opcion;
		String email;
		String contrasenia;
		String nombre;
		 
		
		do {
			
			opcion=JOptionPane.showOptionDialog(null, "Elija opcion", null, 0, 0, null, opciones, opciones);
			
			switch (opcion) {
			
			case 0:
				email=JOptionPane.showInputDialog("Ingrese email:");		
				
				
				
				contrasenia=JOptionPane.showInputDialog("Ingrese contrasenia");
			case 1:
				email=JOptionPane.showInputDialog("Ingrese email");
				contrasenia=JOptionPane.showInputDialog("Ingrese contrasenia");
		
				Usuario encontrado = ControllerUsuario.login(email,contrasenia);
				
				JOptionPane.showMessageDialog(null, encontrado!=null?"encontrado"+encontrado:"no encontrado");
				
				break;
				
				
			default:
				break;
			}
			
		} while (opcion!=2);
		
	}
}
