
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Cargar extends javax.swing.JFrame {

    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .JSON", "json");
    Boolean permitir;
    String patch="";
    
    public Cargar() {
        initComponents();
        this.setTitle("EDD Learning | LOAD JSON - By Oscar Llamas");
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lgoback = new javax.swing.JLabel();
        bsalir = new javax.swing.JButton();
        lcargar = new javax.swing.JLabel();
        bcargar = new javax.swing.JButton();
        bbrowse = new javax.swing.JButton();
        lnombrearchivo = new javax.swing.JTextField();
        lloadusers = new javax.swing.JLabel();
        lfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lgoback.setForeground(new java.awt.Color(255, 255, 255));
        lgoback.setText("GO BACK");
        getContentPane().add(lgoback, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 590, 60, 30));

        bsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/goback1.png"))); // NOI18N
        bsalir.setBorder(null);
        bsalir.setBorderPainted(false);
        bsalir.setContentAreaFilled(false);
        bsalir.setFocusPainted(false);
        bsalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/goback2.png"))); // NOI18N
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });
        getContentPane().add(bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 510, 80, 80));

        lcargar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lcargar.setForeground(new java.awt.Color(255, 255, 255));
        lcargar.setText("LOAD");
        getContentPane().add(lcargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 60, 30));

        bcargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/uploadjson1.png"))); // NOI18N
        bcargar.setBorder(null);
        bcargar.setBorderPainted(false);
        bcargar.setContentAreaFilled(false);
        bcargar.setFocusPainted(false);
        bcargar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/uploadjson2.png"))); // NOI18N
        bcargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcargarActionPerformed(evt);
            }
        });
        getContentPane().add(bcargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 150, 200));

        bbrowse.setBackground(new java.awt.Color(0, 0, 0));
        bbrowse.setFont(new java.awt.Font("Franklin Gothic Book", 1, 12)); // NOI18N
        bbrowse.setForeground(new java.awt.Color(255, 255, 255));
        bbrowse.setText("CHOOSE FILE");
        bbrowse.setBorderPainted(false);
        bbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbrowseActionPerformed(evt);
            }
        });
        getContentPane().add(bbrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 120, 40));

        lnombrearchivo.setBackground(new java.awt.Color(255, 255, 255));
        lnombrearchivo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lnombrearchivo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lnombrearchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 380, 40));

        lloadusers.setFont(new java.awt.Font("Dialog", 1, 56)); // NOI18N
        lloadusers.setForeground(new java.awt.Color(255, 255, 255));
        lloadusers.setText("LOAD USERS");
        getContentPane().add(lloadusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        lfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padmin-wallpaper.jpg"))); // NOI18N
        getContentPane().add(lfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

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
    }//GEN-LAST:event_bbrowseActionPerformed

    private void bcargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcargarActionPerformed
         if(permitir){
           
            try {
            File file = new File(patch);
            JSONParser parser = new JSONParser();            
            lnombrearchivo.setText("");
            patch = "";
            permitir = false;
            FileReader reader = new FileReader(file.getAbsolutePath());
            Object obj = parser.parse(reader); 
            JSONArray jsonArray = (JSONArray)obj;
            for(Object Obj: jsonArray){
                JSONObject jsonObj = (JSONObject) Obj;
                String nombre = (String) jsonObj.get("Nombre");
                String apellido = (String) jsonObj.get("Apellido");
                String carnet = (String) jsonObj.get("Carnet");
                String password = (String) jsonObj.get("Password");
                System.out.println("El nombre es: "+nombre);
                System.out.println("El apellido es: "+apellido);
                System.out.println("El carnet es: "+carnet);
                System.out.println("El password es: "+password);
                System.out.println("");
            }           
            JOptionPane.showMessageDialog(this, "¡LOAD FINISHED!"); 

            }           
            catch (Exception e) {
            }} else {
           JOptionPane.showMessageDialog(this, "NO SELECTED FILE!"); 
        }
    }//GEN-LAST:event_bcargarActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
       PanelAdmin paneladmin = new PanelAdmin();
       paneladmin.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_bsalirActionPerformed

  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbrowse;
    private javax.swing.JButton bcargar;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel lcargar;
    private javax.swing.JLabel lfondo;
    private javax.swing.JLabel lgoback;
    private javax.swing.JLabel lloadusers;
    private javax.swing.JTextField lnombrearchivo;
    // End of variables declaration//GEN-END:variables
}
