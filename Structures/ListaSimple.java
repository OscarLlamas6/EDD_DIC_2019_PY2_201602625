
public class ListaSimple { 
  
    Node head; 
    
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    public static ListaSimple insert(ListaSimple list, int data) 
    { 

        Node new_node = new Node(data); 
        new_node.next = null; 

        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 

            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
            last.next = new_node; 
        }  

        return list; 
    } 
 
    
     public static ListaSimple delete(ListaSimple list, int key) 
    { 
        Node currNode = list.head, prev = null; 
  
        if (currNode != null && currNode.data == key) { 
            list.head = currNode.next; 
            return list; 
        } 
  

        while (currNode != null && currNode.data != key) { 
            prev = currNode; 
            currNode = currNode.next; 
        } 

        if (currNode != null) { 
            prev.next = currNode.next; 
        } 

        if (currNode == null) { 
        } 
  
        return list; 
    } 
    
    
    public static void printList(ListaSimple list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   

        while (currNode != null) { 

            System.out.print(currNode.data + " "); 
   
            currNode = currNode.next; 
        } 
    } 
   

    public static void main(String[] args) 
    { 
        ListaSimple list = new ListaSimple();

        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8);
        list = delete(list, 1);
        list = delete(list, 8);
  
        printList(list); 
    } 
} 