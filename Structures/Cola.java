
package cola;

public class Cola {
   
    static class Node{ 
  
        int data; 
        Node next;  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        }                 
    } 
    
    public Node frente;
    public Node fin;
    public int size;
        
    public Cola(){
        this.frente = null;
        this.fin = null;
        this.size = 0;
    }
    
    public boolean EstaVacia(){
        if(size==0){
            return true;
        }else {
            return false;
        }
    } 
    
    public void enqueue(int data){
        Node n = new Node(data);
        if(EstaVacia()){
            this.frente = n;
        }else {
            this.fin.next = n;
        }
        this.fin = n;
        this.size++;
    }
    
    public void dequeue(){
        if(!EstaVacia()){
            frente = frente.next;
            size--;
        }
    }
       
    public static void main(String[] args) {
        Cola c = new Cola();
        c.enqueue(1);
        c.enqueue(2);
        c.enqueue(3);
        c.enqueue(4);
        c.dequeue();
        System.out.println(c.frente.data);
        System.out.println(c.fin.data);
    }
    
}
