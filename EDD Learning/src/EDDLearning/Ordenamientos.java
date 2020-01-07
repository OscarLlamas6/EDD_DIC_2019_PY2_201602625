
package EDDLearning;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;


public class Ordenamientos {
    
    
    public int [] arreglo;
    public int arreglo_size;
    public int x;
    
    public Ordenamientos(int [] arreglo, int arreglo_size){
        this.arreglo = arreglo;
        this.arreglo_size = arreglo_size;
        this.x = 0;
    }
    
   public void MetodoBurbuja(int [] arreglo){
        
        for(int i = 0; i < (arreglo_size-1);i++){
            for(int j = 0;j < (arreglo_size-1);j++){
                if(arreglo[j] > arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
              GraficarDetallado(arreglo, arreglo[j]);   
            }
           
        } 
        
    }
   
   public void MetodoPorInsercion(int [] arreglo){
       for(int i = 0; i<arreglo_size; i++){
           int pos = i;
           int aux = arreglo[i];
           while((pos>0) && (arreglo[pos-1] > aux)){
               arreglo[pos] = arreglo[pos-1];
               pos--;
           }          
           arreglo[pos] = aux;
           GraficarDetallado(arreglo, arreglo[i]);
       }
   }
   
   public void MetodoRapido(int [] arreglo, int primero, int ultimo){
       int i = primero;
       int j = ultimo;
       int pivote = arreglo[(primero+ultimo)/2];
       do{
           while(arreglo[i]<pivote){
               i++;              
           }
           while(arreglo[j]>pivote){
               j--;
           }
           if(i <= j){
             int aux = arreglo[i];
               arreglo[i] = arreglo[j];
               arreglo[j] = aux;
               i++;
               j--;
           }
           
         GraficarDetallado(arreglo, pivote);
       } while(i<=j);
       if(primero<j){
           MetodoRapido(arreglo, primero, j);
       }
        if(i<ultimo){
           MetodoRapido(arreglo, i, ultimo);
       }
   }   
   
   public void ImprimirArreglo(int [] arreglo){
        for(int i = 0; i< arreglo_size;i++){
            System.out.print(arreglo[i]+"   ");
        }
    }
 
   public void Graficar(int [] arreglo){
       File file = new File("C:/Reportes/salida6.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph Arreglo{");
            ps.println();
            ps.println("node[shape=record];");   
            ps.println("rankdir=LR;"); 
            ps.println();            

            for(int i = 0; i<arreglo_size; i++){
                ps.println("nodo"+i+"[label=\""+arreglo[i]+"\"];");
            }
            for(int i = 0; i<(arreglo_size-1); i++){
                ps.println("nodo"+i+"->"+"nodo"+(i+1)+"[dir=none];");
            }
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida6.dot -o C:/Reportes/Arreglo.png";
            Process p = Runtime.getRuntime().exec(command);
            p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException ex) {
          
        }
        } catch (IOException ex) {
            
        }     
    }
   
   public void GraficarX(int [] arreglo){
       File file = new File("C:/Reportes/salida6.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph Arreglo{");
            ps.println();
            ps.println("node[shape=record];");   
            ps.println("rankdir=LR;"); 
            ps.println();            

            for(int i = 0; i<arreglo_size; i++){
                ps.println("nodo"+i+"[label=\""+arreglo[i]+"\"];");
            }
            for(int i = 0; i<(arreglo_size-1); i++){
                ps.println("nodo"+i+"->"+"nodo"+(i+1)+"[dir=none];");
            }
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida6.dot -o C:/Reportes/Arreglo"+this.x+".png";
            Process p = Runtime.getRuntime().exec(command);
            p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException ex) {
          
        }
            this.x++;
        } catch (IOException ex) {
            
        }     
    }
   
   public void GraficarDetallado(int [] arreglo, int aux){
       File file = new File("C:/Reportes/salida6.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph Arreglo{");
            ps.println();
            ps.println("node[shape=record];");
            ps.println("rankdir=LR;"); 
            ps.println();            

            for(int i = 0; i<arreglo_size; i++){
                if(arreglo[i]==aux){
                    ps.println("nodo"+i+"[label=\""+arreglo[i]+"\", style=filled, fillcolor=gold];");
                } else {
                    ps.println("nodo"+i+"[label=\""+arreglo[i]+"\"];");
                }

            }
            for(int i = 0; i<(arreglo_size-1); i++){
                ps.println("nodo"+i+"->"+"nodo"+(i+1)+"[dir=none];");
            }
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng C:/Reportes/salida6.dot -o C:/Reportes/Arreglo"+this.x+".png";
            Process p = Runtime.getRuntime().exec(command);
            p = Runtime.getRuntime().exec(command);
            try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException ex) {
          
        }
            this.x++;
        } catch (IOException ex) {
            
        }     
    }
}
