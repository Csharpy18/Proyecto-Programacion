
public class Partido
{
    private String nombre;
    private int cedulaJuridica;
    private String colores;
    private String nombrePresidente;
    private String correoElectronico;

    public Partido(String nombre, int cedula, String colores, String presidente, String correo)
    {
       this.nombre = nombre;
       this.cedulaJuridica = cedula;
       this.colores = colores;
       this.nombrePresidente = presidente;
       this.correoElectronico = correo;
    }

}