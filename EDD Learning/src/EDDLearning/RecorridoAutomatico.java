
package EDDLearning;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import EDDLearning.AVLTree.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class RecorridoAutomatico extends javax.swing.JFrame {

    public JFrame frame = this;
    public Usuario usuarioaux;
    public AVLTree arbol;
    public ListaSimple numeros;
    public static int velocidad = 1;
    public static String global = "";
    public int x = 0;
    public int y = 0;
    Timer timer;
    boolean primero = true;
    String recorrido;
    
    public RecorridoAutomatico(Usuario usuarioaux, ListaSimple numeros, String recorrido) {
        this.recorrido = recorrido;
        this.timer = new Timer((velocidad*1000), new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(y<x){
                    ImageIcon icono = new ImageIcon("C:/Reportes/AVL"+y+".png");
                    icono.getImage().flush();
                    lavl.setIcon(icono);
                    lavl.setHorizontalAlignment(JLabel.CENTER);
                    lavl.setVerticalAlignment(JLabel.TOP);
                    lavl.validate();
                    lavl.revalidate();
                    lavl.repaint();
                    scrollimagen.validate();
                    scrollimagen.revalidate();
                    scrollimagen.repaint();
                    frame.validate();
                    frame.revalidate();
                    frame.repaint();
                    y++;
                } else {
                    timer.stop();
                }                                       
            }
        }); 
        this.numeros = numeros;
        this.arbol = new AVLTree();
        this.usuarioaux = usuarioaux;
        initComponents();
        LlenarArbol();       
        if(this.arbol.root!=null){
          GraficarYSetearArbol(this.arbol.root);
          bplay.setEnabled(true);
        }else {
          GraficarNull();
          bplay.setEnabled(false);
          TFrecorrido.setText("Árbol vacio no hay recorrido que mostrar.");
        }
        velocidad = JSvelocidad.getValue();
        ltitutlo.setText("ÁRBOLES AVL: RECORRIDO: "+recorrido);
        this.setTitle("EDD Learning | PREORDEN AUTOMÁTICO - By Oscar Llamas");
        this.setLocationRelativeTo(null);
        this.validate();
        this.revalidate();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bplay = new javax.swing.JButton();
        liniciar = new javax.swing.JLabel();
        lvelocidad = new javax.swing.JLabel();
        JSvelocidad = new javax.swing.JSlider();
        lgoback = new javax.swing.JLabel();
        bsalir = new javax.swing.JButton();
        lrecorrido = new javax.swing.JLabel();
        TFrecorrido = new javax.swing.JTextField();
        scrollimagen = new javax.swing.JScrollPane();
        lavl = new javax.swing.JLabel();
        ltitutlo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(bplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 90, 90));

        liniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        liniciar.setForeground(new java.awt.Color(255, 255, 255));
        liniciar.setText("INICIAR");
        getContentPane().add(liniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        lvelocidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvelocidad.setForeground(new java.awt.Color(255, 255, 255));
        lvelocidad.setText("Velocidad:");
        getContentPane().add(lvelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        JSvelocidad.setBackground(new java.awt.Color(0, 0, 0));
        JSvelocidad.setForeground(new java.awt.Color(255, 255, 255));
        JSvelocidad.setMajorTickSpacing(1);
        JSvelocidad.setMaximum(10);
        JSvelocidad.setMinimum(2);
        JSvelocidad.setMinorTickSpacing(1);
        JSvelocidad.setPaintLabels(true);
        JSvelocidad.setPaintTicks(true);
        JSvelocidad.setValue(2);
        JSvelocidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JSvelocidadStateChanged(evt);
            }
        });
        getContentPane().add(JSvelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        lgoback.setForeground(new java.awt.Color(255, 255, 255));
        lgoback.setText("REGRESAR");
        getContentPane().add(lgoback, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 70, 30));

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
        getContentPane().add(bsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 50, 50));

        lrecorrido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lrecorrido.setForeground(new java.awt.Color(255, 255, 255));
        lrecorrido.setText("RECORRIDO:");
        getContentPane().add(lrecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        TFrecorrido.setBackground(new java.awt.Color(255, 255, 255));
        TFrecorrido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TFrecorrido.setForeground(new java.awt.Color(0, 0, 0));
        TFrecorrido.setFocusable(false);
        getContentPane().add(TFrecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 380, 40));

        scrollimagen.setViewportView(lavl);

        getContentPane().add(scrollimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 540, 540));

        ltitutlo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        ltitutlo.setForeground(new java.awt.Color(255, 255, 255));
        ltitutlo.setText("ÁRBOL AVL: RECORRIDO");
        getContentPane().add(ltitutlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padmin-wallpaper.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        CargarArbol c = new CargarArbol(usuarioaux);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsalirActionPerformed

    public void GraficarYSetearArbol(AVLTree.Node n){           
           File file = new File("C:/Reportes/salida.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph AVL{");
            ps.println();
            ps.println("node[shape=oval];");
            ps.println();
            global = "";
            RecursiveALV(n);
            ps.println(global);
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida.dot -o C:/Reportes/AVL.png";
            Process p = Runtime.getRuntime().exec(command);
            try {
                TimeUnit.MILLISECONDS.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(RecorridoAutomatico.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon i = new ImageIcon("C:/Reportes/AVL.png");
            i.getImage().flush();
            this.lavl.setIcon(i);
            lavl.setHorizontalAlignment(JLabel.CENTER);
            lavl.setVerticalAlignment(JLabel.TOP);
            this.lavl.validate();
            this.lavl.revalidate();
            scrollimagen.setViewportView(this.lavl);
            scrollimagen.revalidate();
            this.revalidate();
            this.validate();
            this.repaint();    
        } catch (Exception e) {
            
        } 
    }
     
    private void JSvelocidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JSvelocidadStateChanged
       this.velocidad = JSvelocidad.getValue();
    }//GEN-LAST:event_JSvelocidadStateChanged

    private void bplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bplayActionPerformed
        TFrecorrido.setText("");
        primero = true;
        x = 0;
        y = 0;
        if(this.recorrido.equals("PREORDEN")){
         preOrder(arbol.root);   
        } else if(this.recorrido.equals("INORDEN")){
         inOrder(arbol.root);   
        }else if(this.recorrido.equals("POSTORDEN")){
            postOrder(arbol.root);   
        }  
        this.timer.setInitialDelay(0);
        this.timer.start();   
    }//GEN-LAST:event_bplayActionPerformed

    public int altura (Node N) {
        if (N == null)
            return 0;
        return N.altura;
    }

    private Node insertAuto(Node node, int dato){
        if (node == null) {
            return(this.arbol.new Node(dato));
        }

        if (dato < node.dato){
        node.izquierdo  = insertAuto(node.izquierdo, dato);
        } else{
            node.derecho = insertAuto(node.derecho, dato);           
        }
            
        
        node.altura = Math.max(altura(node.izquierdo), altura(node.derecho)) + 1;
        int balance = getBalance(node);          
              
        
        // IZQUIERDA IZQUIERDA
        if (balance > 1 && dato < node.izquierdo.dato)
            return derechoRotate(node);

        // DERECHA DERECHA
        if (balance < -1 && dato > node.derecho.dato)
            return izquierdoRotate(node);

        // IZQUIERDA DERECHA
        if (balance > 1 && dato > node.izquierdo.dato)
        {
            node.izquierdo =  izquierdoRotate(node.izquierdo);
            return derechoRotate(node);
        }

        // DERECHA IZQUIERDA
        if (balance < -1 && dato < node.derecho.dato)
        {
            node.derecho = derechoRotate(node.derecho);
            return izquierdoRotate(node);
        }
        
        return node;
    }
              
    public Node derechoRotate(Node y) {
        Node x = y.izquierdo;
        Node T2 = x.derecho;
        x.derecho = y;
        y.izquierdo = T2;
        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho))+1;
        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho))+1;
        return x;
    }

    public Node izquierdoRotate(Node x) {
        Node y = x.derecho;
        Node T2 = y.izquierdo;
        y.izquierdo = x;
        x.derecho = T2;
        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho))+1;
        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho))+1;
        return y;
    }

    public int getBalance(Node N) {
        if (N == null)
            return 0;
        return altura(N.izquierdo) - altura(N.derecho);
    }

    public Node minValueNode(Node node) {
        Node current = node;
        while (current.izquierdo != null)
            current = current.izquierdo;
        return current;
    }
      
    public void GraficarNull(){
        File file = new File("C:/Reportes/salida.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph AVL{");
            ps.println();
            ps.println("null;");
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida.dot -o C:/Reportes/AVL.png";
            Process p = Runtime.getRuntime().exec(command);
            try {
                TimeUnit.MILLISECONDS.sleep(400);
            } catch (InterruptedException ex) {
                Logger.getLogger(RecorridoAutomatico.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon i = new ImageIcon("C:/Reportes/AVL.png");
            i.getImage().flush();
            this.lavl.setIcon(i);
            this.lavl.validate();
            this.lavl.revalidate();
            scrollimagen.setViewportView(this.lavl);
            scrollimagen.revalidate();
           
            this.revalidate();
            this.validate();
            this.repaint();           
        } catch (IOException ex) {
            
        }  
    }
        
    public void RecursiveALV(AVLTree.Node n){
        if(n!=null){
           global+=n.dato+"[xlabel=\""+n.altura+"\"];\r\n";           
           
           RecursiveALV(n.izquierdo);
           RecursiveALV(n.derecho);
           
           if(n.izquierdo!=null){
           global+=n.dato+"->"+n.izquierdo.dato+";\r\n";
           }
           if(n.derecho!=null){
           global+=n.dato+"->"+n.derecho.dato+";\r\n";
           }          
        }
    }
                
    public void RecursiveALVInt(AVLTree.Node n, int aux){
        if(n!=null){
            
           if(n.dato==aux){
             global+=n.dato+"[xlabel=\""+n.altura+"\", style = filled, fillcolor = chartreuse];\r\n";   
           } else {
             global+=n.dato+"[xlabel=\""+n.altura+"\"];\r\n";    
           }
            
                    
           
           RecursiveALVInt(n.izquierdo, aux);
           RecursiveALVInt(n.derecho, aux);
           
           if(n.izquierdo!=null){
           global+=n.dato+"->"+n.izquierdo.dato+";\r\n";
           }
           if(n.derecho!=null){
           global+=n.dato+"->"+n.derecho.dato+";\r\n";
           }          
        }
    }
    
    public void Graficar(AVLTree.Node n) {
       File file = new File("C:/Reportes/salida.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph AVL{");
            ps.println();
            ps.println("node[shape=oval];");
            ps.println();
            global = "";
            RecursiveALV(n);
            ps.println(global);
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida.dot -o C:/Reportes/AVL"+x+".png";
            Process p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(400);
        } catch (InterruptedException ex) {
            Logger.getLogger(InsercionAutomatica.class.getName()).log(Level.SEVERE, null, ex);
        }
            x++;
        } catch (Exception e) {
            
        }     
    }
    
    public void GraficarInt(AVLTree.Node n, int aux) {
       File file = new File("C:/Reportes/salida.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph AVL{");
            ps.println();
            ps.println("node[shape=oval];");
            ps.println();
            global = "";
            RecursiveALVInt(n, aux);
            ps.println(global);
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida.dot -o C:/Reportes/AVL"+x+".png";
            Process p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(400);
        } catch (InterruptedException ex) {
            Logger.getLogger(InsercionAutomatica.class.getName()).log(Level.SEVERE, null, ex);
        }
            x++;
        } catch (Exception e) {
            
        }     
    }
    
    public boolean ExisteEnElBanco(int numero){
      ListaSimple.Node aux = numeros.head;
      while(aux!=null){         
          if(aux.data == numero){ return true;}
          aux = aux.next;
      }
      return false;
    }
    
    public void LlenarArbol(){
       ListaSimple.Node aux = numeros.head; 
       while(aux!=null){         
          this.arbol.root = insertAuto(this.arbol.root, aux.data);
          aux = aux.next;
      }
    }

    public void preOrder(Node root) {
        if (root != null) {
            GraficarInt(arbol.root, root.dato);
            String s = TFrecorrido.getText();
            if(primero){
               primero = false;
               s+=root.dato; 
            }else {
             s+=" - "+root.dato;   
            }
            TFrecorrido.setText(s);
            preOrder(root.izquierdo);            
            preOrder(root.derecho);
        }
    }
    
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.izquierdo);
            GraficarInt(arbol.root, root.dato);
            String s = TFrecorrido.getText();
            if(primero){
               primero = false;
               s+=root.dato; 
            }else {
             s+=" - "+root.dato;   
            }
            TFrecorrido.setText(s);                       
           inOrder(root.derecho);
        }
    }
    
    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.izquierdo);            
            postOrder(root.derecho);
            GraficarInt(arbol.root, root.dato);
            String s = TFrecorrido.getText();
            if(primero){
               primero = false;
               s+=root.dato; 
            }else {
             s+=" - "+root.dato;   
            }
            TFrecorrido.setText(s);           
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider JSvelocidad;
    public javax.swing.JTextField TFrecorrido;
    private javax.swing.JButton bplay;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel fondo;
    public javax.swing.JLabel lavl;
    private javax.swing.JLabel lgoback;
    private javax.swing.JLabel liniciar;
    private javax.swing.JLabel lrecorrido;
    public javax.swing.JLabel ltitutlo;
    private javax.swing.JLabel lvelocidad;
    public javax.swing.JScrollPane scrollimagen;
    // End of variables declaration//GEN-END:variables
}
