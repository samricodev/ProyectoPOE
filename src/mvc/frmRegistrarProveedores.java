
package mvc;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmRegistrarProveedores extends javax.swing.JFrame {

   Proveedor provs;
    public frmRegistrarProveedores() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/car-.png"));
        setIconImage(icon);
        this.setLocationRelativeTo(null);
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
        jlbMensaje = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jrbOpcion3 = new javax.swing.JRadioButton();
        jlbTitulo = new javax.swing.JLabel();
        jtfProductos = new javax.swing.JTextField();
        jlbId = new javax.swing.JLabel();
        jtfCobro = new javax.swing.JTextField();
        jlbNombre = new javax.swing.JLabel();
        jbtnRegistrar = new javax.swing.JButton();
        jlbCategoria = new javax.swing.JLabel();
        jbtnBuscar = new javax.swing.JButton();
        jlbProducto = new javax.swing.JLabel();
        jbtnEditar = new javax.swing.JButton();
        jlbCobro = new javax.swing.JLabel();
        jbtnEliminar = new javax.swing.JButton();
        jtfId = new javax.swing.JTextField();
        jbtnLimpiar = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jbtnRegresar = new javax.swing.JButton();
        jrbOpcion1 = new javax.swing.JRadioButton();
        jrbOpcion2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proveedores");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btngCategoria.add(jrbOpcion3);
        jrbOpcion3.setForeground(new java.awt.Color(0, 204, 255));
        jrbOpcion3.setText("Premium");
        jrbOpcion3.setContentAreaFilled(false);

        jlbTitulo.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 48)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(0, 204, 255));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText("Proveedores");

        jlbId.setForeground(new java.awt.Color(0, 204, 255));
        jlbId.setText("ID:");

        jlbNombre.setForeground(new java.awt.Color(0, 204, 255));
        jlbNombre.setText("NOMBRE:");

        jbtnRegistrar.setForeground(new java.awt.Color(0, 204, 255));
        jbtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        jbtnRegistrar.setText("Registrar");
        jbtnRegistrar.setContentAreaFilled(false);
        jbtnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });

        jlbCategoria.setForeground(new java.awt.Color(0, 204, 255));
        jlbCategoria.setText("CATEGORIA:");

        jbtnBuscar.setForeground(new java.awt.Color(0, 204, 255));
        jbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        jbtnBuscar.setText("Buscar");
        jbtnBuscar.setContentAreaFilled(false);
        jbtnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jlbProducto.setForeground(new java.awt.Color(0, 204, 255));
        jlbProducto.setText("PRODUCTO:");

        jbtnEditar.setForeground(new java.awt.Color(0, 204, 255));
        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jbtnEditar.setText("Editar");
        jbtnEditar.setContentAreaFilled(false);
        jbtnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jlbCobro.setForeground(new java.awt.Color(0, 204, 255));
        jlbCobro.setText("COBRO:");

        jbtnEliminar.setForeground(new java.awt.Color(255, 51, 0));
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setContentAreaFilled(false);
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnLimpiar.setForeground(new java.awt.Color(0, 204, 255));
        jbtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escoba.png"))); // NOI18N
        jbtnLimpiar.setText("Limpiar");
        jbtnLimpiar.setContentAreaFilled(false);
        jbtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarActionPerformed(evt);
            }
        });

        jbtnRegresar.setForeground(new java.awt.Color(255, 51, 0));
        jbtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regreso (2).png"))); // NOI18N
        jbtnRegresar.setText("Regresar");
        jbtnRegresar.setContentAreaFilled(false);
        jbtnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });

        btngCategoria.add(jrbOpcion1);
        jrbOpcion1.setForeground(new java.awt.Color(0, 204, 255));
        jrbOpcion1.setText("Est??ndar");
        jrbOpcion1.setContentAreaFilled(false);

        btngCategoria.add(jrbOpcion2);
        jrbOpcion2.setForeground(new java.awt.Color(0, 204, 255));
        jrbOpcion2.setText("Media");
        jrbOpcion2.setContentAreaFilled(false);
        jrbOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcion2ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camion-de-reparto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlbCobro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlbProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfCobro)
                                    .addComponent(jtfProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jbtnRegresar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfNombre)
                                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jlbTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnEditar)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbId)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbNombre)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbCategoria)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jrbOpcion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbOpcion2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbOpcion3)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbProducto)
                            .addComponent(jtfProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbCobro)
                            .addComponent(jtfCobro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbtnRegresar)))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jlbMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbMensaje)
                .addGap(19, 19, 19))
        );

        setSize(new java.awt.Dimension(493, 530));
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
            JOptionPane.showMessageDialog(null, "Lista Vac??a");
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
            JOptionPane.showMessageDialog(null, "Lista Vac??a");
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
        frmMenuPrincipal mp = new frmMenuPrincipal(null,null,provs,null,null,null);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
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
