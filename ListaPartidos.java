import java.util.Scanner;
public class ListaPartidos {
    Nodo cabeza;

    private class Nodo{
        Partido partido;
        Nodo siguiente;

        public Nodo(Partido partido){
            this.partido = partido;
            siguiente = null;
        }
    }

    public void agregarPartido(Partido partido){
        Nodo actual = cabeza;
        Nodo nuevo = new Nodo(partido);
        if (cabeza == null){
            cabeza = nuevo;
        }
        else{
            while(actual.siguiente != null){
            actual = actual.siguiente;
        }
        actual.siguiente = nuevo;
        }
        
    }

    public Partido partidoNuevo(){
        Scanner scanner = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del partido.");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la cedula del partido.");
                    String cedula = scanner.nextLine();
                    System.out.println("Ingrese los colores del partido.");
                    String colores = scanner.nextLine();
                    System.out.println("Ingrese el nombre del presidente del partido.");
                    String presidente = scanner.nextLine();
                    System.out.println("Ingrese el correo del partido.");
                    String correo = scanner.nextLine();

                    Partido nuevo = new Partido(nombre, cedula, colores, presidente, correo);
                    agregarPartido(nuevo);

                    System.out.println("Partido creado con exito");
                    return nuevo;
    }

    public Partido buscPartido(String nombre){
        Nodo actual = cabeza;
        Partido encontrado = null;
        while(actual != null){
            if (actual.partido.getNombre().equalsIgnoreCase(nombre)){
                encontrado = actual.partido;
            }
            actual = actual.siguiente;
        }
        return encontrado;
    }

    public void calcularPorcentajes(ArbolCandidatos arbolCandidatos){
        Nodo actual = cabeza;
        int totalVotos = arbolCandidatos.obtenerVotosTotales();
        if(totalVotos == 0){
            System.out.println("No se recibieron votos");
        }
        while(actual != null){
            int votosPartido = arbolCandidatos.obtenerVotosPartido(actual.partido);
            System.out.println("El partido: " + actual.partido.getNombre() + " obtuvo un " + (votosPartido * 100)/totalVotos + "% de los votos");
            actual = actual.siguiente;
        }
    }
}
