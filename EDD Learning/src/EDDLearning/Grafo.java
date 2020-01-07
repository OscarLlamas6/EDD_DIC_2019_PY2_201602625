package EDDLearning;

import EDDLearning.ListaVertices.NodoVertice;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;



public class Grafo 
{ 
    private int V;   // No. of vertices 
    private ListaVertices vertices; //Lista de vertices
    public static int x = 0;
    public ListaAdyacencia visitadosanchura;
    public ListaAdyacencia visitadosprofunidad;
    public static String global = "";

   public Grafo(int v) 
    { 
        this.V = v; 
        this.vertices = new ListaVertices();
        this.visitadosanchura = new ListaAdyacencia();
        this.visitadosprofunidad = new ListaAdyacencia();
    } 
    
    public void AgregarVertice(String s){
        Vertice v = new Vertice(s);
        this.vertices = this.vertices.insert(this.vertices, v);
        
    }
    
    public void AgregarArista(String vertice1, String vertice2){
        if(vertices.ObtenerVertice(vertice1)!=null){
            ListaAdyacencia lista = vertices.ObtenerVertice(vertice1).getVertice().getListaAdyacencia();
            lista = lista.insert(lista, vertice2);
        }        
    }
    
    public void RecorridoAnchura(String s){
        ListaAdyacencia VerticesVisitados = new ListaAdyacencia();
        Cola cola = new Cola();
        AgregarVisitado(VerticesVisitados, s);
        cola.enqueue(s);
        cola.Graficar(this.x);
            GraficarGrafoAnchura(s);
        while(cola.getSize()!=0){            
            s = cola.getFrente().getDato();
            cola.dequeue();
            cola.Graficar(this.x);
            GraficarGrafoAnchura(s);
            this.visitadosanchura = this.visitadosanchura.insert(this.visitadosanchura, s);
            System.out.print(s+" ");
            ListaAdyacencia.NodoAdyacencia aux = this.vertices.ObtenerVertice(s).getVertice().getListaAdyacencia().getHead();
            while(aux!=null){
                if(!VerticeVisitado(VerticesVisitados, aux.getData())){
                    AgregarVisitado(VerticesVisitados, aux.getData());
                    cola.enqueue(aux.getData());
                    cola.Graficar(this.x);
                    GraficarGrafoAnchura(s);
                }
                aux = aux.getNext();
            }
        }
        cola.Graficar(this.x);
        GraficarGrafoAnchura("");
        cola.Graficar(this.x);
    }
    
    public void GraficarArbolGeneradorAnchura(String s){       
        File file = new File("C:/Reportes/salida4.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph ArbolGeneradorBFT{");
            ps.println();
            ps.println("node[shape=oval];");   
            ps.println("rankdir=TB;");  
            ps.println();
            NodoVertice v = this.vertices.getHead();
            while(v != null){
                ps.println(v.getVertice().getDato()+";");
                v = v.getNext();
            }
            ps.println();
            ListaAdyacencia VerticesVisitados = new ListaAdyacencia();
            Cola cola = new Cola();
            AgregarVisitado(VerticesVisitados, s);
            cola.enqueue(s);
            while(cola.getSize()!=0){
            s = cola.getFrente().getDato();
            cola.dequeue(); 
            System.out.print(s+" ");
            ListaAdyacencia.NodoAdyacencia aux = this.vertices.ObtenerVertice(s).getVertice().getListaAdyacencia().getHead();
            while(aux!=null){
                if(!VerticeVisitado(VerticesVisitados, aux.getData())){
                    AgregarVisitado(VerticesVisitados, aux.getData());
                    cola.enqueue(aux.getData());
                    ps.println(s+"->"+aux.getData()+";");
                }
                aux = aux.getNext();
            }
        }
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida4.dot -o C:/Reportes/Grafo"+this.x+".png";
            Process p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException ex) {
          
        }
            this.x++;
        } catch (IOException ex) {
            
        }     

        
    }
    
    public void ProfundidadRecursion(String s, ListaAdyacencia lista){
        AgregarVisitado(lista, s);
        System.out.print(s+" ");
        ListaAdyacencia.NodoAdyacencia aux = vertices.ObtenerVertice(s).getVertice().getListaAdyacencia().getHead();
            while(aux!=null){
                if(!VerticeVisitado(lista, aux.getData())){
                    this.global+=s+"->"+aux.getData()+";\n";
                    ProfundidadRecursion(aux.getData(), lista);                   
                }
                aux = aux.getNext();
            }       
    }       
  
    public void RecorridoProfundidadR(String s){
        ListaAdyacencia VerticesVisitados = new ListaAdyacencia();
        ProfundidadRecursion(s, VerticesVisitados);
    }        
           
    public void GraficarArbolGeneradorProfundidad(String s){       
        File file = new File("C:/Reportes/salida4.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph ArbolGeneradorDFT{");
            ps.println();
            ps.println("node[shape=oval];");   
            ps.println("rankdir=TB;");  
            ps.println();
            NodoVertice v = this.vertices.getHead();
            while(v != null){
                ps.println(v.getVertice().getDato()+";");
                v = v.getNext();
            }
            ps.println();
            this.global = "";
            RecorridoProfundidadR(s);
            ps.println();
            ps.println(this.global);
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida4.dot -o C:/Reportes/Grafo"+this.x+".png";
            Process p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException ex) {
          
        }
        } catch (IOException ex) {
            
        }     

        
    } 
          
    public void RecorridoProfundidadStackRecursion(ListaAdyacencia VerticesVisitados, Pila pila){           
      String s = pila.getCima().getDato();
      System.out.print(s+" ");
      this.visitadosprofunidad = this.visitadosprofunidad.insert(this.visitadosprofunidad, s);
      AgregarVisitado(VerticesVisitados, s);
      ListaAdyacencia.NodoAdyacencia aux = vertices.ObtenerVertice(s).getVertice().getListaAdyacencia().getHead();
      while(aux!=null){
          if(!VerticeVisitado(VerticesVisitados, aux.getData())){
                    pila.push(aux.getData());
                    pila.Graficar(this.x);
                    GraficarGrafoProfundidad(s);
                    RecorridoProfundidadStackRecursion(VerticesVisitados, pila);
                }
          aux = aux.getNext();
      }
      pila.pop();
      pila.Graficar(this.x);
      GraficarGrafoProfundidad(s);
  } 
    
    public void RecorridoProfundidadStack(String s){
       ListaAdyacencia VerticesVisitados = new ListaAdyacencia();
       Pila pila = new Pila();
       pila.push(s);
       pila.Graficar(this.x);
       GraficarGrafoProfundidad(s);
       RecorridoProfundidadStackRecursion(VerticesVisitados, pila);
       pila.Graficar(this.x);
       GraficarGrafoProfundidad("");
       pila.Graficar(this.x);
    } 
    
    public boolean VerticeVisitado(ListaAdyacencia lista, String s){
        ListaAdyacencia.NodoAdyacencia aux = lista.getHead();
        while(aux!=null){
            if(aux.getData().equals(s)){ return true; }
            aux = aux.getNext();
        }
        return false;
    }
    
    public boolean VisitadoEnAnchura(String s){
        ListaAdyacencia.NodoAdyacencia aux = this.visitadosanchura.getHead();
        while(aux!=null){
            if(aux.getData().equals(s)){ return true; }
            aux = aux.getNext();
        }
        return false;
    }
    
    public boolean VisitadoEnProfundidad(String s){
        ListaAdyacencia.NodoAdyacencia aux = this.visitadosprofunidad.getHead();
        while(aux!=null){
            if(aux.getData().equals(s)){ return true; }
            aux = aux.getNext();
        }
        return false;
    }
        
    public void AgregarVisitado(ListaAdyacencia lista, String s){
        lista = lista.insert(lista, s);
    }
    
    public int getV() { return this.V; }

    public void setV(int V) { this.V = V; }

    public ListaVertices getVertices() { return this.vertices; }

    public void setVertices(ListaVertices vertices) { this.vertices = vertices; }
  
    public void ImprimirVertices(){
        ListaVertices.NodoVertice aux = this.vertices.getHead();
        while(aux!=null){
            System.out.print(aux.getVertice().getDato()+": ");
            ListaAdyacencia.NodoAdyacencia ad = aux.getVertice().getListaAdyacencia().getHead();
            while(ad!=null){
                System.out.print(ad.getData()+" ");
                ad = ad.getNext();
            }
            System.out.println("");
            aux = aux.getNext();
        }
    }
    
    public void GraficarGrafo(String dato) {
       ListaAdyacencia pares_graficados = new ListaAdyacencia();
       File file = new File("C:/Reportes/salida.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph Grafo{");
            ps.println();
            ps.println("node[shape=circle];");
            ps.println("rankdir=LR;");
            NodoVertice v = vertices.getHead();
            while(v != null){
                if(v.getVertice().getDato().equals(dato)){
                 ps.println(v.getVertice().getDato()+"[style = filled, fillcolor = cyan];");    
                } else {
                 ps.println(v.getVertice().getDato()+";");   
                }               
                v = v.getNext();
            }
            ps.println();                                  
            ListaVertices.NodoVertice aux = this.vertices.getHead();
            while(aux!=null){
            ListaAdyacencia.NodoAdyacencia ad = aux.getVertice().getListaAdyacencia().getHead();
            while(ad!=null){
                if(!ParGraficado(pares_graficados, aux.getVertice().getDato(), ad.getData())){
                    AgregarGraficado(pares_graficados, aux.getVertice().getDato(), ad.getData());
                    ps.println(aux.getVertice().getDato()+"->"+ad.getData()+"[dir=none];");
                }
                ad = ad.getNext();
            }
            System.out.println("");
            aux = aux.getNext();
            }                                                          
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida.dot -o C:/Reportes/Grafo.png";
            Process p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException ex) {
          
        }
        } catch (IOException ex) {
            
        }     
    }
    
    public void GraficarGrafoAnchura(String dato) {
       ListaAdyacencia pares_graficados = new ListaAdyacencia();
       File file = new File("C:/Reportes/salida.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph Grafo{");
            ps.println();
            ps.println("node[shape=circle];");
            ps.println("rankdir=LR;");
            NodoVertice v = vertices.getHead();
            while(v != null){
                if(v.getVertice().getDato().equals(dato)){
                 ps.println(v.getVertice().getDato()+"[style = filled, fillcolor = green];");    
                } else if(VisitadoEnAnchura(v.getVertice().getDato())){
                  ps.println(v.getVertice().getDato()+"[style = filled, fillcolor = gold];");  
                } else {
                 ps.println(v.getVertice().getDato()+";");   
                }               
                v = v.getNext();
            }
            ps.println();                                  
            ListaVertices.NodoVertice aux = this.vertices.getHead();
            while(aux!=null){
            ListaAdyacencia.NodoAdyacencia ad = aux.getVertice().getListaAdyacencia().getHead();
            while(ad!=null){
                if(!ParGraficado(pares_graficados, aux.getVertice().getDato(), ad.getData())){
                    AgregarGraficado(pares_graficados, aux.getVertice().getDato(), ad.getData());
                    ps.println(aux.getVertice().getDato()+"->"+ad.getData()+"[dir=none];");
                }
                ad = ad.getNext();
            }
            System.out.println("");
            aux = aux.getNext();
            }                                                          
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida.dot -o C:/Reportes/Grafo"+this.x+".png";
            Process p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException ex) {
          
        }
            this.x++;
        } catch (IOException ex) {
            
        }     
    }
  
    public void GraficarGrafoProfundidad(String dato) {
       ListaAdyacencia pares_graficados = new ListaAdyacencia();
       File file = new File("C:/Reportes/salida.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph Grafo{");
            ps.println();
            ps.println("node[shape=circle];");
            ps.println("rankdir=LR;");
            NodoVertice v = vertices.getHead();
            while(v != null){
                if(v.getVertice().getDato().equals(dato)){
                 ps.println(v.getVertice().getDato()+"[style = filled, fillcolor = green];");    
                } else if(VisitadoEnProfundidad(v.getVertice().getDato())){
                  ps.println(v.getVertice().getDato()+"[style = filled, fillcolor = gold];");  
                } else {
                 ps.println(v.getVertice().getDato()+";");   
                }               
                v = v.getNext();
            }
            ps.println();                                  
            ListaVertices.NodoVertice aux = this.vertices.getHead();
            while(aux!=null){
            ListaAdyacencia.NodoAdyacencia ad = aux.getVertice().getListaAdyacencia().getHead();
            while(ad!=null){
                if(!ParGraficado(pares_graficados, aux.getVertice().getDato(), ad.getData())){
                    AgregarGraficado(pares_graficados, aux.getVertice().getDato(), ad.getData());
                    ps.println(aux.getVertice().getDato()+"->"+ad.getData()+"[dir=none];");
                }
                ad = ad.getNext();
            }
            System.out.println("");
            aux = aux.getNext();
            }                                                          
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida.dot -o C:/Reportes/Grafo"+this.x+".png";
            Process p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException ex) {
          
        }
            this.x++;
        } catch (IOException ex) {
            
        }     
    }
    
    public void AgregarGraficado(ListaAdyacencia lista, String v1, String v2){
        String par = v1+"-"+v2;
        lista = lista.insert(lista, par);
    }
    
    public boolean ParGraficado(ListaAdyacencia lista, String v1, String v2){
       String par1 = v1+"-"+v2;
       String par2 = v2+"-"+v1;
       ListaAdyacencia.NodoAdyacencia aux = lista.getHead();
        while(aux!=null){
            if(aux.getData().equals(par1) || aux.getData().equals(par2)){ return true; }
            aux = aux.getNext();
        }
        return false;
    }
    
    public void GraficarListaDeAdyacencia(){
       File file = new File("C:/Reportes/salida.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph Grafo{");
            ps.println();
            ps.println("node[shape=record];");
            ps.println("rankdir=TB;");
            ps.println();
            NodoVertice n = this.vertices.getHead();
            while(n != null){
                ps.println(n.getVertice().getDato()+"[style = filled, fillcolor = green, group = 1];");
                n = n.getNext();
            }
            ps.println();
            n = this.vertices.getHead();
            while(n != null){
                if(n.getNext()!=null){
                ps.println(n.getVertice().getDato()+"->"+n.getNext().getVertice().getDato()+"[dir=none];");   
                }               
                n = n.getNext();
            }
            ps.println();
            int x = 0;
            n = this.vertices.getHead();
            while(n!=null){
                ListaAdyacencia.NodoAdyacencia na = n.getVertice().getListaAdyacencia().getHead();
                while(na!=null){
                    ps.println(n.getVertice().getDato()+x+"[label=\""+na.getData()+"\"]");
                    x++;
                    na = na.getNext();
                }
                ps.println();
                int i = 0;
                if(x>0){
                  ps.println(n.getVertice().getDato()+"->"+n.getVertice().getDato()+i+"[dir=none];");  
                }                               
                while(i<x-1){
                        ps.println(n.getVertice().getDato()+i+"->"+n.getVertice().getDato()+(i+1)+"[dir=none];");
                        i++;
                }
                ps.println();
                i = 0;
                if(x>0){
                    String ranksame = "{ rank = same; "+n.getVertice().getDato()+"; "+n.getVertice().getDato()+i+"; "; 
                    i++;
                    while(i<x){
                      ranksame+=n.getVertice().getDato()+i+"; ";
                      i++;
                    }
                    ranksame+="}";
                    ps.println(ranksame);
                }
                
                ps.println();
                x=0;
                n = n.getNext();
            }
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida.dot -o C:/Reportes/Grafo"+this.x+".png";
            Process p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException ex) {
          
        }
          this.x++;
        } catch (IOException ex) {
            
        }    
    }
    
    public void GraficarMatrizDeAdyacencia(){
       File file = new File("C:/Reportes/salida.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph Grafo{");
            ps.println();
            ps.println("node[shape=record];");
            ps.println("rankdir=TB;");
            ps.println();
            if(vertices.getHead() != null){               
            ps.println("M[label=\"M\", style = filled, fillcolor = gold, group = 1];");
            ps.println();
            int g = 2;
            NodoVertice n = this.vertices.getHead();
            while(n != null){
                ps.println(n.getVertice().getDato()+"X[label=\""+n.getVertice().getDato()+"\", style = filled, fillcolor = cyan, group = "+g+"];");
                g++;
                n = n.getNext();
            }
            ps.println();
            n = this.vertices.getHead();    
            while(n != null){
                ps.println(n.getVertice().getDato()+"Y[label=\""+n.getVertice().getDato()+"\", style = filled, fillcolor = cyan, group = 1];");
                n = n.getNext();
            }
            ps.println();
            n = this.vertices.getHead();
            ps.println("M->"+n.getVertice().getDato()+"X[dir=none];");
            while(n.getNext()!= null){
                ps.println(n.getVertice().getDato()+"X->"+n.getNext().getVertice().getDato()+"X[dir=none];");
                n = n.getNext();
            }
            ps.println();
            n = this.vertices.getHead();
            ps.println("M->"+n.getVertice().getDato()+"Y[dir=none];");
            while(n.getNext()!= null){
                ps.println(n.getVertice().getDato()+"Y->"+n.getNext().getVertice().getDato()+"Y[dir=none];");
                n = n.getNext();
            }
            ps.println();
            n = this.vertices.getHead();
            String ranksame = "{ rank = same; M; ";
            while(n != null){
                ranksame+=n.getVertice().getDato()+"X; ";
                n = n.getNext();
            }
            ranksame+="}";
            ps.println(ranksame);
            ps.println();
            n = this.vertices.getHead();            
            while(n != null){
                g = 2;                
                NodoVertice v = this.vertices.getHead();
                while(v!=null){
                    if(ExisteAdyacencia(n.getVertice().getListaAdyacencia(), v.getVertice().getDato())){                       
                        ps.println(n.getVertice().getDato()+v.getVertice().getDato()+"[label=\"1\", group = "+g+"];");
                    }else {
                        ps.println(n.getVertice().getDato()+v.getVertice().getDato()+"[label=\"0\", group = "+g+"];");
                    }
                    g++;
                    v = v.getNext();
                } 
                ps.println();
                v = this.vertices.getHead();
                ps.println(n.getVertice().getDato()+"Y->"+n.getVertice().getDato()+v.getVertice().getDato()+"[dir=none];");
                while(v.getNext() != null){
                    ps.println(n.getVertice().getDato()+v.getVertice().getDato()+"->"+n.getVertice().getDato()+v.getNext().getVertice().getDato()+"[dir=none];");
                    v = v.getNext();
                }
                ps.println();
                v = this.vertices.getHead();      
                ranksame = "{ rank = same; "+n.getVertice().getDato()+"Y; ";
                while(v != null){
                    ranksame+=n.getVertice().getDato()+v.getVertice().getDato()+"; ";
                    v = v.getNext();
                }                
                ranksame += "}";
                ps.println(ranksame);
                ps.println();                                                             
                n = n.getNext();                                                                                                                          
            }           
            n = this.vertices.getHead();
            while(n != null){
                NodoVertice v = this.vertices.getHead();
                ps.println(n.getVertice().getDato()+"X->"+v.getVertice().getDato()+n.getVertice().getDato()+"[dir=none];");
                while(v.getNext() != null){
                    ps.println(v.getVertice().getDato()+n.getVertice().getDato()+"->"+v.getNext().getVertice().getDato()+n.getVertice().getDato()+"[dir=none];");
                    v = v.getNext();
                }
                n = n.getNext();
            }                    
       }
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida.dot -o C:/Reportes/Grafo"+this.x+".png";
            Process p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException ex) {
          
        }
          this.x++;
        } catch (IOException ex) {
            
        }    
    }
    
    public boolean ExisteAdyacencia(ListaAdyacencia lista, String s){
        ListaAdyacencia.NodoAdyacencia n = lista.getHead();
        while(n != null){
            if(n.getData().equals(s)){ return true;}
            n = n.getNext();
        }
        return false;
    }
} 
