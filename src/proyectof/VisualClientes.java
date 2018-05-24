
package proyectof;

import Clases.Conectar;
import Logicas.IngresarClientes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VisualClientes extends javax.swing.JFrame {

   private IngresarClientes IC;
  
    public VisualClientes() {
        initComponents();
        
    IC= new IngresarClientes();
    respuesta=0;

       
    }
    
    private void listar(){
        jTable1.setModel(IC.getDatos());
    }
    private void limpiar(){
        txtApellidosClientes.setText("");
        txtIdClientes.setText("");
        txtNombreClientes.setText("");
        txtTelefono.setText("");
        txtDomicilio.setText("");
        txtConsulta.setText("");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdClientes = new javax.swing.JTextField();
        txtNombreClientes = new javax.swing.JTextField();
        txtApellidosClientes = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btModificar = new javax.swing.JButton();
        btMenu = new javax.swing.JButton();
        btRegistrar = new javax.swing.JButton();
        btConsulta = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btMostrarTodo = new javax.swing.JButton();
        txtConsulta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectof/empleos-online-con-mayor-demanda.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Clientes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 0, 121, 42);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Id del cliente");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 150, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Nombre de cliente");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 110, 160, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Apellidos del cliente");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 140, 160, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Telefono ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 170, 130, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Domicilio");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 200, 100, 22);

        txtIdClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClientesActionPerformed(evt);
            }
        });
        txtIdClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdClientes);
        txtIdClientes.setBounds(160, 80, 210, 17);

        txtNombreClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombreClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClientesKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreClientes);
        txtNombreClientes.setBounds(160, 110, 210, 17);

        txtApellidosClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellidosClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosClientesActionPerformed(evt);
            }
        });
        txtApellidosClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClientesKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidosClientes);
        txtApellidosClientes.setBounds(160, 140, 210, 17);

        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono);
        txtTelefono.setBounds(160, 170, 210, 17);

        txtDomicilio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioActionPerformed(evt);
            }
        });
        jPanel1.add(txtDomicilio);
        txtDomicilio.setBounds(160, 200, 210, 17);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 260, 650, 100);

        btModificar.setText("Modificar");
        btModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153)));
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btModificar);
        btModificar.setBounds(390, 200, 100, 30);

        btMenu.setText("Menú");
        btMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153)));
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btMenu);
        btMenu.setBounds(10, 10, 80, 30);

        btRegistrar.setText("Registrar");
        btRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153)));
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btRegistrar);
        btRegistrar.setBounds(390, 80, 90, 30);

        btConsulta.setText("Consulta");
        btConsulta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153)));
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btConsulta);
        btConsulta.setBounds(510, 80, 100, 30);

        btEliminar.setText("Eliminar");
        btEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153)));
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btEliminar);
        btEliminar.setBounds(390, 160, 100, 30);

        btMostrarTodo.setText("Mostrar Todo");
        btMostrarTodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153)));
        btMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarTodoActionPerformed(evt);
            }
        });
        jPanel1.add(btMostrarTodo);
        btMostrarTodo.setBounds(390, 120, 100, 30);

        txtConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaKeyTyped(evt);
            }
        });
        jPanel1.add(txtConsulta);
        txtConsulta.setBounds(510, 120, 100, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectof/5765321-azul-de-fondo-de-burbujas-vector-de-la-ilustración-.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 720, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidosClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosClientesActionPerformed

    private void txtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioActionPerformed

    private void txtIdClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClientesActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        // TODO add your handling code here:
      int bandera=0;
        int id;
        if(!txtIdClientes.getText().isEmpty() && !txtNombreClientes.getText().isEmpty()  && !txtApellidosClientes.getText().isEmpty() && !txtTelefono.getText().isEmpty() && !txtDomicilio.getText().isEmpty()){
        
           if(txtIdClientes.getText().length()-1<9){
               
           
            id=Integer.parseInt(txtIdClientes.getText());
            bandera=IC.Acceder(id);
            
            if(bandera!=0){
          if(txtTelefono.getText().length()-1<10){
              
          
                
        String Nombres,Apellidos,Dom;
        int idClientes,idParaModificar;
        long Telefono;
        idClientes=Integer.parseInt(txtIdClientes.getText());
        Nombres=txtNombreClientes.getText();
        Apellidos=txtApellidosClientes.getText();
        Telefono=Long.parseLong(txtTelefono.getText());
        Dom=txtDomicilio.getText();
        
        
        respuesta=IC.updateDatos(idClientes,Nombres,Apellidos, Telefono, Dom);
        
          }else{
              JOptionPane.showMessageDialog(null, "se ha pasado de el limite de el numero de telefono");
              
          } 
        }else{
                JOptionPane.showMessageDialog(null,"No se pudo realizar la modificacion ya que ese cliente no existe");
                
            }
            }else{
                   JOptionPane.showMessageDialog(null, "Se ha pasado del limite de digitos en el idClientes");
               }
      }else{
          JOptionPane.showMessageDialog(null,"usted ha dejado un campo o campos  sin registrar");
      }
        limpiar();
    }//GEN-LAST:event_btModificarActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        // TODO add your handling code here:
       
        int bandera=0;
        int id;
        if(!txtIdClientes.getText().isEmpty() && !txtNombreClientes.getText().isEmpty()  && !txtApellidosClientes.getText().isEmpty() && !txtTelefono.getText().isEmpty() && !txtDomicilio.getText().isEmpty()){
         if(txtIdClientes.getText().length()-1<9){  
            id=Integer.parseInt(txtIdClientes.getText());
            bandera=IC.Acceder(id);
           
               
           
            if(bandera==0){
           
              
                  
                
            if(txtTelefono.getText().length()-1<10){
                
            
        
        String Nombre,Apellidos,Dom;
        int idClientes;
        long Telefono;
        idClientes=Integer.parseInt(txtIdClientes.getText());
        Nombre=txtNombreClientes.getText();
        Apellidos=txtApellidosClientes.getText();
        Telefono=Long.parseLong(txtTelefono.getText());
        Dom=txtDomicilio.getText();
        
        respuesta=IC.insertDatos(idClientes, Nombre, Apellidos, Telefono, Dom);
      
           
            }else{
                JOptionPane.showMessageDialog(null, "Se ha pasado de 10 Digitos en el telefono");
                
            }
               
            }else{
                JOptionPane.showMessageDialog(null, "no se pudo realizar el registro ya que hay otro usuario con el mismo id");
                
            }
         
        
           }else{
                   JOptionPane.showMessageDialog(null, "Se ha pasado del limite de digitos en el idClientes");
               }
         }else{
           JOptionPane.showMessageDialog(null,"usted ha dejado un campo o campos  sin registrar");
       }
        limpiar();
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        // TODO add your handling code here:
       int idverificar;
        int bandera=0;
        if(!txtConsulta.getText().isEmpty()){
           if(txtConsulta.getText().length()-1<9){
               
           
            idverificar=Integer.parseInt(txtConsulta.getText());
            bandera=IC.Acceder(idverificar);
       if(bandera!=0){
        int id=Integer.parseInt(txtConsulta.getText());
        jTable1.setModel(IC.getDato(id));
        }else{
                JOptionPane.showMessageDialog(null, "NO se pudo hacer la consulta ya que no existe ese cliente con su id");
                limpiar();
            }
           }else{
               JOptionPane.showMessageDialog(null, "se ha pasado el limite de 9 digitos");
               limpiar();
           }
       }else{
       JOptionPane.showMessageDialog(null,"usted ha dejado el campo de consulta sin contestar no se sabe cual cliente desea ver");
       } 
    }//GEN-LAST:event_btConsultaActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed

        // TODO add your handling code here:
        int id;
        int bandera=0;
        if(!txtIdClientes.getText().isEmpty()){
           if(txtIdClientes.getText().length()-1<9){
               
           
        id=Integer.parseInt(txtIdClientes.getText());
            bandera=IC.Acceder(id);
            
            if(bandera!=0){
        int idClientes=Integer.parseInt(txtIdClientes.getText());
        IC.deleteDatos(idClientes);
        
            }else{
                JOptionPane.showMessageDialog(null, "no se pudo Eliminar ya que no existe ese cliente con id");
                
            }
           }else{
               JOptionPane.showMessageDialog(null, "Se ha pasado del limite de 9 digitos");
               
           }
        }else{
            JOptionPane.showMessageDialog(null,"usted dejo el campo idClientes sin contestar y no se sabe cual cliente va eliminar");
        }
        limpiar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarTodoActionPerformed
        // TODO add your handling code here:
        listar();
       
    }//GEN-LAST:event_btMostrarTodoActionPerformed

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
                MenuPrincipal menu=new MenuPrincipal();
                menu.setLocationRelativeTo(null);
                menu.setSize(708, 402);
                menu.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btMenuActionPerformed

    private void txtConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyTyped
        // TODO add your handling code here:
        
        
         char car= evt.getKeyChar();
        if(car<'0' || car>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtConsultaKeyTyped

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNombreClientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClientesKeyTyped
       char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();
          }
    }//GEN-LAST:event_txtNombreClientesKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btMenu;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btMostrarTodo;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellidosClientes;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtIdClientes;
    private javax.swing.JTextField txtNombreClientes;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
int respuesta;
public Conectar cc= new Conectar();
public Connection cn= cc.getConnection();

}
