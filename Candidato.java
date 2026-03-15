
public class Candidato
{
    private String nombre;
    private String cedula;
    private Partido partido;
    private int cantidadVotos;
    private boolean costarricense;

    public Candidato(String nombre, String cedula, Partido partido,int votos, boolean costarricense)
    {
        if(!costarricense){
            System.out.println("No se pudo crear el candidato, debido a que no es costarricense");
        }
        else{
             this.nombre = nombre;
             this.cedula = cedula;
             this.partido = partido;
             this.cantidadVotos = votos;
             System.out.println("El candidato pudo ser registrado correctamente");
        }
    }
    
    public String toString(){
        String mensajeCandidato = "Candidato: " + nombre + "\n Cedula: "+ cedula + "\n Partido: " + partido + "\n Cantidad de votos: " + cantidadVotos;
        return mensajeCandidato;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCedula(){
        return cedula;
    }
    public void setPartido(Partido partido){
        this.partido = partido;
    }
    
    public Partido getPartido(){
        return partido;
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