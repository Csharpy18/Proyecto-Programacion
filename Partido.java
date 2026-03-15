
public class Partido
{
    private String nombre;
    private String cedulaJuridica;
    private String colores;
    private String nombrePresidente;
    private String correoElectronico;

    public Partido(String nombre, String cedula, String colores, String presidente, String correo)
    {
       this.nombre = nombre;
       this.cedulaJuridica = cedula;
       this.colores = colores;
       this.nombrePresidente = presidente;
       this.correoElectronico = correo;
    }
    
    public String toString(){
        String mensajePartido = "Partido: " + nombre + "\n Cedula: "+ cedulaJuridica + "\n Presidente: " + nombrePresidente + "\n Correo: " + correoElectronico;
        return mensajePartido;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCedula(){
        return cedulaJuridica;
    }
    
    public void setColores(String colores){
        this.colores = colores;
    }
    
    public String getColores(){
        return colores;
    }
    
    public void setNombrePresidente(String nombrePresidente){
        this.nombrePresidente = nombrePresidente;
    }
    
    public String getNombrePresidente(){
        return nombrePresidente;
    }
    
    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    
    public String getCorreo(){
        return correoElectronico;
    }
}