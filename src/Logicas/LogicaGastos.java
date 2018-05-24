
package Logicas;

import Clases.Conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;


public class LogicaGastos {
    
    private final String SQL_INSERT="INSERT INTO Gastos(idGastos,Luz,Agua,Renta,fechaPagos,idEmpleados) values(?,?,?,?,?,?)"; 
    private final String SQL_SELECT="select idGastos,Luz,Agua,Renta,fechaPagos,Gastos.idEmpleados ,Nombres,Apellidos,Horario from Gastos inner join Empleados on Gastos.idEmpleados=Empleados.idEmpleados;";
    private PreparedStatement PS;
    private DefaultTableModel DT;
    private ResultSet RS; 
    private Conectar CN;

    public LogicaGastos() {
    PS=null;
    CN= new Conectar();
    }
    private DefaultTableModel setTitulos(){
        DT= new DefaultTableModel();
    DT.addColumn("Id");
    DT.addColumn("Luz");
    DT.addColumn("Agua");
    DT.addColumn("Renta");
    DT.addColumn("fecha ");
    DT.addColumn("id EMpleado");
    DT.addColumn("Nombres");
    DT.addColumn("Apellidos");
    DT.addColumn("Horario");
    
    return DT;
    }
    //metodo para listar todo lo de la tabla
    public DefaultTableModel getDatos(){
        try {
            setTitulos();
            PS=CN.getConnection().prepareStatement(SQL_SELECT);
            RS=PS.executeQuery();
            Object[] fila= new Object[9];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getFloat(2);
                fila[2]=RS.getFloat(3);
                fila[3]=RS.getFloat(4);
                fila[4]=RS.getDate(5);
                fila[5]=RS.getInt(6);
                fila[6]=RS.getString(7);
                fila[7]=RS.getString(8);
                fila[8]=RS.getString(9);
                
                
                
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
    public int  insertDatos(int idGastos,float luz ,float agua,float renta ,String fecha,int idEmpleados){
              int res=0;       
        try {
            
            PS=CN.getConnection().prepareStatement(SQL_INSERT);
            PS.setInt(1, idGastos);
            PS.setFloat(2, luz);
            PS.setFloat(3, agua);
            PS.setFloat(4, renta);
            PS.setString(5, fecha);
            PS.setInt(6, idEmpleados);
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
    //metodo para hacer una consulta
    public DefaultTableModel getDato(int idGastos){
    String  SQL="select idGastos,Luz,Agua,Renta,fechaPagos,Gastos.idEmpleados ,Nombres,Apellidos,Horario from Gastos inner join Empleados on Gastos.idEmpleados=Empleados.idEmpleados where idGastos="+idGastos;
        try {
            setTitulos();
            PS=CN.getConnection().prepareStatement(SQL);
            RS=PS.executeQuery();
            Object[] fila= new Object[9];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getFloat(2);
                fila[2]=RS.getFloat(3);
                fila[3]=RS.getFloat(4);
                fila[4]=RS.getDate(5);
                fila[5]=RS.getInt(6);
                fila[6]=RS.getString(7);
                fila[7]=RS.getString(8);
                fila[8]=RS.getString(9);
                
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
    public int  updateDatos(int idGastos,float Luz,float Agua,float Renta,String Fecha,int idEmpleado){
         String SQL="UPDATE Gastos  SET idGastos="+idGastos+",Luz="+Luz+",Agua="+Agua+",Renta="+Renta+",fechaPagos='"+Fecha+"',idEmpleados="+idEmpleado+" WHERE idGastos="+idGastos;     
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
         String SQL="DELETE from Gastos WHERE idGastos="+id;     
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
    public int Acceder(int  id){
        int resultado=0;
        try {
            String  sql="select* from Gastos where idGastos="+id;
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
