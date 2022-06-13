package mvc;

public class frmMenuPrincipal extends javax.swing.JFrame {

    
    public frmMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jmbMenu = new javax.swing.JMenuBar();
        jmSucursales = new javax.swing.JMenu();
        jmiSRegistrar = new javax.swing.JMenuItem();
        jmiSMostrar = new javax.swing.JMenuItem();
        jmProductos = new javax.swing.JMenu();
        jmiPORegistar = new javax.swing.JMenuItem();
        jmiPOEditar = new javax.swing.JMenuItem();
        jmProveedores = new javax.swing.JMenu();
        jmiProRegistro = new javax.swing.JMenuItem();
        jmiProMostrar = new javax.swing.JMenuItem();
        jmCompras = new javax.swing.JMenu();
        jmiCoRegistrar = new javax.swing.JMenuItem();
        jmiCoMostrar = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenu();
        jmiCliRegistrar = new javax.swing.JMenuItem();
        jmiCliMostrar = new javax.swing.JMenuItem();
        jmVentas = new javax.swing.JMenu();
        jmiVRegistrar = new javax.swing.JMenuItem();
        jmiMostrar = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vino.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cervezas.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vinos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jmSucursales.setBorder(null);
        jmSucursales.setText("Sucursales");

        jmiSRegistrar.setText("Registrar");
        jmSucursales.add(jmiSRegistrar);

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

        jmiProRegistro.setText("Registro");
        jmProveedores.add(jmiProRegistro);

        jmiProMostrar.setText("Mostrar");
        jmProveedores.add(jmiProMostrar);

        jmbMenu.add(jmProveedores);

        jmCompras.setText("Compras");

        jmiCoRegistrar.setText("Registrar");
        jmCompras.add(jmiCoRegistrar);

        jmiCoMostrar.setText("Mostrar");
        jmCompras.add(jmiCoMostrar);

        jmbMenu.add(jmCompras);

        jmClientes.setText("Clientes");

        jmiCliRegistrar.setText("Registrar");
        jmClientes.add(jmiCliRegistrar);

        jmiCliMostrar.setText("Mostrar");
        jmClientes.add(jmiCliMostrar);

        jmbMenu.add(jmClientes);

        jmVentas.setText("Ventas");

        jmiVRegistrar.setText("Registrar");
        jmVentas.add(jmiVRegistrar);

        jmiMostrar.setText("Mostrar");
        jmVentas.add(jmiMostrar);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(817, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        frmUsuario f = new frmUsuario();
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmSalirMouseClicked

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenu jmCompras;
    private javax.swing.JMenu jmProductos;
    private javax.swing.JMenu jmProveedores;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenu jmSucursales;
    private javax.swing.JMenu jmVentas;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiCliMostrar;
    private javax.swing.JMenuItem jmiCliRegistrar;
    private javax.swing.JMenuItem jmiCoMostrar;
    private javax.swing.JMenuItem jmiCoRegistrar;
    private javax.swing.JMenuItem jmiMostrar;
    private javax.swing.JMenuItem jmiPOEditar;
    private javax.swing.JMenuItem jmiPORegistar;
    private javax.swing.JMenuItem jmiProMostrar;
    private javax.swing.JMenuItem jmiProRegistro;
    private javax.swing.JMenuItem jmiSMostrar;
    private javax.swing.JMenuItem jmiSRegistrar;
    private javax.swing.JMenuItem jmiVRegistrar;
    // End of variables declaration//GEN-END:variables
}
