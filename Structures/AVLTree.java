
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;





public class AVLTree {
    
    public class Node {
        private Node izquierdo, derecho;
        private int altura = 1;
        private int dato;

        private Node (int val) {
            this.dato = val;
        }
    }
    
    public Node root;
    public static String global = "";
    
    private int altura (Node N) {
        if (N == null)
            return 0;
        return N.altura;
    }

    private Node insert(Node node, int dato) {
        if (node == null) {
            return(new Node(dato));
        }

        if (dato < node.dato)
            node.izquierdo  = insert(node.izquierdo, dato);
        else
            node.derecho = insert(node.derecho, dato);

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

    private Node derechoRotate(Node y) {
        Node x = y.izquierdo;
        Node T2 = x.derecho;
        x.derecho = y;
        y.izquierdo = T2;
        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho))+1;
        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho))+1;
        return x;
    }

    private Node izquierdoRotate(Node x) {
        Node y = x.derecho;
        Node T2 = y.izquierdo;
        y.izquierdo = x;
        x.derecho = T2;
        x.altura = Math.max(altura(x.izquierdo), altura(x.derecho))+1;
        y.altura = Math.max(altura(y.izquierdo), altura(y.derecho))+1;
        return y;
    }

    private int getBalance(Node N) {
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

    private Node minValueNode(Node node) {
        Node current = node;
        while (current.izquierdo != null)
            current = current.izquierdo;
        return current;
    }

    private Node deleteNode(Node root, int dato) {

        if (root == null)
            return root;
        if ( dato < root.dato )
            root.izquierdo = deleteNode(root.izquierdo, dato);

        else if( dato > root.dato )
            root.derecho = deleteNode(root.derecho, dato);

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
                root.derecho = deleteNode(root.derecho, temp.dato);
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
           global+=n.dato+";\r\n";         
           
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
        } catch (IOException ex) {
            
        }     
    }
    
    public static void main(String args[]) {
        AVLTree arbol = new AVLTree();
        arbol.root = arbol.insert(arbol.root, 6);
        arbol.root = arbol.insert(arbol.root, 11);
        arbol.root = arbol.insert(arbol.root, 28);
        arbol.root = arbol.insert(arbol.root, 9);
        arbol.root = arbol.deleteNode(arbol.root, 28);
        arbol.Graficar();
    }
}