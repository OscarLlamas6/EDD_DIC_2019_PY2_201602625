
package GrafoGFG;

public class Cola {
   
   
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
    
    public Node getFrente() { return this.frente;}
    public void setFrente(Node frente) { this.frente = frente; }
    public Node getFin() { return this.fin;}
    public void setFin(Node fin) { this.fin = fin; }
    public int getSize() { return this.size;  }
    public void setSize(int size) { this.size = size; }
       
    
}
