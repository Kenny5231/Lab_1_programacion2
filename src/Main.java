import java.util.ArrayList;
import javax.swing.JOptionPane;
//funciones
//instancia
//clases

/**
 *
 * @author Kenny
 */
public class Main extends javax.swing.JFrame {
    private boolean usuariosAgregados = false;
     ArrayList<Usuarios> ListadeUsuarios;
    public Main(ArrayList<Usuarios>AtributListadeUsuarios){
        if (AtributListadeUsuarios == null) {
            ListadeUsuarios = new ArrayList<Usuarios>();

        } else {

            ListadeUsuarios = AtributListadeUsuarios;

        }
//        if (!usuariosAgregados) {
//        ListadeUsuarios.add(new Usuarios("Barcoide", "777"));
//        ListadeUsuarios.add(new Usuarios("Barquio", "888"));
//        usuariosAgregados = true; // Marca que los usuarios ya se han agregado
//    }
           
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Player = new javax.swing.JToggleButton();
        Inicio = new javax.swing.JToggleButton();
        Salir = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Player.setText("Crear Player");
        Player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerActionPerformed(evt);
            }
        });
        getContentPane().add(Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 110, -1));

        Inicio.setText("Iniciar Sesion");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        getContentPane().add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 110, 20));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 110, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:
        Inicio_sesion op= new Inicio_sesion(ListadeUsuarios);
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InicioActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(null, "Desea salir?", " Salir", JOptionPane.YES_NO_OPTION);
        if(opcion==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void PlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerActionPerformed
        // TODO add your handling code here:
        Crear_Player ip =new Crear_Player(ListadeUsuarios);
        ip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PlayerActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Inicio;
    private javax.swing.JToggleButton Player;
    private javax.swing.JToggleButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
