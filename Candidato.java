
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
    

}