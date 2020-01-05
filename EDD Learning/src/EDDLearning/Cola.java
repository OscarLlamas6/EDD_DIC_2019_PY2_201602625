
package EDDLearning;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

public class Cola {
   
   
   public static class Node{ 
  
       private String dato; 
       private Node next;  
        Node(String dato) 
        { 
            this.dato = dato;
            this.next = null; 
        }                 
        public String getDato() { return this.dato; }
        public void setDato(String dato) { this.dato = dato; }
        public Node getNext() { return next; }
        public void setNext(Node next) { this.next = next; }
    } 
    
    private Node frente;
    private Node fin;
    private int size;
        
    public Cola(){
        this.frente = null;
        this.fin = null;
        this.size = 0;
    }
    
    public boolean EstaVacia(){
        if(getSize()==0){
            return true;
        }else {
            return false;
        }
    } 
    
    public void enqueue(String dato){
        Node n = new Node(dato);
        if(EstaVacia()){
            this.setFrente(n);
        }else {
            this.getFin().setNext(n);
        }
        this.setFin(n);
        this.setSize(this.getSize() + 1);
    }
    
    public void dequeue(){
        if(!EstaVacia()){
            setFrente(getFrente().getNext());
            setSize(getSize() - 1);
        }
    }
    
    public void Graficar(int x){
       File file = new File("C:/Reportes/salida2.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph Cola{");
            ps.println();
            ps.println("node[shape=record];");   
            ps.println();
            boolean primero = true;
            String cola = "Cola[label=\"";
            Node aux = this.getFrente();
            while(aux != null){
                if(primero){
                    primero = false;
                    cola+=" "+aux.getDato()+" ";
                } else {
                   cola+="| "+aux.getDato()+" "; 
                }              
                aux = aux.getNext();
            }
            cola+="\"];";
            ps.println(cola);
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida2.dot -o C:/Reportes/Cola"+x+".png";
            Process p = Runtime.getRuntime().exec(command);
            command = "Salida.png";
            p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException ex) {
          
        }
        } catch (IOException ex) {
            
        }     
    }
    
    public Node getFrente() { return this.frente;}
    public void setFrente(Node frente) { this.frente = frente; }
    public Node getFin() { return this.fin;}
    public void setFin(Node fin) { this.fin = fin; }
    public int getSize() { return this.size;  }
    public void setSize(int size) { this.size = size; }
       
    
}
