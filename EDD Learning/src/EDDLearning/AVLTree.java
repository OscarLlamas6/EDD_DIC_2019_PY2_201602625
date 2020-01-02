package EDDLearning;


import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;





public class AVLTree {
    
    public class Node {
        public Node izquierdo, derecho;
        public int altura = 1;
        public int dato;

        public Node (int val) {
            this.dato = val;
        }
    }
    
    public Node root;
    public static String global = "";

    public AVLTree(){
        this.root = null;
    }
    
    public int altura (Node N) {
        if (N == null)
            return 0;
        return N.altura;
    }

    public Node insertAuto(Node node, int dato) {
        if (node == null) {
            return(new Node(dato));
        }

        if (dato < node.dato){
        node.izquierdo  = insertAuto(node.izquierdo, dato);
        }
            
        else{
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

    public Node insertManual(Node node, int dato) {
        if (node == null) {
            return(new Node(dato));
        }

        if (dato < node.dato)
            node.izquierdo  = insertManual(node.izquierdo, dato);
        else
            node.derecho = insertManual(node.derecho, dato);

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

    public void preOrder(Node root) {
        if (root != null) {
            preOrder(root.izquierdo);
            System.out.printf("%d ", root.dato);
            preOrder(root.derecho);
        }
    }

    public Node minValueNode(Node node) {
        Node current = node;
        while (current.izquierdo != null)
            current = current.izquierdo;
        return current;
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
    
    public Node deleteNodeManual(Node root, int dato) {

        if (root == null)
            return root;
        if ( dato < root.dato )
            root.izquierdo = deleteNodeManual(root.izquierdo, dato);

        else if( dato > root.dato )
            root.derecho = deleteNodeManual(root.derecho, dato);

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
                root.derecho = deleteNodeManual(root.derecho, temp.dato);
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

    public void RecursiveALV(Node n){
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
            
   public void GraficarYSetear(JLabel label, JScrollPane scroll, JFrame frame){
            Graficar();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(AVLTree.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon i = new ImageIcon("C:/Reportes/AVL.png");
            i.getImage().flush();
            label.setIcon(i);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.validate();
            label.revalidate();
            scroll.setViewportView(label);
            scroll.revalidate();
            frame.revalidate();
            frame.validate();
            frame.repaint();
   }
            
    public void Graficar() {
       File file = new File("salida.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph AVL{");
            ps.println();
            ps.println("node[shape=oval];");
            ps.println();
            global = "";
            RecursiveALV(this.root);
            ps.println(global);
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng src/salida.dot -o src/Images/AVL.png";
            Process p = Runtime.getRuntime().exec(command);
        } catch (IOException ex) {
            
        }     
    }
    
}