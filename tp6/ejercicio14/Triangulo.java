package tp6.ejercicio14;
import java.lang.Math;
import parcialesviejos.parcial1_2025.Punto;

public class Triangulo extends Figura {
    
    // Instancia
    protected Punto v1;
    protected Punto v2;
    protected Punto v3;
    // Cosntructor
    public Triangulo(Punto p1, Punto p2, Punto p3){
        v1 = p1;
        v2 = p2;
        v3 = p3;
    }
    // Consultas
    public float area(){
        float s = (v1.distancia(v2) + v2.distancia(v3) + v3.distancia(v1)) / 2;
        return (float) Math.sqrt(s * (s - v1.distancia(v2)) * (s - v2.distancia(v3)) * (s - v3.distancia(v1)));
    }
    public float perimetro(){
        return v1.distancia(v2) + v2.distancia(v3) + v3.distancia(v1);
    }
    public Punto centro(){
        Punto nuevo = v1; // ESTA ASIGNACION PORQUE SI NO ME DICE QUE NO INICIALIZO
        nuevo.establecerX((v1.obtenerX() + v2.obtenerX() + v3.obtenerX()) / 3);
        nuevo.establecerY((v1.obtenerY() + v2.obtenerY() + v3.obtenerY()) / 3);
        return nuevo;
    }
    public boolean equals(Figura f){
        boolean resultado = this == f;
        Triangulo t;
        if(!resultado && f != null){
            if(getClass() == f.getClass()){
                t = (Triangulo)f;
                if(v1 != null && v2 != null && v3 != null && nuevo.obtenerV1() != null && nuevo.obtener)
            }
        }
    }
}
