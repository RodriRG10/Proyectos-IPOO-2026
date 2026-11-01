package tp5.ejercicio6;
import parcialesviejos.parcial1_2025.Punto;

public class ColeccionPoligonos {
    
    // Instancia
    protected Poligono [] cp;
    protected int n;
    // Constructor
    public ColeccionPoligonos(int max){
        cp = new Poligono[max - 1];
        n = 0;
    }
    // Comandos
    public void insertar(Poligono p){
        if(p != null){
            cp[n] = p;
            n++;
        }
    }
    public void eliminar(Poligono p){
        boolean resultado = false;
        if(p != null)
            for(int i = 0; i < n && !resultado; i++)
                if(cp[i].equals(p)){
                    cp[i] = cp[n - 1];
                    cp[n - 1] = null;
                    n--;
                    resultado = true;
                }
    }
    public void eliminarPoligonoNLados(int n){
        
    }
}
