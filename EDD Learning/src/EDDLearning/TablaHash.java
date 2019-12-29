package EDDLearning;




import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;



public class TablaHash {
    
    Usuario [] tabla; //tabla hash
    int size; //tamaño de la tabla
    int count; //elementos existentes en la tabla
    
    public TablaHash(int size){
        this.size = size;
        this.tabla = new Usuario[size];
        Arrays.fill(tabla,null);
        this.count = 0;
    }
    
    
    static boolean isPrime(int n)  
    {  
        if (n <= 1) return false;  
        if (n <= 3) return true;  
        if (n % 2 == 0 || n % 3 == 0) return false;         
        for (int i = 5; i * i <= n; i = i + 6)  
            if (n % i == 0 || n % (i + 2) == 0)  
            return false;         
        return true;  
    }  
    
     static int nextPrime(int N)  
    {        
        if (N <= 1)  
            return 2;       
        int prime = N;  
        boolean found = false;  
    
        while (!found)  
        {  
            prime++;       
            if (isPrime(prime))  
                found = true;  
        }     
        return prime;  
    }  
    
    
    
    public int funcionHash(long clave){
      int direccion = (int)(clave%this.size);           
      if(tabla[direccion]==null)
      {
          return direccion;
          
      } else {
          int i = 0;
          int aux = (int)(clave%7);
          direccion = (aux+1)*i;
          while(tabla[direccion]!=null){              
              i++;
              direccion = (aux+1)*i;
            }
          return direccion;
        }    
}
    
    
    public void ReinsertarElementos(){
        Usuario [] tablaaux  = new Usuario[size];

        for(int i = 0; i < size; i++){           
            if(tabla[i]!=null){               
                tablaaux[i] = tabla[i];                        
            }
        }
        this.count = 0;
        this.tabla = new Usuario[size];
        Arrays.fill(tabla,null);       
        for(int i = 0; i < size; i++){           
            if(tablaaux[i]!=null){
               Usuario aux = tablaaux[i];
               Insertar(Long.parseLong(aux.getCarnet()), aux);   
            }                                  
        }
    }
    
    public void Insertar(long clave, Usuario elemento){
        double porcentaje = (double) this.count/this.size;
       if(porcentaje < 0.55){
           int direccion = funcionHash(clave);
           tabla[direccion] = elemento;
           count++;
       } else {
           int size_aux = this.size;
           this.size = nextPrime(size_aux);
           ReinsertarElementos();
           int direccion = funcionHash(clave);
           tabla[direccion] = elemento;
           count++;
       }
    }
    
    public void MostrarTabla(){
        for(int i = 0;i<size;i++){
            System.out.print("|   "+i+"   ");
        }
        System.out.println("");
        for(int i = 0;i<size;i++){
            if(tabla[i]!=null){
                System.out.print("| "+tabla[i].getCarnet()+" ");
            }else {
                System.out.print("|       ");
            }
        }
    }
    
    public void Graficar(){
        File file = new File("src/salida.dot");
       if (file.exists()){ file.delete();}
        try {
            file.createNewFile();
            PrintStream ps = new PrintStream(file);
            ps.println("digraph HashTable{");
            ps.println();
            ps.println("node[shape=record];");
            ps.println("rankdir=LR;");
            ps.println();
            int x = 0;
            for(int i = 0; i < this.size; i++){
                if(this.tabla[i]!=null){
                   ps.println("node"+x+"[label=\"Clave: "+i+"\\n Nombre: "+this.tabla[i].getNombre()+"\\n Apellido: "+this.tabla[i].getApellido()+"\\n Carnet: "+this.tabla[i].getCarnet()+"\\n Password: "+this.tabla[i].getPassDes()+"\"];"); 
                   x++;
                }
            }
            ps.println();
            for(int i = 0; i< x-1; i++){
             ps.println("node"+i+"->node"+(i+1)+"[dir=none];");   
            }
            ps.println();
            ps.print("}");
            ps.close();
            String command = "dot.exe -Tpng src/salida.dot -o src/Images/HashTableReport.png";
            Process p = Runtime.getRuntime().exec(command);
        } catch (IOException ex) {
            
        }  
    }
    
}
