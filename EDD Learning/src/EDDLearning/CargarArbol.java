
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

        lmanualpostorden = new javax.swing.JLabel();
        bmanualpostorden = new javax.swing.JButton();
        lmanualinorden = new javax.swing.JLabel();
        bmanualinorden = new javax.swing.JButton();
        lmanualpreorden = new javax.swing.JLabel();
        bmanualpreorden = new javax.swing.JButton();
        lautopostorden = new javax.swing.JLabel();
        bautopostorden = new javax.swing.JButton();
        lautoinorden = new javax.swing.JLabel();
        bautoinorden = new javax.swing.JButton();
        bautopreorden = new javax.swing.JButton();
        lautopreorden = new javax.swing.JLabel();
        lautodelete = new javax.swing.JLabel();
        lmanualdelete = new javax.swing.JLabel();
        lelegir = new javax.swing.JLabel();
        lmanualinsert = new javax.swing.JLabel();
        bmanualdelete = new javax.swing.JButton();
        lautoinsert = new javax.swing.JLabel();
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

        lmanualpostorden.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualpostorden.setForeground(new java.awt.Color(255, 255, 255));
        lmanualpostorden.setText("POSTORDEN MANUAL");
        getContentPane().add(lmanualpostorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 160, 30));

        bmanualpostorden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualpostorden1.png"))); // NOI18N
        bmanualpostorden.setBorder(null);
        bmanualpostorden.setBorderPainted(false);
        bmanualpostorden.setContentAreaFilled(false);
        bmanualpostorden.setFocusPainted(false);
        bmanualpostorden.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualpostorden2.png"))); // NOI18N
        bmanualpostorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmanualpostordenActionPerformed(evt);
            }
        });
        getContentPane().add(bmanualpostorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 150, 200));

        lmanualinorden.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualinorden.setForeground(new java.awt.Color(255, 255, 255));
        lmanualinorden.setText("INORDEN MANUAL");
        getContentPane().add(lmanualinorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 140, 30));

        bmanualinorden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualinorden1.png"))); // NOI18N
        bmanualinorden.setBorder(null);
        bmanualinorden.setBorderPainted(false);
        bmanualinorden.setContentAreaFilled(false);
        bmanualinorden.setFocusPainted(false);
        bmanualinorden.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualinorden2.png"))); // NOI18N
        bmanualinorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmanualinordenActionPerformed(evt);
            }
        });
        getContentPane().add(bmanualinorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 150, 200));

        lmanualpreorden.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualpreorden.setForeground(new java.awt.Color(255, 255, 255));
        lmanualpreorden.setText("PREORDEN MANUAL");
        getContentPane().add(lmanualpreorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 150, 30));

        bmanualpreorden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualpreorden1.png"))); // NOI18N
        bmanualpreorden.setBorder(null);
        bmanualpreorden.setBorderPainted(false);
        bmanualpreorden.setContentAreaFilled(false);
        bmanualpreorden.setFocusPainted(false);
        bmanualpreorden.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manualpreorden2.png"))); // NOI18N
        bmanualpreorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmanualpreordenActionPerformed(evt);
            }
        });
        getContentPane().add(bmanualpreorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 150, 200));

        lautopostorden.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lautopostorden.setForeground(new java.awt.Color(255, 255, 255));
        lautopostorden.setText("POSTORDEN AUTOMÁTICO");
        getContentPane().add(lautopostorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 190, 30));

        bautopostorden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autopostorden1.png"))); // NOI18N
        bautopostorden.setBorder(null);
        bautopostorden.setBorderPainted(false);
        bautopostorden.setContentAreaFilled(false);
        bautopostorden.setFocusPainted(false);
        bautopostorden.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autopostorden2.png"))); // NOI18N
        bautopostorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautopostordenActionPerformed(evt);
            }
        });
        getContentPane().add(bautopostorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 150, 200));

        lautoinorden.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lautoinorden.setForeground(new java.awt.Color(255, 255, 255));
        lautoinorden.setText("INORDEN AUTOMÁTICO");
        getContentPane().add(lautoinorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 180, 30));

        bautoinorden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoinorden1.png"))); // NOI18N
        bautoinorden.setBorder(null);
        bautoinorden.setBorderPainted(false);
        bautoinorden.setContentAreaFilled(false);
        bautoinorden.setFocusPainted(false);
        bautoinorden.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autoinorden2.png"))); // NOI18N
        bautoinorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautoinordenActionPerformed(evt);
            }
        });
        getContentPane().add(bautoinorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 150, 200));

        bautopreorden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autopreorden1.png"))); // NOI18N
        bautopreorden.setBorder(null);
        bautopreorden.setBorderPainted(false);
        bautopreorden.setContentAreaFilled(false);
        bautopreorden.setFocusPainted(false);
        bautopreorden.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/autopreorden2.png"))); // NOI18N
        bautopreorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bautopreordenActionPerformed(evt);
            }
        });
        getContentPane().add(bautopreorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 150, 200));

        lautopreorden.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lautopreorden.setForeground(new java.awt.Color(255, 255, 255));
        lautopreorden.setText("PREORDEN AUTOMÁTICO");
        getContentPane().add(lautopreorden, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 180, 30));

        lautodelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lautodelete.setForeground(new java.awt.Color(255, 255, 255));
        lautodelete.setText("ELIMINACIÓN AUTOMÁTICA");
        getContentPane().add(lautodelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 220, 30));

        lmanualdelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualdelete.setForeground(new java.awt.Color(255, 255, 255));
        lmanualdelete.setText("ELIMINACIÓN MANUAL");
        getContentPane().add(lmanualdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 160, 30));

        lelegir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lelegir.setForeground(new java.awt.Color(255, 255, 255));
        lelegir.setText("ELEGIR MODO Y TIPO DE EJECUCIÓN:");
        getContentPane().add(lelegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 340, 30));

        lmanualinsert.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lmanualinsert.setForeground(new java.awt.Color(255, 255, 255));
        lmanualinsert.setText("INSERCIÓN MANUAL");
        getContentPane().add(lmanualinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 150, 30));

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
        getContentPane().add(bmanualdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 150, 200));

        lautoinsert.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lautoinsert.setForeground(new java.awt.Color(255, 255, 255));
        lautoinsert.setText("INSERCIÓN AUTOMÁTICA");
        getContentPane().add(lautoinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 30));

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
        getContentPane().add(bmanualadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 150, 200));

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
        getContentPane().add(bautodelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 150, 200));

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
        getContentPane().add(bautoinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 150, 200));

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
       if(permitir){
            lnombrearchivo.setText("");
            patch = "";  
            permitir = false;
            InsercionManual im = new InsercionManual(useraux, numeros);
            im.setVisible(true);
            this.dispose();                      
            } else {
                JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
            }
    }//GEN-LAST:event_bmanualaddActionPerformed

    private void bmanualdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualdeleteActionPerformed
          if(permitir){
            lnombrearchivo.setText("");
            patch = "";  
            permitir = false;
            EliminacionManual em = new EliminacionManual(useraux, numeros);
            em.setVisible(true);
            this.dispose();                      
            } else {
                JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
            }
    }//GEN-LAST:event_bmanualdeleteActionPerformed

    private void lnombrearchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnombrearchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnombrearchivoActionPerformed

    private void bautopreordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautopreordenActionPerformed
         if(permitir){
            lnombrearchivo.setText("");
            patch = "";  
            permitir = false;
            RecorridoAutomatico ra = new RecorridoAutomatico(useraux, numeros, "PREORDEN");
            ra.setVisible(true);
            this.dispose();                      
            } else {
                JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
            }
    }//GEN-LAST:event_bautopreordenActionPerformed

    private void bautoinordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautoinordenActionPerformed
        if(permitir){
            lnombrearchivo.setText("");
            patch = "";  
            permitir = false;
            RecorridoAutomatico ra = new RecorridoAutomatico(useraux, numeros, "INORDEN");
            ra.setVisible(true);
            this.dispose();                      
            } else {
                JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
            }
    }//GEN-LAST:event_bautoinordenActionPerformed

    private void bautopostordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bautopostordenActionPerformed
        if(permitir){
            lnombrearchivo.setText("");
            patch = "";  
            permitir = false;
            RecorridoAutomatico ra = new RecorridoAutomatico(useraux, numeros, "POSTORDEN");
            ra.setVisible(true);
            this.dispose();                      
            } else {
                JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
            }
    }//GEN-LAST:event_bautopostordenActionPerformed

    private void bmanualpreordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualpreordenActionPerformed
       if(permitir){
            lnombrearchivo.setText("");
            patch = "";  
            permitir = false;
            RecorridoManual rm = new RecorridoManual(useraux, numeros, "PREORDEN");
            rm.setVisible(true);
            this.dispose();                      
            } else {
                JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
            }
    }//GEN-LAST:event_bmanualpreordenActionPerformed

    private void bmanualinordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualinordenActionPerformed
       if(permitir){
            lnombrearchivo.setText("");
            patch = "";  
            permitir = false;
            RecorridoManual rm = new RecorridoManual(useraux, numeros, "INORDEN");
            rm.setVisible(true);
            this.dispose();                      
            } else {
                JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
            }
    }//GEN-LAST:event_bmanualinordenActionPerformed

    private void bmanualpostordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmanualpostordenActionPerformed
     if(permitir){
            lnombrearchivo.setText("");
            patch = "";  
            permitir = false;
            RecorridoManual rm = new RecorridoManual(useraux, numeros, "POSTORDEN");
            rm.setVisible(true);
            this.dispose();                      
            } else {
                JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!");
            }   
    }//GEN-LAST:event_bmanualpostordenActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bautodelete;
    private javax.swing.JButton bautoinorden;
    private javax.swing.JButton bautoinsert;
    private javax.swing.JButton bautopostorden;
    private javax.swing.JButton bautopreorden;
    private javax.swing.JButton bbrowse;
    private javax.swing.JButton bmanualadd;
    private javax.swing.JButton bmanualdelete;
    private javax.swing.JButton bmanualinorden;
    private javax.swing.JButton bmanualpostorden;
    private javax.swing.JButton bmanualpreorden;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lautodelete;
    private javax.swing.JLabel lautoinorden;
    private javax.swing.JLabel lautoinsert;
    private javax.swing.JLabel lautopostorden;
    private javax.swing.JLabel lautopreorden;
    private javax.swing.JLabel lelegir;
    private javax.swing.JLabel lgoback;
    private javax.swing.JLabel lloadtree;
    private javax.swing.JLabel lmanualdelete;
    private javax.swing.JLabel lmanualinorden;
    private javax.swing.JLabel lmanualinsert;
    private javax.swing.JLabel lmanualpostorden;
    private javax.swing.JLabel lmanualpreorden;
    private javax.swing.JTextField lnombrearchivo;
    // End of variables declaration//GEN-END:variables
}
