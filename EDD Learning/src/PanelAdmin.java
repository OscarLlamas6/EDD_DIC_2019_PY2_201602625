
public class PanelAdmin extends javax.swing.JFrame {

    public PanelAdmin() {
        initComponents();
        this.setTitle("EDD Learning | ADMIN - By Oscar Llamas");
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        llogout = new javax.swing.JLabel();
        blogout = new javax.swing.JButton();
        lgestionar = new javax.swing.JLabel();
        bgestionar = new javax.swing.JButton();
        lcargarusuarios = new javax.swing.JLabel();
        lcargar = new javax.swing.JButton();
        lmenu = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        llogout.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        llogout.setForeground(new java.awt.Color(255, 255, 255));
        llogout.setText("LOGOUT");
        getContentPane().add(llogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 80, 30));

        blogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout1.png"))); // NOI18N
        blogout.setBorder(null);
        blogout.setBorderPainted(false);
        blogout.setContentAreaFilled(false);
        blogout.setFocusPainted(false);
        blogout.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout2.png"))); // NOI18N
        blogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogoutActionPerformed(evt);
            }
        });
        getContentPane().add(blogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 150, 200));

        lgestionar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lgestionar.setForeground(new java.awt.Color(255, 255, 255));
        lgestionar.setText("MANAGE USERS");
        getContentPane().add(lgestionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 150, 30));

        bgestionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gestionar1.png"))); // NOI18N
        bgestionar.setBorder(null);
        bgestionar.setBorderPainted(false);
        bgestionar.setContentAreaFilled(false);
        bgestionar.setFocusPainted(false);
        bgestionar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gestionar2.png"))); // NOI18N
        getContentPane().add(bgestionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 150, 200));

        lcargarusuarios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lcargarusuarios.setForeground(new java.awt.Color(255, 255, 255));
        lcargarusuarios.setText("LOAD USERS");
        getContentPane().add(lcargarusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 130, 30));

        lcargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cargar1.png"))); // NOI18N
        lcargar.setBorder(null);
        lcargar.setBorderPainted(false);
        lcargar.setContentAreaFilled(false);
        lcargar.setFocusPainted(false);
        lcargar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cargar2.png"))); // NOI18N
        lcargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcargarActionPerformed(evt);
            }
        });
        getContentPane().add(lcargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 150, 200));

        lmenu.setFont(new java.awt.Font("Dialog", 1, 56)); // NOI18N
        lmenu.setForeground(new java.awt.Color(255, 255, 255));
        lmenu.setText("MENU");
        getContentPane().add(lmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padmin-wallpaper.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void blogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogoutActionPerformed
        VentanaInicio inicio = new VentanaInicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_blogoutActionPerformed

    private void lcargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcargarActionPerformed
        Cargar cargar = new Cargar();
        cargar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lcargarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bgestionar;
    private javax.swing.JButton blogout;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton lcargar;
    private javax.swing.JLabel lcargarusuarios;
    private javax.swing.JLabel lgestionar;
    private javax.swing.JLabel llogout;
    private javax.swing.JLabel lmenu;
    // End of variables declaration//GEN-END:variables
}
