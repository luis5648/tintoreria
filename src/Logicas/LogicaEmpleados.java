
package Logicas;

import Clases.Conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectof.InicioDeSesion;
import proyectof.MenuPrincipal;

public class LogicaEmpleados {
    
    private final String SQL_INSERT="INSERT INTO Empleados(idEmpleados, Nombres,Apellidos,Domicilio,Telefono,Salario,Horario,Contrasenia) values(?,?,?,?,?,?,?,?)"; 
    private final String SQL_SELECT="SELECT * FROM Empleados";
    private PreparedStatement PS;
    private DefaultTableModel DT;
    private ResultSet RS; 
    private Conectar CN;

    public LogicaEmpleados() {
   PS= null;
   CN= new Conectar();
    }
    private DefaultTableModel setTitulos(){
        DT= new DefaultTableModel();
    DT.addColumn("Id ");
    DT.addColumn("Nombres");
    DT.addColumn("Apellidos");
    DT.addColumn("Domicilio");
    DT.addColumn("Telefono");
    DT.addColumn("Salario");
    DT.addColumn("Horario");
    DT.addColumn("Contraseña");
    return DT;
    }
    //metodo para listar todo lo de la tabla
    public DefaultTableModel getDatos(){
        try {
            setTitulos();
            PS=CN.getConnection().prepareStatement(SQL_SELECT);
            RS=PS.executeQuery();
            Object[] fila= new Object[8];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getString(2);
                fila[2]=RS.getString(3);
                fila[3]=RS.getString(4);
                fila[4]=RS.getLong(5);
                fila[5]=RS.getFloat(6);
                fila[6]=RS.getString(7);
                fila[7]=RS.getInt(8);
                
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
    public DefaultTableModel getDato(int idCliente){
    String  SQL="SELECT*FROM Empleados where idEmpleados="+idCliente;
        try {
            setTitulos();
            PS=CN.getConnection().prepareStatement(SQL);
            RS=PS.executeQuery();
            Object[] fila= new Object[8];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getString(2);
                fila[2]=RS.getString(3);
                fila[3]=RS.getString(4);
                fila[4]=RS.getLong(5);
                fila[5]=RS.getFloat(6);
                fila[6]=RS.getString(7);
                fila[7]=RS.getInt(8);
                
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
    public int  updateDatos(int idEmpleado,String Nom,String Ape ,String Dom,long Tel,float sal,String horario,int contra){
        String SQL="UPDATE Empleados  SET idEmpleados="+idEmpleado+",Nombres='"+Nom+"',Apellidos='"+Ape+"',Domicilio='"+Dom+"', Telefono="+Tel+", Salario="+sal+",Horario='"+horario+"',Contrasenia="+contra+" WHERE idEmpleados="+idEmpleado;     
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
         String SQL="DELETE from Empleados WHERE idEmpleados="+id;     
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
    
    public int  insertDatos(int idEmpleado,String Nom,String Ape,String Dom,long Tel,float Sal,String horario,int Con){
              int res=0;       
        try {
            
            PS=CN.getConnection().prepareStatement(SQL_INSERT);
            PS.setInt(1,idEmpleado);
            PS.setString(2, Nom);
            PS.setString(3, Ape);
            PS.setString(4, Dom);
            PS.setLong(5, Tel);
            PS.setFloat(6, Sal);
            PS.setString(7, horario);
            PS.setInt(8,Con);
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
    public int Acceder(int  id){
        int resultado=0;
        try {
            String  sql="select* from Empleados where idEmpleados="+id;
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
    public int  login(String usuario ,String pass){
       int resultado=0;
       
       String  sql="select* from empleados where idEmpleados= "+usuario+" and Contrasenia="+pass+"";
        try {
            Connection cn=CN.getConnection();
            Statement st= cn.createStatement();
            ResultSet rs= st.executeQuery(sql);
            if(rs.next()){
                resultado=1;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(InicioDeSesion.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
          
        }
        return resultado;
    }
    
}
