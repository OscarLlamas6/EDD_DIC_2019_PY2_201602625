
package EDDLearning;

import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class CargarArbol extends javax.swing.JFrame {

    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .JSON", "json");
    public Boolean permitir = false;
    public String patch="";
    public Usuario useraux;
    public ListaSimple numeros = null;
    
    public CargarArbol(Usuario useraux) {
        this.useraux = useraux;
        initComponents();
        this.setTitle("EDD Learning | CARGAR JSON - By Oscar Llamas");
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lelegir2 = new javax.swing.JLabel();
        lauto = new javax.swing.JLabel();
        lelegir = new javax.swing.JLabel();
        lmanualdelete = new javax.swing.JLabel();
        bmanualdelete = new javax.swing.JButton();
        lmanualadd = new javax.swing.JLabel();
        bmanualadd = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();
        bautodelete = new javax.swing.JButton();
        bautoinsert = new javax.swing.JButton();
        lgoback = new javax.swing.JLabel();
        bbrowse = new javax.swing.JButton();
        lnombrearchivo = new javax.swing.JTextField();
        lloadtree = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lelegir2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lelegir2.setForeground(new java.awt.Color(255, 255, 255));
        lelegir2.setText("ELIMINACIÓN AUTOMÁTICA");
        getContentPane().add(lelegir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 220, 30));

        lauto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lauto.setForeground(new java.awt.Color(255, 255, 255));
        lauto.setText("ELIMINACIÓN MANUAL");
        getContentPane().add(lauto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 160, 30));

        lelegir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lelegir.setForeground(new java.awt.Color(255, 255, 255));
        lelegir.setText("ELEGIR MODO Y TIPO DE EJECUCIÓN:");
        getContentPane().add(lelegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 340, 30));

        lmanualdelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualdelete.setForeground(new java.awt.Color(255, 255, 255));
        lmanualdelete.setText("INSERCIÓN MANUAL");
        getContentPane().add(lmanualdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 150, 30));

        bmanualdelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualdelete1.png"))); // NOI18N
        bmanualdelete.setBorder(null);
        bmanualdelete.setBorderPainted(false);
        bmanualdelete.setContentAreaFilled(false);
        bmanualdelete.setFocusPainted(false);
        bmanualdelete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualdelete2.png"))); // NOI18N
        bmanualdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmanualdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bmanualdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 150, 200));

        lmanualadd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualadd.setForeground(new java.awt.Color(255, 255, 255));
        lmanualadd.setText("INSERCIÓN AUTOMÁTICA");
        getContentPane().add(lmanualadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, 30));

        bmanualadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualadd1.png"))); // NOI18N
        bmanualadd.setBorder(null);
        bmanualadd.setBorderPainted(false);
        bmanualadd.setContentAreaFilled(false);
        bmanualadd.setFocusPainted(false);
        bmanualadd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualadd2.png"))); // NOI18N
        bmanualadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmanualaddActionPerformed(evt);
            }
        });
        getContentPane().add(bmanualadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 150, 200));

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

        bautodelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autodelete1.png"))); // NOI18N
        bautodelete.setBorder(null);
        bautodelete.setBorderPainted(false);
        bautodelete.setContentAreaFilled(false);
        bautodelete.setFocusPainted(false);
        bautodelete.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autodelete2.png"))); // NOI18N
        bautodelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautodeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bautodelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 150, 200));

        bautoinsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoadd1.png"))); // NOI18N
        bautoinsert.setBorder(null);
        bautoinsert.setBorderPainted(false);
        bautoinsert.setContentAreaFilled(false);
        bautoinsert.setFocusPainted(false);
        bautoinsert.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoadd2.png"))); // NOI18N
        bautoinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautoinsertActionPerformed(evt);
            }
        });
        getContentPane().add(bautoinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 150, 200));

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

    private void bautoinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautoinsertActionPerformed
        if(permitir){
            lnombrearchivo.setText("");
            patch = "";  
            permitir = false;
            InsercionAutomatica ia = new InsercionAutomatica(useraux, numeros);
            ia.setVisible(true);
            this.dispose();                      
            } else {
                JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
            }
    }//GEN-LAST:event_bautoinsertActionPerformed

    private void bautodeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautodeleteActionPerformed
        if(permitir){
            lnombrearchivo.setText("");
            patch = "";  
            permitir = false;
            EliminacionAutomatica ea = new EliminacionAutomatica(useraux, numeros);
            ea.setVisible(true);
            this.dispose();                      
            } else {
                JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
            }
    }//GEN-LAST:event_bautodeleteActionPerformed

    private void bmanualaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualaddActionPerformed
     
    }//GEN-LAST:event_bmanualaddActionPerformed

    private void bmanualdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualdeleteActionPerformed
       
    }//GEN-LAST:event_bmanualdeleteActionPerformed

    private void lnombrearchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnombrearchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnombrearchivoActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bautodelete;
    private javax.swing.JButton bautoinsert;
    private javax.swing.JButton bbrowse;
    private javax.swing.JButton bmanualadd;
    private javax.swing.JButton bmanualdelete;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lauto;
    private javax.swing.JLabel lelegir;
    private javax.swing.JLabel lelegir2;
    private javax.swing.JLabel lgoback;
    private javax.swing.JLabel lloadtree;
    private javax.swing.JLabel lmanualadd;
    private javax.swing.JLabel lmanualdelete;
    private javax.swing.JTextField lnombrearchivo;
    // End of variables declaration//GEN-END:variables
}
