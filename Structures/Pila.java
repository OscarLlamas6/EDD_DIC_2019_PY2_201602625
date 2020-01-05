
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
    
    public Node getCima() { return this.cima; }
    public void setCima(Node cima) {this.cima = cima; }
    public int getSize() { return this.size; }
    public void setSize(int size) { this.size = size; }
    
}
