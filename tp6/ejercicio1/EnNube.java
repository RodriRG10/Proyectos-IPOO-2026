package tp6.ejercicio1;

public class EnNube extends PlanBase {

    // Instancia;
    protected int espacio;
    // Constructor
    public EnNube(int u, int b, int e){
        super(u,b);
        espacio = e;
    }
    // Consultas
    public int obtenerEspacio(){
        return espacio;
    }
    public int costoPlan(int p){
        return espacio * p + base + usuarios;
    }
    
}
