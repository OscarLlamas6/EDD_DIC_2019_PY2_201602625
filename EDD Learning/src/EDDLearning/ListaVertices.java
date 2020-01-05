package EDDLearning;

public class ListaVertices { 
  
    private NodoVertice head; 

    public NodoVertice getHead() { return this.head;}

    public void setHead(NodoVertice head) { this.head = head; }
    
    public static class NodoVertice { 
  
        private Vertice vertice; 
        private NodoVertice next; 
  
        NodoVertice(Vertice vertice) 
        { 
            this.vertice = vertice; 
            this.next = null; 
        } 
        
        public Vertice getVertice() {  return this.vertice; }
        public void setVertice(Vertice vertice) { this.vertice = vertice; }
        public NodoVertice getNext() { return next; }
        public void setNext(NodoVertice next) { this.next = next; }
    } 
  
    public ListaVertices insert(ListaVertices list, Vertice vertice) 
    { 

        NodoVertice new_node = new NodoVertice(vertice); 
        new_node.setNext(null); 

        if (list.getHead() == null) { 
            list.setHead(new_node); 
        } 
        else { 

            NodoVertice last = list.getHead(); 
            while (last.getNext() != null) { 
                last = last.getNext(); 
            } 
            last.setNext(new_node); 
        }  

        return list; 
    } 
     
    public NodoVertice ObtenerVertice(String dato){
        NodoVertice aux = this.getHead();
        while(aux!=null){
          if(aux.getVertice().getDato()==dato){
              return aux;
          }
          aux = aux.getNext();
        }
        return null;
    }
    
} 