
public class ArbolCandidatos
{
    Nodo raiz;
    
    
    private class Nodo{
        private Candidato candidato;
        private Nodo der;
        private Nodo izq;
        
        public Nodo(Candidato candidato){
            this.candidato = candidato;
            this.izq = this.der = null;
        }
        
        public String toString(){
            String mensaje = "El candidato es: " + candidato.getNombre();
            return mensaje;
        }
    }
    
    public ArbolCandidatos()
    {
        // initialise instance variables
        
    }
}