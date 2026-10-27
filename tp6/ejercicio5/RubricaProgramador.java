package tp6.ejercicio5;

public class RubricaProgramador extends Rubrica {

    // Instacia
    protected int lineasCodigo;
    // Constructor
    public RubricaProgramador(int l, int c, int a, int r, int lc){
        super(l,c,a,r);
        lineasCodigo = lc;
    }
    // Comandos
    public void aumentarLineasCodigo(int p){
        lineasCodigo += p;
    }
    // Consultas
    public int obtenerLineasCodigo(){
        return lineasCodigo;
    }
    public String toString(){
        return super.toString() + " lineas de codigo" +lineasCodigo;
    }
    public float productividad(){
        return comunicacion * 1.5f + autonomia * 3 + comunicacion * 5 + responsabilidad * ((float)lineasCodigo / 10000);
    }
}
