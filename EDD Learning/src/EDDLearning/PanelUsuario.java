

package EDDLearning;

public class PanelUsuario extends javax.swing.JFrame {

    public String nombreaux;
    public String apellidoaux;
    public Usuario usuarioaux;
   
    public PanelUsuario(Usuario usuarioaux) {
        this.usuarioaux = usuarioaux;
        this.nombreaux = this.usuarioaux.getNombre();
        this.apellidoaux = this.usuarioaux.getApellido();
        initComponents();
        this.setTitle("EDD Learning | USUARIO - By Oscar Llamas");
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blogout = new javax.swing.JButton();
        llogout = new javax.swing.JLabel();
        bgraph = new javax.swing.JButton();
        lgraph = new javax.swing.JLabel();
        bavl = new javax.swing.JButton();
        lavl = new javax.swing.JLabel();
        lmenu = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(blogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 150, 200));

        llogout.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        llogout.setForeground(new java.awt.Color(255, 255, 255));
        llogout.setText("CERRAR SESION");
        getContentPane().add(llogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 160, 30));

        bgraph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graph1.png"))); // NOI18N
        bgraph.setBorder(null);
        bgraph.setBorderPainted(false);
        bgraph.setContentAreaFilled(false);
        bgraph.setFocusPainted(false);
        bgraph.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graph2.png"))); // NOI18N
        bgraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgraphActionPerformed(evt);
            }
        });
        getContentPane().add(bgraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 150, 200));

        lgraph.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lgraph.setForeground(new java.awt.Color(255, 255, 255));
        lgraph.setText("GRAFOS");
        getContentPane().add(lgraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 90, 30));

        bavl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/avl1.png"))); // NOI18N
        bavl.setBorder(null);
        bavl.setBorderPainted(false);
        bavl.setContentAreaFilled(false);
        bavl.setFocusPainted(false);
        bavl.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/avl2.png"))); // NOI18N
        bavl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bavlActionPerformed(evt);
            }
        });
        getContentPane().add(bavl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 150, 200));

        lavl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lavl.setForeground(new java.awt.Color(255, 255, 255));
        lavl.setText("ÁRBOLES AVL");
        getContentPane().add(lavl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 140, 30));

        lmenu.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lmenu.setForeground(new java.awt.Color(255, 255, 255));
        lmenu.setText("Bienvenid@: "+nombreaux+" "+apellidoaux);
        getContentPane().add(lmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padmin-wallpaper.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bavlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bavlActionPerformed
        CargarArbol c = new CargarArbol(this.usuarioaux);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bavlActionPerformed

    private void bgraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgraphActionPerformed
        CargarGrafo c = new CargarGrafo(this.usuarioaux);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bgraphActionPerformed

    private void blogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogoutActionPerformed
        if(usuarioaux.getApellido().equals("") && usuarioaux.getPass().equals("") && usuarioaux.getCarnet().equals("")){
            PanelAdmin pa = new PanelAdmin();
            pa.setVisible(true);
            this.dispose();
        } else {
           VentanaInicio inicio = new VentanaInicio();
        inicio.setVisible(true);
        this.dispose(); 
        }
        
        
    }//GEN-LAST:event_blogoutActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bavl;
    private javax.swing.JButton bgraph;
    private javax.swing.JButton blogout;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lavl;
    private javax.swing.JLabel lgraph;
    private javax.swing.JLabel llogout;
    public javax.swing.JLabel lmenu;
    // End of variables declaration//GEN-END:variables
}
