package tp6.ejercicio2;
import tp2.ejercicio2.Poliza;

public class PolizaFabrica extends Poliza {

    // Instancia
    protected int cantOperarios;
    protected float valorEquipo;
    // Constructor
    public PolizaFabrica(int np){
        super(np);
        cantOperarios = 0;
        valorEquipo = 0;
    }
    public PolizaFabrica(int np, float i, float r, int co, float ve){
        super(np,i,r);
        cantOperarios = co;
        valorEquipo = ve;
    }
    // Comandos
    public void establecerCantOperarios(int n){
        cantOperarios = n;
    }
    public void establecerValorEquipo(float n){
        valorEquipo = n;
    }
    // Consultas
    public int obtenerCantOperarios(){
        return cantOperarios;
    }
    public float obtenerValorEquipo(){
        return valorEquipo;
    }
    public float obtenerCostoPoliza(){
        return cantOperarios * 500 + valorEquipo * 0.8f + incendio + robo;
    }
}
