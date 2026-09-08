package tp3.ejercicio4;
import tp2.ejercicio9.Color;
public class Borde {
    // Atributos Instancia
    private int grosor;
    private Color color;
    // Constructor
    public Borde(int g, Color c){
        grosor = g;
        color = c;
    }
    // Comandos
    public void establecerGrosor(int g){
        grosor = g;
    }
    public void establecerColor(Color c){
        color = c;
    }
    public void copy(Borde b){
        if (b != null){
            grosor = b.obtenerGrosor();
            color = b.obtenerColor();
        }
    }
    // Consultas
    public int obtenerGrosor(){
        return grosor;
    }
    public Color obtenerColor(){
        return color;
    }
    public Borde clone(){
        Borde b = new Borde(grosor,color);
        return b;
    }
    public boolean equals(Borde b){
        return color == b.obtenerColor() && grosor == b.obtenerGrosor();
    }
    


}
    

