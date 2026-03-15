public class Canton {
    private String nombre;
    ListaVotantes lista;

    public Canton(String nombre, ListaVotantes votantes){
        this.nombre = nombre;
        this.lista = votantes;
    }

    public String getNombre(){
        return nombre;
    }
}
