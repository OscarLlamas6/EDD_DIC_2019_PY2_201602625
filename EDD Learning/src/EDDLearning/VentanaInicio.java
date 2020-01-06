package EDDLearning;

import static EDDLearning.Cargar.getHash;
import static EDDLearning.Main.tablausuarios;
import java.awt.event.KeyEvent;




public class VentanaInicio extends javax.swing.JFrame {

    String uadmin = "admin";
    String padmin = "admin";
    
    
    public VentanaInicio() {
        
        initComponents();
        this.setTitle("EDD Learning | LOGIN - By Oscar Llamas");
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lanuncio = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        bLogin = new javax.swing.JButton();
        lPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lHW = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lanuncio.setBackground(new java.awt.Color(0, 0, 0));
        lanuncio.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lanuncio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 180, 20));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Mostrar contraseña.");
        jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox1StateChanged(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, -1, -1));

        bLogin.setBackground(new java.awt.Color(255, 255, 255));
        bLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bLogin.setForeground(new java.awt.Color(0, 0, 0));
        bLogin.setText("INGRESAR");
        bLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bLogin.setRolloverEnabled(true);
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });
        getContentPane().add(bLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, 110, 50));

        lPass.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        lPass.setForeground(new java.awt.Color(255, 255, 255));
        lPass.setText("Contraseña:");
        getContentPane().add(lPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 220, 30));

        lID.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        lID.setForeground(new java.awt.Color(255, 255, 255));
        lID.setText("Carnet:");
        getContentPane().add(lID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 220, 30));

        lHW.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        lHW.setForeground(new java.awt.Color(255, 255, 255));
        lHW.setText("¡Hello World!");
        getContentPane().add(lHW, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login-wallpapaer.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox1StateChanged
       if(jCheckBox1.isSelected()){
          txtPass.setEchoChar((char)0);
        }else{
          txtPass.setEchoChar('•');  
        } 
    }//GEN-LAST:event_jCheckBox1StateChanged

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        lanuncio.setText("");
        if(!txtID.getText().equals("") && !txtPass.getText().equals("")){
            if(txtID.getText().equals(uadmin) && txtPass.getText().equals(padmin)){
                lanuncio.setText("");
                PanelAdmin padmin = new PanelAdmin();
                padmin.setVisible(true);
                this.dispose();
            } else if( isNumeric(txtID.getText().replaceAll("-", "")) && UsuarioExiste(txtID.getText().replaceAll("-", ""), txtPass.getText())!=null){
                
                PanelUsuario pusuario = new PanelUsuario(UsuarioExiste(txtID.getText().replaceAll("-", ""), txtPass.getText()));
                pusuario.setVisible(true);
                this.dispose();
            }  else {
               lanuncio.setText("Datos invalidos.!");
                this.repaint(); 
            }
           
        }else {
            lanuncio.setText("Hey campos vacios!");
            this.repaint();
        }
    }//GEN-LAST:event_bLoginActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
     
    }//GEN-LAST:event_txtIDKeyTyped

    public static boolean isNumeric(String str) {
    if (str == null) {
        return false;
    }
    int sz = str.length();
    for (int i = 0; i < sz; i++) {
        if (Character.isDigit(str.charAt(i)) == false) {
            return false;
        }
    }
    return true;
}
    
    public Usuario UsuarioExiste(String carnet, String pass){
        long clave = Long.parseLong(carnet);
        int direccion = (int)(clave%tablausuarios.size);
        while(direccion>tablausuarios.size-1){
          direccion = direccion - tablausuarios.size;
        }
         if(tablausuarios.tabla[direccion]==null){
            return null;
        } else {
            if(tablausuarios.tabla[direccion].getCarnet().equals(carnet) && tablausuarios.tabla[direccion].getPass().equals(getHash(pass.getBytes(), "SHA-256"))){
                return tablausuarios.tabla[direccion];
            }else {
               int i = 0;
               int aux = (int)(clave%7);
               direccion = (aux+1)*i;
               while(direccion>tablausuarios.size-1){
            direccion = direccion - tablausuarios.size;
            }
               while(direccion<tablausuarios.size){
                if(tablausuarios.tabla[direccion]==null){ return null;}
                if(tablausuarios.tabla[direccion].getCarnet().equals(carnet) && tablausuarios.tabla[direccion].getPass().equals(getHash(pass.getBytes(), "SHA-256"))){
                    return tablausuarios.tabla[direccion];
                }
                i++;
                direccion = (aux+1)*i;
                }
               return null;
            }
        }  
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLogin;
    private javax.swing.JLabel fondo;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel lHW;
    private javax.swing.JLabel lID;
    private javax.swing.JLabel lPass;
    private javax.swing.JLabel lanuncio;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
