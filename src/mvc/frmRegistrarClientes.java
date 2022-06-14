//lazaro prueba commit  
package mvc;

import javax.swing.JOptionPane;

public class frmRegistrarClientes extends javax.swing.JFrame {

    Cliente clientes;
    
    public frmRegistrarClientes() {
        initComponents();
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
        jtfId = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jtfCompras = new javax.swing.JTextField();
        rbnMinorista = new javax.swing.JRadioButton();
        rbnMayorista = new javax.swing.JRadioButton();
        jbnRegistrar = new javax.swing.JButton();
        jbnRegresar = new javax.swing.JButton();
        jcbSi = new javax.swing.JCheckBox();
        jcbNo = new javax.swing.JCheckBox();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");
        setResizable(false);

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

        btngIncidentes.add(jcbSi);
        jcbSi.setText("Si");

        btngIncidentes.add(jcbNo);
        jcbNo.setText("No");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jlbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbIncidentes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbSi)
                                .addGap(18, 18, 18)
                                .addComponent(jcbNo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jlbTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlbNombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                    .addComponent(jlbCompras))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(rbnMinorista)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbnMayorista))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jtfCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbnRegresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jbnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTitulo)
                    .addComponent(jbnRegistrar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbCliente)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbNombreCliente)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbTipo)
                            .addComponent(rbnMinorista)
                            .addComponent(rbnMayorista))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbCompras)
                            .addComponent(jtfCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbIncidentes)
                            .addComponent(jcbSi)
                            .addComponent(jcbNo))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnBuscar)
                        .addGap(34, 34, 34)
                        .addComponent(btnEditar)
                        .addGap(40, 40, 40)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)))
                .addComponent(jbnRegresar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(589, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegresarActionPerformed
        frmMenuPrincipal back = new frmMenuPrincipal(null,null,null,null,null,clientes);
        back.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbnRegresarActionPerformed

    private void jbnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegistrarActionPerformed
        int id = Integer.parseInt(jtfId.getText());
        String nombre = jtfNombre.getText();
        int compras = Integer.parseInt(jtfCompras.getText());
        String tipoCliente = "";
        boolean incidentes = false;
        if(rbnMinorista.isSelected()){
            tipoCliente = "minorista";
        } else if(rbnMayorista.isSelected()){
            tipoCliente = "mayorista";
        }
        if(jcbSi.isSelected()){
            incidentes = true;
        } else if(jcbNo.isSelected()){
            incidentes = false;
        }
        
        Cliente nuevo = new Cliente(id,nombre,tipoCliente,compras,incidentes);
        //Validar Listas 
        if( clientes == null){
            //se agrega el primer nodo a la lista 
             clientes = nuevo;
        }else{
            //CREAR APUNTADOR AUXILIAR 
            Cliente aux =  clientes;
            //Recorrer la lista 
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        
        JOptionPane.showMessageDialog(null,"Registro hecho");
        jtfId.setText(null);
        jtfCompras.setText(null);
        jtfNombre.setText(null);
        btngTipoCliente.clearSelection();
        btngIncidentes.clearSelection();
    }//GEN-LAST:event_jbnRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Cliente aux = clientes;
        boolean encontrado = false;
        if(clientes == null){
            JOptionPane.showMessageDialog(null, "Lista Vacía");
        } else {
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    jtfNombre.setText(aux.getNombre());
                    jtfCompras.setText(String.valueOf(aux.getCompras()));
                    if(aux.getTipo().equals("minorista")){
                        rbnMinorista.setSelected(true);
                    } else if(aux.getTipo().equals("mayorista")){
                        rbnMayorista.setSelected(true);
                    } 
                    if(aux.getIncidentes() == true){
                        jcbSi.setSelected(true);
                    } else if(aux.getIncidentes() == false){
                        jcbNo.setSelected(true);
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jtfId.setEditable(true);
        jtfId.setText(null);
        jtfCompras.setText(null);
        jtfNombre.setText(null);
        btngTipoCliente.clearSelection();
        btngIncidentes.clearSelection();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Cliente aux = clientes;
        boolean encontrado = false;
        if(clientes == null){
            JOptionPane.showMessageDialog(null, "Lista Vacía");
        } else {
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId()))){
                    aux.setNombre(jtfNombre.getText());
                    aux.setCompras(Integer.parseInt(jtfCompras.getText()));
                    if(rbnMinorista.isSelected()){
                        aux.setTipo("minorista");
                    } else if(rbnMayorista.isSelected()){
                        aux.setTipo("mayorista");
                    }
                    if(jcbSi.isSelected()){
                        aux.setIncidentes(true);
                    } else if(jcbNo.isSelected()){
                        aux.setIncidentes(false);
                    }
                        JOptionPane.showMessageDialog(null, "Cliente con id " + aux.getId() + " ha sido actualizado");
                        jtfId.setEditable(true);
                        jtfId.setText(null);
                        jtfCompras.setText(null);
                        jtfNombre.setText(null);
                        btngTipoCliente.clearSelection();
                        btngIncidentes.clearSelection();
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Cliente aux = clientes;
        Cliente anteterior = null;
        boolean encontrado = false;
        if (clientes == null){
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }else{
            while(aux != null){
                if(jtfId.getText().equals(String.valueOf(aux.getId())) ){
                    if(anteterior != null){
                        //ELIMINANDO CUALQUIER NODO
                        anteterior.setSiguiente(aux.getSiguiente());
                    }else{
                        clientes = aux.getSiguiente();
                    }
                    JOptionPane.showMessageDialog(null,"DATO ELIMINADO");
                    jtfId.setEditable(true);
                    jtfId.setText(null);
                    jtfCompras.setText(null);
                    jtfNombre.setText(null);
                    btngTipoCliente.clearSelection();
                    btngIncidentes.clearSelection();
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup btngIncidentes;
    private javax.swing.ButtonGroup btngTipoCliente;
    private javax.swing.JButton jbnRegistrar;
    private javax.swing.JButton jbnRegresar;
    private javax.swing.JCheckBox jcbNo;
    private javax.swing.JCheckBox jcbSi;
    private javax.swing.JLabel jlbCliente;
    private javax.swing.JLabel jlbCompras;
    private javax.swing.JLabel jlbIncidentes;
    private javax.swing.JLabel jlbNombreCliente;
    private javax.swing.JLabel jlbTipo;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JTextField jtfCompras;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JRadioButton rbnMayorista;
    private javax.swing.JRadioButton rbnMinorista;
    // End of variables declaration//GEN-END:variables
}
