package mvc;

public class frmMenuPrincipal extends javax.swing.JFrame {

    
    public frmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jmbMenu = new javax.swing.JMenuBar();
        jmSucursales = new javax.swing.JMenu();
        jmiSRegistrar = new javax.swing.JMenuItem();
        jmiSEditar = new javax.swing.JMenuItem();
        jmiSBuscar = new javax.swing.JMenuItem();
        jmiSEliminar = new javax.swing.JMenuItem();
        jmiSMostrar = new javax.swing.JMenuItem();
        jmProductos = new javax.swing.JMenu();
        jmiPORegistar = new javax.swing.JMenuItem();
        jmiPOEditar = new javax.swing.JMenuItem();
        jmProveedores = new javax.swing.JMenu();
        jmCompras = new javax.swing.JMenu();
        jmClientes = new javax.swing.JMenu();
        jmVentas = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jmSucursales.setText("Sucursales");

        jmiSRegistrar.setText("Registrar");
        jmSucursales.add(jmiSRegistrar);

        jmiSEditar.setText("Editar");
        jmSucursales.add(jmiSEditar);

        jmiSBuscar.setText("Buscar");
        jmiSBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSBuscarActionPerformed(evt);
            }
        });
        jmSucursales.add(jmiSBuscar);

        jmiSEliminar.setText("Eliminar");
        jmSucursales.add(jmiSEliminar);

        jmiSMostrar.setText("Mostrar");
        jmiSMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSMostrarActionPerformed(evt);
            }
        });
        jmSucursales.add(jmiSMostrar);

        jmbMenu.add(jmSucursales);

        jmProductos.setText("Productos");

        jmiPORegistar.setText("Registrar");
        jmProductos.add(jmiPORegistar);

        jmiPOEditar.setText("Editar");
        jmProductos.add(jmiPOEditar);

        jmbMenu.add(jmProductos);

        jmProveedores.setText("Proveedores");
        jmbMenu.add(jmProveedores);

        jmCompras.setText("Compras");
        jmbMenu.add(jmCompras);

        jmClientes.setText("Clientes");
        jmbMenu.add(jmClientes);

        jmVentas.setText("Ventas");
        jmbMenu.add(jmVentas);

        jmSalir.setText("Salir");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jmbMenu.add(jmSalir);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(478, 358));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        frmUsuario f = new frmUsuario();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmSalirMouseClicked

    private void jmiSBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiSBuscarActionPerformed

    private void jmiSMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSMostrarActionPerformed

    }//GEN-LAST:event_jmiSMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmCompras;
    private javax.swing.JMenu jmProductos;
    private javax.swing.JMenu jmProveedores;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmSucursales;
    private javax.swing.JMenu jmVentas;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiPOEditar;
    private javax.swing.JMenuItem jmiPORegistar;
    private javax.swing.JMenuItem jmiSBuscar;
    private javax.swing.JMenuItem jmiSEditar;
    private javax.swing.JMenuItem jmiSEliminar;
    private javax.swing.JMenuItem jmiSMostrar;
    private javax.swing.JMenuItem jmiSRegistrar;
    // End of variables declaration//GEN-END:variables
}
