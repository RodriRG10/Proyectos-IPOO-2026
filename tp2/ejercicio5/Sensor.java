package tp2.ejercicio5;

public class Sensor {
    // Clase
    private static final double max = 0.01;
    // Instacia
    private float p1;
    private float p2;
    // Constructor
    public Sensor(float p1, float p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    // Comandos
    public void establecerP1(float p){
        p1 = p;
    }
    public void establecerP2(float p){
        p2 = p;
    }
    public void copy(Sensor s){
        if (s != null){
            p1 = s.obtenerP1();
            p2 = s.obtenerP2();
        }
    }
    // Consultas
    public float obtenerP1(){
        return p1;
    }
    public float obtenerP2(){
        return p2;
    }
    public boolean riesgo(){
        return p1 < p2;
    }
    public boolean emergencia(){
        return p1 < max;
    }
    public boolean equals(Sensor s){
        boolean resultado = false;
        if (s != null)
            resultado = p1 == s.obtenerP1() && p2 == s.obtenerP2();
        return resultado;
    }
    public Sensor clone(){
        Sensor s = new Sensor(p1,p2);
        return s;
    }
}
