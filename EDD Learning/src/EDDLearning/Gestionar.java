
package EDDLearning;

import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;
import static EDDLearning.Main.tablausuarios;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Gestionar extends javax.swing.JFrame {

    public Usuario user;
    String header[]={"Nombre","Apellido", "Carnet","Password (SHA-256)"};
    String datos[][] = {};
    DefaultTableModel modelo = new DefaultTableModel(datos, header){
         public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
    
    public Gestionar() {
        initComponents();
        tusuarios.setModel(modelo);
        AgregarUsuarios();
        this.setTitle("EDD Learning | GESTIONAR USUARIOS - By Oscar Llamas");
        this.setLocationRelativeTo(null);
        txtNombre.setVisible(false);
        txtApellido.setVisible(false);
        txtpass.setVisible(false);
        lnombre.setVisible(false);
        lapellido.setVisible(false);
        lpass.setVisible(false);
        bguardar.setVisible(false);
        lguardar.setVisible(false);
        beliminar.setVisible(false);
        leliminar.setVisible(false);
        checkpass.setVisible(false);
    }

    
    public static String getHash(byte[] inputBytes, String algoritmo){
        String hashValue = "";
        try {
            MessageDigest md = MessageDigest.getInstance(algoritmo);
            md.update(inputBytes);
            byte[] db = md.digest();
            hashValue = DatatypeConverter.printHexBinary(db);
        } catch (Exception e) {
        }
            return hashValue;
        
    }

    private void AgregarUsuarios(){        
        for(int i = 0; i<tablausuarios.size; i++){
            if(tablausuarios.tabla[i]!=null){
            String nombre = tablausuarios.tabla[i].getNombre();
            String apellido = tablausuarios.tabla[i].getApellido();
            String carnet = tablausuarios.tabla[i].getCarnet();
            String pass = tablausuarios.tabla[i].getPass();
            String fila[] = {nombre, apellido, carnet, pass};
            modelo.addRow(fila);
            }
        }              
    }
    
    private Usuario getUsuario(int index){
        int x = 0;
        for(int i = 0; i<tablausuarios.size; i++){
            if(tablausuarios.tabla[i]!=null){
                if(x == index){
                    return tablausuarios.tabla[i];
                }
                x++;
            }
        }  
        return null;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        breportes = new javax.swing.JButton();
        lreportes = new javax.swing.JLabel();
        checkpass = new javax.swing.JCheckBox();
        beliminar = new javax.swing.JButton();
        leliminar = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        lpass = new javax.swing.JLabel();
        bguardar = new javax.swing.JButton();
        lguardar = new javax.swing.JLabel();
        lapellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lnombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        scrollusers = new javax.swing.JScrollPane();
        tusuarios = new javax.swing.JTable();
        lgoback = new javax.swing.JLabel();
        bsalir = new javax.swing.JButton();
        lmanageusers = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        breportes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        breportes.setForeground(new java.awt.Color(0, 0, 0));
        breportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reportes1.png"))); // NOI18N
        breportes.setBorder(null);
        breportes.setContentAreaFilled(false);
        breportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reportes2.png"))); // NOI18N
        breportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breportesActionPerformed(evt);
            }
        });
        getContentPane().add(breportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 70, 70));

        lreportes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lreportes.setForeground(new java.awt.Color(255, 255, 255));
        lreportes.setText("REPORTE");
        getContentPane().add(lreportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 70, 30));

        checkpass.setBackground(new java.awt.Color(0, 0, 0));
        checkpass.setForeground(new java.awt.Color(255, 255, 255));
        checkpass.setText("Mostrar contraseña.");
        checkpass.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkpassStateChanged(evt);
            }
        });
        checkpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkpassActionPerformed(evt);
            }
        });
        getContentPane().add(checkpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, -1, -1));

        beliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        beliminar.setForeground(new java.awt.Color(0, 0, 0));
        beliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar1.png"))); // NOI18N
        beliminar.setBorder(null);
        beliminar.setContentAreaFilled(false);
        beliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar2.png"))); // NOI18N
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });
        getContentPane().add(beliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 70, 70));

        leliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        leliminar.setForeground(new java.awt.Color(255, 255, 255));
        leliminar.setText("ELIMINAR");
        getContentPane().add(leliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 70, 30));

        txtpass.setBackground(new java.awt.Color(255, 255, 255));
        txtpass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtpass.setForeground(new java.awt.Color(0, 0, 0));
        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 250, 40));

        lpass.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lpass.setForeground(new java.awt.Color(255, 255, 255));
        lpass.setText("CONTRASEÑA:");
        getContentPane().add(lpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 140, 30));

        bguardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bguardar.setForeground(new java.awt.Color(0, 0, 0));
        bguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guardar1.png"))); // NOI18N
        bguardar.setBorder(null);
        bguardar.setContentAreaFilled(false);
        bguardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guardar2.png"))); // NOI18N
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });
        getContentPane().add(bguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 70, 70));

        lguardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lguardar.setForeground(new java.awt.Color(255, 255, 255));
        lguardar.setText("GUARDAR");
        getContentPane().add(lguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 70, 30));

        lapellido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lapellido.setForeground(new java.awt.Color(255, 255, 255));
        lapellido.setText("APELLIDO:");
        getContentPane().add(lapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 100, 30));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 250, 40));

        lnombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lnombre.setForeground(new java.awt.Color(255, 255, 255));
        lnombre.setText("NOMBRE:");
        getContentPane().add(lnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 100, 30));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 250, 40));

        scrollusers.setEnabled(false);

        tusuarios.setBackground(new java.awt.Color(255, 255, 255));
        tusuarios.setForeground(new java.awt.Color(0, 0, 0));
        tusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tusuariosMouseClicked(evt);
            }
        });
        scrollusers.setViewportView(tusuarios);

        getContentPane().add(scrollusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 870, 310));

        lgoback.setForeground(new java.awt.Color(255, 255, 255));
        lgoback.setText("GO BACK");
        getContentPane().add(lgoback, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, 60, 30));

        bsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gobackp1.png"))); // NOI18N
        bsalir.setBorder(null);
        bsalir.setBorderPainted(false);
        bsalir.setContentAreaFilled(false);
        bsalir.setFocusPainted(false);
        bsalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gobackp2.png"))); // NOI18N
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });
        getContentPane().add(bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 550, 50, 50));

        lmanageusers.setFont(new java.awt.Font("Dialog", 1, 56)); // NOI18N
        lmanageusers.setForeground(new java.awt.Color(255, 255, 255));
        lmanageusers.setText("GESTIONAR USUARIOS");
        getContentPane().add(lmanageusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padmin-wallpaper.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        PanelAdmin paneladmin = new PanelAdmin();
        paneladmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsalirActionPerformed

    private void tusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tusuariosMouseClicked
         if (evt.getClickCount() == 2) {     // to detect doble click events
              int i = tusuarios.getSelectedRow();
              Usuario aux = getUsuario(i);              
              if(aux!=null){
                user = aux;
                txtNombre.setVisible(true);
                txtApellido.setVisible(true);
                txtpass.setVisible(true);
                lnombre.setVisible(true);
                lapellido.setVisible(true);
                lpass.setVisible(true);
                bguardar.setVisible(true);
                lguardar.setVisible(true);
                beliminar.setVisible(true);
                leliminar.setVisible(true);
                checkpass.setVisible(true);
                txtNombre.setText(aux.getNombre());
                txtApellido.setText(aux.getApellido());
                txtpass.setText(aux.getPassDes());
              } else {
            txtNombre.setVisible(false);
            txtApellido.setVisible(false);
            txtpass.setVisible(false);
            lnombre.setVisible(false);
            lapellido.setVisible(false);
            lpass.setVisible(false);
            bguardar.setVisible(false);
            lguardar.setVisible(false);
            beliminar.setVisible(false);
            leliminar.setVisible(false);
            checkpass.setVisible(false);
            }                          
            }else {
            txtNombre.setVisible(false);
            txtApellido.setVisible(false);
            txtpass.setVisible(false);
            lnombre.setVisible(false);
            lapellido.setVisible(false);
            lpass.setVisible(false);
            bguardar.setVisible(false);
            lguardar.setVisible(false);
            beliminar.setVisible(false);
            leliminar.setVisible(false);
            checkpass.setVisible(false);
            }
    }//GEN-LAST:event_tusuariosMouseClicked

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void checkpassStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkpassStateChanged
        if(checkpass.isSelected()){
            txtpass.setEchoChar((char)0);
        }else{
            txtpass.setEchoChar('•');
        }
    }//GEN-LAST:event_checkpassStateChanged

    private void checkpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkpassActionPerformed

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed
        for(int i = 0; i<tablausuarios.size; i++){
            if(tablausuarios.tabla[i]!=null){
               if(tablausuarios.tabla[i].getCarnet().equals(user.getCarnet())){
                   tablausuarios.tabla[i] = null;                   
                   break;
               }
            }
        }
        tablausuarios.count--;
        tablausuarios.ReinsertarElementos();
        modelo.getDataVector().removeAllElements();
        modelo.fireTableDataChanged();
        AgregarUsuarios();
        tusuarios.validate();
        tusuarios.repaint();
        txtNombre.setVisible(false);
        txtApellido.setVisible(false);
        txtpass.setVisible(false);
        lnombre.setVisible(false);
        lapellido.setVisible(false);
        lpass.setVisible(false);
        bguardar.setVisible(false);
        lguardar.setVisible(false);
        beliminar.setVisible(false);
        leliminar.setVisible(false);
        checkpass.setVisible(false);
    }//GEN-LAST:event_beliminarActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
        if(!txtNombre.getText().equals("") && !txtApellido.getText().equals("") && !txtpass.getText().equals("")){
            if(txtpass.getText().length()>=8){
                user.setNombre(txtNombre.getText());
                user.setApellido(txtApellido.getText());
                user.setPassDes(txtpass.getText());
                user.setPass(getHash(txtpass.getText().getBytes(), "SHA-256"));
                modelo.getDataVector().removeAllElements();
                modelo.fireTableDataChanged();
                AgregarUsuarios();
                tusuarios.validate();
                tusuarios.repaint();
            } else {
                JOptionPane.showMessageDialog(this, "¡Nueva contraseña muy corta!"); 
            }
        }else {
            JOptionPane.showMessageDialog(this, "¡Hay campos vacios!"); 
        }
    }//GEN-LAST:event_bguardarActionPerformed

    private void breportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breportesActionPerformed
        tablausuarios.Graficar();
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Gestionar.class.getName()).log(Level.SEVERE, null, ex);
        }
        ReporteTablaHash reporte = new ReporteTablaHash(this, true);
        reporte.setVisible(true);
        reporte.revalidate();
        reporte.repaint();
    }//GEN-LAST:event_breportesActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beliminar;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton breportes;
    private javax.swing.JButton bsalir;
    private javax.swing.JCheckBox checkpass;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lapellido;
    private javax.swing.JLabel leliminar;
    private javax.swing.JLabel lgoback;
    private javax.swing.JLabel lguardar;
    private javax.swing.JLabel lmanageusers;
    private javax.swing.JLabel lnombre;
    private javax.swing.JLabel lpass;
    private javax.swing.JLabel lreportes;
    private javax.swing.JScrollPane scrollusers;
    private javax.swing.JTable tusuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
