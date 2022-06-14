//lazaro prueba commit  
package mvc;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmRegistrarClientes extends javax.swing.JFrame {

    Cliente clientes;
    
    public frmRegistrarClientes() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/customer-.png"));
        setIconImage(icon);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngTipoCliente = new javax.swing.ButtonGroup();
        btngIncidentes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jcbNo = new javax.swing.JCheckBox();
        jlbCompras = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jlbIncidentes = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jtfId = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jtfCompras = new javax.swing.JTextField();
        rbnMinorista = new javax.swing.JRadioButton();
        rbnMayorista = new javax.swing.JRadioButton();
        jbnRegistrar = new javax.swing.JButton();
        jlbCliente = new javax.swing.JLabel();
        jbnRegresar = new javax.swing.JButton();
        jlbNombreCliente = new javax.swing.JLabel();
        jcbSi = new javax.swing.JCheckBox();
        jlbTipo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btngIncidentes.add(jcbNo);
        jcbNo.setForeground(new java.awt.Color(0, 204, 255));
        jcbNo.setText("No");
        jcbNo.setContentAreaFilled(false);

        jlbCompras.setForeground(new java.awt.Color(0, 204, 255));
        jlbCompras.setText("Compras cliente:");

        btnEditar.setForeground(new java.awt.Color(0, 204, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setContentAreaFilled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jlbIncidentes.setForeground(new java.awt.Color(0, 204, 255));
        jlbIncidentes.setText("Incidentes cliente:");

        btnBuscar.setForeground(new java.awt.Color(0, 204, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setForeground(new java.awt.Color(255, 51, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setForeground(new java.awt.Color(0, 204, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escoba.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btngTipoCliente.add(rbnMinorista);
        rbnMinorista.setForeground(new java.awt.Color(0, 204, 255));
        rbnMinorista.setText("Minorista");
        rbnMinorista.setContentAreaFilled(false);

        btngTipoCliente.add(rbnMayorista);
        rbnMayorista.setForeground(new java.awt.Color(0, 204, 255));
        rbnMayorista.setText("Mayorista");
        rbnMayorista.setContentAreaFilled(false);

        jbnRegistrar.setForeground(new java.awt.Color(0, 204, 255));
        jbnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        jbnRegistrar.setText("Registrar");
        jbnRegistrar.setContentAreaFilled(false);
        jbnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegistrarActionPerformed(evt);
            }
        });

        jlbCliente.setForeground(new java.awt.Color(0, 204, 255));
        jlbCliente.setText("Id cliente:");

        jbnRegresar.setForeground(new java.awt.Color(255, 51, 0));
        jbnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regreso (2).png"))); // NOI18N
        jbnRegresar.setText("Regresar");
        jbnRegresar.setContentAreaFilled(false);
        jbnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegresarActionPerformed(evt);
            }
        });

        jlbNombreCliente.setForeground(new java.awt.Color(0, 204, 255));
        jlbNombreCliente.setText("Nombre cliente:");

        btngIncidentes.add(jcbSi);
        jcbSi.setForeground(new java.awt.Color(0, 204, 255));
        jcbSi.setText("Si");
        jcbSi.setContentAreaFilled(false);

        jlbTipo.setForeground(new java.awt.Color(0, 204, 255));
        jlbTipo.setText("Tipo cliente:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/customer.png"))); // NOI18N

        jlbTitulo.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 48)); // NOI18N
        jlbTitulo.setForeground(new java.awt.Color(0, 204, 255));
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText("Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbTitulo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbnRegresar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jlbTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlbNombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jlbCompras))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(jtfCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(rbnMinorista)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbnMayorista))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jlbIncidentes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jcbSi)
                                    .addGap(32, 32, 32)
                                    .addComponent(jcbNo)))
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbCliente)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbNombreCliente)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbTipo)
                            .addComponent(rbnMinorista)
                            .addComponent(rbnMayorista))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbCompras)
                            .addComponent(jtfCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(jlbIncidentes)
                    .addComponent(jcbSi)
                    .addComponent(jcbNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(jbnRegresar))
                .addContainerGap(30, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(473, 455));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
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
