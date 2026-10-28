package tp6.ejercicio7;

abstract public class Alojamiento {

    // Instancia
    protected int id;
    protected int personas;
    // Constructor
    public Alojamiento(int id,int p){
        this.id = id;
        personas = p;
    }
    // Consultas
    public int obtenerId(){
        return id;
    }
    public int obtenerPersonas(){
        return personas;
    }
    public String toString(){
        return "id " +id +" personas" +personas;
    }
    abstract public float costoDiario(int p); 
}
