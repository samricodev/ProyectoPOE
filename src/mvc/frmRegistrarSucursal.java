
package mvc;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class frmRegistrarSucursal extends javax.swing.JFrame {

    Sucursal suc;
    
    public frmRegistrarSucursal(Sucursal suc) {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/mercado-.png"));
        setIconImage(icon);
        suc = null;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngTipo = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlbId = new javax.swing.JLabel();
        jlbLoicalidad = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfLocalidad = new javax.swing.JTextField();
        jcbTipo2 = new javax.swing.JCheckBox();
        jcbTipo3 = new javax.swing.JCheckBox();
        jcbTipo1 = new javax.swing.JCheckBox();
        jlbTipo = new javax.swing.JLabel();
        jlbCapacidad = new javax.swing.JLabel();
        jtfCapacidad = new javax.swing.JTextField();
        jtfVentas = new javax.swing.JTextField();
        jlbVentas = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        bntRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sucursales");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setEnabled(false);

        jlbId.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jlbId.setForeground(new java.awt.Color(0, 204, 255));
        jlbId.setText("ID");

        jlbLoicalidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jlbLoicalidad.setForeground(new java.awt.Color(0, 204, 255));
        jlbLoicalidad.setText("LOCALIDAD");

        jtfId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jtfLocalidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jcbTipo2.setBackground(new java.awt.Color(204, 204, 255));
        btngTipo.add(jcbTipo2);
        jcbTipo2.setForeground(new java.awt.Color(0, 204, 255));
        jcbTipo2.setText("Tipo 2");
        jcbTipo2.setFocusPainted(false);
        jcbTipo2.setOpaque(false);

        jcbTipo3.setBackground(new java.awt.Color(204, 204, 255));
        btngTipo.add(jcbTipo3);
        jcbTipo3.setForeground(new java.awt.Color(0, 204, 255));
        jcbTipo3.setText("Tipo 3 ");
        jcbTipo3.setFocusPainted(false);
        jcbTipo3.setOpaque(false);

        btngTipo.add(jcbTipo1);
        jcbTipo1.setForeground(new java.awt.Color(0, 204, 255));
        jcbTipo1.setText("Tipo 1");
        jcbTipo1.setFocusPainted(false);
        jcbTipo1.setOpaque(false);

        jlbTipo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jlbTipo.setForeground(new java.awt.Color(0, 204, 255));
        jlbTipo.setText("TIPO");

        jlbCapacidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jlbCapacidad.setForeground(new java.awt.Color(0, 204, 255));
        jlbCapacidad.setText("CAPACIDAD");

        jtfCapacidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jtfVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jlbVentas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jlbVentas.setForeground(new java.awt.Color(0, 204, 255));
        jlbVentas.setText("VENTAS");

        btnRegistrar.setForeground(new java.awt.Color(0, 204, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        bntRegresar.setForeground(new java.awt.Color(255, 102, 51));
        bntRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regreso (2).png"))); // NOI18N
        bntRegresar.setText("Regresar");
        bntRegresar.setContentAreaFilled(false);
        bntRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntRegresar.setFocusPainted(false);
        bntRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("SUCURSALES");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mercado.png"))); // NOI18N

        btnBuscar.setForeground(new java.awt.Color(0, 204, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setForeground(new java.awt.Color(0, 204, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnEditar.setText(" Editar");
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setForeground(new java.awt.Color(255, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setForeground(new java.awt.Color(0, 204, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escoba.png"))); // NOI18N
        btnLimpiar.setText(" Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jlbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jlbLoicalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jlbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcbTipo1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcbTipo2)
                            .addGap(10, 10, 10)
                            .addComponent(jcbTipo3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntRegresar)
                        .addGap(283, 283, 283)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnBuscar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar)
                            .addComponent(btnEditar))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(76, 76, 76))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(85, 85, 85)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnRegistrar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEditar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLimpiar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(220, 220, 220)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnEliminar)
                                        .addComponent(bntRegresar))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(jlbId)
                                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbLoicalidad)
                                    .addComponent(jtfLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlbTipo)
                                    .addComponent(jcbTipo1)
                                    .addComponent(jcbTipo2)
                                    .addComponent(jcbTipo3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                    .addComponent(jlbCapacidad)
                                    .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbVentas)
                                    .addComponent(jtfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)))
                        .addGap(34, 34, 34)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(592, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegresarActionPerformed
        frmMenuPrincipal back = new frmMenuPrincipal(suc,null,null,null,null,null);
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bntRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int id = Integer.parseInt(jtfId.getText());
        String localidad = jtfLocalidad.getText();
        int tipo = 0;
        int capacidad = Integer.parseInt(jtfCapacidad.getText());
        float ventas_prom = Integer.parseInt(jtfVentas.getText());
        
        //EVALUAR 
        if(jcbTipo1.isSelected()){
            tipo = 1;
        }else if(jcbTipo2.isSelected()){
            tipo = 2;
        }else if(jcbTipo3.isSelected()){
            tipo = 3;
        } else {

            JOptionPane.showMessageDialog(null, "NINGUNO OPCION SELECCIONADA");

        }
        
        //Pasamos los argumentos 
        Sucursal nueva = new Sucursal(id,localidad,tipo,capacidad,ventas_prom);
        
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
        
//        jlbMensaje.setText("Registro hecho");
          JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO.");
        jtfId.setText(null);
        jtfLocalidad.setText(null);
        jtfVentas.setText(null);
        jtfCapacidad.setText(null);
        btngTipo.clearSelection();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Sucursal aux = suc;
        boolean encontrado = false;
        if(suc == null){

//            jlbMensaje.setForeground(Color.orange);
  //          jlbMensaje.setText("La lista esta vacia");
               JOptionPane.showMessageDialog(null, "SUCURSAL NO LOCALIZADA");

        } else{
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    jtfLocalidad.setText(aux.getLocalidad());
                    jtfCapacidad.setText(String.valueOf(aux.getCapacidad()));
                    jtfVentas.setText(String.valueOf(aux.getVentas_prom()));
                    if(aux.getTipo() == 1){
                        jcbTipo1.setSelected(true);
                    } else if(aux.getTipo() == 2){
                        jcbTipo2.setSelected(true);
                    } else if(aux.getTipo() == 3){
                        jcbTipo3.setSelected(true);
                    }
                    encontrado = true;
                    break;
                }
                aux = aux.getSiguiente();
            }
            if(!encontrado){

//                jlbMensaje.setForeground(Color.orange);
  //              jlbMensaje.setText("El dato no se ha encontrado");
                  JOptionPane.showMessageDialog(null, "SUCURSAL NO LOCALIZADA");

            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        Sucursal aux = suc;
        boolean encontrado = false;
        if(suc == null){


            JOptionPane.showMessageDialog(null, "LISTA VACIA");

        } else{
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    jtfId.setEditable(false);
                    aux.setLocalidad(jtfLocalidad.getText());
                    aux.setCapacidad(Integer.parseInt(jtfCapacidad.getText()));
                    aux.setVentas_prom(Float.parseFloat(jtfVentas.getText()));
                    
                    if(jcbTipo1.isSelected()){
                        aux.setTipo(1);
                    }else if(jcbTipo2.isSelected()){
                        aux.setTipo(2);
                    }else if(jcbTipo3.isSelected()){
                        aux.setTipo(3);
                    }

                    JOptionPane.showMessageDialog(null,"La sucursal con Id " + aux.getId() + " ha sido actualizada");
                    jtfId.setText(null);
                    jtfLocalidad.setText(null);
                    jtfVentas.setText(null);
                    jtfCapacidad.setText(null);
                    btngTipo.clearSelection();

                    encontrado = true;
                    break;
                }
                aux = aux.getSiguiente();
            }
                if(!encontrado){

                       JOptionPane.showMessageDialog(null, "SUCURSAL NO LOCALIZADA");

                }

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        Sucursal aux = suc;
        Sucursal anteterior = null;
        boolean encontrado = false;
        if (suc == null){

            JOptionPane.showMessageDialog(null, "LISTA VACIA");

        }else{
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId())) ){
                    if(anteterior != null){
                        //ELIMINANDO CUALQUIER NODO
                        anteterior.setSiguiente(aux.getSiguiente());
                    }else{
                        suc = aux.getSiguiente();
                    }

                       JOptionPane.showMessageDialog(null, "LA SUCURSAL HA SIDO ELIMINADA CORRECTAMENTE.");

                    encontrado = true;
                    break;
                }
                anteterior = aux;
                aux = aux.getSiguiente();
            }
            if(!encontrado){ 

                  JOptionPane.showMessageDialog(null, "SUCURSAL NO LOCALIZADA");

            }
        }
        jtfId.setText(null);
        jtfLocalidad.setText(null);
        jtfVentas.setText(null);
        jtfCapacidad.setText(null);
        btngTipo.clearSelection();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        jtfId.setText("");
        jtfCapacidad.setText("");
        jtfLocalidad.setText("");
        jtfVentas.setText("");
        this.jcbTipo1.setSelected(false);
        this.jcbTipo2.setSelected(false);
        this.jcbTipo3.setSelected(false);
        jtfId.setEditable(true);
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
                new frmRegistrarSucursal(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRegresar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup btngTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcbTipo1;
    private javax.swing.JCheckBox jcbTipo2;
    private javax.swing.JCheckBox jcbTipo3;
    private javax.swing.JLabel jlbCapacidad;
    private javax.swing.JLabel jlbId;
    private javax.swing.JLabel jlbLoicalidad;
    private javax.swing.JLabel jlbTipo;
    private javax.swing.JLabel jlbVentas;
    private javax.swing.JTextField jtfCapacidad;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfLocalidad;
    private javax.swing.JTextField jtfVentas;
    // End of variables declaration//GEN-END:variables
}
