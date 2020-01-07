
package EDDLearning;

import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class CargarArreglo extends javax.swing.JFrame {

    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .JSON", "json");
    public Boolean permitir = false;
    public String patch="";
    public Usuario useraux;
    public JSONObject jSONObject = null;
    
    public CargarArreglo(Usuario useraux) {
        this.useraux = useraux;
        initComponents();
        this.setTitle("EDD Learning | CARGAR JSON - By Oscar Llamas");
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lmanualinquick = new javax.swing.JLabel();
        bmanualquick = new javax.swing.JButton();
        lautoquick = new javax.swing.JLabel();
        bautoquick = new javax.swing.JButton();
        bautoinsercion = new javax.swing.JButton();
        lmanualinsercion = new javax.swing.JLabel();
        bmanualinsercion = new javax.swing.JButton();
        lautoinsercion = new javax.swing.JLabel();
        lelegir = new javax.swing.JLabel();
        lmanualburbuja = new javax.swing.JLabel();
        lautoburbuja = new javax.swing.JLabel();
        bmanualburbuja = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();
        bautoburbuja = new javax.swing.JButton();
        lgoback = new javax.swing.JLabel();
        bbrowse = new javax.swing.JButton();
        lnombrearchivo = new javax.swing.JTextField();
        lloadtree = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lmanualinquick.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualinquick.setForeground(new java.awt.Color(255, 255, 255));
        lmanualinquick.setText("ORDENAMIENTO RÁPIDO MANUAL");
        getContentPane().add(lmanualinquick, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, 240, 30));

        bmanualquick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualquick1.png"))); // NOI18N
        bmanualquick.setBorder(null);
        bmanualquick.setBorderPainted(false);
        bmanualquick.setContentAreaFilled(false);
        bmanualquick.setFocusPainted(false);
        bmanualquick.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualquick2.png"))); // NOI18N
        bmanualquick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmanualquickActionPerformed(evt);
            }
        });
        getContentPane().add(bmanualquick, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 150, 200));

        lautoquick.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lautoquick.setForeground(new java.awt.Color(255, 255, 255));
        lautoquick.setText("ORDENAMIENTO RÁPIDO AUTOMÁTICO");
        getContentPane().add(lautoquick, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 280, 30));

        bautoquick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoquick1.png"))); // NOI18N
        bautoquick.setBorder(null);
        bautoquick.setBorderPainted(false);
        bautoquick.setContentAreaFilled(false);
        bautoquick.setFocusPainted(false);
        bautoquick.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoquick2.png"))); // NOI18N
        bautoquick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautoquickActionPerformed(evt);
            }
        });
        getContentPane().add(bautoquick, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, 150, 200));

        bautoinsercion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoinsercion1.png"))); // NOI18N
        bautoinsercion.setBorder(null);
        bautoinsercion.setBorderPainted(false);
        bautoinsercion.setContentAreaFilled(false);
        bautoinsercion.setFocusPainted(false);
        bautoinsercion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoinsercion2.png"))); // NOI18N
        bautoinsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautoinsercionActionPerformed(evt);
            }
        });
        getContentPane().add(bautoinsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 150, 200));

        lmanualinsercion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualinsercion.setForeground(new java.awt.Color(255, 255, 255));
        lmanualinsercion.setText("ORDENAMIENTO POR INSERCIÓN MANUAL");
        getContentPane().add(lmanualinsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, 300, 30));

        bmanualinsercion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualinsercion1.png"))); // NOI18N
        bmanualinsercion.setBorder(null);
        bmanualinsercion.setBorderPainted(false);
        bmanualinsercion.setContentAreaFilled(false);
        bmanualinsercion.setFocusPainted(false);
        bmanualinsercion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualinsercion2.png"))); // NOI18N
        bmanualinsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmanualinsercionActionPerformed(evt);
            }
        });
        getContentPane().add(bmanualinsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 150, 200));

        lautoinsercion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lautoinsercion.setForeground(new java.awt.Color(255, 255, 255));
        lautoinsercion.setText("ORDENAMIENTO POR INSERCIÓN AUTOMÁTICO");
        getContentPane().add(lautoinsercion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 340, 30));

        lelegir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lelegir.setForeground(new java.awt.Color(255, 255, 255));
        lelegir.setText("ELEGIR MODO Y TIPO DE EJECUCIÓN:");
        getContentPane().add(lelegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 340, 30));

        lmanualburbuja.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualburbuja.setForeground(new java.awt.Color(255, 255, 255));
        lmanualburbuja.setText("ORDENAMIENTO BURBUJA MANUAL");
        getContentPane().add(lmanualburbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 260, 30));

        lautoburbuja.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lautoburbuja.setForeground(new java.awt.Color(255, 255, 255));
        lautoburbuja.setText("ORDENAMIENTO BURBUJA AUTOMÁTICO");
        getContentPane().add(lautoburbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 300, 30));

        bmanualburbuja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualburbuja1.png"))); // NOI18N
        bmanualburbuja.setBorder(null);
        bmanualburbuja.setBorderPainted(false);
        bmanualburbuja.setContentAreaFilled(false);
        bmanualburbuja.setFocusPainted(false);
        bmanualburbuja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualburbuja2.png"))); // NOI18N
        bmanualburbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmanualburbujaActionPerformed(evt);
            }
        });
        getContentPane().add(bmanualburbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 150, 200));

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

        bautoburbuja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoburbuja1.png"))); // NOI18N
        bautoburbuja.setBorder(null);
        bautoburbuja.setBorderPainted(false);
        bautoburbuja.setContentAreaFilled(false);
        bautoburbuja.setFocusPainted(false);
        bautoburbuja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoburbuja2.png"))); // NOI18N
        bautoburbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautoburbujaActionPerformed(evt);
            }
        });
        getContentPane().add(bautoburbuja, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 150, 200));

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

    private void bautoburbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautoburbujaActionPerformed
         if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            OrdenamientoAutomatico oa = new OrdenamientoAutomatico(useraux, jSONObject, "Burbuja");
            oa.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bautoburbujaActionPerformed

    private void lnombrearchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnombrearchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnombrearchivoActionPerformed

    private void bmanualburbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualburbujaActionPerformed
        if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            OrdenamientoManual om = new OrdenamientoManual(useraux, jSONObject, "Burbuja");
            om.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bmanualburbujaActionPerformed

    private void bautoinsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautoinsercionActionPerformed
        if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            OrdenamientoAutomatico oa = new OrdenamientoAutomatico(useraux, jSONObject, "Inserción");
            oa.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bautoinsercionActionPerformed

    private void bmanualinsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualinsercionActionPerformed
       if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            OrdenamientoManual om = new OrdenamientoManual(useraux, jSONObject, "Inserción");
            om.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bmanualinsercionActionPerformed

    private void bautoquickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautoquickActionPerformed
         if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            OrdenamientoAutomatico oa = new OrdenamientoAutomatico(useraux, jSONObject, "Rápido");
            oa.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bautoquickActionPerformed

    private void bmanualquickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualquickActionPerformed
         if(permitir){
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            OrdenamientoManual om = new OrdenamientoManual(useraux, jSONObject, "Rápido");
            om.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
        }
    }//GEN-LAST:event_bmanualquickActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bautoburbuja;
    private javax.swing.JButton bautoinsercion;
    private javax.swing.JButton bautoquick;
    private javax.swing.JButton bbrowse;
    private javax.swing.JButton bmanualburbuja;
    private javax.swing.JButton bmanualinsercion;
    private javax.swing.JButton bmanualquick;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lautoburbuja;
    private javax.swing.JLabel lautoinsercion;
    private javax.swing.JLabel lautoquick;
    private javax.swing.JLabel lelegir;
    private javax.swing.JLabel lgoback;
    private javax.swing.JLabel lloadtree;
    private javax.swing.JLabel lmanualburbuja;
    private javax.swing.JLabel lmanualinquick;
    private javax.swing.JLabel lmanualinsercion;
    private javax.swing.JTextField lnombrearchivo;
    // End of variables declaration//GEN-END:variables
}
