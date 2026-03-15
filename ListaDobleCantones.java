import java.util.Scanner;

public class ListaDobleCantones{
    private Nodo primero;
    private Nodo ultimo;
    
    private class Nodo{
        private Canton canton;
        ListaVotantes listaVotantes;
        private Nodo siguiente;
        

        public Nodo(Canton canton){
            this.canton = canton;
            listaVotantes = null;
            this.siguiente = null;
        }

        public Canton getCanton(){
            return canton;
        }
    }


    public void agregar(Canton canton){
        Nodo nuevo = new Nodo(canton);
        Nodo actual = primero;
        if(primero == null){
            primero = nuevo;
            ultimo = nuevo;
        }
        else{
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            ultimo = nuevo;
        }

    }

    public Canton buscar(String nombre){
        boolean encontrado = false;
        Nodo actual = primero;
        Canton buscado = null;
        while (actual != null && !encontrado){
            if(nombre.equals(actual.canton.getNombre())){
                encontrado = true;
                buscado = actual.canton;
            }
           actual = actual.siguiente;
        }
        return buscado;
    }

    public Votante buscarVotante(String cedulaVotante){
        Nodo actual = primero;
        Votante buscado = null;
        while(actual != null && buscado == null){
            buscado = actual.canton.lista.buscar(cedulaVotante);
            actual = actual.siguiente;
        }
        return buscado;
    }
}