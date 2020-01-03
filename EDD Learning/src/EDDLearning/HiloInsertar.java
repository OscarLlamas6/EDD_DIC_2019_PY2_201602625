
package EDDLearning;

import static EDDLearning.InsercionAutomatica.global;
import java.io.File;
import java.io.PrintStream;
import javax.swing.*;
import EDDLearning.AVLTree.*;
import static EDDLearning.InsercionAutomatica.velocidad;
import java.util.concurrent.TimeUnit;



public class HiloInsertar extends Thread{
    
    JFrame frame;
    JLabel label;
    JScrollPane scroll;
    AVLTree arbol;
    int aux;
    JButton boton;
    
    public HiloInsertar(JFrame frame, JLabel label, JScrollPane scroll, AVLTree arbol, int aux, JButton boton){
        this.frame = frame;
        this.label = label;
        this.scroll = scroll;
        this.arbol = arbol;
        this.boton = boton;
        this.aux = aux;
    }
    
    @Override
    public void run(){
        try {
            boton.setEnabled(false);
            arbol.root = insertAuto(arbol.root, aux);
            Graficar(arbol.root);
            HiloInsertar.sleep(velocidad);
            Setear();
            boton.setEnabled(true);
            label.revalidate();
            scroll.revalidate();
            frame.revalidate();
            frame.repaint();
            this.stop();
        } catch (Exception ex) {
           
        }
        
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
    
    public int altura (Node N) {
        if (N == null)
            return 0;
        return N.altura;
    }
          
    public Node derechoRotate(Node y) {
        AVLTree.Node x = y.izquierdo;
        AVLTree.Node T2 = x.derecho;
        x.derecho = y;
        y.izquierdo = T2;
        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho))+1;
        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho))+1;
        return x;
    }

    public Node izquierdoRotate(AVLTree.Node x) {
        AVLTree.Node y = x.derecho;
        AVLTree.Node T2 = y.izquierdo;
        y.izquierdo = x;
        x.derecho = T2;
        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho))+1;
        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho))+1;
        return y;
    }

    public int getBalance(AVLTree.Node N) {
        if (N == null)
            return 0;
        return altura(N.izquierdo) - altura(N.derecho);
    }

    public AVLTree.Node minValueNode(AVLTree.Node node) {
        AVLTree.Node current = node;
        while (current.izquierdo != null)
            current = current.izquierdo;
        return current;
    }
     
    public void Setear(){                                                                      
            ImageIcon i = new ImageIcon("C:/Reportes/AVL.png");
            i.getImage().flush();
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.TOP);
            label.setIcon(i);
            label.validate();
            label.revalidate();
            label.repaint();
            scroll.setViewportView(label);
            scroll.validate();
            scroll.revalidate();
            scroll.repaint();
            frame.revalidate();
            frame.validate();
            frame.repaint();           
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
     
}
