
public class ListaVotantes{
    private Nodo primero;

    private class Nodo{
        private Votante votante;
        private Nodo siguiente;
        

        public Nodo(Votante votante){
            this.votante = votante;
            this.siguiente = null;
        }
    }

    public void agregar(Votante votante){//acomodado en orden alfabetico
        Nodo nuevo = new Nodo(votante);
        Nodo actual = primero;
        if(primero == null){
            primero = nuevo;
        }
        else{
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;

        }

    }

    public Votante buscar(String cedula){
        boolean encontrado = false;
        Nodo actual = primero;
        Votante buscado = null;
        while (actual != null && !encontrado){
            if(cedula.equals(actual.votante.getCedula())){
                encontrado = true;
                buscado = actual.votante;
            }
           actual = actual.siguiente;
        }
        return buscado;
    }
}