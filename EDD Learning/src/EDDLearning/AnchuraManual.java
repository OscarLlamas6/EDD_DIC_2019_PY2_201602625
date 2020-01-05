
package EDDLearning;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AnchuraManual extends javax.swing.JFrame {

    public ListaAdyacencia.NodoAdyacencia visitado;
    public JSONObject ObjGrafo;
    public Grafo grafo;
    public JFrame frame = this;
    public Usuario usuarioaux;
    public int x = 0;
    public int y = 0;
    boolean primero = true;
    
    public AnchuraManual(Usuario usuarioaux, JSONObject ObjGrafo) {
        this.visitado = null;
        this.ObjGrafo = ObjGrafo;
        this.usuarioaux = usuarioaux;       
        initComponents();
        bnext.setEnabled(false);
        SetearGrafoFinal(this.grafo, this.ObjGrafo);
        this.setTitle("EDD Learning | RECORRIDO EN ANCHURA - By Oscar Llamas");
        this.setLocationRelativeTo(null);
        this.validate();
        this.revalidate();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lnext = new javax.swing.JLabel();
        bnext = new javax.swing.JButton();
        txtRecorrido = new javax.swing.JTextArea();
        lrecorrido = new javax.swing.JLabel();
        scrolleddaux = new javax.swing.JScrollPane();
        leddaux = new javax.swing.JLabel();
        bplay = new javax.swing.JButton();
        liniciar = new javax.swing.JLabel();
        lgoback = new javax.swing.JLabel();
        bsalir = new javax.swing.JButton();
        scrollimagen = new javax.swing.JScrollPane();
        lgrafo = new javax.swing.JLabel();
        ltitutlo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnext.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lnext.setForeground(new java.awt.Color(255, 255, 255));
        lnext.setText("SIGUIENTE");
        getContentPane().add(lnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, -1, -1));

        bnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/siguiente1.png"))); // NOI18N
        bnext.setBorder(null);
        bnext.setBorderPainted(false);
        bnext.setContentAreaFilled(false);
        bnext.setFocusPainted(false);
        bnext.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/siguiente2.png"))); // NOI18N
        bnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnextActionPerformed(evt);
            }
        });
        getContentPane().add(bnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 90, 90));

        txtRecorrido.setBackground(new java.awt.Color(255, 255, 255));
        txtRecorrido.setColumns(20);
        txtRecorrido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtRecorrido.setForeground(new java.awt.Color(0, 0, 0));
        txtRecorrido.setLineWrap(true);
        txtRecorrido.setRows(5);
        txtRecorrido.setWrapStyleWord(true);
        txtRecorrido.setFocusable(false);
        getContentPane().add(txtRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 330, 60));

        lrecorrido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lrecorrido.setForeground(new java.awt.Color(255, 255, 255));
        lrecorrido.setText("Recorrido:");
        getContentPane().add(lrecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        scrolleddaux.setViewportView(leddaux);

        getContentPane().add(scrolleddaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 640, 90));

        bplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/start1.png"))); // NOI18N
        bplay.setBorder(null);
        bplay.setBorderPainted(false);
        bplay.setContentAreaFilled(false);
        bplay.setFocusPainted(false);
        bplay.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/start2.png"))); // NOI18N
        bplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplayActionPerformed(evt);
            }
        });
        getContentPane().add(bplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 90, 90));

        liniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        liniciar.setForeground(new java.awt.Color(255, 255, 255));
        liniciar.setText("INICIAR");
        getContentPane().add(liniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 650, -1, -1));

        lgoback.setForeground(new java.awt.Color(255, 255, 255));
        lgoback.setText("REGRESAR");
        getContentPane().add(lgoback, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 680, 70, 30));

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
        getContentPane().add(bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, 50, 50));

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
  
    private void bplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplayActionPerformed
        this.y = 0;
        this.txtRecorrido.setText("");
        this.primero = true;
        this.visitado = this.grafo.visitadosanchura.getHead();
        this.bplay.setEnabled(false);
        this.bnext.setEnabled(true);
    }//GEN-LAST:event_bplayActionPerformed

    private void bnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnextActionPerformed
        if(y<x+1){  
            bplay.setEnabled(false);
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
            frame.validate();
            frame.revalidate();
            frame.repaint();
            y++;
            if(y>=x+1){
                bnext.setEnabled(false);
                bplay.setEnabled(true);
            }
                } else {
                    bplay.setEnabled(true);
                    bnext.setEnabled(false);
                }                        
    }//GEN-LAST:event_bnextActionPerformed
      
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
    private javax.swing.JButton bnext;
    private javax.swing.JButton bplay;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel fondo;
    public javax.swing.JLabel leddaux;
    private javax.swing.JLabel lgoback;
    public javax.swing.JLabel lgrafo;
    private javax.swing.JLabel liniciar;
    private javax.swing.JLabel lnext;
    private javax.swing.JLabel lrecorrido;
    public javax.swing.JLabel ltitutlo;
    public javax.swing.JScrollPane scrolleddaux;
    public javax.swing.JScrollPane scrollimagen;
    public javax.swing.JTextArea txtRecorrido;
    // End of variables declaration//GEN-END:variables
}
