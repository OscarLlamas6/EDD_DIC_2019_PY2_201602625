package EDDLearning;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;


public class Pila {
        
    public static class Node{ 
  
       private String dato; 
       private Node next;  
        Node(String dato) 
        { 
            this.dato = dato;
            this.next = null; 
        }                 
        public String getDato() { return dato; }
        public void setDato(String dato) { this.dato = dato; }
        public Node getNext() { return next; }
        public void setNext(Node next) { this.next = next; }
    } 
    
    private Node cima;
    private int size;
    
    public boolean EstaVacia(){
        if(getSize()==0){
            return true;
        }else {
            return false;
        }
    } 
    
    public void push(String dato){
        Node n = new Node(dato);
        if(EstaVacia()){
            this.cima = n;
            this.size++;
        }else {
            n.setNext(this.cima);
            this.cima = n;
            this.size++;
        }
    }
    
    public void pop(){
        if(!EstaVacia()){
            this.cima = this.cima.getNext();
            this.size--;                   
        }
    }
    
    public void Graficar(int x){
       File file = new File("C:/Reportes/salida3.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph Pila{");
            ps.println();
            ps.println("node[shape=record];");   
            ps.println("rankdir=LR;");  
            ps.println();
            boolean primero = true;
            String pila = "Pila[label=\"";
            Pila.Node aux = this.getCima();
            while(aux != null){
                if(primero){
                    primero = false;
                    pila+=" "+aux.getDato()+" ";
                } else {
                   pila+="| "+aux.getDato()+" "; 
                }              
                aux = aux.getNext();
            }
            pila+="\"];";
            ps.println(pila);
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida3.dot -o C:/Reportes/Pila"+x+".png";
            Process p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException ex) {
          
        }
        } catch (IOException ex) {
            
        }     
    }
    
    public Node getCima() { return this.cima; }
    public void setCima(Node cima) {this.cima = cima; }
    public int getSize() { return this.size; }
    public void setSize(int size) { this.size = size; }
    
}
