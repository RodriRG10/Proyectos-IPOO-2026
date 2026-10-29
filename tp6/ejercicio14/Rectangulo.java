package tp6.ejercicio14;
import org.w3c.dom.css.Rect;

import parcialesviejos.parcial1_2025.Punto;

public class Rectangulo extends Figura {

    // Instancia 
    protected float ladoMayor;
    protected float ladoMenor;
    protected Punto centro;
    // Constructor
    public Rectangulo(float lMa, float lMe, Punto c){
        ladoMayor = lMa;
        ladoMenor = lMe;
        centro = c;
    }
    // Consultas 
    public float area(){
        return ladoMayor * ladoMenor;
    }
    public float perimetro(){
        return 2 * (ladoMayor + ladoMenor);
    }
    public Punto centro(){
        return centro;
    }
    public boolean equals(Figura f){
        boolean resultado = this == f;
        Rectangulo r;
        if(!false && f != null){
            if(getClass() == f.getClass()){
                r = (Rectangulo)f;
                resultado = centro.equals(r.centro()) && ladoMayor == r.obtenerLadoMayor() && ladoMenor == r.obtenerLadoMenor();
            }
        }
        return resultado;
    }
    
}
