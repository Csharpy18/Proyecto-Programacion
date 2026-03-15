public class Votante
{
    //Atributos
    private String cedula;
    private String nombre;
    private Canton domicilioElectoral;
    private boolean votoEmitido;
    
    
    //Constructor
    public Votante(String cedula, String nombre, Canton domicilioElectoral)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.domicilioElectoral = domicilioElectoral;
        this.votoEmitido = false;
        
    }

    //Getters y Setters, doble espaciado entre Getters y Setters de diferentes atributos
    public String getCedula(){
        return cedula;
    }
    

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    public Canton getDomicilioElectoral(){
        return domicilioElectoral;
    }
    
    public void setDomicilioElectoral(Canton domicilioElectoral){
        this.domicilioElectoral = domicilioElectoral;
    }
    
    
    public boolean getVotoEmitido(){
        return votoEmitido;   
    }
    
    public void setVotoEmitido(boolean votoEmitido){
        this.votoEmitido = votoEmitido;
    }
    
    
}