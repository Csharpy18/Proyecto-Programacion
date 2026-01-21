public class Votante
{
    //Atributos
    private int cedula;
    private String nombre;
    private String domicilioElectoral;
    private boolean votoEmitido;
    private int edad;
    
    //Constructor
    public Votante(int cedula, String nombre, String domicilioElectoral, boolean votoEmitido, int edad)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.domicilioElectoral = domicilioElectoral;
        this.votoEmitido = votoEmitido;
        this.edad = edad;
        
    }

    //Getters y Setters, doble espaciado entre Getters y Setters de diferentes atributos
    public int getCedula(){
        return cedula;
    }
    

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    public String getDomicilioElectoral(){
        return domicilioElectoral;
    }
    
    public void setDomicilioElectoral(String domicilioElectoral){
        this.domicilioElectoral = domicilioElectoral;
    }
    
    
    public boolean getVotoEmitido(){
        return votoEmitido;   
    }
    
    public void setVotoEmitido(boolean votoEmitido){
        this.votoEmitido = votoEmitido;
    }
    
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
}