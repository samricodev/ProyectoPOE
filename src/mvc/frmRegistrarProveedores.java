
package mvc;

import javax.swing.JOptionPane;

public class frmRegistrarProveedores extends javax.swing.JFrame {

   Proveedor provs;
    public frmRegistrarProveedores() {
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

        btngCategoria = new javax.swing.ButtonGroup();
        jlbTitulo = new javax.swing.JLabel();
        jlbId = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jlbCategoria = new javax.swing.JLabel();
        jlbProducto = new javax.swing.JLabel();
        jlbCobro = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jrbOpcion1 = new javax.swing.JRadioButton();
        jrbOpcion2 = new javax.swing.JRadioButton();
        jrbOpcion3 = new javax.swing.JRadioButton();
        jtfProductos = new javax.swing.JTextField();
        jtfCobro = new javax.swing.JTextField();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnBuscar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnLimpiar = new javax.swing.JButton();
        jbtnRegresar = new javax.swing.JButton();
        jlbMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proveedores");
        setResizable(false);

        jlbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText("Proveedores");

        jlbId.setText("ID:");

        jlbNombre.setText("Nombre:");

        jlbCategoria.setText("Categoria:");

        jlbProducto.setText("Producto:");

        jlbCobro.setText("Cobro:");

        btngCategoria.add(jrbOpcion1);
        jrbOpcion1.setText("Estándar");

        btngCategoria.add(jrbOpcion2);
        jrbOpcion2.setText("Media");
        jrbOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcion2ActionPerformed(evt);
            }
        });

        btngCategoria.add(jrbOpcion3);
        jrbOpcion3.setText("Premium");

        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });

        jbtnBuscar.setText("Buscar");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jbtnEditar.setText("Editar");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnRegresar.setText("Regresar");
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(jtfId)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlbCobro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfCobro)
                            .addComponent(jtfProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbtnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jbtnRegresar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jlbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jlbMensaje)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbId)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRegistrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbOpcion1)
                            .addComponent(jlbCategoria))
                        .addGap(6, 6, 6)
                        .addComponent(jrbOpcion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbOpcion3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbProducto)
                            .addComponent(jtfProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbCobro)
                            .addComponent(jtfCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jlbMensaje)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jbtnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnRegresar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(482, 428));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
        int id = Integer.parseInt(jtfId.getText());
        String nombre = jtfNombre.getText();
        String categoria = "";
        if(jrbOpcion1.isSelected()){
            categoria = "Estandar";
        } else if(jrbOpcion2.isSelected()){
            categoria = "Media";
        } else if(jrbOpcion3.isSelected()){
            categoria = "Premium";
        }
        String producto = jtfProductos.getText();
        float cobro = Integer.parseInt(jtfCobro.getText());
        Proveedor nuevo = new Proveedor(id,nombre,categoria,producto,cobro);
        
        //Validar Listas 
        if(provs == null){
            //se agrega el primer nodo a la lista 
            provs = nuevo;
        }else{
            //CREAR APUNTADOR AUXILIAR 
            Proveedor aux = provs;
            //Recorrer la lista 
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        
        JOptionPane.showMessageDialog(null, "Registro hecho");
        jtfId.setText(null);
        jtfNombre.setText(null);
        btngCategoria.clearSelection();
        jtfProductos.setText(null);
        jtfCobro.setText(null);
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void jrbOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOpcion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbOpcion2ActionPerformed

    private void jbtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarActionPerformed
        jtfId.setEditable(true);
        jtfId.setText(null);
        jtfNombre.setText(null);
        btngCategoria.clearSelection();
        jtfProductos.setText(null);
        jtfCobro.setText(null);
    }//GEN-LAST:event_jbtnLimpiarActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        Proveedor aux = provs;
        boolean encontrado = false;
        if(provs == null){
            JOptionPane.showMessageDialog(null, "Lista Vacía");
        } else {
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    jtfNombre.setText(aux.getNombre());
                    jtfProductos.setText(aux.getProductos());
                    jtfCobro.setText(String.valueOf(aux.getCobro()));
                    if(aux.getCategoria().equals("Estandar")){
                        jrbOpcion1.setSelected(true);
                    } else if(aux.getCategoria().equals("Media")){
                        jrbOpcion2.setSelected(true);
                    } else if(aux.getCategoria().equals("Premium")){
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
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        Proveedor aux = provs;
        boolean encontrado = false;
        if(provs == null){
            JOptionPane.showMessageDialog(null, "Lista Vacía");
        } else {
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    jtfId.setEditable(false);
                    aux.setNombre(jtfNombre.getText());
                    aux.setProductos(jtfProductos.getText());
                    aux.setCobro(Float.parseFloat(jtfCobro.getText()));
                    if(jrbOpcion1.isSelected()){
                        aux.setCategoria("Estandar");
                    } else if(jrbOpcion2.isSelected()){
                        aux.setCategoria("Media");
                    } else if(jrbOpcion3.isSelected()){
                        aux.setCategoria("Premium");
                    }
                        JOptionPane.showMessageDialog(null, "Proveedor con id " + aux.getId() + " ha sido actualizado");
                        jtfId.setEditable(true);
                        jtfId.setText(null);
                        jtfNombre.setText(null);
                        btngCategoria.clearSelection();
                        jtfProductos.setText(null);
                        jtfCobro.setText(null);
                        encontrado = true;
                        break;
                }
                    aux = aux.getSiguiente();
            }
                if(!encontrado){
                    JOptionPane.showMessageDialog(null,"El proveedor no se ha encontrado");
                }
        }
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        Proveedor aux = provs;
        Proveedor anteterior = null;
        boolean encontrado = false;
        if (provs == null){
            jlbMensaje.setText("La lista esta vacia");
        }else{
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId())) ){
                    if(anteterior != null){
                        //ELIMINANDO CUALQUIER NODO
                        anteterior.setSiguiente(aux.getSiguiente());
                    }else{
                        provs = aux.getSiguiente();
                    }
                    JOptionPane.showMessageDialog(null,"DATO ELIMINADO");
                    jtfId.setEditable(true);
                    jtfId.setText(null);
                    jtfNombre.setText(null);
                    btngCategoria.clearSelection();
                    jtfProductos.setText(null);
                    jtfCobro.setText(null);
                    encontrado = true;
                    break;
                }
                anteterior = aux;
                aux = aux.getSiguiente();
            }
            if(!encontrado){ 
                jlbMensaje.setText("El dato no se ha encontrado");
            }
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed
        frmMenuPrincipal mp = new frmMenuPrincipal(null,null,provs,null);
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistrarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrarProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngCategoria;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnLimpiar;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JLabel jlbCategoria;
    private javax.swing.JLabel jlbCobro;
    private javax.swing.JLabel jlbId;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbProducto;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JRadioButton jrbOpcion1;
    private javax.swing.JRadioButton jrbOpcion2;
    private javax.swing.JRadioButton jrbOpcion3;
    private javax.swing.JTextField jtfCobro;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfProductos;
    // End of variables declaration//GEN-END:variables
}
