/*
 * Con esta clase nos conectamos a la base de datos
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class Conectar {
   
    private static Connection conn;
    private static final String Driver="com.mysql.jdbc.Driver";
    private static final String Usuario="root";
    private static final String Contrasenia="newborn";
    private static final String Url="jdbc:mysql://localhost:3306/tintoreria?autoReconnect=true&useSSL=false";

    public Conectar() {
    conn=null;
      
        
    }
    //este metodo nos retorna la conexion
    public Connection getConnection(){
        try {
            Class.forName(Driver);
            conn=DriverManager.getConnection(Url,Usuario,Contrasenia);
            if(conn!=null){
                
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar "+e);
        }
       
    
        
        return conn;
    }
    
    //con este metodo nos desconectamos de l abasew de datos
    public void Desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex.getMessage(),"Error al cerrar la conexion",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
