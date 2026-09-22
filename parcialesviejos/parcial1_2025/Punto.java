package parcialesviejos.parcial1_2025;

public class Punto {
    // Instancia
    private int x;
    private int y;
    // Constructor
    public Punto(int coord, int ord){
        x = coord;
        y = ord;
    }
    // Comandos
    public void establecerX(int coord){
        x = coord;
    }
    public void establecerY(int ord){
        y = ord;
    }
    public void copy(Punto p){
        if(p != null){
            x = p.obtenerX();
            y = p.obtenerY();
        }
    }
    // Consultas
    public int obtenerX(){
        return x;
    }
    public int obtenerY(){
        return y;
    }
    public Punto clone(){
        Punto nuevo = new Punto(x,y);
        return nuevo;
    }
    public boolean equals(Punto p){
        boolean resultado = false;
        if(p != null)
            resultado = x == p.obtenerX() && y == p.obtenerY();
        return resultado;    
    }
    public double distancia(Punto p){
        double resultado = 0;
        if(p != null){
            resultado = Math.sqrt((p.obtenerX() - x) * (p.obtenerX() - x) + (p.obtenerY() - y) * (p.obtenerY() - y));
        }
        return resultado;
    }

}
