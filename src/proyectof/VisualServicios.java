
package proyectof;

import Clases.Conectar;
import Logicas.IngresarClientes;
import Logicas.LogicaEmpleados;
import Logicas.LogicaServicios;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class VisualServicios extends javax.swing.JFrame {
 
    private LogicaServicios LS;
    private LogicaEmpleados LE;
    private IngresarClientes LC;
   
    public VisualServicios() {
        initComponents();
        LS= new LogicaServicios();
        LC= new IngresarClientes();
        LE= new LogicaEmpleados();
        respuesta=0;
    }
     private void listar(){
        jTable1.setModel(LS.getDatos());
    }
   private void Limpiar(){
       txtIdServicios.setText("");
       txtNumeroPrendas.setText("");
       txtPrecioTotal.setText("");
       txtDia.setText("");
       txtMes.setText("");
       txtAnio.setText("");
       txtIdClientes.setText("");
       txtidEmpleados.setText("");
       txtConsulta.setText("");
       txtDiaInicialConsulta.setText("");
       txtMesInicialConsulta.setText("");
       txtAnioInicialConsulta.setText("");
       txtDiaFinalconsulta.setText("");
       txtMesFinalConsulta.setText("");
       txtAnio.setText("");
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtIdClientes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdServicios = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNumeroPrendas = new javax.swing.JTextField();
        txtPrecioTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
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
        txtidEmpleados = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDiaInicialConsulta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMesInicialConsulta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAnioInicialConsulta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDiaFinalconsulta = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtMesFinalConsulta = new javax.swing.JTextField();
        txtAnioFInalconsulta = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtConsultaMes = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Fecha de ingreso");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 170, 130, 22);

        txtIdClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClientesActionPerformed(evt);
            }
        });
        txtIdClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidEmpleadosKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdClientes);
        txtIdClientes.setBounds(160, 206, 210, 20);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Id Servicio");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 80, 150, 20);

        txtIdServicios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdServiciosActionPerformed(evt);
            }
        });
        txtIdServicios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidEmpleadosKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdServicios);
        txtIdServicios.setBounds(160, 76, 210, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Precio");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 140, 160, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Número Prendas");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 110, 160, 22);

        txtNumeroPrendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumeroPrendas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidEmpleadosKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeroPrendas);
        txtNumeroPrendas.setBounds(160, 106, 210, 20);

        txtPrecioTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPrecioTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioTotalActionPerformed(evt);
            }
        });
        txtPrecioTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidEmpleadosKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrecioTotal);
        txtPrecioTotal.setBounds(160, 136, 210, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Id Cliente");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 200, 130, 22);

        txtDia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidEmpleadosKeyTyped(evt);
            }
        });
        jPanel2.add(txtDia);
        txtDia.setBounds(160, 180, 40, 17);

        btModificar.setBackground(new java.awt.Color(204, 204, 204));
        btModificar.setText("Modificar");
        btModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 204, 204)));
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btModificar);
        btModificar.setBounds(390, 200, 100, 30);

        btEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btEliminar.setText("Eliminar");
        btEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 204, 204)));
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btEliminar);
        btEliminar.setBounds(390, 160, 100, 30);

        btMostrarTodo.setBackground(new java.awt.Color(204, 204, 204));
        btMostrarTodo.setText("Mostrar Todo");
        btMostrarTodo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 204, 204)));
        btMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarTodoActionPerformed(evt);
            }
        });
        jPanel2.add(btMostrarTodo);
        btMostrarTodo.setBounds(390, 120, 100, 30);

        btRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        btRegistrar.setText("Registrar");
        btRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 204, 204)));
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btRegistrar);
        btRegistrar.setBounds(390, 80, 90, 30);

        btConsulta.setBackground(new java.awt.Color(204, 204, 204));
        btConsulta.setText("Consulta");
        btConsulta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 204, 204)));
        btConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btConsulta);
        btConsulta.setBounds(510, 80, 100, 30);

        btMenu.setText("Menú");
        btMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 204, 204)));
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });
        jPanel2.add(btMenu);
        btMenu.setBounds(10, 10, 80, 30);

        txtConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidEmpleadosKeyTyped(evt);
            }
        });
        jPanel2.add(txtConsulta);
        txtConsulta.setBounds(510, 120, 100, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Servicios");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(380, 0, 190, 42);

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 270, 850, 90);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Id Empleado");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 230, 110, 30);

        txtidEmpleados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtidEmpleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidEmpleadosKeyTyped(evt);
            }
        });
        jPanel2.add(txtidEmpleados);
        txtidEmpleados.setBounds(150, 236, 220, 20);

        jLabel9.setText("    /");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(200, 180, 34, 20);

        txtMes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidEmpleadosKeyTyped(evt);
            }
        });
        jPanel2.add(txtMes);
        txtMes.setBounds(230, 180, 50, 17);

        jLabel10.setText("    /");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(280, 180, 40, 15);

        txtAnio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidEmpleadosKeyTyped(evt);
            }
        });
        jPanel2.add(txtAnio);
        txtAnio.setBounds(320, 180, 40, 17);

        jLabel11.setText("Consulta del mes");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(670, 60, 220, 15);

        txtDiaInicialConsulta.setText("dia");
        txtDiaInicialConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDiaInicialConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaInicialConsultaActionPerformed(evt);
            }
        });
        txtDiaInicialConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaInicialConsultaKeyTyped(evt);
            }
        });
        jPanel2.add(txtDiaInicialConsulta);
        txtDiaInicialConsulta.setBounds(630, 110, 60, 17);

        jLabel12.setText("  /");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(690, 110, 9, 15);

        txtMesInicialConsulta.setText("mes");
        txtMesInicialConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMesInicialConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaInicialConsultaKeyTyped(evt);
            }
        });
        jPanel2.add(txtMesInicialConsulta);
        txtMesInicialConsulta.setBounds(710, 110, 60, 17);

        jLabel13.setText("   /");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(770, 110, 12, 15);

        txtAnioInicialConsulta.setText("año");
        txtAnioInicialConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAnioInicialConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaInicialConsultaKeyTyped(evt);
            }
        });
        jPanel2.add(txtAnioInicialConsulta);
        txtAnioInicialConsulta.setBounds(800, 110, 70, 17);

        jLabel14.setText("Digite la fecha inicial donde quiere ver los servicios");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(620, 74, 300, 20);

        jLabel15.setText("DIgite  la fecha final hasta donde quiera ver los servcios");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(620, 140, 290, 15);

        txtDiaFinalconsulta.setText("dia");
        txtDiaFinalconsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDiaFinalconsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaInicialConsultaKeyTyped(evt);
            }
        });
        jPanel2.add(txtDiaFinalconsulta);
        txtDiaFinalconsulta.setBounds(610, 170, 70, 17);

        jLabel16.setText("    /");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(680, 170, 15, 15);

        txtMesFinalConsulta.setText("mes");
        txtMesFinalConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMesFinalConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaInicialConsultaKeyTyped(evt);
            }
        });
        jPanel2.add(txtMesFinalConsulta);
        txtMesFinalConsulta.setBounds(720, 170, 60, 17);

        txtAnioFInalconsulta.setText("año");
        txtAnioFInalconsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAnioFInalconsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiaInicialConsultaKeyTyped(evt);
            }
        });
        jPanel2.add(txtAnioFInalconsulta);
        txtAnioFInalconsulta.setBounds(810, 170, 70, 17);

        jLabel17.setText("    /");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(780, 170, 30, 15);

        txtConsultaMes.setBackground(new java.awt.Color(204, 204, 204));
        txtConsultaMes.setText("Consulta del  mes ");
        txtConsultaMes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 204), new java.awt.Color(0, 204, 204)));
        txtConsultaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaMesActionPerformed(evt);
            }
        });
        jPanel2.add(txtConsultaMes);
        txtConsultaMes.setBounds(660, 210, 180, 19);

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectof/5765321-azul-de-fondo-de-burbujas-vector-de-la-ilustración-.jpg"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel18);
        jLabel18.setBounds(-350, -60, 1550, 760);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdServiciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdServiciosActionPerformed

    private void txtPrecioTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioTotalActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        int idServicios,NumeroPrendas,idClientes,idEmpleados;
        float PrecioTotal;
        String fecha;
         int idS,banderaS,idC,banderaC,idE,banderaE;
        if(!txtIdServicios.getText().isEmpty() && !txtNumeroPrendas.getText().isEmpty() && !txtPrecioTotal.getText().isEmpty() && !txtDia.getText().isEmpty() && !txtMes.getText().isEmpty() && !txtAnio.getText().isEmpty() && !txtIdClientes.getText().isEmpty() && !txtidEmpleados.getText().isEmpty()){
           if(txtIdServicios.getText().length()-1<9){
            if(txtNumeroPrendas.getText().length()-1<9){
                if(txtPrecioTotal.getText().length()-1<9){
                if(txtDia.getText().length()-1<9 && txtMes.getText().length()-1<9 && txtAnio.getText().length()-1<9){
                    if(txtIdClientes.getText().length()-1<9){
                        if(txtidEmpleados.getText().length()-1<9){
                            
                        
                    
                
                
            
           
            idS=Integer.parseInt(txtIdServicios.getText());
        banderaS=LS.Acceder(idS);
        idC=Integer.parseInt(txtIdClientes.getText());
        banderaC=LC.Acceder(idC);
        idE=Integer.parseInt(txtidEmpleados.getText());
        banderaE=LE.Acceder(idE);
        if(banderaS!=0){
            if(banderaC!=0){
                
                    
                 if(banderaE!=0){
                int dia=Integer.parseInt(txtDia.getText());
                int mes= Integer.parseInt(txtMes.getText());
                int anio=Integer.parseInt(txtAnio.getText());
                
            if(dia>=1 && dia<=31 && mes>=1 && mes<=12){
            
           
        
        idServicios=Integer.parseInt(txtIdServicios.getText());
        NumeroPrendas=Integer.parseInt(txtNumeroPrendas.getText());
        PrecioTotal=Float.parseFloat(txtPrecioTotal.getText());
        fecha= txtAnio.getText()+"/"+txtMes.getText()+"/"+txtDia.getText();
        idClientes=Integer.parseInt(txtIdClientes.getText());
        idEmpleados=Integer.parseInt(txtidEmpleados.getText());
        
        respuesta=LS.updateDatos(idServicios, NumeroPrendas, PrecioTotal, fecha, idClientes, idEmpleados);
       
            }
            else{
                JOptionPane.showMessageDialog(null, "DIgito mal la fecha");
                
            }
                 
                }else{
                    JOptionPane.showMessageDialog(null, "no existe ese Empleado");
                    
                }
            }else{
            JOptionPane.showMessageDialog(null, "no existe ese cliente");
            
                }
        
        }else{
            JOptionPane.showMessageDialog(null, "no se puede modificar ya que no existe ese servicio");
        
            }
        }else{
            JOptionPane.showMessageDialog(null, "Se ha pasado de los limites de digitos en el idEmpleados");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Se ha pasado en los limites de digitos en el idClientes");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Se ha pasado en el limite de digitos en la fecha de registro");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Se ha pasado de los limites de digitos en el Precio Total");
        }
        
                
           }else{
            JOptionPane.showMessageDialog(null, "se ha pasado en el limite de digitos en el numero de Prendas");
        }
           }else{
            JOptionPane.showMessageDialog(null, "se ha pasado en el limite de digitos en el idServicios");
        }
        }else{
            JOptionPane.showMessageDialog(null, "NO ha llenado todos los campos necesarios");
        
        }
        Limpiar();
    }//GEN-LAST:event_btModificarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
       int idS,banderaS;
        if(!txtIdServicios.getText().isEmpty()){
        if(txtIdServicios.getText().length()-1<9){
            
        
            idS=Integer.parseInt(txtIdServicios.getText());
        banderaS=LS.Acceder(idS);
            if(banderaS!=0){
                
            
            int idServicios=Integer.parseInt(txtIdServicios.getText());
        LS.deleteDatos(idServicios);
            
            }else{
                JOptionPane.showMessageDialog(null, "no se pudo elimiinar ya que no existe ese servicio");
           
            }
        }else{
            JOptionPane.showMessageDialog(null, "Se ha pasado en los limites de digitos en el idServicios");
        }    
        }else{
           JOptionPane.showMessageDialog(null, "no ha llenado el campo idServicios y no se sabe cual servicio vamos a eliminar");
       
        }
        Limpiar();
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarTodoActionPerformed
        // TODO add your handling code here:
        
        
        listar();
    }//GEN-LAST:event_btMostrarTodoActionPerformed

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        // TODO add your handling code here:
       int idS,banderaS,idC,banderaC,idE,banderaE;
       
       int idServicios,NumeroPrendas,idClientes,idEmpleados;
        float PrecioTotal;
        String fecha;
       
        if(!txtIdServicios.getText().isEmpty() && !txtNumeroPrendas.getText().isEmpty() && !txtPrecioTotal.getText().isEmpty() && !txtDia.getText().isEmpty() && !txtMes.getText().isEmpty() && !txtAnio.getText().isEmpty() && !txtIdClientes.getText().isEmpty() && !txtidEmpleados.getText().isEmpty()){
         if(txtIdServicios.getText().length()-1<9){
             if(txtNumeroPrendas.getText().length()-1<9){
                 if(txtPrecioTotal.getText().length()-1<9){
                 if(txtDia.getText().length()-1<9 && txtMes.getText().length()-1<9 && txtAnio.getText().length()-1<9){
                     if(txtIdClientes.getText().length()-1<9){
                         if(txtidEmpleados.getText().length()-1<9){
                     
                 
                 
             
         
            idS=Integer.parseInt(txtIdServicios.getText());
        banderaS=LS.Acceder(idS);
        
        idC=Integer.parseInt(txtIdClientes.getText());
        banderaC=LC.Acceder(idC);
        
        idE=Integer.parseInt(txtidEmpleados.getText());
        banderaE=LE.Acceder(idE);
        if(banderaS==0){
            if(banderaC!=0){
                if(banderaE!=0){
                int dia=Integer.parseInt(txtDia.getText());
                int mes= Integer.parseInt(txtMes.getText());
                int anio=Integer.parseInt(txtAnio.getText());
                
            if(dia>=1 && dia<=31 && mes>=1 && mes<=12){
                
            
            
        idServicios=Integer.parseInt(txtIdServicios.getText());
        NumeroPrendas=Integer.parseInt(txtNumeroPrendas.getText());
        PrecioTotal=Float.parseFloat(txtPrecioTotal.getText());
        fecha= txtAnio.getText()+"/"+txtMes.getText()+"/"+txtDia.getText();
        idClientes=Integer.parseInt(txtIdClientes.getText());
        idEmpleados=Integer.parseInt(txtidEmpleados.getText());
        respuesta=LS.insertDatos(idServicios, NumeroPrendas, PrecioTotal, fecha, idClientes, idEmpleados);
        
            }else{
                JOptionPane.showMessageDialog(null, "Digito mal la fecha");
           
            }
                }else{
                JOptionPane.showMessageDialog(null, "No existe ese empleado con id");
               
                }
                }else{
                JOptionPane.showMessageDialog(null, "no existe ese cliente");
            
            }
            }else{
            JOptionPane.showMessageDialog(null, "existe un servicio con ese mismo id");
        
        
        }
                         }else{
                             JOptionPane.showMessageDialog(null, "Se ha pasado en el numero de digitos de idEmpleados");
                         }
                     }else{
                         JOptionPane.showMessageDialog(null, "Se ha pasado en el numero de digitos de idClientes");
                     }
                     }else{
                     JOptionPane.showMessageDialog(null, "Se ha pasado en el limite de digitos en  la fecha");
                 }
                 }else{
                     JOptionPane.showMessageDialog(null, "Se ha pasado  en el limite de digitos en el Precio");
                 }
                 }else{
                 JOptionPane.showMessageDialog(null, "Se ha pasado del limite de digitos en el numero de prendas");
             }
             }else{
             JOptionPane.showMessageDialog(null, "Se ha pasado del limite de digitos en el idServicios");
         }
         }else{
            JOptionPane.showMessageDialog(null,"usted no ha llenado los campos necesarios");
        
        }
        Limpiar();
    }//GEN-LAST:event_btRegistrarActionPerformed

    private void btConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaActionPerformed
        // TODO add your handling code here:
     int idS,banderaS;
        if(!txtConsulta.getText().isEmpty()){
        if(txtConsulta.getText().length()-1<9){
            
        
            idS=Integer.parseInt(txtConsulta.getText());
    banderaS=LS.Acceder(idS);
     
       if(banderaS!=0){
        int id=Integer.parseInt(txtConsulta.getText());
        jTable1.setModel(LS.getDato(id)); 
      
       }else{
           JOptionPane.showMessageDialog(null, "no se pudo realizar la consulta ya que no existe ese servicio");
       
       }   
        }else{
            JOptionPane.showMessageDialog(null, "Se ha pasado de los limites de digitos en consulta");
        }
        }else{
    JOptionPane.showMessageDialog(null, "No ha llenado el campo consulta");
        
        }
        Limpiar();
    }//GEN-LAST:event_btConsultaActionPerformed

    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        MenuPrincipal menu=new MenuPrincipal();
        menu.setLocationRelativeTo(null);
        menu.setSize(708, 402);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btMenuActionPerformed

    private void txtIdClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClientesActionPerformed

    private void txtidEmpleadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidEmpleadosKeyTyped
        // TODO add your handling code here
         char car= evt.getKeyChar();
        if(car<'0' || car>'9'){
            evt.consume();
        }
        
        
        
    }//GEN-LAST:event_txtidEmpleadosKeyTyped

    private void txtConsultaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaMesActionPerformed
      String FechaInicial,FechaFinal;  
     int diaI,mesI,anioI;
     int diaF,mesF,anioF;
     
     if(!txtDiaInicialConsulta.getText().isEmpty() && !txtMesInicialConsulta.getText().isEmpty() && !txtAnioInicialConsulta.getText().isEmpty() && !txtDiaFinalconsulta.getText().isEmpty() && !txtMesFinalConsulta.getText().isEmpty() && !txtAnioFInalconsulta.getText().isEmpty()){
        if(txtDiaInicialConsulta.getText().length()-1<9 && txtMesInicialConsulta.getText().length()-1<9 && txtAnioInicialConsulta.getText().length()-1<9){
            if(txtDiaFinalconsulta.getText().length()-1<9 && txtMesFinalConsulta.getText().length()-1<9 && txtAnioFInalconsulta.getText().length()-1<9){
        
     
     diaI=Integer.parseInt(txtDiaInicialConsulta.getText());
     mesI=Integer.parseInt(txtMesInicialConsulta.getText());
     anioI=Integer.parseInt(txtAnioInicialConsulta.getText());
     
     diaF=Integer.parseInt(txtDiaFinalconsulta.getText());
     mesF=Integer.parseInt(txtMesFinalConsulta.getText());
     anioF=Integer.parseInt(txtAnioFInalconsulta.getText());
     
     
     if(diaI>=1 && diaI<=31 && mesI>=1 && mesI<=12 && diaF>=1 &&diaF<=31 && mesF>=1 && mesF<=12 ){
         
     
     FechaInicial=txtAnioInicialConsulta.getText()+"/"+txtMesInicialConsulta.getText()+"/"+txtDiaInicialConsulta.getText();
     FechaFinal=txtAnioFInalconsulta.getText()+"/"+txtMesFinalConsulta.getText()+"/"+txtDiaFinalconsulta.getText();
     jTable1.setModel(LS.getFecha(FechaInicial, FechaFinal));
     
     }else{
         JOptionPane.showMessageDialog(null, "verifique que los dias y meses sean correctos");
     
     }
            }else{
                JOptionPane.showMessageDialog(null, "Se ha pasado de los limites de digitos en la fecha final");
            }
            }else{
            JOptionPane.showMessageDialog(null, "Se ha pasado de los limites de digitos en la fecha inicial");
        }
        }else{
         JOptionPane.showMessageDialog(null, "ha dejado campos sin llenar");
     
     }
     Limpiar();
    }//GEN-LAST:event_txtConsultaMesActionPerformed

    private void txtDiaInicialConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaInicialConsultaKeyTyped
        // TODO add your handling code here:
        char car= evt.getKeyChar();
        if(car<'0' || car>'9'){
            evt.consume();
        }
        
    }//GEN-LAST:event_txtDiaInicialConsultaKeyTyped

    private void txtDiaInicialConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaInicialConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaInicialConsultaActionPerformed

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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtAnioFInalconsulta;
    private javax.swing.JTextField txtAnioInicialConsulta;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JButton txtConsultaMes;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtDiaFinalconsulta;
    private javax.swing.JTextField txtDiaInicialConsulta;
    private javax.swing.JTextField txtIdClientes;
    private javax.swing.JTextField txtIdServicios;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtMesFinalConsulta;
    private javax.swing.JTextField txtMesInicialConsulta;
    private javax.swing.JTextField txtNumeroPrendas;
    private javax.swing.JTextField txtPrecioTotal;
    private javax.swing.JTextField txtidEmpleados;
    // End of variables declaration//GEN-END:variables
int respuesta;
public Conectar cc= new Conectar();
public Connection cn= cc.getConnection();
}
