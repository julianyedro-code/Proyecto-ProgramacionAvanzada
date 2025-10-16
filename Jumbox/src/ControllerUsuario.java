import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class ControllerUsuario {

    private static Connection con = Conexion.getInstance().getConnection();

    public static Usuario login(String mail,String password) {
       
    	 
    	do {
    		
    		mail=JOptionPane.showInputDialog("Ingrese email");
			
		} while (mail.isEmpty());
    	
    	do {
		
    		password=JOptionPane.showInputDialog("Ingrese password");
		
    	} while (password.isEmpty());
    	
    	
    	Usuario usuario=null;
    	
    	
    	
    	
    	
    	
    	try {
    		PreparedStatement Logueo= con.prepareStatement("SELECT * FROM `usuario` WHERE email = ? AND contrasenia = ?");
			
    		Logueo.setString(1,mail);
    		Logueo.setString(2, password); 
    		
    		ResultSet resultado = Logueo.executeQuery();
    		
    		if (resultado.next()) {
				
    			  int id=resultado.getInt("id_usuario");
    			  String nombre = resultado.getString("nombre");
                  String email = resultado.getString("email");
                  String contrasenia = resultado.getString("contrasenia");
                  boolean activo = resultado.getBoolean("activo");
                  
                  usuario = new Usuario();
                  
                  usuario.getIdUsuario();
                  usuario.getNombre();
                  usuario.getEmail();
                  usuario.getContrasenia();
                  usuario.getActivo();
                  
			}
    		
		} catch (Exception e) {

			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error en el logueo"+ e.getMessage());
		
		}
    	return usuario;
    	
    	
    	
    }

    public static Usuario buscarPorID(int id) {
        Usuario usuario = null;
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuario WHERE idUsuario = ?");
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                String dni = rs.getString("dni");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                String contrasenia = rs.getString("contrasenia");
                boolean activo = rs.getBoolean("activo");
                
                usuario = new Usuario();
                usuario.setIdUsuario(id);
                usuario.setNombre(nombre);
                usuario.setDni(dni);
                usuario.setEmail(email);
                usuario.setTelefono(telefono);
                usuario.setContrasenia(contrasenia);
                usuario.setActivo(activo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuario;
    }

    public static void editarUsuario(Usuario usuario) {
        try {
            PreparedStatement Editar = con.prepareStatement(
                "UPDATE usuario SET nombre=?, dni=?, email=?, telefono=?, contrasenia=?, activo=? WHERE idUsuario=?"
            );
            Editar.setString(1, usuario.getNombre());
            Editar.setString(2, usuario.getDni());
            Editar.setString(3, usuario.getEmail());
            Editar.setString(4, usuario.getTelefono());
            Editar.setString(5, usuario.getContrasenia());
            Editar.setBoolean(6, usuario.getActivo());
            Editar.setInt(7, usuario.getIdUsuario());

            int filas = Editar.executeUpdate();
            if (filas > 0) {
                System.out.println("Usuario editado correctamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void EliminarUsuario(int id) {
        try {
            PreparedStatement eliminar = con.prepareStatement("UPDATE usuario SET activo = false WHERE idUsuario = ?");
            eliminar.setInt(1, id);

            int filas = eliminar.executeUpdate();
            if (filas > 0) {
                System.out.println("Usuario desactivado correctamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean emailExiste(String email) {
        try {
            PreparedStatement emailExistente = con.prepareStatement("SELECT COUNT(*) FROM usuario WHERE email = ?");
            emailExistente.setString(1, email);
            ResultSet rs = emailExistente.executeQuery();
            
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static void agregarUsuario(Usuario usuario) {
        if (emailExiste(usuario.getEmail())) {
            JOptionPane.showMessageDialog(null, "Ya existe un usuario con este email");
            return;
        }
        
        try {
            PreparedStatement statement = con.prepareStatement(
                "INSERT INTO usuario (nombre, dni, email, telefono, contrasenia, activo) VALUES (?, ?, ?, ?, ?, ?)"
            );
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getDni());
            statement.setString(3, usuario.getEmail());
            statement.setString(4, usuario.getTelefono());
            statement.setString(5, usuario.getContrasenia());
            statement.setBoolean(6, usuario.getActivo());

            int filas = statement.executeUpdate();
            if (filas > 0) {
                System.out.println("Usuario agregado correctamente.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al agregar usuario: " + e.getMessage());
        }
    }


    public static LinkedList<Usuario> mostrarUsuarios() {
        LinkedList<Usuario> usuarios = new LinkedList<>();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM usuario WHERE activo = true");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("idUsuario");
                String nombre = rs.getString("nombre");
                String dni = rs.getString("dni");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                String contrasenia = rs.getString("contrasenia");
                boolean activo = rs.getBoolean("activo");

                Usuario usuario = new Usuario();
                usuario.setIdUsuario(id);
                usuario.setNombre(nombre);
                usuario.setDni(dni);
                usuario.setEmail(email);
                usuario.setTelefono(telefono);
                usuario.setContrasenia(contrasenia);
                usuario.setActivo(activo);
                
                usuarios.add(usuario);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}