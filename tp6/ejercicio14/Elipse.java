package tp6.ejercicio14;
import parcialesviejos.parcial1_2025.Punto;
import java.lang.Math;

public class Elipse extends Figura {

    // Clase
    protected float pi = (float) Math.PI;
    // Instancia
    protected float ejeMayor;
    protected float ejeMenor;
    protected Punto centro;

    // Constructor
    public Elipse(float eMa, float eMe, Punto c){
        ejeMayor = eMa;
        ejeMenor = eMe;
        centro = c;
    }
    // Consultas
    public float area(){
        return pi * ejeMayor * ejeMenor;
    }
    public float perimetro(){
        return 2 * pi * (float) Math.sqrt((ejeMayor * ejeMayor + ejeMenor * ejeMenor) / 2);
    }
    public Punto centro(){
        return centro;
    }
    public boolean equals(Figura f){
        boolean resultado = this == f;
        Elipse nuevo;
        if(!resultado && f != null && this == null){
            if(this.getClass() == f.getClass()){
                nuevo = (Elipse)f;
                resultado = ejeMayor == nuevo.obtenerEjeMayor() && ejeMenor == nuevo.obtenerEjeMenor() && centro != null && centro.equals(nuevo.centro());
            }
        }
        return resultado;
    }

    
}
