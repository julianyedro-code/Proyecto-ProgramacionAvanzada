
package ui;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import bll.Usuario;
import bll.Direccion;
import dll.Conexion;
import dll.ControllerUsuario;



public class Main {
	
    public static void main(String[] args) {
        
        Conexion.getInstance();
        
        String[] opciones = {"Registrarse", "Ingresar", "Salir"};
        
        int opcion = JOptionPane.showOptionDialog(null, "Ingrese opción", "Menu principal", 0, 0, null, opciones, opciones[2]);
        
        switch (opcion) {
            case 0:

            	Direccion nuevaDireccion = new Direccion();
            	
                nuevaDireccion.setCalle(JOptionPane.showInputDialog("Ingrese calle"));
                nuevaDireccion.setNumeroCalle(Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de la calle")));
                nuevaDireccion.setCiudad(JOptionPane.showInputDialog("Ingrese ciudad"));
                nuevaDireccion.setProvincia(JOptionPane.showInputDialog("Ingrese provincia"));
        
                ControllerUsuario.guardarDireccion(nuevaDireccion);
                
                Usuario nuevoUsuario = new Usuario();
                nuevoUsuario.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
                nuevoUsuario.setApellido(JOptionPane.showInputDialog("Ingrese su apellido"));
                nuevoUsuario.setIdDireccion(nuevaDireccion.getIdDireccion()); 
                nuevoUsuario.setTelefono(JOptionPane.showInputDialog("Ingrese su teléfono"));
                nuevoUsuario.setActivo(true);
                
                String dni;
                do {
                	dni=JOptionPane.showInputDialog("Ingrese su DNI");
                    if (ControllerUsuario.dniExiste(dni)) {
                    	
						JOptionPane.showMessageDialog(null,"❌ Este dni ya está registrado. Use su DNI.");
					}	
				} while (ControllerUsuario.dniExiste(dni));
                
                String telefono;
                
                
                do {
                	telefono=JOptionPane.showInputDialog("Ingrese su telefono");
                    if (ControllerUsuario.telefonoExiste(telefono)) {
                    	
						JOptionPane.showMessageDialog(null,"❌ Este telefono  ya está registrado. Use su telefono.");
					}	
				} while (ControllerUsuario.telefonoExiste(telefono));
                
                
                String email;
                do {
                    email = JOptionPane.showInputDialog("Ingrese su email");
                    if (ControllerUsuario.emailExiste(email)) {
                        JOptionPane.showMessageDialog(null, "❌ Este email ya está registrado. Use otro email.");
                    }
                } while (ControllerUsuario.emailExiste(email));
                
                nuevoUsuario.setDni(dni);
                nuevoUsuario.setTelefono(telefono);
                nuevoUsuario.setEmail(email);
                
                nuevoUsuario.setContrasenia(JOptionPane.showInputDialog("Ingrese su contraseña"));
                
                ControllerUsuario.agregarUsuario(nuevoUsuario);
                
                JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente");
                
                
                break;
                
            case 1:
            	
            	String emailLogin = "";
                String passwordLogin = "";
                
                emailLogin = JOptionPane.showInputDialog("Ingrese su email:");
                
                if (emailLogin == null || emailLogin.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar un email");
                    break;
                }
                
                passwordLogin = JOptionPane.showInputDialog("Ingrese su contraseña:");
                if (passwordLogin == null || passwordLogin.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Debe ingresar una contraseña");
                    break;
                }
                
                
                Usuario usuarioLogueado = ControllerUsuario.login(emailLogin, passwordLogin);
                
                if (usuarioLogueado != null) {
                    
                	JOptionPane.showMessageDialog(null, "✅ Login exitoso\nBienvenido: " + 
                        usuarioLogueado.getNombre() + " " + usuarioLogueado.getApellido());
                    
                    
                    String[] opcionesUsuario = {"Ver Perfil", "Editar Datos", "Cerrar Sesión"};
                    int opcionUsuario;
                    
                    do {
                        opcionUsuario = JOptionPane.showOptionDialog(null, 
                            "¿Qué desea hacer?", "Menú Usuario", 
                            0, 0, null, opcionesUsuario, opcionesUsuario[0]);
                        
                        switch (opcionUsuario) {
                            case 0: 
                                String perfil = "--- PERFIL DEL USUARIO ---\n" +
                                               "Nombre: " + usuarioLogueado.getNombre() + "\n" +
                                               "Apellido: " + usuarioLogueado.getApellido() + "\n" +
                                               "Email: " + usuarioLogueado.getEmail() + "\n" +
                                               "DNI: " + usuarioLogueado.getDni() + "\n" +
                                               "Teléfono: " + usuarioLogueado.getTelefono() + "\n" +
                                               "Estado: " + (usuarioLogueado.getActivo() ? "Activo" : "Inactivo");
                                JOptionPane.showMessageDialog(null, perfil);
                                break;
                                
                            case 1: 
                                JOptionPane.showMessageDialog(null, "⏳ Función en desarrollo...");
                                
                                break;
                                
                            case 2:
                                JOptionPane.showMessageDialog(null, "👋 Sesión cerrada. Hasta pronto!");
                                break;
                                
                            default:
                                break;
                        }
                        
                    } while (opcionUsuario != 2 && opcionUsuario != -1); 
                    
                } else {
                    JOptionPane.showMessageDialog(null, "❌ Error en el login. Verifique sus credenciales.");
                }
            	
            	break;
                
            default:
            	JOptionPane.showMessageDialog(null, "Saliendo..");
                break;
        }
    }
}