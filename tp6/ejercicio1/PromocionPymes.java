package tp6.ejercicio1;

public class PromocionPymes extends PlanBase {

    // Instancia 
    protected boolean activa;
    // Constructor
    public PromocionPymes(int u, int b){
        super(u,b);
        activa = true;
    }
    // Comandos 
    public void cambiarActiva(){
        activa = !activa;
    }
    // Consultas
    public boolean obtenerActiva(){
        return activa;
    }
    public int costoPlan(){
        int resultado = base;
        if (!activa)
            resultado += (usuarios * 5);
        return resultado;
    }
    
    
}