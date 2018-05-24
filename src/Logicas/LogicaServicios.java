
package Logicas;

import Clases.Conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;


public class LogicaServicios {

private final String SQL_INSERT="INSERT INTO Servicios(idServicios,NumeroPrendas,PrecioTotal,FechaIngreso,idClientes,idEmpleados) values(?,?,?,?,?,?)"; 
    private final String SQL_SELECT="Select idServicios,PrecioToTal,NumeroPrendas,FechaIngreso,Servicios.idClientes ,Clientes.Nombres,Clientes.Apellidos,Servicios.idEmpleados,Empleados.Nombres,Empleados.Apellidos,Empleados.Horario from Servicios inner join Clientes on Servicios.idClientes=Clientes.idClientes  inner join Empleados on Servicios.idEmpleados=Empleados.idEmpleados;";
    private PreparedStatement PS;
    private DefaultTableModel DT;
    private ResultSet RS; 
    private Conectar CN;

    public LogicaServicios() {
    PS=null;
    CN= new Conectar();
    }
        
    private DefaultTableModel setTitulos(){
        DT= new DefaultTableModel();
    DT.addColumn("IdServicios");
    DT.addColumn("PrecioTotal");
    DT.addColumn("NumeroPrendas");
    DT.addColumn("fechaIngreso");
    DT.addColumn("idClientes");
    DT.addColumn("Nombres Cliente");
    DT.addColumn("Apellidos Cliente");
    DT.addColumn("id Empleados");
    DT.addColumn("Nombres Empleado");
    DT.addColumn("Apellidos Empleado");
    DT.addColumn("Horario");
    return DT;
    }
    //metodo para listar todo lo de la tabla
    public DefaultTableModel getDatos(){
        try {
            setTitulos();
            PS=CN.getConnection().prepareStatement(SQL_SELECT);
            RS=PS.executeQuery();
            Object[] fila= new Object[11];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getFloat(2);
                fila[2]=RS.getInt(3);
                fila[3]=RS.getString(4);
                fila[4]=RS.getInt(5);
                fila[5]=RS.getString(6);
                fila[6]=RS.getString(7);
                fila[7]=RS.getInt(8);
                fila[8]=RS.getString(9);
                fila[9]=RS.getString(10);
                fila[10]=RS.getString(11);
                
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
    public DefaultTableModel getDato(int idServicios){
    String  SQL="Select idServicios,PrecioToTal,NumeroPrendas,FechaIngreso,Servicios.idClientes ,Clientes.Nombres,Clientes.Apellidos,Servicios.idEmpleados,Empleados.Nombres,Empleados.Apellidos,Empleados.Horario from Servicios inner join Clientes on Servicios.idClientes=Clientes.idClientes  inner join Empleados on Servicios.idEmpleados=Empleados.idEmpleados where idServicios="+idServicios;
        try {
            setTitulos();
            PS=CN.getConnection().prepareStatement(SQL);
            RS=PS.executeQuery();
            Object[] fila= new Object[11];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getFloat(2);
                fila[2]=RS.getInt(3);
                fila[3]=RS.getString(4);
                fila[4]=RS.getInt(5);
                fila[5]=RS.getString(6);
                fila[6]=RS.getString(7);
                fila[7]=RS.getInt(8);
                fila[8]=RS.getString(9);
                fila[9]=RS.getString(10);
                fila[10]=RS.getString(11);
                
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
    
    public int  insertDatos(int idServicio,int NumeroPrendas,float PrecioToTal,String Fecha,int idCliente,int idEmpleado){
              int res=0;       
        try {
            
            PS=CN.getConnection().prepareStatement(SQL_INSERT);
            PS.setInt(1, idServicio);
            PS.setInt(2,NumeroPrendas);
            PS.setFloat(3,PrecioToTal);
            PS.setString(4, Fecha);
            PS.setInt(5,idCliente);
            PS.setInt(6,idEmpleado);
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
    public int  updateDatos(int idServicios,int NumeroPrendas,float precio,String fecha,int idCliente,int idEmpleado){
         String SQL="UPDATE Servicios  SET idServicios="+idCliente+",NumeroPrendas="+NumeroPrendas+",PrecioTotal="+precio+",FechaIngreso='"+fecha+"',idClientes="+idCliente+",idEmpleados="+idEmpleado+" WHERE idServicios="+idServicios;     
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
         String SQL="DELETE from Servicios WHERE idServicios="+id;     
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
            String  sql="select* from Servicios where idServicios="+id;
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
    
     public DefaultTableModel getFecha(String FechaInicial ,String FechaFinal){
    String  SQL="Select idServicios,PrecioToTal,NumeroPrendas,FechaIngreso,Servicios.idClientes ,Clientes.Nombres,Clientes.Apellidos,Servicios.idEmpleados,Empleados.Nombres,Empleados.Apellidos,Empleados.Horario from Servicios inner join Clientes on Servicios.idClientes=Clientes.idClientes  inner join Empleados on Servicios.idEmpleados=Empleados.idEmpleados where FechaIngreso between '"+FechaInicial+"' and '"+FechaFinal+"'";
        try {
            setTitulos();
            PS=CN.getConnection().prepareStatement(SQL);
            RS=PS.executeQuery();
            Object[] fila= new Object[11];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getFloat(2);
                fila[2]=RS.getInt(3);
                fila[3]=RS.getString(4);
                fila[4]=RS.getInt(5);
                fila[5]=RS.getString(6);
                fila[6]=RS.getString(7);
                fila[7]=RS.getInt(8);
                fila[8]=RS.getString(9);
                fila[9]=RS.getString(10);
                fila[10]=RS.getString(11);
                
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
}
