package parcialesviejos.parcial1_2025;

public class Triangulo {
    // Instancia
    private Punto p1;
    private Punto p2;
    private Punto p3;
    // Constructor
    public Triangulo(Punto punto1, Punto punto2, Punto punto3){
        p1 = punto1;
        p2 = punto2;
        p3 = punto3;
    }
    public Triangulo(){
        p1 = new Punto(0,0);
        p2 = new Punto(1,1);
        p3 = new Punto(2,0);
    }
    // Comandos
    public void establecerP1(Punto p){
        if(p!= null)
            p1 = p;
    }
    public void establecerP2(Punto p){
        if(p!= null)
            p2 = p;
    }
    public void establecerP3(Punto p){
        if(p!= null)
            p3 = p;
    }
    public void copy(Triangulo t){
        p1.copy(t.obtenerP1());
        p2.copy(t.obtenerP2());
        p3.copy(t.obtenerP3());
    }
    // Consultas
    public Punto obtenerP1(){
        return p1;
    }
    public Punto obtenerP2(){
        return p2;
    }
    public Punto obtenerP3(){
        return p3;
    }
    public Triangulo clone(){
        Triangulo nuevo = new Triangulo(p1.clone(),p2.clone(),p3.clone());
        return nuevo;
    }
    public boolean equals(Triangulo t){
        return p1.equals(t.obtenerP1()) && p2.equals(t.obtenerP2()) && p3.equals(t.obtenerP3());
    }
    public double perimetro(){
        return p1.distancia(p2) + p1.distancia(p3) + p2.distancia(p3);
        
    }
    public Triangulo perimetroMayor(Triangulo t){
        Triangulo resultado;
        if (this.perimetro() > t.perimetro())
            resultado = this;
        else
            resultado = t;
        return resultado;
    }
}
