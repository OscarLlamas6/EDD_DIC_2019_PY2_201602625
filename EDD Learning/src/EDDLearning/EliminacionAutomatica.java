
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
import javax.swing.SwingUtilities;

public class EliminacionAutomatica extends javax.swing.JFrame {

    public Usuario usuarioaux;
    public AVLTree arbol;
    public ListaSimple numeros;
    public static int velocidad = 1;
    public static String global = "";
    
    public EliminacionAutomatica(Usuario usuarioaux, ListaSimple numeros) {
        this.numeros = numeros;
        this.arbol = new AVLTree();
        this.usuarioaux = usuarioaux;
        initComponents();
        LlenarArbol();
        GraficarYSetear(this.arbol.root);
        SetearBanco(this.numeros, TFdisponible);
        this.setTitle("EDD Learning | INSERCIÓN AUTOMÁTICA - By Oscar Llamas");
        this.setLocationRelativeTo(null);
        this.validate();
        this.revalidate();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lvelocidad = new javax.swing.JLabel();
        JSvelocidad = new javax.swing.JSlider();
        lgoback = new javax.swing.JLabel();
        bsalir = new javax.swing.JButton();
        lexplicacion = new javax.swing.JLabel();
        scrollexplicacion = new javax.swing.JScrollPane();
        txtExplicacion = new javax.swing.JTextArea();
        beliminar = new javax.swing.JButton();
        TFinsertar = new javax.swing.JTextField();
        ldisponibles = new javax.swing.JLabel();
        TFdisponible = new javax.swing.JTextField();
        scrollimagen = new javax.swing.JScrollPane();
        lavl = new javax.swing.JLabel();
        ltitutlo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lvelocidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lvelocidad.setForeground(new java.awt.Color(255, 255, 255));
        lvelocidad.setText("Velocidad:");
        getContentPane().add(lvelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        JSvelocidad.setBackground(new java.awt.Color(0, 0, 0));
        JSvelocidad.setForeground(new java.awt.Color(255, 255, 255));
        JSvelocidad.setMajorTickSpacing(1);
        JSvelocidad.setMaximum(10);
        JSvelocidad.setMinimum(3);
        JSvelocidad.setMinorTickSpacing(1);
        JSvelocidad.setPaintLabels(true);
        JSvelocidad.setPaintTicks(true);
        JSvelocidad.setValue(3);
        JSvelocidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JSvelocidadStateChanged(evt);
            }
        });
        getContentPane().add(JSvelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

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

        lexplicacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lexplicacion.setForeground(new java.awt.Color(255, 255, 255));
        lexplicacion.setText("Explicación:");
        getContentPane().add(lexplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtExplicacion.setBackground(new java.awt.Color(255, 255, 255));
        txtExplicacion.setColumns(20);
        txtExplicacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtExplicacion.setForeground(new java.awt.Color(0, 0, 0));
        txtExplicacion.setLineWrap(true);
        txtExplicacion.setRows(5);
        txtExplicacion.setWrapStyleWord(true);
        txtExplicacion.setFocusable(false);
        scrollexplicacion.setViewportView(txtExplicacion);

        getContentPane().add(scrollexplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 390, 100));

        beliminar.setBackground(new java.awt.Color(255, 255, 255));
        beliminar.setForeground(new java.awt.Color(0, 0, 0));
        beliminar.setText("ELIMINAR");
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });
        getContentPane().add(beliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 100, 40));

        TFinsertar.setBackground(new java.awt.Color(255, 255, 255));
        TFinsertar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TFinsertar.setForeground(new java.awt.Color(0, 0, 0));
        TFinsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFinsertarActionPerformed(evt);
            }
        });
        TFinsertar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFinsertarKeyTyped(evt);
            }
        });
        getContentPane().add(TFinsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 40));

        ldisponibles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ldisponibles.setForeground(new java.awt.Color(255, 255, 255));
        ldisponibles.setText("Banco de números disponibles:");
        getContentPane().add(ldisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        TFdisponible.setBackground(new java.awt.Color(255, 255, 255));
        TFdisponible.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TFdisponible.setForeground(new java.awt.Color(0, 0, 0));
        TFdisponible.setFocusable(false);
        getContentPane().add(TFdisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 380, 40));

        scrollimagen.setViewportView(lavl);

        getContentPane().add(scrollimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 540, 540));

        ltitutlo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        ltitutlo.setForeground(new java.awt.Color(255, 255, 255));
        ltitutlo.setText("ÁRBOL AVL: ELIMINACIÓN");
        getContentPane().add(ltitutlo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padmin-wallpaper.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        CargarArbol c = new CargarArbol(usuarioaux);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bsalirActionPerformed

    public void GraficarYSetear(AVLTree.Node n){           
            try { 
            Graficar(n);
            TimeUnit.SECONDS.sleep(velocidad);                      
            ImageIcon i = new ImageIcon("C:/Reportes/AVL.png");
            i.getImage().flush();
            this.lavl.setIcon(i);
            this.lavl.setHorizontalAlignment(JLabel.CENTER);
            this.lavl.setVerticalAlignment(JLabel.TOP);
            this.lavl.validate();
            this.lavl.revalidate();
            this.lavl.repaint();
            this.scrollimagen.setViewportView(this.lavl);
            this.scrollimagen.validate();
            this.scrollimagen.revalidate();
            this.scrollimagen.repaint();
            this.revalidate();
            this.validate();
            this.repaint();
             } catch (Exception e) {
            
            } 
            
    }
    
 
    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed
        if(!TFinsertar.getText().equals("")){
        if(this.arbol.root != null){
                int aux = Integer.parseInt(TFinsertar.getText());       
        if(ExisteEnElBanco(aux)){           
            this.numeros = this.numeros.delete(this.numeros, aux);
            this.TFinsertar.setText("");
            SetearBanco(this.numeros, this.TFdisponible);
            this.arbol.root = deleteNodeAuto(this.arbol.root, aux);
            this.GraficarYSetear(this.arbol.root);
            this.txtExplicacion.setText("Eliminamos "+aux+".");
            this.validate();
            this.revalidate();
            this.repaint();                      
        } else {
            this.TFinsertar.setText("");
            SetearBanco(this.numeros, this.TFdisponible);
            this.txtExplicacion.setText("");
        }
        }else {
            GraficarNull();
        }
        } else {
            this.txtExplicacion.setText("");
        }
    }//GEN-LAST:event_beliminarActionPerformed

    private void TFinsertarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFinsertarKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || c ==  KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE )){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TFinsertarKeyTyped

    private void JSvelocidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JSvelocidadStateChanged
       this.velocidad = JSvelocidad.getValue();
    }//GEN-LAST:event_JSvelocidadStateChanged

    private void TFinsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFinsertarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFinsertarActionPerformed

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
           
     public Node deleteNodeAuto(Node root, int dato) {

        if (root == null)
            return root;
        if ( dato < root.dato )
            root.izquierdo = deleteNodeAuto(root.izquierdo, dato);

        else if( dato > root.dato )
            root.derecho = deleteNodeAuto(root.derecho, dato);

        else {

            if( (root.izquierdo == null) || (root.derecho == null) ) {

                Node temp;
                if (root.izquierdo != null)
                        temp = root.izquierdo;
                else
                    temp = root.derecho;

                if(temp == null) {
                    temp = root;
                    root = null;
                }
                else 
                    root = temp; 

                temp = null;
            }
            else {
                Node temp = minValueNode(root.derecho);
                root.dato = temp.dato;
                root.derecho = deleteNodeAuto(root.derecho, temp.dato);
            }
        }

 
        if (root == null)
            return root;

        root.altura = Math.max(altura(root.izquierdo), altura(root.derecho)) + 1;

        int balance = getBalance(root);


        // IZQUIERDA IZQUIERDA
        if (balance > 1 && getBalance(root.izquierdo) >= 0)
            return derechoRotate(root);

        // IZQUIERDA DERECHA
        if (balance > 1 && getBalance(root.izquierdo) < 0) {
            root.izquierdo =  izquierdoRotate(root.izquierdo);
            return derechoRotate(root);
        }

        // DERECHA DERECHA
        if (balance < -1 && getBalance(root.derecho) <= 0)
            return izquierdoRotate(root);

        // DERECHA IZQUIERDA
        if (balance < -1 && getBalance(root.derecho) > 0) {
            root.derecho = derechoRotate(root.derecho);
            return izquierdoRotate(root);
        }

        return root;
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
                TimeUnit.SECONDS.sleep(velocidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(EliminacionAutomatica.class.getName()).log(Level.SEVERE, null, ex);
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
            txtExplicacion.setText("El árbol está vacío, por lo tanto su cabeza es interpretada como null.");
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
            String command = "dot.exe -Tpng C:/Reportes/salida.dot -o C:/Reportes/AVL.png";
            Process p = Runtime.getRuntime().exec(command);
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
            
        
    public void SetearBanco(ListaSimple numeros, JTextField disponibles){
      ListaSimple.Node aux = numeros.head;
      boolean primero = true;    
      String s = "";
      while(aux!=null){         
          if(primero){
              primero = false;
              s+=aux.data;
          }else{
              s+=", "+aux.data;
          }
          aux = aux.next;
      }
      disponibles.setText(s);
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider JSvelocidad;
    public javax.swing.JTextField TFdisponible;
    private javax.swing.JTextField TFinsertar;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel fondo;
    public javax.swing.JLabel lavl;
    private javax.swing.JLabel ldisponibles;
    private javax.swing.JLabel lexplicacion;
    private javax.swing.JLabel lgoback;
    private javax.swing.JLabel ltitutlo;
    private javax.swing.JLabel lvelocidad;
    private javax.swing.JScrollPane scrollexplicacion;
    public javax.swing.JScrollPane scrollimagen;
    public javax.swing.JTextArea txtExplicacion;
    // End of variables declaration//GEN-END:variables
}
