//lazaro prueba commit  
package mvc;

public class frmRegistrarClientes extends javax.swing.JFrame {

    private Cliente client;
    
    public frmRegistrarClientes() {
        initComponents();
        client = null;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngTipoCliente = new javax.swing.ButtonGroup();
        btngIncidentes = new javax.swing.ButtonGroup();
        jlbTitulo = new javax.swing.JLabel();
        jlbCliente = new javax.swing.JLabel();
        jlbNombreCliente = new javax.swing.JLabel();
        jlbTipo = new javax.swing.JLabel();
        jlbCompras = new javax.swing.JLabel();
        jlbIncidentes = new javax.swing.JLabel();
        jtxCliente = new javax.swing.JTextField();
        jtxNombre = new javax.swing.JTextField();
        jtxCompras = new javax.swing.JTextField();
        rbnMinorista = new javax.swing.JRadioButton();
        rbnMayorista = new javax.swing.JRadioButton();
        jbnRegistrar = new javax.swing.JButton();
        jbnRegresar = new javax.swing.JButton();
        jlbMensaje = new javax.swing.JLabel();
        jcbSi = new javax.swing.JCheckBox();
        jcbNo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlbTitulo.setText("Registrar clientes");

        jlbCliente.setText("Id cliente:");

        jlbNombreCliente.setText("Nombre cliente:");

        jlbTipo.setText("Tipo cliente:");

        jlbCompras.setText("Compras cliente:");

        jlbIncidentes.setText("Incidentes cliente:");

        btngTipoCliente.add(rbnMinorista);
        rbnMinorista.setText("Minorista");

        btngTipoCliente.add(rbnMayorista);
        rbnMayorista.setText("Mayorista");

        jbnRegistrar.setText("Registrar");
        jbnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegistrarActionPerformed(evt);
            }
        });

        jbnRegresar.setText("Regresar");
        jbnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegresarActionPerformed(evt);
            }
        });

        jlbMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMensaje.setText("(AREA DE MENSJAES)");

        btngIncidentes.add(jcbSi);
        jcbSi.setText("Si");

        btngIncidentes.add(jcbNo);
        jcbNo.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlbTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlbNombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(rbnMinorista)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbnMayorista))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jtxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jtxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbnRegistrar)
                                    .addComponent(jlbIncidentes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbSi)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbNo))
                                    .addComponent(jtxCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbnRegresar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jlbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlbTitulo)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCliente)
                    .addComponent(jtxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNombreCliente)
                    .addComponent(jtxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTipo)
                    .addComponent(rbnMinorista)
                    .addComponent(rbnMayorista))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCompras)
                    .addComponent(jtxCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbIncidentes)
                    .addComponent(jcbSi)
                    .addComponent(jcbNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnRegistrar)
                    .addComponent(jbnRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegresarActionPerformed
        frmMenuPrincipal back = new frmMenuPrincipal();
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbnRegresarActionPerformed

    private void jbnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegistrarActionPerformed
        int id = Integer.parseInt(jtxCliente.getText());
        String nombre = jtxNombre.getText();
        int tipo = 0;
        int compras = Integer.parseInt(jtxCompras.getText());
        boolean incidentes = false;
        
        //Evaluar
        if(rbnMinorista.isSelected()){
            tipo = 1;
        }else if(rbnMayorista.isSelected()){
            tipo = 2;
        }else{
            jlbMensaje.setText("NINGUNA OPCION SELECCIONADA");
        }
        
        if(jcbSi.isSelected()){
            incidentes = true;
        }else if (jcbNo.isSelected()){
            incidentes = false;
        }
        
        Cliente nuevo = new Cliente(id,nombre,tipo,compras,false);
        
        //VALIDAR LISTAS
        if(client == null){
            //Se agrega el primer nodo a la lista
            client = nuevo;
        }else{
            //Creamos el apuntador auxiliar
            Cliente aux = client;
            //Recorrer la lista 
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        frmMostrarCliente ver = new frmMostrarCliente(client);
        ver.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jbnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngIncidentes;
    private javax.swing.ButtonGroup btngTipoCliente;
    private javax.swing.JButton jbnRegistrar;
    private javax.swing.JButton jbnRegresar;
    private javax.swing.JCheckBox jcbNo;
    private javax.swing.JCheckBox jcbSi;
    private javax.swing.JLabel jlbCliente;
    private javax.swing.JLabel jlbCompras;
    private javax.swing.JLabel jlbIncidentes;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JLabel jlbNombreCliente;
    private javax.swing.JLabel jlbTipo;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JTextField jtxCliente;
    private javax.swing.JTextField jtxCompras;
    private javax.swing.JTextField jtxNombre;
    private javax.swing.JRadioButton rbnMayorista;
    private javax.swing.JRadioButton rbnMinorista;
    // End of variables declaration//GEN-END:variables
}
