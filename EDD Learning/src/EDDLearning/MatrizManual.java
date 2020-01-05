
package EDDLearning;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class MatrizManual extends javax.swing.JFrame {

    public JSONObject ObjGrafo;
    public Grafo grafo;
    public JFrame frame = this;
    public Usuario usuarioaux;
    public static int velocidad = 1;
    public int x = 0;
    public int y = 0;
    
    public MatrizManual(Usuario usuarioaux, JSONObject ObjGrafo) {
        this.ObjGrafo = ObjGrafo;
        this.usuarioaux = usuarioaux;        
        initComponents();
        this.bnext.setEnabled(false);
        SetearGrafoFinal(this.grafo, this.ObjGrafo);
        this.setTitle("EDD Learning | MATRIZ DE ADYACENCIA - By Oscar Llamas");
        this.setLocationRelativeTo(null);
        this.validate();
        this.revalidate();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bnext = new javax.swing.JButton();
        lnext = new javax.swing.JLabel();
        scrollgrafo = new javax.swing.JScrollPane();
        lgrafofinal = new javax.swing.JLabel();
        bplay = new javax.swing.JButton();
        txtExplicacion = new javax.swing.JTextArea();
        lexplicacion = new javax.swing.JLabel();
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
        getContentPane().add(bnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 90, 90));

        lnext.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lnext.setForeground(new java.awt.Color(255, 255, 255));
        lnext.setText("SIGUIENTE");
        getContentPane().add(lnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, -1));

        scrollgrafo.setViewportView(lgrafofinal);

        getContentPane().add(scrollgrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 400, 250));

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
        getContentPane().add(bplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 90, 90));

        txtExplicacion.setBackground(new java.awt.Color(255, 255, 255));
        txtExplicacion.setColumns(20);
        txtExplicacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtExplicacion.setForeground(new java.awt.Color(0, 0, 0));
        txtExplicacion.setLineWrap(true);
        txtExplicacion.setRows(5);
        txtExplicacion.setWrapStyleWord(true);
        txtExplicacion.setFocusable(false);
        getContentPane().add(txtExplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 380, 70));

        lexplicacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lexplicacion.setForeground(new java.awt.Color(255, 255, 255));
        lexplicacion.setText("Explicación:");
        getContentPane().add(lexplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        liniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        liniciar.setForeground(new java.awt.Color(255, 255, 255));
        liniciar.setText("INICIAR");
        getContentPane().add(liniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, -1));

        lgoback.setForeground(new java.awt.Color(255, 255, 255));
        lgoback.setText("REGRESAR");
        getContentPane().add(lgoback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, -1, 30));

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
        getContentPane().add(bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 50, 50));

        scrollimagen.setViewportView(lgrafo);

        getContentPane().add(scrollimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 540, 540));

        ltitutlo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        ltitutlo.setForeground(new java.awt.Color(255, 255, 255));
        ltitutlo.setText("Grafos: Matriz de Adyacencia");
        getContentPane().add(ltitutlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padmin-wallpaper.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        CargarGrafo c = new CargarGrafo(usuarioaux);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsalirActionPerformed
  
    private void bplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplayActionPerformed
        y = 0;
        bplay.setEnabled(false);
        bnext.setEnabled(true);
    }//GEN-LAST:event_bplayActionPerformed

    private void bnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnextActionPerformed
         if(y<x+1){
                    bplay.setEnabled(false);
                    ImageIcon icono = new ImageIcon("C:/Reportes/Grafo"+y+".png");
                    icono.getImage().flush();
                    lgrafo.setIcon(icono);
                    lgrafo.setHorizontalAlignment(JLabel.CENTER);
                    lgrafo.setVerticalAlignment(JLabel.TOP);
                    lgrafo.validate();
                    lgrafo.revalidate();
                    scrollimagen.validate();
                    scrollimagen.revalidate();
                    if(y<(x/2)){
                       txtExplicacion.setText("Creando vertices...");
                    } else if(y>=(x/2) && y<x){
                       txtExplicacion.setText("Creando adyacencias...");
                    } else {
                       txtExplicacion.setText("Matriz de adyacencia terminada.");
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
                    bnext.setEnabled(false);
                    bplay.setEnabled(true);
                }   
    }//GEN-LAST:event_bnextActionPerformed
  
    
    public void SetearGrafoFinal(Grafo grafo, JSONObject jSONObject){
        try {
        JSONArray jsonArray = (JSONArray) jSONObject.get("Graph");
        this.x = jsonArray.size()*2;
        grafo = new Grafo(jsonArray.size());
        grafo.x = 0;
        for(Object Obj: jsonArray){
            JSONObject o = (JSONObject) Obj;
            String s = String.valueOf(o.get("Node"));
            grafo.AgregarVertice(s);
            grafo.GraficarListaDeAdyacencia();
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
            grafo.GraficarListaDeAdyacencia();
        }
        grafo.GraficarMatrizDeAdyacencia();
        grafo.GraficarGrafo("");
        ImageIcon icono = new ImageIcon("C:/Reportes/GrafoFinal.png");
        icono.getImage().flush();
        lgrafofinal.setIcon(icono);
        lgrafofinal.setHorizontalAlignment(JLabel.CENTER);
        lgrafofinal.setVerticalAlignment(JLabel.TOP);
        lgrafofinal.validate();
        lgrafofinal.revalidate();
        scrollgrafo.validate();
        scrollgrafo.revalidate();
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
    private javax.swing.JLabel lexplicacion;
    private javax.swing.JLabel lgoback;
    public javax.swing.JLabel lgrafo;
    public javax.swing.JLabel lgrafofinal;
    private javax.swing.JLabel liniciar;
    private javax.swing.JLabel lnext;
    public javax.swing.JLabel ltitutlo;
    public javax.swing.JScrollPane scrollgrafo;
    public javax.swing.JScrollPane scrollimagen;
    public javax.swing.JTextArea txtExplicacion;
    // End of variables declaration//GEN-END:variables
}
