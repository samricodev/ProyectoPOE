
package mvc;

import java.awt.Color;
import javax.swing.UIManager;

public class frmRegistrarSucursal extends javax.swing.JFrame {

    Sucursal suc;
    
    public frmRegistrarSucursal(Sucursal suc) {
        initComponents();
        suc = null;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngTipo = new javax.swing.ButtonGroup();
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
        jlbMensaje = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        bntRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sucursales");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jlbId.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jlbId.setForeground(new java.awt.Color(0, 204, 255));
        jlbId.setText("ID");

        jlbLoicalidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jlbLoicalidad.setForeground(new java.awt.Color(0, 204, 255));
        jlbLoicalidad.setText("LOCALIDAD");

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

        jlbVentas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jlbVentas.setForeground(new java.awt.Color(0, 204, 255));
        jlbVentas.setText("VENTAS");

        jlbMensaje.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        jlbMensaje.setForeground(new java.awt.Color(0, 204, 255));
        jlbMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbMensaje.setText("Ingrese los datos datos correspondientes");

        btnRegistrar.setForeground(new java.awt.Color(0, 204, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRegistrar)
                                    .addComponent(btnBuscar)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnEditar)
                                            .addComponent(bntRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jlbCapacidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jcbTipo1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbTipo2))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(jlbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jcbTipo3)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jlbId, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(jlbLoicalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbLoicalidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbTipo1)
                            .addComponent(jcbTipo2)
                            .addComponent(jcbTipo3))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(41, 41, 41)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntRegresar))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(552, 412));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegresarActionPerformed
        frmMenuPrincipal back = new frmMenuPrincipal(suc);
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
            jlbMensaje.setText("NINGUNO OPCION SELECCIONADA");
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
        
        jlbMensaje.setText("Registro hecho");
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
            jlbMensaje.setText("La lista esta vacia");
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
                jlbMensaje.setText("El dato no se ha encontrado");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        Sucursal aux = suc;
        boolean encontrado = false;
        if(suc == null){
            jlbMensaje.setText("La lista esta vacia");
        } else{
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    jtfId.setEditable(false);
                    aux.setLocalidad(jtfLocalidad.getText());
                    aux.setCapacidad(Integer.parseInt(jtfCapacidad.getText()));
                    aux.setVentas_prom(Integer.parseInt(jtfCapacidad.getText()));
                    if(aux.getTipo() == 1){
                        jcbTipo1.setSelected(true);
                    } else if(aux.getTipo() == 2){
                        jcbTipo2.setSelected(true);
                    } else if(aux.getTipo() == 3){
                        jcbTipo3.setSelected(true);
                    }
                    jlbMensaje.setText("La sucursal con Id " + aux.getId() + " ha sido actualizada");
                    encontrado = true;
                    break;
                }
                aux = aux.getSiguiente();
            }
            if(!encontrado){
                jlbMensaje.setText("La sucursal no se ha encontrado");
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Sucursal aux = suc;
        Sucursal anteterior = null;
        boolean encontrado = false;
        if (suc == null){
            jlbMensaje.setText("La lista esta vacia");
        }else{
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId())) ){
                    if(anteterior != null){
                        //ELIMINANDO CUALQUIER NODO
                        anteterior.setSiguiente(aux.getSiguiente());
                    }else{
                        suc = aux.getSiguiente();
                    }
                    jlbMensaje.setText("DATO ELIMINADO");
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
        jtfId.setText(null);
        jtfLocalidad.setText(null);
        jtfVentas.setText(null);
        jtfCapacidad.setText(null);
        btngTipo.clearSelection();
    }//GEN-LAST:event_btnEliminarActionPerformed

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
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup btngTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
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
