
package EDDLearning;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AnchuraAutomatico extends javax.swing.JFrame {

    public ListaAdyacencia.NodoAdyacencia visitado;
    public JSONObject ObjGrafo;
    public Grafo grafo;
    public JFrame frame = this;
    public Usuario usuarioaux;
    public static int velocidad = 1;
    public int x = 0;
    public int y = 0;
    Timer timer;
    boolean primero = true;
    
    public AnchuraAutomatico(Usuario usuarioaux, JSONObject ObjGrafo) {
        this.visitado = null;
        this.ObjGrafo = ObjGrafo;
        this.usuarioaux = usuarioaux;
        this.timer = new Timer((this.velocidad*1000), new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.setDelay(velocidad*1000);
                bplay.setEnabled(false);
                if(y<x+2){                  
                    ImageIcon icono = new ImageIcon("C:/Reportes/Grafo"+y+".png");
                    ImageIcon icono2 = new ImageIcon("C:/Reportes/Cola"+y+".png");
                    icono.getImage().flush();
                    icono2.getImage().flush();                  
                    lgrafo.setIcon(icono);
                    lgrafo.setHorizontalAlignment(JLabel.CENTER);
                    lgrafo.setVerticalAlignment(JLabel.TOP);
                    lgrafo.validate();
                    lgrafo.revalidate();
                    leddaux.setIcon(icono2);
                    leddaux.setHorizontalAlignment(JLabel.LEFT);
                    leddaux.validate();
                    leddaux.revalidate();
                    scrolleddaux.validate();
                    scrolleddaux.revalidate();
                    if(visitado != null){
                        String r = txtRecorrido.getText();
                        if(primero){
                            primero = false;
                            r+=visitado.getData();
                        } else {
                            r+=", "+visitado.getData();
                        }
                       txtRecorrido.setText(r);
                       visitado = visitado.getNext();
                    }
                    if(y>x){
                      txtRecorrido.setText("Árbol generador del grafo (recorrido en anchura) .");
                    }
                    frame.validate();
                    frame.revalidate();
                    frame.repaint();
                    y++;
                } else {
                    timer.stop();
                    bplay.setEnabled(true);
                }                                       
            }
        });         
        initComponents();
        SetearGrafoFinal(this.grafo, this.ObjGrafo);
        velocidad = JSvelocidad.getValue();
        this.setTitle("EDD Learning | RECORRIDO EN ANCHURA - By Oscar Llamas");
        this.setLocationRelativeTo(null);
        this.validate();
        this.revalidate();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRecorrido = new javax.swing.JTextArea();
        lrecorrido = new javax.swing.JLabel();
        JSvelocidad = new javax.swing.JSlider();
        scrolleddaux = new javax.swing.JScrollPane();
        leddaux = new javax.swing.JLabel();
        bplay = new javax.swing.JButton();
        liniciar = new javax.swing.JLabel();
        lvelocidad = new javax.swing.JLabel();
        lgoback = new javax.swing.JLabel();
        bsalir = new javax.swing.JButton();
        scrollimagen = new javax.swing.JScrollPane();
        lgrafo = new javax.swing.JLabel();
        ltitutlo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRecorrido.setBackground(new java.awt.Color(255, 255, 255));
        txtRecorrido.setColumns(20);
        txtRecorrido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtRecorrido.setForeground(new java.awt.Color(0, 0, 0));
        txtRecorrido.setLineWrap(true);
        txtRecorrido.setRows(5);
        txtRecorrido.setWrapStyleWord(true);
        txtRecorrido.setFocusable(false);
        getContentPane().add(txtRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 330, 60));

        lrecorrido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lrecorrido.setForeground(new java.awt.Color(255, 255, 255));
        lrecorrido.setText("Recorrido:");
        getContentPane().add(lrecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, -1, -1));

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
        getContentPane().add(JSvelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        scrolleddaux.setViewportView(leddaux);

        getContentPane().add(scrolleddaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 640, 90));

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
        getContentPane().add(lvelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

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

        scrollimagen.setViewportView(lgrafo);

        getContentPane().add(scrollimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 640, 340));

        ltitutlo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        ltitutlo.setForeground(new java.awt.Color(255, 255, 255));
        ltitutlo.setText("Grafos: Recorrido en anchura");
        getContentPane().add(ltitutlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graph-wallpaper.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        CargarGrafo c = new CargarGrafo(usuarioaux);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsalirActionPerformed
  
    private void JSvelocidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JSvelocidadStateChanged
       this.velocidad = JSvelocidad.getValue();
    }//GEN-LAST:event_JSvelocidadStateChanged

    private void bplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplayActionPerformed
        this.y = 0;
        this.txtRecorrido.setText("");
        this.primero = true;
        this.visitado = this.grafo.visitadosanchura.getHead();
        this.timer.setInitialDelay(0);
        this.timer.setDelay(velocidad*1000);
        this.timer.start();   
    }//GEN-LAST:event_bplayActionPerformed
  
    
    public void SetearGrafoFinal(Grafo grafo, JSONObject jSONObject){    
        try {
        String primer_nodo = "";
        JSONArray jsonArray = (JSONArray) jSONObject.get("Graph");
        this.x = (jsonArray.size()*2);
        grafo = new Grafo(jsonArray.size());
        grafo.x = 0;
        for(Object Obj: jsonArray){
            JSONObject o = (JSONObject) Obj;
            String s = String.valueOf(o.get("Node"));
            grafo.AgregarVertice(s);
        } 
        for(Object Obj: jsonArray){
            JSONObject o = (JSONObject) Obj;
            String vertice1 = String.valueOf(o.get("Node"));
            JSONArray EdgesArray = (JSONArray) o.get("Adjacency");
            for(Object Edge: EdgesArray){
                JSONObject e = (JSONObject) Edge;
                String vertice2 = String.valueOf(e.get("Node"));
                grafo.AgregarArista(vertice1, vertice2);
            }

        }
        this.grafo = grafo;
        if(this.grafo.getVertices().getHead() != null){
            primer_nodo = String.valueOf(this.grafo.getVertices().getHead().getVertice().getDato());
            this.grafo.RecorridoAnchura(primer_nodo);
            this.grafo.GraficarArbolGeneradorAnchura(primer_nodo);
        }
        
        this.grafo.GraficarGrafo("");
        ImageIcon icono = new ImageIcon("C:/Reportes/Grafo.png");
        icono.getImage().flush();
        lgrafo.setIcon(icono);
        lgrafo.setHorizontalAlignment(JLabel.CENTER);
        lgrafo.setVerticalAlignment(JLabel.TOP);
        lgrafo.validate();
        lgrafo.revalidate();
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
    public javax.swing.JLabel leddaux;
    private javax.swing.JLabel lgoback;
    public javax.swing.JLabel lgrafo;
    private javax.swing.JLabel liniciar;
    private javax.swing.JLabel lrecorrido;
    public javax.swing.JLabel ltitutlo;
    private javax.swing.JLabel lvelocidad;
    public javax.swing.JScrollPane scrolleddaux;
    public javax.swing.JScrollPane scrollimagen;
    public javax.swing.JTextArea txtRecorrido;
    // End of variables declaration//GEN-END:variables
}
