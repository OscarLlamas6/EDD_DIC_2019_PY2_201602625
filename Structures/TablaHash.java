
import java.util.Arrays;


public class TablaHash {
    
    String [] tabla; //tabla hash
    int size; //tamaño de la tabla
    int count; //elementos existentes en la tabla
    
    public TablaHash(int size){
        this.size = size;
        this.tabla = new String[size];
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
      if(tabla[direccion]!=null)
      {
          return direccion;
      } else {
          int i = 0;
          int aux = (int)(clave%7); 
          while(tabla[direccion]!=null){
              direccion = (aux+1)*i;
              i++;
            }
          return direccion;
        }    
}
    
    
    public void ReinsertarElementos(){
        for(int i = 0;i<size;i++){
            if(tabla[i]!=null){
                Insertar(Long.parseLong(tabla[i]), tabla[i]);
                tabla[i]=null;
            }
        }
    }
    
    public void Insertar(long clave, String elemento){
       if(this.count < (int)((this.size-1)*(55.0f/100.0f))){
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
            System.out.print("|     "+i+"     ");
        }
        System.out.println("");
        for(int i = 0;i<size;i++){
            if(tabla[i]!=null){
                System.out.print("|  "+tabla[i]+" ");
            }else {
                System.out.print("|           ");
            }
        }
    }
    
    
    
}
