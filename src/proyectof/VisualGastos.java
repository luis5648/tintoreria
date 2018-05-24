
package proyectof;

import Clases.Conectar;
import Logicas.LogicaEmpleados;
import Logicas.LogicaGastos;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class VisualGastos extends javax.swing.JFrame {

    private  LogicaGastos LG;
    private LogicaEmpleados LE;
    
    
    public VisualGastos() {
        initComponents();
        LG= new LogicaGastos();
        LE= new LogicaEmpleados();
        respuesta=0;
    }
    private void Listar(){
        jTable1.setModel(LG.getDatos());
    }
   private void limpiar(){
       txtidGastos.setText("");
       txtluz.setText("");
       txtagua.setText("");
       txtrenta.setText("");
       txtidEmpleados.setText("");
       txtDiaPago.setText("");
       txtMesPago.setText("");
       txtAnioPago.setText("");
       txtConsulta.setText("");
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtidEmpleados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidGastos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtluz = new javax.swing.JTextField();
        txtagua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtrenta = new javax.swing.JTextField();
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDiaPago = new javax.swing.JTextField();
        txtMesPago = new javax.swing.JTextField();
        txtAnioPago = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectof/empleos-online-con-mayor-demanda.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Id Empleado");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 200, 130, 22);

        txtidEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidEmpleadosActionPerformed(evt);
            }
        });
        txtidEmpleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtluzKeyTyped(evt);
            }
        });
        jPanel1.add(txtidEmpleados);
        txtidEmpleados.setBounds(160, 200, 210, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Id Gastos");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 80, 150, 20);

        txtidGastos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidGastosActionPerformed(evt);
            }
        });
        txtidGastos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtluzKeyTyped(evt);
            }
        });
        jPanel1.add(txtidGastos);
        txtidGastos.setBounds(160, 76, 210, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Gastos Agua");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 140, 160, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Gastos Luz");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 110, 160, 22);

        txtluz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtluz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtluzKeyTyped(evt);
            }
        });
        jPanel1.add(txtluz);
        txtluz.setBounds(160, 106, 210, 20);

        txtagua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtagua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaguaActionPerformed(evt);
            }
        });
        txtagua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtluzKeyTyped(evt);
            }
        });
        jPanel1.add(txtagua);
        txtagua.setBounds(160, 136, 210, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Gastos renta");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 170, 130, 22);

        txtrenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtrenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrentaActionPerformed(evt);
            }
        });
        txtrenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtluzKeyTyped(evt);
            }
        });
        jPanel1.add(txtrenta);
        txtrenta.setBounds(160, 166, 210, 20);

        btModificar.setText("Modificar");
        btModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 204), new java.awt.Color(0, 204, 204)));
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btModificar);
        btModificar.setBounds(390, 200, 100, 30);

        btEliminar.setText("Eliminar");
        btEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 204), new java.awt.Color(0, 204, 204)));
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btEliminar);
        btEliminar.setBounds(390, 160, 100, 30);

        btMostrarTodo.setText("Mostrar Todo");
        btMostrarTodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 204), new java.awt.Color(0, 204, 204)));
        btMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarTodoActionPerformed(evt);
            }
        });
        jPanel1.add(btMostrarTodo);
        btMostrarTodo.setBounds(390, 120, 100, 30);

        btRegistrar.setText("Registrar");
        btRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 204), new java.awt.Color(0, 204, 204)));
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btRegistrar);
        btRegistrar.setBounds(390, 80, 90, 30);

        btConsulta.setText("Consulta");
        btConsulta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 204), new java.awt.Color(0, 204, 204)));
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(btConsulta);
        btConsulta.setBounds(510, 80, 100, 30);

        btMenu.setText("Menú");
        btMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 255, 204), new java.awt.Color(0, 204, 204)));
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
                txtluzKeyTyped(evt);
            }
        });
        jPanel1.add(txtConsulta);
        txtConsulta.setBounds(510, 120, 100, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Gastos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(240, 0, 190, 42);

        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 270, 620, 90);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Fecha Pagos ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 240, 140, 20);

        jLabel9.setText("    /");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(230, 240, 16, 14);

        jLabel10.setText("   /");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 240, 40, 20);

        txtDiaPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDiaPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtluzKeyTyped(evt);
            }
        });
        jPanel1.add(txtDiaPago);
        txtDiaPago.setBounds(160, 240, 70, 16);

        txtMesPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMesPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtluzKeyTyped(evt);
            }
        });
        jPanel1.add(txtMesPago);
        txtMesPago.setBounds(250, 240, 60, 16);

        txtAnioPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAnioPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioPagoActionPerformed(evt);
            }
        });
        txtAnioPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtluzKeyTyped(evt);
            }
        });
        jPanel1.add(txtAnioPago);
        txtAnioPago.setBounds(350, 240, 55, 16);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectof/5765321-azul-de-fondo-de-burbujas-vector-de-la-ilustración-.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, -50, 700, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidEmpleadosActionPerformed

    private void txtidGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidGastosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidGastosActionPerformed

    private void txtaguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaguaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaguaActionPerformed

    private void txtrentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrentaActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        // TODO add your handling code here:
       int idGastos, idEmpleados;
        float luz,agua,renta;
        String fecha;
        int idGAsto,banderagasto;
       int idempleado, banderaempleado;
        if(!txtidGastos.getText().isEmpty() && !txtluz.getText().isEmpty() && !txtagua.getText().isEmpty() && !txtrenta.getText().isEmpty() && !txtDiaPago.getText().isEmpty() && !txtMesPago.getText().isEmpty() && !txtAnioPago.getText().isEmpty() && !txtidEmpleados.getText().isEmpty())
        {
         if(txtidGastos.getText().length()-1<9){
             if(txtidEmpleados.getText().length()-1<9){
             if(txtluz.getText().length()-1<9){
                 if(txtagua.getText().length()-1<9){
                 if(txtrenta.getText().length()-1<9){
                  if(txtDiaPago.getText().length()-1<9 && txtMesPago.getText().length()-1<9 && txtAnioPago.getText().length()-1<9){
                      
                  
                  
                 
              
             
         
            idGAsto=Integer.parseInt(txtidGastos.getText());
            banderagasto=LG.Acceder(idGAsto);
            idempleado=Integer.parseInt(txtidEmpleados.getText());
            banderaempleado=LE.Acceder(idempleado);
            if(banderagasto!=0){
                
            if(banderaempleado!=0){
                
            
            int dia=Integer.parseInt(txtDiaPago.getText());
        int mes=Integer.parseInt(txtMesPago.getText());
        int anio=Integer.parseInt(txtAnioPago.getText());
        if(dia>=1 && dia<=31 && mes>=1 && mes<=12 ){
            
        idGastos=Integer.parseInt(txtidGastos.getText());
        luz=Float.parseFloat(txtluz.getText());
        agua=Float.parseFloat(txtagua.getText());
        renta=Float.parseFloat(txtrenta.getText());
        fecha= txtAnioPago.getText()+"/"+txtMesPago.getText()+"/"+txtDiaPago.getText();
        
        idEmpleados=Integer.parseInt(txtidEmpleados.getText());
        respuesta=LG.updateDatos(idGastos, luz, agua, renta, fecha, idEmpleados);
           
        
        }else{
           JOptionPane.showMessageDialog(null ,"NO digito correctamente la fecha");
        }
            } else{
                JOptionPane.showMessageDialog(null,"NO se puede realizar la modificacion ya que en el campo de id empleado no existe un empleado con ese id");
           
            }
            }else{
                JOptionPane.showMessageDialog(null, "no se puede hacer la modificacion ya que  no existe el id del gasto");
            
            }
                  }else{
                      JOptionPane.showMessageDialog(null, "Se ha pasado en el limite de digitos en la fecha");
                  }
                  }else{
                     JOptionPane.showMessageDialog(null,"Se ha pasado en el limite de digitos en la renta");
                 }
                 }else{
                     JOptionPane.showMessageDialog(null, "Se ha pasado en el limite de digitos en el agua");
                 }
                 }else{
                 JOptionPane.showMessageDialog(null, "SE ha pasado del limite de digitos en la luz");
             }
             }else{
                 JOptionPane.showMessageDialog(null, "Se ha pasado del limite de digitos en el idEMpleados");
             }
             }else{
             JOptionPane.showMessageDialog(null, "se ha pasado del limite de digitos en el idgastos");
         }
            }else{
        JOptionPane.showMessageDialog(null, "usted ha dejado un campo o varios campos sin llenar");
        }
        limpiar();
        
    }//GEN-LAST:event_btModificarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
        int id,bandera;
        
        if(!txtidGastos.getText().isEmpty()){
           if(txtidGastos.getText().length()-1<9){
               
           
            id=Integer.parseInt(txtidGastos.getText());
            bandera=LG.Acceder(id);
           
            if(bandera!=0){
                
        
                
            
        
        int idGastos=Integer.parseInt(txtidGastos.getText());
        LG.deleteDatos(idGastos);
        limpiar();
            
                
            }else{
                JOptionPane.showMessageDialog(null, "EL registro no se pudo borrar ya que no no hay un gasto con ese id");
               limpiar();
            }
           }else{
               JOptionPane.showMessageDialog(null, "Se ha pasado en el limite de digitos en el idGastos");
           } 
           }else{
            JOptionPane.showMessageDialog(null, "Usted ha dejado sin contestar el campo de idGastos y no se sabe cual registro vamos a eliminar");
        }
        limpiar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarTodoActionPerformed
        Listar();
    
    }//GEN-LAST:event_btMostrarTodoActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        // TODO add your handling code here:
        int banderaGastos,idgasto;
        int banderaEmpleado ,idempleado;
        
        if(!txtidGastos.getText().isEmpty() && !txtluz.getText().isEmpty() && !txtagua.getText().isEmpty() && !txtrenta.getText().isEmpty() && !txtDiaPago.getText().isEmpty() && !txtMesPago.getText().isEmpty() && !txtAnioPago.getText().isEmpty() && !txtidEmpleados.getText().isEmpty()){
           if(txtidGastos.getText().length()-1<9){
               if(txtidEmpleados.getText().length()-1<9){
                   if(txtluz.getText().length()-1<10){
                       if(txtrenta.getText().length()-1<10){
                   if(txtagua.getText().length()-1<10){
                 
                       if(txtDiaPago.getText().length()-1<9 && txtMesPago.getText().length()-1<9 && txtAnioPago.getText().length()-1<9){
                           
                                        
               
           
           
                
            
            idgasto=Integer.parseInt(txtidGastos.getText());
            banderaGastos=LG.Acceder(idgasto);
            idempleado=Integer.parseInt(txtidEmpleados.getText());
            
            banderaEmpleado=LE.Acceder(idempleado);
            
            if(banderaGastos==0){
                if(banderaEmpleado!=0){
                    
                
            
        int dia=Integer.parseInt(txtDiaPago.getText());
        int mes=Integer.parseInt(txtMesPago.getText());
        int anio=Integer.parseInt(txtAnioPago.getText());
        if(dia>=1 && dia<=31 && mes>=1 && mes<=12 ){
            
        
        
         int idGastos, idEmpleados;
        float luz,agua,renta;
        String fecha;
        idGastos=Integer.parseInt(txtidGastos.getText());
        luz=Float.parseFloat(txtluz.getText());
        agua=Float.parseFloat(txtagua.getText());
        renta=Float.parseFloat(txtrenta.getText());
        fecha= txtAnioPago.getText()+"/"+txtMesPago.getText()+"/"+txtDiaPago.getText();
        
        idEmpleados=Integer.parseInt(txtidEmpleados.getText());
        respuesta=LG.insertDatos(idGastos, luz, agua, renta, fecha, idEmpleados);
            
        }else{
            JOptionPane.showMessageDialog(null, "no digito bien la fecha");
        
        }        
        }else{
                    JOptionPane.showMessageDialog(null, "no se puede hacer el registro ya que en el campo idEmleado no existe ese empleado");
                
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "no se puede hacer el registro ya que hay otro gasto con el mismo id ");
            
            }
                       }else{
                           JOptionPane.showMessageDialog(null, "Se ha pasado en el limite de digitos en la fecha");
                       }
                       }else{
                       JOptionPane.showMessageDialog(null, "Se ha pasado en el limite de digitos en el agua");
                   }    
                   }else{
                           JOptionPane.showMessageDialog(null, "Se ha pasado en el limite de Digitos en el campo Renta");
                       }
                   }else{
                       JOptionPane.showMessageDialog(null, "Se ha pasado del limite de digitos en el campo luz");
                   }
               }else{
                   JOptionPane.showMessageDialog(null, "Se ha pasado del limite de digitos en idEmpleados");
               }
               }else{
               JOptionPane.showMessageDialog(null, "se ha pasado del limite de digitos en idGastos");
           }
            }else{
            JOptionPane.showMessageDialog(null, "ha dejado un campo o varios campos sin contestar");
        }
        limpiar();
        
        
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed

        // TODO add your handling code here:
          int idCon,bandera;
        if(!txtConsulta.getText().isEmpty()){
           if(txtConsulta.getText().length()-1<9){
               
           
            idCon=Integer.parseInt(txtConsulta.getText());
            bandera=LG.Acceder(idCon);
            if(bandera!=0){
                
            
        
        int id=Integer.parseInt(txtConsulta.getText());
        
        jTable1.setModel(LG.getDato(id));
            
            }else{
                JOptionPane.showMessageDialog(null, "No se realizo la consulta ya que no existe algun gasto con ese id");
           
            }
           }else{
               JOptionPane.showMessageDialog(null, "Se ha pasado en el limite de digitos en la consulta");
           } 
           }else{
            JOptionPane.showMessageDialog(null, "usted ha dejado sin contestar el campo consulta y no sabemos que registro desea ver");
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

    private void txtAnioPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioPagoActionPerformed

    private void txtluzKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtluzKeyTyped
        // TODO add your handling code here:
        
        
         char car= evt.getKeyChar();
        if(car<'0' || car>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtluzKeyTyped

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField txtAnioPago;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextField txtDiaPago;
    private javax.swing.JTextField txtMesPago;
    private javax.swing.JTextField txtagua;
    private javax.swing.JTextField txtidEmpleados;
    private javax.swing.JTextField txtidGastos;
    private javax.swing.JTextField txtluz;
    private javax.swing.JTextField txtrenta;
    // End of variables declaration//GEN-END:variables
int respuesta;
public Conectar cc= new Conectar();
public Connection cn= cc.getConnection();
}
