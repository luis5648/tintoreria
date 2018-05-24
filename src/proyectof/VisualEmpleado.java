
package proyectof;

import Clases.Conectar;
import Logicas.LogicaEmpleados;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class VisualEmpleado extends javax.swing.JFrame {
private LogicaEmpleados LE;
   
    public VisualEmpleado() {
        initComponents();
        LE= new LogicaEmpleados();
        respuesta=0;
        
    }
    private void listar(){
        jTable1.setModel(LE.getDatos());
    }
    private void limpiar(){
        txtIdEmpleados.setText("");
        txtNombreEmpleados.setText("");
        txtApellidosEmpleado.setText("");
        txtDomicilio.setText("");
        txtTelefono.setText("");
        txtSalario.setText("");
        txtContrasenia.setText("");
        txtConsulta.setText("");
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdEmpleados = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreEmpleados = new javax.swing.JTextField();
        txtApellidosEmpleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        btModificar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btMostrarTodo = new javax.swing.JButton();
        btRegistrar = new javax.swing.JButton();
        btConsulta = new javax.swing.JButton();
        btMenu = new javax.swing.JButton();
        txtConsulta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbHorario = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectof/empleos-online-con-mayor-demanda.jpg"))); // NOI18N
        jLabel3.setText("Telefono");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Id Empleado");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 150, 20);

        txtIdEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEmpleadosActionPerformed(evt);
            }
        });
        txtIdEmpleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseniaKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdEmpleados);
        txtIdEmpleados.setBounds(160, 80, 210, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Apellidos Empleado");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 140, 160, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Nombre Empleado");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 110, 160, 22);

        txtNombreEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombreEmpleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDomicilioKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreEmpleados);
        txtNombreEmpleados.setBounds(160, 110, 210, 17);

        txtApellidosEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellidosEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosEmpleadoActionPerformed(evt);
            }
        });
        txtApellidosEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDomicilioKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidosEmpleado);
        txtApellidosEmpleado.setBounds(160, 140, 210, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Domicilio");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 170, 100, 22);

        txtDomicilio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioActionPerformed(evt);
            }
        });
        txtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDomicilioKeyTyped(evt);
            }
        });
        jPanel1.add(txtDomicilio);
        txtDomicilio.setBounds(160, 170, 210, 17);

        btModificar.setText("Modificar");
        btModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153)));
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btModificar);
        btModificar.setBounds(390, 200, 100, 30);

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

        btMenu.setText("Menú");
        btMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 153, 153)));
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btMenu);
        btMenu.setBounds(10, 10, 80, 30);

        txtConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaKeyTyped(evt);
            }
        });
        jPanel1.add(txtConsulta);
        txtConsulta.setBounds(510, 120, 100, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Empleados");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 0, 190, 42);

        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 270, 620, 90);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Telefono (casa)");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 200, 120, 30);

        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefono.setMaximumSize(new java.awt.Dimension(10, 10));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseniaKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono);
        txtTelefono.setBounds(160, 210, 210, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Salario");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 240, 50, 22);

        txtSalario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseniaKeyTyped(evt);
            }
        });
        jPanel1.add(txtSalario);
        txtSalario.setBounds(80, 240, 120, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Horario");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(210, 240, 60, 15);

        cbHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino" }));
        jPanel1.add(cbHorario);
        cbHorario.setBounds(280, 240, 100, 24);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Contraseña");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(390, 240, 90, 22);

        txtContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseniaKeyTyped(evt);
            }
        });
        jPanel1.add(txtContrasenia);
        txtContrasenia.setBounds(480, 240, 110, 17);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectof/5765321-azul-de-fondo-de-burbujas-vector-de-la-ilustración-.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, -10, 660, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEmpleadosActionPerformed

    private void txtApellidosEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosEmpleadoActionPerformed

    private void txtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed

        int idEmpleado,Contrasenia;
        long Telefono;
        String Nombres,Apellidos,Domicilio,Horario;
        float salariio;
        
        int bandera=0;
        int id;
        if(!txtIdEmpleados.getText().isEmpty() && !txtNombreEmpleados.getText().isEmpty() && !txtApellidosEmpleado.getText().isEmpty() && !txtDomicilio.getText().isEmpty() && !txtTelefono.getText().isEmpty() && ! txtSalario.getText().isEmpty() && !txtContrasenia.getText().isEmpty()){
        if(txtIdEmpleados.getText().length()-1<9){
            
        
        id=Integer.parseInt(txtIdEmpleados.getText());
            bandera=LE.Acceder(id);
            
            if(bandera!=0){
                if(txtTelefono.getText().length()-1<10){
                    if(txtSalario.getText().length()-1<10){
                        if(txtContrasenia.getText().length()-1<9){
                            
                        
                    
                
                
            
        idEmpleado=Integer.parseInt(txtIdEmpleados.getText());
        Nombres= txtNombreEmpleados.getText();
        Apellidos=txtApellidosEmpleado.getText();
        Domicilio=txtDomicilio.getText();
        Telefono=Long.parseLong(txtTelefono.getText());
        salariio=Float.parseFloat(txtSalario.getText());
        Horario=cbHorario.getSelectedItem().toString();
        Contrasenia=Integer.parseInt(txtContrasenia.getText());
        
        respuesta=LE.updateDatos(idEmpleado, Nombres, Apellidos,Domicilio,Telefono,salariio,Horario,Contrasenia);
            
                        }else{
                            JOptionPane.showMessageDialog(null, "Se ha pasado de limite de digitos en la contraseña");
                        }
                        }else{
                        JOptionPane.showMessageDialog(null, "Se ha pasado del limite de digitos en el salario");
                    }
                    }else{
                    JOptionPane.showMessageDialog(null, "Se ha pasado del limite de digitos en el telefono");
                }
                }else{
       JOptionPane.showMessageDialog(null,"No se pudo realizar la modificacion ya que ese Empleado no existe");
       
            }
        }else{
           JOptionPane.showMessageDialog(null, "Se ha pasado de digitos en el id Empleadoa");
        }
        }else{
        JOptionPane.showMessageDialog(null, "usted no lleno todos los campos ");
    }
        
        limpiar();
        
    }//GEN-LAST:event_btModificarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
       int id;
        int bandera=0;
        
        if(!txtIdEmpleados.getText().isEmpty()){
           if(txtIdEmpleados.getText().length()-1<9){
           
           
            id=Integer.parseInt(txtIdEmpleados.getText());
            bandera=LE.Acceder(id);
            
            if(bandera!=0){
        
        int idClientes=Integer.parseInt(txtIdEmpleados.getText());
        LE.deleteDatos(idClientes);
        
            }else{
                JOptionPane.showMessageDialog(null, "no se pudo Eliminar ya que no existe ese Empleado con id");
                }
           }else{
               JOptionPane.showMessageDialog(null, "Se paso del limite digitos ");
           }
            }else{
        JOptionPane.showMessageDialog(null, "usted no lleno el campo id EMpleados y no se sabe que empleado se eliminara ");
        }
        limpiar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarTodoActionPerformed
   
        
       listar();
    
        
    }//GEN-LAST:event_btMostrarTodoActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        // TODO add your handling code here:
        int idEmpleado,Contrasenia;
        long Telefono;
        String Nombres,Apellidos,Domicilio,Horario;
        float salariio;
        
         int bandera=0;
        int id;
        if(!txtIdEmpleados.getText().isEmpty() && !txtNombreEmpleados.getText().isEmpty() && !txtApellidosEmpleado.getText().isEmpty() && !txtDomicilio.getText().isEmpty() && !txtTelefono.getText().isEmpty() && ! txtSalario.getText().isEmpty() && !txtContrasenia.getText().isEmpty()){
        if(txtIdEmpleados.getText().length()-1<10){
        
        
            id=Integer.parseInt(txtIdEmpleados.getText());
            bandera =LE.Acceder(id);
            if(bandera==0){
                if(txtTelefono.getText().length()-1<10){
                    if(txtSalario.getText().length()-1<10){
                        if(txtContrasenia.getText().length()-1<9){
                            
                        
                        
                    

                    
            
            
        idEmpleado=Integer.parseInt(txtIdEmpleados.getText());
        Nombres= txtNombreEmpleados.getText();
        Apellidos=txtApellidosEmpleado.getText();
        Domicilio=txtDomicilio.getText();
        Telefono=Long.parseLong(txtTelefono.getText());
        salariio=Float.parseFloat(txtSalario.getText());
        Horario=cbHorario.getSelectedItem().toString();
        Contrasenia=Integer.parseInt(txtContrasenia.getText());
        respuesta=LE.insertDatos(idEmpleado, Nombres, Apellidos,Domicilio,Telefono,salariio,Horario,Contrasenia);
                  
                        }else{
                            JOptionPane.showMessageDialog(null, "Se ha pasado del limite de digitos en la contraseña");
                        }
                        }else{
                        JOptionPane.showMessageDialog(null, "Se ha pasado del limite de numeros en el salario");
                        
                    }
                    }else{
                    JOptionPane.showMessageDialog(null, "Se ha pasado del limite de 10 digitos");
                    
                }
                }else{
                JOptionPane.showMessageDialog(null, "no se pudo realizar el registro ya que hay otro empleado con el mismo id");
            
            
            }
        }else{
            JOptionPane.showMessageDialog(null, "Se ha pasado de 9 digitos del id");
            
        }
            
            }else{
        JOptionPane.showMessageDialog(null, "usted no lleno todos los campos ");
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
        bandera=LE.Acceder(idverificar);
        if(bandera!=0){
            
        
         int id=Integer.parseInt(txtConsulta.getText());
        jTable1.setModel(LE.getDato(id));
        }else{
            JOptionPane.showMessageDialog(null, "NO se pudo hacer la consulta ya que no existe ese Empleado con su id");
        }
       }else{
           JOptionPane.showMessageDialog(null, "Se ha pasado del limite del digitos en la consulta");
       } 
       }else{
            JOptionPane.showMessageDialog(null, "usted no lleno el campo consulta no sabemos que empleado quiere ver");
        }
        limpiar();
    }//GEN-LAST:event_btConsultaActionPerformed

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        MenuPrincipal menu=new MenuPrincipal();
        menu.setLocationRelativeTo(null);
        menu.setSize(708, 402);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btMenuActionPerformed

    private void txtContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseniaKeyTyped
        // TODO add your handling code here:
        char car= evt.getKeyChar();
        if(car<'0' || car>'9'){
            evt.consume();
        }
        
        
        
    }//GEN-LAST:event_txtContraseniaKeyTyped

    private void txtConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyTyped
        // TODO add your handling code here:
        char car= evt.getKeyChar();
        if(car<'0' || car>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtConsultaKeyTyped

    private void txtDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDomicilioKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar(); 
        if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();
          }
    }//GEN-LAST:event_txtDomicilioKeyTyped

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsulta;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btMenu;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btMostrarTodo;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JComboBox<String> cbHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellidosEmpleado;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtIdEmpleados;
    private javax.swing.JTextField txtNombreEmpleados;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
int respuesta;
public Conectar cc= new Conectar();
public Connection cn= cc.getConnection();
}
