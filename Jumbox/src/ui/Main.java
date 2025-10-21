
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
                nuevoUsuario.setDni(JOptionPane.showInputDialog("Ingrese su DNI"));
                nuevoUsuario.setIdDireccion(nuevaDireccion.getIdDireccion()); 
                nuevoUsuario.setTelefono(JOptionPane.showInputDialog("Ingrese su teléfono"));
                nuevoUsuario.setActivo(true);
                
                String email;
                do {
                    email = JOptionPane.showInputDialog("Ingrese su email");
                    if (ControllerUsuario.emailExiste(email)) {
                        JOptionPane.showMessageDialog(null, "❌ Este email ya está registrado. Use otro email.");
                    }
                } while (ControllerUsuario.emailExiste(email));
                
                nuevoUsuario.setEmail(email);
                
                nuevoUsuario.setContrasenia(JOptionPane.showInputDialog("Ingrese su contraseña"));
                
                ControllerUsuario.agregarUsuario(nuevoUsuario);
                
                
                
                
                break;
                
            case 1:
            	
            	break;
                
            default:
                break;
        }
    }
}