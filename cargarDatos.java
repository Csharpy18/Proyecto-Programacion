import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class cargarDatos{
    public static void cargarPartidos(String ruta, ListaPartidos lista){
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {

               
                String[] datos = linea.split(";");

                if (datos.length == 5) {
                    String nombre = datos[0];
                    String id = datos[1];
                    String colores = datos[2];
                    String presidente = datos[3];
                    String correo = datos [4];
                    Partido partido = new Partido(nombre, id, colores, presidente, correo);
                    lista.agregarPartido(partido);
                } else {
                    System.out.println("Línea inválida en partidos: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de partidos: " + e.getMessage());
        }
    }

     public static void cargarVotantes(String ruta, ListaDobleCantones listaCantones) {
    try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = br.readLine()) != null) {

            String[] datos = linea.split(";");

            if (datos.length == 3) {
                String cedula = datos[0];
                String nombre = datos[1];
                String nombreCanton = datos[2];

                // Buscar si el cantón ya existe
                Canton canton = listaCantones.buscar(nombreCanton);

                // Si no existe, crearlo e insertarlo
                if (canton == null) {
                    canton = new Canton(nombreCanton, new ListaVotantes());
                    listaCantones.agregar(canton);
                }

                // Crear votante con el objeto Canton
                Votante votante = new Votante(cedula, nombre, canton);
                canton.lista.agregar(votante);

            } else {
                System.out.println("Línea inválida, se omite: " + linea);
            }
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo de votantes: " + e.getMessage());
    }
}

} 

