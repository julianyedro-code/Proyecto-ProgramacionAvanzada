package dll;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.sql.*;
import javax.swing.JOptionPane;

import bll.Direccion;
import bll.Usuario;


public class ControllerUsuario {

    private static Connection con = Conexion.getInstance().getConnection();

    public static Usuario login(String mail,String password) {
       
    	Usuario usuario=null;
    	 
    	do {
    		
    		mail=JOptionPane.showInputDialog("Ingrese email");
			
    		if (mail.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debe  ingresar algun dato");
					
			}
    		
		} while (mail.isEmpty());
    	
    	do {
		
    		password=JOptionPane.showInputDialog("Ingrese password");
		

				
    	} while (password.isEmpty());
    	
    	
    	
    	
    	
    	try {
    		
		PreparedStatement logueo = con.prepareStatement("SELECT * FROM usuario WHERE email=? AND contrasenia= ? ");
    		
		logueo.setString(1,mail);
		logueo.setString(2, password);
		
		ResultSet resultado = logueo.executeQuery();
    		
		if (resultado.next()) {
		
			int id = resultado.getInt("id_usuario");
			String nombre=resultado.getString("nombre");
			String apellido=resultado.getString("apellido");
			String dni=resultado.getString("dni");
			String email=resultado.getString("email");
			String legajo=resultado.getString("legajo");
			int direccion=resultado.getInt("id_direccion");
			String telefono=resultado.getString("telefono");
			double sueldo=resultado.getDouble("sueldo");
			String contrasenia =resultado.getString("contrasenia");
			boolean activo=resultado.getBoolean("activo");
	
			usuario =new Usuario(id,nombre,apellido,dni,email,legajo,null,telefono,sueldo,contrasenia,activo);

			JOptionPane.showMessageDialog(null,"Bienvenido "+usuario.getNombre());
			 
		}
		
		
		else {
			JOptionPane.showMessageDialog(null, "Usuario no encontrado");
		}
		
		
    	} catch (Exception e) {
		
    		JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
    	
    	
    	
    return usuario;
    	
    	
    	    	
    	
    	
    
   }
    
    
    public static boolean emailExiste(String email) {
	    	try {
				
	    		PreparedStatement emailExistente =con.prepareStatement("SELECT COUNT(*) FROM usuario WHERE email=?");
	    		emailExistente.setString(1, email);
	    		
	    		ResultSet resultado = emailExistente.executeQuery();
	    		
	    		if (resultado.next()) {
	    			
	    			if (resultado.getInt(1)>0) {
	    				return true;
	    			}
	    		
	    		}
	    		return false;
	    		
			} catch (Exception e) {
	
				e.printStackTrace();
				return false;
			}
		
    	
    }
    
    
    public static Usuario agregarUsuario(Usuario usuario) {
    	
    	
    	try {
    		 
    		
            PreparedStatement statement = con.prepareStatement(
            		"INSERT INTO usuario (nombre, apellido, dni, email, legajo , id_direccion, telefono, contrasenia, activo) VALUES (?, ?, ?, ? , ?, ?, ?, ?, ?)"
            );
            
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getApellido());
            statement.setString(3, usuario.getDni());
            statement.setString(4, usuario.getEmail());
            statement.setString(5, usuario.getDni());
            statement.setInt(6, usuario.getIdDireccion());
            statement.setString(7, usuario.getTelefono());
            statement.setString(8, usuario.getContrasenia());
            statement.setBoolean(9, true);
            
            int filas = statement.executeUpdate();
            if (filas > 0) {
                System.out.println("Usuario agregado correctamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al agregar usuario: " + e.getMessage());
        }

    	return usuario;
    }
    
    
    
    public static Direccion guardarDireccion(Direccion direccion) {
       
    	try {
            PreparedStatement guardarDireccion = con.prepareStatement(
                "INSERT INTO direccion (calle, numero, ciudad, provincia) VALUES (?, ?, ?, ?)",  Statement.RETURN_GENERATED_KEYS);
            
           
            guardarDireccion.setString(1, direccion.getCalle());
            guardarDireccion.setInt(2, direccion.getNumeroCalle());
            guardarDireccion.setString(3, direccion.getCiudad());
            guardarDireccion.setString(4, direccion.getProvincia());
            
            guardarDireccion.executeUpdate();
            
            ResultSet resultado = guardarDireccion.getGeneratedKeys();
            
            if (resultado.next()) {
            	 int idGenerado = resultado.getInt(1);  
                 direccion.setIdDireccion(idGenerado);
                 System.out.println("✅ Direccion guardada exitosamente con ID: " + idGenerado);
            }
            
             
            resultado.close();
            guardarDireccion.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return direccion;   
    }
}