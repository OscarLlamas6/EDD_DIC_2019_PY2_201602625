



public class Usuario {
    
    private String nombre, apellido, carnet, pass;
    
    public Usuario(String nombre, String apellido, String carnet, String pass){
            this.nombre = nombre;
            this.apellido = apellido;
            this.carnet = carnet;
            this.pass = pass;
    }
    
    public void setNombre(String nombre){ this.nombre = nombre;}
    public void setApellido(String apellido){ this.apellido = apellido;}
    public void setCarnet(String carnet){ this.carnet = carnet;}
    public void setPass(String pass){ this.pass = pass;}
    
    public String getNombre(){ return this.nombre;}
    public String getApellido(){ return this.apellido;}
    public String getCarnet(){ return this.carnet;}
    public String getPass(){ return this.pass;}
    
    
}
