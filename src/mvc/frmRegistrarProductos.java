     

package mvc;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmRegistrarProductos extends javax.swing.JFrame {
    
    Producto product;

    public frmRegistrarProductos(Producto product) {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/licor-de-cafe.png"));
        setIconImage(icon);
        this.setLocationRelativeTo(null);
        product = null;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlbID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfNombreProducto = new javax.swing.JTextField();
        jtfContenido = new javax.swing.JTextField();
        jtfUnidades = new javax.swing.JTextField();
        jtfCosto = new javax.swing.JTextField();
        jlbCosto = new javax.swing.JLabel();
        jlbUnidades = new javax.swing.JLabel();
        jlbContenido = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setEnabled(false);

        jlbID.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jlbID.setForeground(new java.awt.Color(0, 204, 255));
        jlbID.setText("ID:");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("PRODUCTOS");

        jtfId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jtfNombreProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jtfContenido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jtfUnidades.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jtfCosto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jlbCosto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jlbCosto.setForeground(new java.awt.Color(0, 204, 255));
        jlbCosto.setText("COSTO:");

        jlbUnidades.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jlbUnidades.setForeground(new java.awt.Color(0, 204, 255));
        jlbUnidades.setText("UNIDADES:");

        jlbContenido.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jlbContenido.setForeground(new java.awt.Color(0, 204, 255));
        jlbContenido.setText("CONTENIDO:");

        jlbNombre.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jlbNombre.setForeground(new java.awt.Color(0, 204, 255));
        jlbNombre.setText("NOMBRE DEL PRODUCTO:");

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("/ml");

        btnRegistrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 204, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 204, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 204, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 51, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 51, 0));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regreso (2).png"))); // NOI18N
        btnRegresar.setText("Registrar");
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vino.png"))); // NOI18N

        btnLimpiar.setForeground(new java.awt.Color(0, 204, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escoba.png"))); // NOI18N
        btnLimpiar.setText(" Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbContenido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbCosto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlbNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditar)
                            .addComponent(btnBuscar)
                            .addComponent(btnRegistrar)
                            .addComponent(btnLimpiar)
                            .addComponent(btnEliminar))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbID)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbNombre)
                            .addComponent(jtfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbContenido)
                            .addComponent(jtfContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jlbUnidades)
                            .addComponent(jtfUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbCosto)
                            .addComponent(jtfCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        frmMenuPrincipal menu = new frmMenuPrincipal(null,product,null,null,null,null);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int id = Integer.parseInt(jtfId.getText());
        String nombre = jtfNombreProducto.getText();
        String contenido = jtfContenido.getText();
        int unidades = Integer.parseInt(jtfContenido.getText());
        float costo = Integer.parseInt(jtfCosto.getText());
        
        Producto nuevo = new Producto(id,nombre,contenido,unidades,costo);
        
        //VALIDAR LISTAS 
        if(product == null){
            //se agrega el primer nodo a la lista 
            product = nuevo;
        }else{
            //CREAR APUNTADOR AUXILIAR 
            Producto aux = product;
            //Recorrer la lista 
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        
        //jlbMensaje.setText("Registro hecho");
        JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO.");
        jtfId.setText(null);
        jtfContenido.setText(null);
        jtfCosto.setText(null);
        jtfNombreProducto.setText(null);
        jtfUnidades.setText(null);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Producto aux = product;
        boolean encontrado = false;
        if(product == null){
            JOptionPane.showMessageDialog(null, "PRODUCTO NO LOCALIZADO");
        } else{
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    jtfNombreProducto.setText(aux.getNombre());
                    jtfContenido.setText(String.valueOf(aux.getContenido()));
                    jtfUnidades.setText(String.valueOf(aux.getUnidades()));
                    jtfCosto.setText(String.valueOf(aux.getCosto()));
                    encontrado = true;
                    break;
                }
                aux = aux.getSiguiente();
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(null, "PRODUCTO NO LOCALIZADO.");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        Producto aux = product;
        boolean encontrado = false;
        if(product == null){
            JOptionPane.showMessageDialog(null, "PRODUCTO NO LOCALIZADO.");
        }else{
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    jtfId.setEditable(false);
                    aux.setContenido(jtfContenido.getText());
                    aux.setCosto(Float.parseFloat(jtfCosto.getText()));
                    aux.setNombre(jtfNombreProducto.getText());
                    aux.setUnidades(Integer.parseInt(jtfUnidades.getText()));
                    
                    JOptionPane.showMessageDialog(null, "El producto con ID: " + aux.getId() + " ha sido actualizado exitosamente");
                    jtfContenido.setText(null);
                    jtfCosto.setText(null);
                    jtfId.setText(null);
                    jtfNombreProducto.setText(null);
                    jtfUnidades.setText(null);
                    jtfId.setEditable(true);
                    encontrado = true;
                    break;
                }
                aux = aux.getSiguiente();
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(null, "PRODUCTO NO LOCALIZADO");
                
            }
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Producto aux = product;
        Producto anterior = null;
        boolean encontrado = false;
        int valor;
        if(product == null){
            JOptionPane.showMessageDialog(null, "PRODUCTO NO LOCALIZADO.");
        }else{
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    if(anterior !=null){
                        //ELIMINANDO CUALQUIER NODO 
                    anterior.setSiguiente(aux.getSiguiente()); 
                }else{
                    product = aux.getSiguiente();
                }
               JOptionPane.showMessageDialog(null, "EL PRODUCTO HA SIDO ELIMINADO CORRECTAMENTE.");
               encontrado = true;
               break;
            }
            anterior = aux;
            aux = aux.getSiguiente();
        }
        if(!encontrado){
            JOptionPane.showMessageDialog(null, "PRODUCTO NO LOCALIZADO");
        }
        }
        jtfContenido.setText(null);
        jtfCosto.setText(null);
        jtfId.setText(null);
        jtfNombreProducto.setText(null);
        jtfUnidades.setText(null);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        
        jtfContenido.setText(null);
        jtfCosto.setText(null);
        jtfId.setText(null);
        jtfNombreProducto.setText(null);
        jtfUnidades.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistrarProductos(null).setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbContenido;
    private javax.swing.JLabel jlbCosto;
    private javax.swing.JLabel jlbID;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbUnidades;
    private javax.swing.JTextField jtfContenido;
    private javax.swing.JTextField jtfCosto;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNombreProducto;
    private javax.swing.JTextField jtfUnidades;
    // End of variables declaration//GEN-END:variables
}
