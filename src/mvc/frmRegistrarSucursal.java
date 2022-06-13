
package mvc;

public class frmRegistrarSucursal extends javax.swing.JFrame {

    private Sucursal suc;
    
    public frmRegistrarSucursal() {
        initComponents();
        suc = null;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngTipo = new javax.swing.ButtonGroup();
        btnRegistrar = new javax.swing.JButton();
        bntRegresar = new javax.swing.JButton();
        jtfId = new javax.swing.JTextField();
        jtfLocalidad = new javax.swing.JTextField();
        jtfCapacidad = new javax.swing.JTextField();
        jtfVentas = new javax.swing.JTextField();
        jlbId = new javax.swing.JLabel();
        jlbLoicalidad = new javax.swing.JLabel();
        jlbTipo = new javax.swing.JLabel();
        jlbCapacidad = new javax.swing.JLabel();
        jlbVentas = new javax.swing.JLabel();
        jcbTipo1 = new javax.swing.JCheckBox();
        jcbTipo2 = new javax.swing.JCheckBox();
        jcbTipo3 = new javax.swing.JCheckBox();
        jlbMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        bntRegresar.setText("Regresar");
        bntRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRegresarActionPerformed(evt);
            }
        });

        jlbId.setText("ID");

        jlbLoicalidad.setText("LOCALIDAD");

        jlbTipo.setText("TIPO");

        jlbCapacidad.setText("CAPACIDAD");

        jlbVentas.setText("VENTAS");

        btngTipo.add(jcbTipo1);
        jcbTipo1.setText("Tipo 1");

        btngTipo.add(jcbTipo2);
        jcbTipo2.setText("Tipo 2");

        btngTipo.add(jcbTipo3);
        jcbTipo3.setText("Tipo 3 ");

        jlbMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMensaje.setText("(AREA DE MENSAJES)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jlbId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jlbLoicalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jtfLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jlbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jcbTipo1)
                                                .addGap(10, 10, 10)
                                                .addComponent(jcbTipo2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jcbTipo3))
                                            .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(jlbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntRegresar)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbLoicalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbTipo1)
                    .addComponent(jcbTipo2)
                    .addComponent(jcbTipo3)
                    .addComponent(jlbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jlbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntRegresar)
                    .addComponent(btnRegistrar))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegresarActionPerformed
        frmMenuPrincipal back = new frmMenuPrincipal();
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bntRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int id = Integer.parseInt(jtfId.getText());
        String localidad = jtfLocalidad.getText();
        int tipo = 0;
        int capacidad = Integer.parseInt(jtfCapacidad.getText());
        int ventas_prom = Integer.parseInt(jtfVentas.getText());
        
        //EVALUAR 
        if(jcbTipo1.isSelected()){
            tipo = 1;
        }else if(jcbTipo2.isSelected()){
            tipo = 2;
        }else if(jcbTipo3.isSelected()){
            tipo = 3;
        } else {
            jlbMensaje.setText("NINGUNO OPCION SELECCIONADA");
        }
        
        //Pasamos los argumentos 
        Sucursal nueva = new Sucursal(id,localidad,tipo,capacidad,0);
        
        //Validar Listas 
        if(suc == null){
            //se agrega el primer nodo a la lista 
            suc = nueva;
        }else{
            //CREAR APUNTADOR AUXILIAR 
            Sucursal aux = suc;
            //Recorrer la lista 
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nueva);
        }
        
        frmMostrarSucursal ver = new frmMostrarSucursal(suc);
            ver.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistrarSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrarSucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRegresar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup btngTipo;
    private javax.swing.JCheckBox jcbTipo1;
    private javax.swing.JCheckBox jcbTipo2;
    private javax.swing.JCheckBox jcbTipo3;
    private javax.swing.JLabel jlbCapacidad;
    private javax.swing.JLabel jlbId;
    private javax.swing.JLabel jlbLoicalidad;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JLabel jlbTipo;
    private javax.swing.JLabel jlbVentas;
    private javax.swing.JTextField jtfCapacidad;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfLocalidad;
    private javax.swing.JTextField jtfVentas;
    // End of variables declaration//GEN-END:variables
}
