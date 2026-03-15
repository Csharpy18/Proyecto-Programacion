import java.util.Scanner;

public class Main
{
    public static void crearNuevoVotante(ListaDobleCantones listaCantones){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cedula del votante.");
        String cedulaVotante = scanner.nextLine();
        
        System.out.println("Ingrese el nombre del votante.");
        String nombreVotante = scanner.nextLine();
        
        System.out.println("Ingrese el canton del votante.");
        String nombreCanton = scanner.nextLine();

        Canton cantonEncontrado = listaCantones.buscar(nombreCanton);

        if(cantonEncontrado == null){
            cantonEncontrado = new Canton(nombreCanton, new ListaVotantes());
            listaCantones.agregar(cantonEncontrado);
        }

        Votante nuevoVotante = new Votante(cedulaVotante, nombreVotante, cantonEncontrado);
        cantonEncontrado.lista.agregar(nuevoVotante);
    }
    
    public static void registrarVoto(ListaDobleCantones listaCantones, ArbolCandidatos arbolCandidatos){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su numero de cedula");
        String cedulaVotante = scanner.nextLine();

        Votante votante = listaCantones.buscarVotante(cedulaVotante);
        if(votante == null){
            System.out.println("Este usuario no fue encontrado, incluyase como votante antes.");
        }
        else{
             if(votante.getVotoEmitido()){
            System.out.println("El usuario solo puede votar una vez.");
        }
            else{
                boolean votoRealizado = false;
                while(!votoRealizado){
                    System.out.println("Digite el nombre del candidato por el que desea votar");
                    String candidatoAVotar = scanner.nextLine();
                    Candidato elegido = arbolCandidatos.buscar(candidatoAVotar);
                    if(elegido == null){
                        System.out.println("Elija otro candidato, no se encontro el que busca");
                    }
                    else{
                        elegido.setVotos(elegido.getVotos()+1);
                        votante.setVotoEmitido(true);
                        votoRealizado = true;
                    }
                }
            
            
            }
        }
    }

    public static void mostrarResultados(ArbolCandidatos arbolCandidatos, ListaPartidos listaPartidos){
        Candidato ganador = arbolCandidatos.obtenerGanador();
        int totalVotos = arbolCandidatos.obtenerVotosTotales();
        if(totalVotos == 0){
            System.out.println("No se recibieron votos");
        }
        else{
            System.out.println("El ganador fue " + ganador.getNombre());
            listaPartidos.calcularPorcentajes(arbolCandidatos);
        }
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        ListaPartidos listaPartidos = new ListaPartidos();
        ListaDobleCantones listaCantones = new ListaDobleCantones();
        ArbolCandidatos arbolCandidatos = new ArbolCandidatos();


        //cargador automatico
        cargarDatos.cargarPartidos("Partidos Politicos.txt", listaPartidos);
        cargarDatos.cargarVotantes("Padrón electroal.txt", listaCantones);
         

        while (opcion !=5){

            System.out.println("Bienvenido al sistema de \nElecciones presidenciales en Costa Rica 2026");
            System.out.println("Estan son sus opciones, ingrese el número \ncorrespondiente a lo que desea hacer\n");
            System.out.println("1. Incluir un partido \n2. Incluir un candidato \n3. Incluir un votante \n4. Registrar un voto \n5. Salir ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch(opcion){
                case 1:
                    listaPartidos.partidoNuevo();
                    break;
                case 2:
                    arbolCandidatos.candidatoNuevo(listaPartidos);
                    break; 
                case 3:
                    crearNuevoVotante(listaCantones);
                    break;
                case 4:
                    registrarVoto(listaCantones, arbolCandidatos);
                    break;
                case 5:
                    mostrarResultados(arbolCandidatos, listaPartidos);
                    System.out.println("Apagando el sistema");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            
            
        }
    
    
    }
}