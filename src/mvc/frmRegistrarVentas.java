
package mvc;

import javax.swing.JOptionPane;

public class frmRegistrarVentas extends javax.swing.JFrame {

    Venta ventas;
    public frmRegistrarVentas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngTipoVenta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jlbId = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jlbTitulo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jlbVenta = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jlbMonto = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jlbTipoPago = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jtfTitulo = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jtfMonto = new javax.swing.JTextField();
        jtfTipoPago = new javax.swing.JTextField();
        jlbTitulo1 = new javax.swing.JLabel();
        jrbOpcion1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jrbOpcion2 = new javax.swing.JRadioButton();
        jrbOpcion3 = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jlbId.setForeground(new java.awt.Color(0, 204, 255));
        jlbId.setText("ID:");

        btnRegistrar.setForeground(new java.awt.Color(0, 204, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jlbTitulo.setForeground(new java.awt.Color(0, 204, 255));
        jlbTitulo.setText("TITULO:");

        btnBuscar.setForeground(new java.awt.Color(0, 204, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jlbVenta.setForeground(new java.awt.Color(0, 204, 255));
        jlbVenta.setText("TIPO DE VENTA:");

        btnEditar.setForeground(new java.awt.Color(0, 204, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jlbMonto.setForeground(new java.awt.Color(0, 204, 255));
        jlbMonto.setText("Monto:");

        btnEliminar.setForeground(new java.awt.Color(255, 51, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jlbTipoPago.setForeground(new java.awt.Color(0, 204, 255));
        jlbTipoPago.setText("TIPO DE PAGO");

        btnLimpiar.setForeground(new java.awt.Color(0, 204, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escoba.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnRegresar.setForeground(new java.awt.Color(255, 51, 0));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regreso (2).png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jlbTitulo1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 36)); // NOI18N
        jlbTitulo1.setForeground(new java.awt.Color(0, 204, 255));
        jlbTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo1.setText("Ventas");

        btngTipoVenta.add(jrbOpcion1);
        jrbOpcion1.setForeground(new java.awt.Color(0, 204, 255));
        jrbOpcion1.setText("Unica");
        jrbOpcion1.setContentAreaFilled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ventas-bajas.png"))); // NOI18N

        btngTipoVenta.add(jrbOpcion2);
        jrbOpcion2.setForeground(new java.awt.Color(0, 204, 255));
        jrbOpcion2.setText("Minorista");
        jrbOpcion2.setContentAreaFilled(false);

        btngTipoVenta.add(jrbOpcion3);
        jrbOpcion3.setForeground(new java.awt.Color(0, 204, 255));
        jrbOpcion3.setText("Mayorista");
        jrbOpcion3.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbTitulo1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlbTitulo)
                                .addGap(7, 7, 7)
                                .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlbVenta)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jrbOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jlbTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfTipoPago))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jlbMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jlbId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRegresar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(107, 107, 107))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4))
                    .addComponent(jlbTitulo1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbId)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbTitulo)
                            .addComponent(jtfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbVenta)
                            .addComponent(jrbOpcion1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbOpcion2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbOpcion3)
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlbMonto)
                                    .addComponent(jtfMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnBuscar)))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbTipoPago))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegresar)))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(361, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int id = Integer.parseInt(jtfId.getText());
        String titulo = jtfTitulo.getText();
        String tipo_pago = jtfTipoPago.getText();
        String tipo_venta = "";
        float monto = Float.parseFloat(jtfMonto.getText());
        if(jrbOpcion1.isSelected()){
            tipo_venta = "unica";
        } else if(jrbOpcion2.isSelected()){
            tipo_venta = "minorista";
        } else if(jrbOpcion3.isSelected()){
            tipo_venta = "mayorista";
        }
        
        Venta nueva = new Venta(id,titulo,tipo_venta,monto,tipo_pago);
        //Validar Listas 
        if(ventas == null){
            //se agrega el primer nodo a la lista 
            ventas = nueva;
        }else{
            //CREAR APUNTADOR AUXILIAR 
            Venta aux = ventas;
            //Recorrer la lista 
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nueva);
        }
        
        JOptionPane.showMessageDialog(null,"Registro hecho");
        jtfId.setText(null);
        jtfTitulo.setText(null);
        jtfMonto.setText(null);
        jtfTipoPago.setText(null);
        btngTipoVenta.clearSelection();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Venta aux = ventas;
        boolean encontrado = false;
        if(ventas == null){
            JOptionPane.showMessageDialog(null, "Lista Vacía");
        } else {
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    jtfTitulo.setText(aux.getTitulo());
                    jtfTipoPago.setText(aux.getTipo_pago());
                    jtfMonto.setText(String.valueOf(aux.getMonto()));
                    if(aux.getTipo().equals("unica")){
                        jrbOpcion1.setSelected(true);
                    } else if(aux.getTipo().equals("minorista")){
                        jrbOpcion2.setSelected(true);
                    } else if(aux.getTipo().equals("mayorista")){
                        jrbOpcion3.setSelected(true);
                    }
                        encontrado = true;
                        break;
                }
                    aux = aux.getSiguiente();
            }
                if(!encontrado){
                    JOptionPane.showMessageDialog(null,"Dato no encontrado");
                }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Venta aux = ventas;
        boolean encontrado = false;
        if(ventas == null){
            JOptionPane.showMessageDialog(null, "Lista Vacía");
        } else {
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    jtfId.setEditable(false);
                    aux.setTitulo(jtfTitulo.getText());
                    aux.setTipo_pago(jtfTipoPago.getText());
                    aux.setMonto(Float.parseFloat(jtfMonto.getText()));
                    if(jrbOpcion1.isSelected()){
                        aux.setTipo("unica");
                    } else if(jrbOpcion2.isSelected()){
                        aux.setTipo("minorista");
                    } else if(jrbOpcion3.isSelected()){
                        aux.setTipo("mayorista");
                    }
                        JOptionPane.showMessageDialog(null, "Venta con id " + aux.getId() + " ha sido actualizado");
                        jtfId.setEditable(true);
                        jtfId.setText(null);
                        jtfTitulo.setText(null);
                        jtfMonto.setText(null);
                        jtfTipoPago.setText(null);
                        btngTipoVenta.clearSelection();
                        encontrado = true;
                        break;
                }
                    aux = aux.getSiguiente();
            }
                if(!encontrado){
                    JOptionPane.showMessageDialog(null,"Dato no encontrado");
                }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jtfId.setEditable(true);
        jtfId.setText(null);
        jtfTitulo.setText(null);
        jtfMonto.setText(null);
        jtfTipoPago.setText(null);
        btngTipoVenta.clearSelection();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Venta aux = ventas;
        Venta anteterior = null;
        boolean encontrado = false;
        if (ventas == null){
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }else{
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId())) ){
                    if(anteterior != null){
                        //ELIMINANDO CUALQUIER NODO
                        anteterior.setSiguiente(aux.getSiguiente());
                    }else{
                        ventas = aux.getSiguiente();
                    }
                    JOptionPane.showMessageDialog(null,"DATO ELIMINADO");
                    jtfId.setEditable(true);
                    jtfId.setText(null);
                    jtfTitulo.setText(null);
                    jtfMonto.setText(null);
                    jtfTipoPago.setText(null);
                    btngTipoVenta.clearSelection();
                    encontrado = true;
                    break;
                }
                anteterior = aux;
                aux = aux.getSiguiente();
            }
            if(!encontrado){ 
               JOptionPane.showMessageDialog(null,"El dato no se ha encontrado");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frmMenuPrincipal mp = new frmMenuPrincipal(null,null,null,null,ventas,null);
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistrarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frmRegistrarVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup btngTipoVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbId;
    private javax.swing.JLabel jlbMonto;
    private javax.swing.JLabel jlbTipoPago;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel jlbTitulo1;
    private javax.swing.JLabel jlbVenta;
    private javax.swing.JRadioButton jrbOpcion1;
    private javax.swing.JRadioButton jrbOpcion2;
    private javax.swing.JRadioButton jrbOpcion3;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfMonto;
    private javax.swing.JTextField jtfTipoPago;
    private javax.swing.JTextField jtfTitulo;
    // End of variables declaration//GEN-END:variables
}
