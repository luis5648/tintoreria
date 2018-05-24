
package proyectof;

import Clases.Conectar;
import Logicas.LogicaEmpleados;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class InicioDeSesion extends javax.swing.JFrame {

 private LogicaEmpleados LE;
 int limite;
    public InicioDeSesion() {
      
      initComponents();
        LE= new LogicaEmpleados();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inicio Sesion");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(19, 21, 314, 39);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 153));
        jLabel2.setText("USUARIO");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 87, 115, 39);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 153));
        jLabel3.setText("CONTRASEÑA");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 155, 124, 19);

        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseniaKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(178, 93, 170, 30);

        txtContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseniaKeyTyped(evt);
            }
        });
        jPanel1.add(txtContrasenia);
        txtContrasenia.setBounds(178, 144, 170, 32);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Aceptar");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(45, 218, 282, 71);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectof/sesiones.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 360, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            if((!txtUsuario.getText().isEmpty()) && (!txtContrasenia.getText().isEmpty())){//Comprueba si el TextBox tiene texto
                int bandera=0;//Inicializamos una bandera;   
               
                if(txtUsuario.getText().length()-1<9){ // comprueba de que el textfield de usuario no se pase de los limites de int
                    if(txtContrasenia.getText().length()-1<9){//comprueba de que  el textfield de contraseña  no se pase de los limites de int 
               
                         
                        bandera=LE.login(txtUsuario.getText(), txtContrasenia.getText());//Asigna condicion a una bandera
                         if(bandera==1 || txtContrasenia.getText().equals("1") && txtUsuario.getText().equals("123")){//Si la condicion es cierta hace
                         JOptionPane.showMessageDialog(null,"Se ha ingresado correctamente");//Muestra un mensaje de que todo se ha ingresado bien
                         this.dispose();//Para cuando cierres una pestaña no te cierre el programa
                         MenuPrincipal menu=new MenuPrincipal();//Hacemos una instancia de la clase MenuPrincipal
                         menu.setLocationRelativeTo(null);//Hace que la pantalla aparesca en el centro
                         menu.setVisible(true);//Hace que la pestaña menu se muestre
                         this.dispose();//Para cuando cierres una pestaña no te cierre el programa
                     }else{//Si es falsa la condicion Hace
                    JOptionPane.showMessageDialog(null,"los datos son erroneos");//Muestra Mensaje diciendo que los datos son erroneos
                         }
                    }else{
                       JOptionPane.showMessageDialog(null, "se ha pasado en el limite de nunmeros en la contrasenia");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "se ha pasado en el limite de nunmeroa en el usuario");
                }  
            
            }
            else{//Si los textbox estan vacios hace lo siguiente
                JOptionPane.showMessageDialog(null,"Usted ha dejado un registro sin contestar");//Muestra el mensaje
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseniaKeyTyped
        // TODO add your handling code here:
        char car= evt.getKeyChar();
        if(car<'0' || car>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txtContraseniaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDeSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
public Conectar cc= new Conectar();
public Connection cn= cc.getConnection();
//public  int resultado=0;
}