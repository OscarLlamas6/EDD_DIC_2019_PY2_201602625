package EDDLearning;


import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import static EDDLearning.Main.tablausuarios;
import java.util.Arrays;


public class Cargar extends javax.swing.JFrame {

    private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos .JSON", "json");
    Boolean permitir = false;
    String patch="";
    
    
    public Cargar() {
        initComponents();
        this.setTitle("EDD Learning | CARGAR JSON - By Oscar Llamas");
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
        lgoback.setText("REGRESAR");
        getContentPane().add(lgoback, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 590, 70, 30));

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
        lcargar.setText("CARGAR");
        getContentPane().add(lcargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 80, 30));

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
        getContentPane().add(bbrowse, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 120, 40));

        lnombrearchivo.setBackground(new java.awt.Color(255, 255, 255));
        lnombrearchivo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lnombrearchivo.setForeground(new java.awt.Color(0, 0, 0));
        lnombrearchivo.setFocusable(false);
        getContentPane().add(lnombrearchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 380, 40));

        lloadusers.setFont(new java.awt.Font("Dialog", 1, 56)); // NOI18N
        lloadusers.setForeground(new java.awt.Color(255, 255, 255));
        lloadusers.setText("CARGAR USUARIOS");
        getContentPane().add(lloadusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

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
    
    
    public boolean CARNETexiste(String carnet){
        long clave = Long.parseLong(carnet);
        int direccion = (int)(clave%tablausuarios.size); 
        while(direccion>tablausuarios.size-1){
          direccion = direccion - tablausuarios.size;
        }
        if(tablausuarios.tabla[direccion]==null){
            return false;
        } else {
            if(tablausuarios.tabla[direccion].getCarnet().equals(carnet)){
                return true;
            }else {
               int i = 0;
               int aux = (int)(clave%7);
               direccion = (aux+1)*i;
               while(direccion>tablausuarios.size-1){
                direccion = direccion - tablausuarios.size;
                }
               while(direccion<tablausuarios.size){
                if(tablausuarios.tabla[direccion]==null){ return false;}
                if(tablausuarios.tabla[direccion].getCarnet().equals(carnet)){
                    return true;
                }
                i++;
                direccion = (aux+1)*i;
                }
               return false;
            }
        }        
    }
    
    
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
            UsuarioRechazado [] rechazados = new UsuarioRechazado[jsonArray.size()];
            Arrays.fill(rechazados,null);
            int ur = 0;
            boolean rechazo = false;
            for(Object Obj: jsonArray){               
                JSONObject jsonObj = (JSONObject) Obj;
                String nombre = (String) jsonObj.get("Nombre");
                String apellido = (String) jsonObj.get("Apellido");
                String carnet = ((String) jsonObj.get("Carnet")).replaceAll("-", "");
                String password = (String) jsonObj.get("Password");               
                if(!CARNETexiste(carnet) && password.length()>=8){
                    Usuario u = new Usuario(nombre, apellido, carnet, getHash(password.getBytes(), "SHA-256"), password); //nuevo usuario con password encriptada
                    tablausuarios.Insertar(Long.parseLong(carnet), u); //insertamos usuario en tabla hash
                } else {
                   rechazo = true;
                   if(CARNETexiste(carnet) && password.length()>=8){
                       UsuarioRechazado user = new UsuarioRechazado(nombre, apellido, carnet, password, "Carne ya existe.");
                       rechazados[ur] = user;
                       ur++;
                   } else if(!CARNETexiste(carnet) && password.length()<8){
                       UsuarioRechazado user = new UsuarioRechazado(nombre, apellido, carnet, password, "Contraseña muy corta.");
                       rechazados[ur] = user;
                       ur++;
                   } else if(CARNETexiste(carnet)&& password.length()<8){
                       UsuarioRechazado user = new UsuarioRechazado(nombre, apellido, carnet, password, "Carne ya existe y contraseña muy corta.");
                       rechazados[ur] = user;
                       ur++; 
                   }
                }                              
            }
            
            if(rechazo){
                TablaRechazados tr = new TablaRechazados(this, true, rechazados,jsonArray.size());
                tr.setVisible(true);
            }
                  
            JOptionPane.showMessageDialog(this, "¡CARGA TERMINADA!"); 
            }           
            catch (Exception e) {
            }} else {
           JOptionPane.showMessageDialog(this, "NO HA SELECCIONADO NINGUN ARCHIVO!"); 
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
