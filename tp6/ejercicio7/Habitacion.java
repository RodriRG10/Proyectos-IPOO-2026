package tp6.ejercicio7;

public class Habitacion extends Alojamiento {

    // Instancia
    protected int camas;
    // Constructor
    public Habitacion(int id, int p, int c){
        super(id,p);
        camas = c;
    }
    // Consultas
    public int obtenerCamas(){
        return camas;
    }
    public float costoDiario(int p){
        return camas * (p/2);
    }
    
    
}
