import java.util.Scanner;

public class ArbolCandidatos 
{
    Nodo raiz;
    //falta insercion busqueda y recorrido
    private class Nodo{
        private Candidato candidato;
        Nodo der;
        Nodo izq;
        
        private Nodo(Candidato candidato){
            this.candidato = candidato;
            this.izq = this.der = null;
        }
        
        public Candidato getCandidato(){
            return candidato;
        }
        
        public String toString(){
            String mensaje = "El candidato es: " + candidato.getNombre();
            return mensaje;
        }
    }
    
    public ArbolCandidatos()
    {
       this.raiz = null;
    }
    

    public Candidato buscar(String candidatoNombre){
        Nodo actual = raiz;
        boolean encontrado = false;
        Candidato candidato = null;
        
        while(actual != null && !encontrado){
            int orden = (actual.getCandidato().getNombre().compareToIgnoreCase(candidatoNombre));
            if(orden == 0){
                candidato = actual.getCandidato();
                encontrado = true;
            }
            else if(orden > 0){
                actual = actual.der;
            }
            else{
                actual = actual.izq;
            }
        }
        if(!encontrado){
            System.out.println("No se encontró el candidato.");
        }
        return candidato;
    }
    
    public void recorrer(){
        recorrerRec(raiz);
    }
    private void recorrerRec(Nodo nodo){
        if (nodo != null){
            recorrerRec(nodo.izq);
           System.out.println( nodo.toString());
            recorrerRec(nodo.der);
        }
    }
    
    public void insertar(Candidato candidato){
        insertarRec(candidato, raiz);
    }
    private Nodo insertarRec(Candidato candidato, Nodo raiz){
        Nodo nuevo = new Nodo(candidato);
        Nodo actual = raiz;
        if(actual == null){
            actual = nuevo;
        }
        else{
            if(candidato.getNombre().compareToIgnoreCase(actual.getCandidato().getNombre())>0){
                actual.der = insertarRec(candidato, actual.der);
            }
            else{
                actual.izq = insertarRec(candidato, actual.izq);
            }
            
        }
        return actual;
    }

    public Candidato obtenerGanador(){
        return obtenerGanadorRec(raiz, null);
    }
    private Candidato obtenerGanadorRec(Nodo nodo, Candidato ganador){
        if (nodo!= null){
            if(ganador == null || nodo.getCandidato().getVotos()> ganador.getVotos()){
                ganador = nodo.getCandidato();
            }
        ganador = obtenerGanadorRec(nodo.izq, ganador);
        ganador = obtenerGanadorRec(nodo.der, ganador);
        }
        return ganador;
    }
    public void candidatoNuevo(ListaPartidos listaPartidos){
        Scanner scanner = new Scanner(System.in);

        

        boolean tico;
                    System.out.println("En construcción");//Incluir candidato
                    System.out.println("Ingrese el nombre del candidato.");
                    String nombreCandidato = scanner.nextLine();
                    System.out.println("Ingrese la cedula del candidato.");
                    String cedulaCandidato = scanner.nextLine();
                    System.out.println("Ingrese el partido del candidato.");
                    String partido = scanner.nextLine();
                    Partido partidoCandidato = listaPartidos.buscPartido(partido);
                    if(partidoCandidato == null){
                        System.out.println("El partido no existe, incluya el partido primero");
                        partidoCandidato = listaPartidos.partidoNuevo();
                
                    }

                    System.out.println("El candidato es costarricense?");
                    String esCostarricense = scanner.nextLine();
                    while (!esCostarricense.equalsIgnoreCase("Si") &&!esCostarricense.equalsIgnoreCase("No") ){
                        System.out.println("El candidato es costarricense?");
                        esCostarricense = scanner.nextLine();
                        System.out.println("Ingrese si o no");
                    }
                    if(esCostarricense.equalsIgnoreCase("Si")){
                        tico = true;
                    }
                    else{
                        tico = false;
                    }

                    Candidato nuevoCandidato = new Candidato(nombreCandidato, cedulaCandidato, partidoCandidato, 0, tico);
                    insertar(nuevoCandidato);
    }

    public int obtenerVotosPartido(Partido partido){
        return obtenerVotosPartidoRec(raiz, partido);
    }

    private int obtenerVotosPartidoRec(Nodo nodo, Partido partido){
        int votos = 0;
        if(nodo != null){
            if(nodo.getCandidato().getPartido().getNombre().equals(partido.getNombre())){
                votos = nodo.getCandidato().getVotos();
            }
        }
        votos += obtenerVotosPartidoRec(nodo.izq, partido) + obtenerVotosPartidoRec(nodo.der, partido);
        return votos;
    }

    public int obtenerVotosTotales(){
        return obtenerVotosTotalesRec(raiz);
    }
    private int obtenerVotosTotalesRec(Nodo nodo){
        int votos = 0;
        if(nodo != null){
            votos = nodo.getCandidato().getVotos();
            votos += obtenerVotosTotalesRec(nodo.izq) + obtenerVotosTotalesRec(nodo.der);

        }
        return votos;
    }
}