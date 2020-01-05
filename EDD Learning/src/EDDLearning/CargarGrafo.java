
package EDDLearning;

import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class CargarGrafo extends javax.swing.JFrame {

    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .JSON", "json");
    public Boolean permitir = false;
    public String patch="";
    public Usuario useraux;
    public JSONObject jSONObject = null;
    
    public CargarGrafo(Usuario useraux) {
        this.useraux = useraux;
        initComponents();
        this.setTitle("EDD Learning | CARGAR JSON - By Oscar Llamas");
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lmanualDFT = new javax.swing.JLabel();
        bmanualDFT = new javax.swing.JButton();
        bautoDFT = new javax.swing.JButton();
        lautoDFT = new javax.swing.JLabel();
        lautoBFT = new javax.swing.JLabel();
        lmanualBFT = new javax.swing.JLabel();
        lelegir = new javax.swing.JLabel();
        lmanualmatrix = new javax.swing.JLabel();
        bmanualBFT = new javax.swing.JButton();
        lautomatrix = new javax.swing.JLabel();
        bmanualmatrix = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();
        bautoBFT = new javax.swing.JButton();
        bautomatrix = new javax.swing.JButton();
        lgoback = new javax.swing.JLabel();
        bbrowse = new javax.swing.JButton();
        lnombrearchivo = new javax.swing.JTextField();
        lloadtree = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lmanualDFT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualDFT.setForeground(new java.awt.Color(255, 255, 255));
        lmanualDFT.setText("RECORRIDO EN PROFUNDIDAD MANUAL");
        getContentPane().add(lmanualDFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 280, 30));

        bmanualDFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualDFT1.png"))); // NOI18N
        bmanualDFT.setBorder(null);
        bmanualDFT.setBorderPainted(false);
        bmanualDFT.setContentAreaFilled(false);
        bmanualDFT.setFocusPainted(false);
        bmanualDFT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualDFT2.png"))); // NOI18N
        bmanualDFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmanualDFTActionPerformed(evt);
            }
        });
        getContentPane().add(bmanualDFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 150, 200));

        bautoDFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoDFT1.png"))); // NOI18N
        bautoDFT.setBorder(null);
        bautoDFT.setBorderPainted(false);
        bautoDFT.setContentAreaFilled(false);
        bautoDFT.setFocusPainted(false);
        bautoDFT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoDFT2.png"))); // NOI18N
        bautoDFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautoDFTActionPerformed(evt);
            }
        });
        getContentPane().add(bautoDFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, 150, 200));

        lautoDFT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lautoDFT.setForeground(new java.awt.Color(255, 255, 255));
        lautoDFT.setText("RECORRIDO EN PROFUNDIDAD AUTOMÁTICO");
        getContentPane().add(lautoDFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 320, 30));

        lautoBFT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lautoBFT.setForeground(new java.awt.Color(255, 255, 255));
        lautoBFT.setText("RECORRIDO EN ANCHURA AUTOMÁTICO");
        getContentPane().add(lautoBFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 280, 30));

        lmanualBFT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualBFT.setForeground(new java.awt.Color(255, 255, 255));
        lmanualBFT.setText("RECORRIDO EN ANCHURA MANUAL");
        getContentPane().add(lmanualBFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 250, 30));

        lelegir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lelegir.setForeground(new java.awt.Color(255, 255, 255));
        lelegir.setText("ELEGIR MODO Y TIPO DE EJECUCIÓN:");
        getContentPane().add(lelegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 340, 30));

        lmanualmatrix.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualmatrix.setForeground(new java.awt.Color(255, 255, 255));
        lmanualmatrix.setText("MATRIZ DE ADYACENCIA MANUAL");
        getContentPane().add(lmanualmatrix, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 240, 30));

        bmanualBFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualBFT1.png"))); // NOI18N
        bmanualBFT.setBorder(null);
        bmanualBFT.setBorderPainted(false);
        bmanualBFT.setContentAreaFilled(false);
        bmanualBFT.setFocusPainted(false);
        bmanualBFT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualBFT2.png"))); // NOI18N
        bmanualBFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmanualBFTActionPerformed(evt);
            }
        });
        getContentPane().add(bmanualBFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 150, 200));

        lautomatrix.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lautomatrix.setForeground(new java.awt.Color(255, 255, 255));
        lautomatrix.setText("MATRIZ DE ADYACENCIA AUTOMÁTICA");
        getContentPane().add(lautomatrix, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 270, 30));

        bmanualmatrix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualmatrix1.png"))); // NOI18N
        bmanualmatrix.setBorder(null);
        bmanualmatrix.setBorderPainted(false);
        bmanualmatrix.setContentAreaFilled(false);
        bmanualmatrix.setFocusPainted(false);
        bmanualmatrix.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualmatrix2.png"))); // NOI18N
        bmanualmatrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmanualmatrixActionPerformed(evt);
            }
        });
        getContentPane().add(bmanualmatrix, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 150, 200));

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
        getContentPane().add(bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 50, 50));

        bautoBFT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoBFT1.png"))); // NOI18N
        bautoBFT.setBorder(null);
        bautoBFT.setBorderPainted(false);
        bautoBFT.setContentAreaFilled(false);
        bautoBFT.setFocusPainted(false);
        bautoBFT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoBFT2.png"))); // NOI18N
        bautoBFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautoBFTActionPerformed(evt);
            }
        });
        getContentPane().add(bautoBFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 150, 200));

        bautomatrix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/automatrix1.png"))); // NOI18N
        bautomatrix.setBorder(null);
        bautomatrix.setBorderPainted(false);
        bautomatrix.setContentAreaFilled(false);
        bautomatrix.setFocusPainted(false);
        bautomatrix.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/automatrix2.png"))); // NOI18N
        bautomatrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautomatrixActionPerformed(evt);
            }
        });
        getContentPane().add(bautomatrix, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 150, 200));

        lgoback.setForeground(new java.awt.Color(255, 255, 255));
        lgoback.setText("REGRESAR");
        getContentPane().add(lgoback, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 60, 70, 30));

        bbrowse.setBackground(new java.awt.Color(255, 255, 255));
        bbrowse.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        bbrowse.setForeground(new java.awt.Color(0, 0, 0));
        bbrowse.setText("EXAMINAR");
        bbrowse.setBorderPainted(false);
        bbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbrowseActionPerformed(evt);
            }
        });
        getContentPane().add(bbrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 120, 40));

        lnombrearchivo.setBackground(new java.awt.Color(255, 255, 255));
        lnombrearchivo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lnombrearchivo.setForeground(new java.awt.Color(0, 0, 0));
        lnombrearchivo.setFocusable(false);
        lnombrearchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnombrearchivoActionPerformed(evt);
            }
        });
        getContentPane().add(lnombrearchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 380, 40));

        lloadtree.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lloadtree.setForeground(new java.awt.Color(255, 255, 255));
        lloadtree.setText("CARGAR JSON");
        getContentPane().add(lloadtree, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padmin-wallpaper.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbrowseActionPerformed
        String pcusuario = System.getProperty("user.home");
        JFileChooser buscador = new JFileChooser(pcusuario +"/Desktop");
        buscador.setAcceptAllFileFilterUsed(false);
        buscador.setFileFilter(filtro);
        int abrir = buscador.showOpenDialog(this);
        if(abrir == buscador.APPROVE_OPTION){
            lnombrearchivo.setText((String) buscador.getSelectedFile().getName());
            patch = buscador.getSelectedFile().getAbsolutePath();
            permitir = true;
        }
        if(permitir){
            try {
            File file = new File(patch);
            JSONParser parser = new JSONParser();                                 
            FileReader reader = new FileReader(file.getAbsolutePath());
            Object obj = parser.parse(reader); 
            this.jSONObject = (JSONObject)obj;                                  
            }
            catch (Exception e) {
            }
        }
    }//GEN-LAST:event_bbrowseActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        PanelUsuario panelusuario = new PanelUsuario(this.useraux);
        panelusuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsalirActionPerformed

    private void bautomatrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautomatrixActionPerformed
         if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            MatrizAutomatica ma = new MatrizAutomatica(useraux, jSONObject);
            ma.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bautomatrixActionPerformed

    private void bautoBFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautoBFTActionPerformed
      if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            AnchuraAutomatico aa = new AnchuraAutomatico(useraux, jSONObject);
            aa.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bautoBFTActionPerformed

    private void lnombrearchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnombrearchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnombrearchivoActionPerformed

    private void bautoDFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautoDFTActionPerformed
         if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            ProfundidadAutomatico pa = new ProfundidadAutomatico(useraux, jSONObject);
            pa.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bautoDFTActionPerformed

    private void bmanualDFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualDFTActionPerformed
       if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            ProfundidadManual pm = new ProfundidadManual(useraux, jSONObject);
            pm.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bmanualDFTActionPerformed

    private void bmanualBFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualBFTActionPerformed
        if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            AnchuraManual am = new AnchuraManual(useraux, jSONObject);
            am.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bmanualBFTActionPerformed

    private void bmanualmatrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualmatrixActionPerformed
        if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            MatrizManual mm = new MatrizManual(useraux, jSONObject);
            mm.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bmanualmatrixActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bautoBFT;
    private javax.swing.JButton bautoDFT;
    private javax.swing.JButton bautomatrix;
    private javax.swing.JButton bbrowse;
    private javax.swing.JButton bmanualBFT;
    private javax.swing.JButton bmanualDFT;
    private javax.swing.JButton bmanualmatrix;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lautoBFT;
    private javax.swing.JLabel lautoDFT;
    private javax.swing.JLabel lautomatrix;
    private javax.swing.JLabel lelegir;
    private javax.swing.JLabel lgoback;
    private javax.swing.JLabel lloadtree;
    private javax.swing.JLabel lmanualBFT;
    private javax.swing.JLabel lmanualDFT;
    private javax.swing.JLabel lmanualmatrix;
    private javax.swing.JTextField lnombrearchivo;
    // End of variables declaration//GEN-END:variables
}
