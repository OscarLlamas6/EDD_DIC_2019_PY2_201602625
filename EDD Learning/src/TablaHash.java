


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
        Usuario tablaaux [] = new Usuario[count];
        int x = 0;
        for(int i = 0; i < size; i++){           
            if(tabla[i]!=null){               
                tablaaux[0] = tabla[i];
                tabla[i] = null;
                x++;                             
            }
        }
        for(int i = 0; i < count; i++){
            Usuario aux = tablaaux[i];
            Insertar(Long.parseLong(aux.getCarnet()), aux);   
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
    
    
    
}
