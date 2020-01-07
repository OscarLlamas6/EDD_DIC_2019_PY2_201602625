
package EDDLearning;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class OrdenamientoAutomatico extends javax.swing.JFrame {

    public JSONObject ObjOrdenamiento;
    public JFrame frame = this;
    public Usuario usuarioaux;
    public static int velocidad = 1;
    public int x = 0;
    public int y = 0;
    public String tipo_ordenamiento;
    Timer timer;
    
    public OrdenamientoAutomatico(Usuario usuarioaux, JSONObject ObjOrdenamiento, String tipo_ordenamiento) {
        this.tipo_ordenamiento = tipo_ordenamiento;
        this.ObjOrdenamiento = ObjOrdenamiento;
        this.usuarioaux = usuarioaux;
        this.timer = new Timer((this.velocidad*1000), new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.setDelay(velocidad*1000);
                bplay.setEnabled(false);
                if(y<x){                  
                    ImageIcon icono = new ImageIcon("C:/Reportes/Arreglo"+y+".png");
                    icono.getImage().flush();                 
                    larreglo.setIcon(icono);
                    larreglo.setHorizontalAlignment(JLabel.CENTER);
                    larreglo.setVerticalAlignment(JLabel.CENTER);
                    larreglo.validate();
                    larreglo.revalidate();
                    txtExplicacion.setText("Ordenando...");
                    frame.validate();
                    frame.revalidate();
                    frame.repaint();
                    y++;
                } else {
                    txtExplicacion.setText("Arreglo ordenado");
                    timer.stop();
                    bplay.setEnabled(true);                   
                }                                       
            }
        });         
        initComponents();
        SetearArregloFinal(ObjOrdenamiento);
        velocidad = JSvelocidad.getValue();
        this.ltitutlo.setText(this.ltitutlo.getText()+tipo_ordenamiento);
        this.setTitle("EDD Learning | ORDENAMIENTOS - By Oscar Llamas");
        this.setLocationRelativeTo(null);
        this.validate();
        this.revalidate();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtExplicacion = new javax.swing.JTextArea();
        lexplicacion = new javax.swing.JLabel();
        JSvelocidad = new javax.swing.JSlider();
        bplay = new javax.swing.JButton();
        liniciar = new javax.swing.JLabel();
        lvelocidad = new javax.swing.JLabel();
        lgoback = new javax.swing.JLabel();
        bsalir = new javax.swing.JButton();
        scrollimagen = new javax.swing.JScrollPane();
        larreglo = new javax.swing.JLabel();
        ltitutlo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtExplicacion.setBackground(new java.awt.Color(255, 255, 255));
        txtExplicacion.setColumns(20);
        txtExplicacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtExplicacion.setForeground(new java.awt.Color(0, 0, 0));
        txtExplicacion.setLineWrap(true);
        txtExplicacion.setRows(5);
        txtExplicacion.setWrapStyleWord(true);
        txtExplicacion.setFocusable(false);
        getContentPane().add(txtExplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 330, 60));

        lexplicacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lexplicacion.setForeground(new java.awt.Color(255, 255, 255));
        lexplicacion.setText("Explicación:");
        getContentPane().add(lexplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        JSvelocidad.setBackground(new java.awt.Color(0, 0, 0));
        JSvelocidad.setForeground(new java.awt.Color(255, 255, 255));
        JSvelocidad.setMajorTickSpacing(1);
        JSvelocidad.setMaximum(10);
        JSvelocidad.setMinimum(1);
        JSvelocidad.setMinorTickSpacing(1);
        JSvelocidad.setPaintLabels(true);
        JSvelocidad.setPaintTicks(true);
        JSvelocidad.setValue(1);
        JSvelocidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JSvelocidadStateChanged(evt);
            }
        });
        getContentPane().add(JSvelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, -1, -1));

        bplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/startp1.png"))); // NOI18N
        bplay.setBorder(null);
        bplay.setBorderPainted(false);
        bplay.setContentAreaFilled(false);
        bplay.setFocusPainted(false);
        bplay.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/startp2.png"))); // NOI18N
        bplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplayActionPerformed(evt);
            }
        });
        getContentPane().add(bplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 50, 50));

        liniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        liniciar.setForeground(new java.awt.Color(255, 255, 255));
        liniciar.setText("INICIAR");
        getContentPane().add(liniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 640, -1, -1));

        lvelocidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvelocidad.setForeground(new java.awt.Color(255, 255, 255));
        lvelocidad.setText("Velocidad:");
        getContentPane().add(lvelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        lgoback.setForeground(new java.awt.Color(255, 255, 255));
        lgoback.setText("REGRESAR");
        getContentPane().add(lgoback, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, 70, 30));

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
        getContentPane().add(bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 50, 50));

        scrollimagen.setViewportView(larreglo);

        getContentPane().add(scrollimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 650, 370));

        ltitutlo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        ltitutlo.setForeground(new java.awt.Color(255, 255, 255));
        ltitutlo.setText("Ordenamientos: ");
        getContentPane().add(ltitutlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graph-wallpaper.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        CargarArreglo c = new CargarArreglo(usuarioaux);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsalirActionPerformed
  
    private void JSvelocidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JSvelocidadStateChanged
       this.velocidad = JSvelocidad.getValue();
    }//GEN-LAST:event_JSvelocidadStateChanged

    private void bplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplayActionPerformed
        this.y = 0;
        this.txtExplicacion.setText("");
        this.timer.setInitialDelay(0);
        this.timer.setDelay(velocidad*1000);
        this.timer.start();   
    }//GEN-LAST:event_bplayActionPerformed
  
    
    public void SetearArregloFinal(JSONObject jSONObject){    
        try {
        JSONArray jsonArray = (JSONArray) jSONObject.get("Array");
        int [] arreglo = new int[jsonArray.size()];
        int i = 0;
        for(Object Obj: jsonArray){
            JSONObject o = (JSONObject) Obj;
            String s = String.valueOf(o.get("num"));
            int aux = Integer.parseInt(s);
            arreglo[i] = aux;
            i++;
        }        
        Ordenamientos ordenamientos = new Ordenamientos(arreglo, jsonArray.size());
        ordenamientos.Graficar(ordenamientos.arreglo);
        
        if(tipo_ordenamiento.equals("Burbuja")){
            ordenamientos.MetodoBurbuja(ordenamientos.arreglo);            
        } else if(tipo_ordenamiento.equals("Inserción")){
            ordenamientos.MetodoPorInsercion(ordenamientos.arreglo);
        } else if(tipo_ordenamiento.equals("Rápido")){
            ordenamientos.MetodoRapido(ordenamientos.arreglo,0,(jsonArray.size()-1));
        }
        
        ordenamientos.GraficarX(ordenamientos.arreglo);
        this.x = ordenamientos.x;
        ImageIcon icono = new ImageIcon("C:/Reportes/Arreglo.png");
        icono.getImage().flush();
        larreglo.setIcon(icono);
        larreglo.setHorizontalAlignment(JLabel.CENTER);
        larreglo.setVerticalAlignment(JLabel.CENTER);
        larreglo.validate();
        larreglo.revalidate();
        scrollimagen.validate();
        scrollimagen.revalidate();
        frame.validate();
        frame.revalidate();        
        } catch (Exception e) {
        }      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider JSvelocidad;
    private javax.swing.JButton bplay;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel fondo;
    public javax.swing.JLabel larreglo;
    private javax.swing.JLabel lexplicacion;
    private javax.swing.JLabel lgoback;
    private javax.swing.JLabel liniciar;
    public javax.swing.JLabel ltitutlo;
    private javax.swing.JLabel lvelocidad;
    public javax.swing.JScrollPane scrollimagen;
    public javax.swing.JTextArea txtExplicacion;
    // End of variables declaration//GEN-END:variables
}
