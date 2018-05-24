
package Logicas;

import Clases.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IngresarClientes {
    
    private final String SQL_INSERT="INSERT INTO Clientes(idClientes,Nombres,Apellidos,Telefono,Domicilio) values(?,?,?,?,?)"; 
    private final String SQL_SELECT="SELECT * FROM Clientes";
    private PreparedStatement PS;
    private DefaultTableModel DT;
    private ResultSet RS; 
    private Conectar CN;
    

    public IngresarClientes() {
    PS=null;
    CN= new Conectar();
    
    }
    //Metodo para hacer las columnas necesarias 
    private DefaultTableModel setTitulos(){
        DT= new DefaultTableModel();
    DT.addColumn("Id");
    DT.addColumn("Nombres");
    DT.addColumn("Apellidos");
    DT.addColumn("Telefono");
    DT.addColumn("Domicilio");
    return DT;
    }
    
    public int  insertDatos(int idCliente,String Nom,String Ape,long Tel,String Dom){
              int res=0;       
        try {
            
            PS=CN.getConnection().prepareStatement(SQL_INSERT);
            PS.setInt(1, idCliente);
            PS.setString(2, Nom);
            PS.setString(3, Ape);
            PS.setLong(4, Tel);
            PS.setString(5, Dom);
            res=PS.executeUpdate();
            
            if(res>0){
                JOptionPane.showMessageDialog(null, "Registro se ha guardado con exito");
            }
        } catch (SQLException e) {
        }finally{
            PS=null;
            CN.Desconectar();
        }
        
        
        return res;
    }
     public int  updateDatos(int idCliente,String Nom,String Ape,long Tel,String Dom){
         String SQL="UPDATE Clientes  SET idClientes="+idCliente+",Nombres='"+Nom+"',Apellidos='"+Ape+"',Telefono="+Tel+",Domicilio='"+Dom+"' WHERE idClientes="+idCliente;     
         int res=0;       
        try {
            
            PS=CN.getConnection().prepareStatement(SQL);
            res=PS.executeUpdate();
            
            if(res>0){
                JOptionPane.showMessageDialog(null, "Registro se ha modificado con exito");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al modificar los datos"+e.getMessage());
        }finally{
            PS=null;
            CN.Desconectar();
        }
        
        
        return res;
    }
     
     public void deleteDatos(int id){
         String SQL="DELETE from Clientes WHERE idClientes="+id;     
         int res=0;       
        try {
            
            PS=CN.getConnection().prepareStatement(SQL);
            res=PS.executeUpdate();
            
            if(res>0){
                JOptionPane.showMessageDialog(null, "Registro se  ha Eliminado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar los datos"+e.getMessage());
        }finally{
            PS=null;
            CN.Desconectar();
        }
         
     }
    //metodo para listar todo lo de la tabla
    public DefaultTableModel getDatos(){
        try {
            setTitulos();
            PS=CN.getConnection().prepareStatement(SQL_SELECT);
            RS=PS.executeQuery();
            Object[] fila= new Object[5];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getString(2);
                fila[2]=RS.getString(3);
                fila[3]=RS.getLong(4);
                fila[4]=RS.getString(5);
                
             DT.addRow(fila);
            }
            
            
        } catch (SQLException e) {
            System.out.println("error  al listar los datos"+e.getMessage());
        }finally{
            PS=null;
            RS=null;
            CN.Desconectar();
        }
        
        return DT; 
    }
    //metodo para hacer una consulta
    public DefaultTableModel getDato(int idCliente){
    String  SQL="SELECT*FROM Clientes where idClientes="+idCliente;
        try {
            setTitulos();
            PS=CN.getConnection().prepareStatement(SQL);
            RS=PS.executeQuery();
            Object[] fila= new Object[5];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getString(2);
                fila[2]=RS.getString(3);
                fila[3]=RS.getLong(4);
                fila[4]=RS.getString(5);
                
             DT.addRow(fila);
            }
            
            
        } catch (SQLException e) {
            System.out.println("error  al listar los datos"+e.getMessage());
        }finally{
            PS=null;
            RS=null;
            CN.Desconectar();
        }
        
        return DT; 
    }
    public int Acceder(int  id){
        int resultado=0;
        try {
            String  sql="select* from Clientes where idClientes="+id;
            Connection cn=CN.getConnection();
            
            Statement st= cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            if(rs.next()){
                resultado=1;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(IngresarClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
   
  
    
}
