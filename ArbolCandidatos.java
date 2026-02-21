
public class ArbolCandidatos 
{
    Nodo raiz;
    //falta insercion busqueda y recorrido
    private class Nodo{
        private Candidato candidato;
        Nodo der;
        Nodo izq;
        
        public Nodo(Candidato candidato){
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
            nodo.toString();
            recorrerRec(nodo.der);
        }
    }
    
    public void insertar(Nodo nodo){
        insertarRec(nodo, raiz);
    }
    private Nodo insertarRec(Nodo nodo, Nodo raiz){
        Nodo nuevo = nodo;
        Nodo actual = raiz;
        if(raiz == null){
            raiz = nuevo;
        }
        else{
            if(nodo.getCandidato().getNombre().compareToIgnoreCase(nuevo.getCandidato().getNombre())>0){
                actual.der = insertarRec(nodo, actual.der);
            }
            else{
                nodo.izq = insertarRec(nodo, actual.izq);
            }
            
        }
        return nuevo;
    }
}