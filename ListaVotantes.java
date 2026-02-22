public class ListaVotantes{
    private Nodo primero;

    private class Nodo{
        private String nombre;
        private Nodo siguiente;
        private boolean votoRealizado;

        public Nodo(String nombre){
            this.nombre = nombre;
            this.votoRealizado = false;
            this.siguiente = null;
        }

        public String getNombre(){
            return nombre;
        }

        public boolean getVoto(){
            return votoRealizado;
        }

        public void setVoto(boolean voto){
            this.votoRealizado = voto;
        }

        public String toString(){
            String mensaje = ("El elector es " + nombre);
            return mensaje;
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
            if(nombre.equalsIgnoreCase(actual.getNombre())){
                encontrado = true;
                buscado = actual;
            }
           actual = actual.siguiente;
        }
        return buscado.getVoto();
    }
}