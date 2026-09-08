package tp3.ejercicio8;

public class Hora {
    // Instancia
    private int hor;
    private int min;
    // Constructor
    public Hora(int h, int m){
        hor = h;
        min = m;
    }
    // Comandos
    public void establecerHora(int c){
        hor = c;
    }
    public void establecerMinutos(int c){
        min = c;
    }
    public void copy(Hora h){
        hor = h.obtenerHora();
        min = h.obtenerMinutos();
    }
    // Consultas
    public int obtenerHora(){
        return hor;
    }
    public int obtenerMinutos(){
        return min;
    }
    public boolean equals(Hora c){
        return hor == c.obtenerHora() && min == c.obtenerMinutos();
    }
    public int diferenciaMinutos(Hora c){
        return (hor - c.obtenerHora()) * 60 + (min - c.obtenerMinutos());
    }
    public boolean anterior(Hora c){
        return hor < c.obtenerHora();
    }
}
