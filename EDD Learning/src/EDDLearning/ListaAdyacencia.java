package EDDLearning;

public class ListaAdyacencia { 
  
    private NodoAdyacencia head; 

    public NodoAdyacencia getHead() {  return this.head; }

    public void setHead(NodoAdyacencia head) { this.head = head; }
    
    public static class NodoAdyacencia { 
  
       private String data; 
       private NodoAdyacencia next; 
  
      public  NodoAdyacencia(String d) 
        { 
            this.data = d; 
            this.next = null; 
        } 

        public String getData() { return this.data; }
        public void setData(String data) { this.data = data; }
        public NodoAdyacencia getNext() { return this.next; }
        public void setNext(NodoAdyacencia next) { this.next = next; }
    } 
  
    
    public ListaAdyacencia(){
        this.head = null;
    }
    
    public ListaAdyacencia insert(ListaAdyacencia list, String data) 
    { 

        NodoAdyacencia new_node = new NodoAdyacencia(data); 
        new_node.setNext(null); 

        if (list.getHead() == null) { 
            list.setHead(new_node); 
        } 
        else { 

            NodoAdyacencia last = list.getHead(); 
            while (last.getNext() != null) { 
                last = last.getNext(); 
            } 
            last.setNext(new_node); 
        }  

        return list; 
    }  
    
    public ListaAdyacencia delete(ListaAdyacencia list, String key) 
    { 
        NodoAdyacencia currNode = list.getHead(), prev = null; 
  
        if (currNode != null && currNode.getData() == key) { 
            list.setHead(currNode.getNext()); 
            return list; 
        } 
  

        while (currNode != null && currNode.getData() != key) { 
            prev = currNode; 
            currNode = currNode.getNext(); 
        } 

        if (currNode != null) { 
            prev.setNext(currNode.getNext()); 
        } 

        if (currNode == null) { 
        } 
  
        return list; 
    } 
        
    public static void printList(ListaAdyacencia list) 
    { 
        NodoAdyacencia currNode = list.getHead();    
        System.out.print("Lista: ");   
        while (currNode != null) { 
            System.out.print(currNode.getData() + " ");   
            currNode = currNode.getNext(); 
        } 
    } 
      
} 