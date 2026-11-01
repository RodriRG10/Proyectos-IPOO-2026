package tp5.ejercicio6;
import parcialesviejos.parcial1_2025.Punto;

public class Poligono {

    // Instancia
    protected Punto [] pol;
    protected int n;
    // Constructor
    public Poligono(int max){
        pol = new Punto[max-1];
        n = 0;
    }
    // Comandos 
    public void insertar(Punto p){
        if(p != null && !estaLlena()){
            pol[n] = p;
            n++;
        }
    }
    public void eliminar(Punto p){
        boolean resultado = false;
        if(p != null)
            for(int i = 0; i < n && !resultado; i++)
                if(pol[i].equals(p)){
                    pol[i] = pol[n - 1];
                    pol[n-1] = null;
                    n--;
                    resultado = true;
                }
    }
    // Consultas 
    public int cantPuntos(){
        return n;
    }
    public boolean estaLlena(){
        return n == pol.length;
    }
    public Punto obtenerPunto(int p){
        return pol[p-1];
    }
    public boolean existePunto(Punto p){
        boolean resultado = false;
        for(int i = 0; i < n && !resultado; i++){
            if(pol[i].equals(p))
                resultado = true;
        }
        return resultado;
    }
    public float perimetro(){
        float suma = 0;
        for(int i = 0; i < n - 1; i++){
            suma += pol[i].distancia(pol[i + 1]);
        }
        return suma / n;
    }
    public boolean equals(Poligono p){
        boolean resultado = this == p;
        if(p != null && !resultado && n == p.cantPuntos()){
            resultado = true;
            for(int i = 0; i < n && resultado; i++)
                resultado = pol[i].equals(p.obtenerPunto(i + 1));
        }
        return resultado;
    }
}
    

