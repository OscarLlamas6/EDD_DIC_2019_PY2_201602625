
package EDDLearning;

import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class CargarArbolB extends javax.swing.JFrame {

    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .JSON", "json");
    public Boolean permitir = false;
    public String patch="";
    public Usuario useraux;
    public ListaSimple numeros = null;
    
    public CargarArbolB(Usuario useraux) {
        this.useraux = useraux;
        initComponents();
        this.setTitle("EDD Learning | CARGAR JSON - By Oscar Llamas");
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lelegir = new javax.swing.JLabel();
        linsert = new javax.swing.JLabel();
        bsalir = new javax.swing.JButton();
        badd = new javax.swing.JButton();
        lgoback = new javax.swing.JLabel();
        bbrowse = new javax.swing.JButton();
        lnombrearchivo = new javax.swing.JTextField();
        lloadtree = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lelegir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lelegir.setForeground(new java.awt.Color(255, 255, 255));
        lelegir.setText("ELEGIR MODO Y TIPO DE EJECUCIÓN:");
        getContentPane().add(lelegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 340, 30));

        linsert.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        linsert.setForeground(new java.awt.Color(255, 255, 255));
        linsert.setText("INSERCIÓN");
        getContentPane().add(linsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 80, 30));

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

        badd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addB1.png"))); // NOI18N
        badd.setBorder(null);
        badd.setBorderPainted(false);
        badd.setContentAreaFilled(false);
        badd.setFocusPainted(false);
        badd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addB2.png"))); // NOI18N
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        getContentPane().add(badd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 150, 200));

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
            JSONObject jsonObj = (JSONObject)obj;
            JSONArray jsonArray = (JSONArray) jsonObj.get("Input");
            this.numeros = new ListaSimple();
            for(Object Obj: jsonArray){
                JSONObject o = (JSONObject) Obj;
                String s = String.valueOf(o.get("num"));
                int aux = Integer.parseInt(s);
                numeros = numeros.insert(numeros, aux);
            }
                
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

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        if(permitir){
            lnombrearchivo.setText("");
            patch = "";  
            permitir = false;
            InsercionArbolB ia = new InsercionArbolB(useraux, numeros);
            ia.setVisible(true);
            this.dispose();                      
            } else {
                JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
            }
    }//GEN-LAST:event_baddActionPerformed

    private void lnombrearchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnombrearchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnombrearchivoActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badd;
    private javax.swing.JButton bbrowse;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lelegir;
    private javax.swing.JLabel lgoback;
    private javax.swing.JLabel linsert;
    private javax.swing.JLabel lloadtree;
    private javax.swing.JTextField lnombrearchivo;
    // End of variables declaration//GEN-END:variables
}
