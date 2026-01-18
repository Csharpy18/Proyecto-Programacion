
public class Candidato
{
    private String nombre;
    private int cedula;
    private Partido partido;
    private int edad;
    private int cantidadVotos;
    private boolean costarricense;

    public Candidato(String nombre, int cedula, Partido partido, int edad, int votos, boolean costarricense)
    {
        if(costarricense){
         this.nombre = nombre;
         this.cedula = cedula;
         this.partido = partido;
         this.edad = edad; 
         this.cantidadVotos = votos;
         System.out.println("El candidato pudo ser registrado correctamente");
        }
        else{
            System.out.println("El candidato no se pudo registrar porque no es costarricense");
        }
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCedula(int cedula){
        this.cedula = cedula;
    }
    
    public int getCedula(){
        return cedula;
    }
    public void setPartido(Partido partido){
        this.partido = partido;
    }
    
    public Partido getPartido(){
        return partido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    public void setVotos(int cantidadVotos){
        this.cantidadVotos = cantidadVotos;
    }
    
    public int getVotos(){
        return cantidadVotos;
    }
    public void setCostarricense(boolean esCostarricense){
        this.costarricense = esCostarricense;
    }
    
    public boolean getCostarricense(){
        return costarricense;
    }
    
    
}