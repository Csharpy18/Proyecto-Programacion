public class ListaVotantes{
    private Nodo primero;

    private class Nodo{
        private Votante votante;
        private Nodo siguiente;
        

        public Nodo(String nombre){
            
            this.siguiente = null;
        }
    }

    public void agregar(String nombre){
        Nodo nuevo = new Nodo(nombre);
        Nodo actual = primero;
        if(primero == null){
            primero = actual;
        }
        else{
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;

        }

    }

    public boolean buscar(String nombre){
        boolean encontrado = false;
        Nodo actual = primero;
        Nodo buscado = null;
        while (actual != null && !encontrado){
            if(nombre.equalsIgnoreCase(actual.votante.getNombre())){
                encontrado = true;
                buscado = actual;
            }
           actual = actual.siguiente;
        }
        return buscado.votante.getVotoEmitido();
    }
}