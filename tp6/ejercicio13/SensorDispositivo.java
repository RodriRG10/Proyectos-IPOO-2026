package tp6.ejercicio13;
import tp2.ejercicio5.Sensor;

public class SensorDispositivo extends Sensor {

    // Instancia
    protected float p3;
    protected float p4;
    // Constructor 
    public SensorDispositivo(float pU, float pD, float pT, float pC){
        super(pU,pD);
        p3 = pT;
        p4 = pC;
    }
    // Comandos
    public void establecerP3(float p){
        p3 = p;
    }
    public void establecerP4(float p){
        p4 = p;
    }
    // Consultas
    public float obtenerP3(){
        return p3;
    }
    public float obtenerP4(){
        return p4;
    }
    public boolean riesgo(){
        return p2 > p1;
    }
    public boolean emergencia(){
        return p1 < max;
    }
    public boolean equals(Sensor s){
        boolean resultado = super.equals(s);
        SensorDispositivo nuevo;
        if(this.getClass() == s.getClass()){
            nuevo = (SensorDispositivo)s;
            resultado = p3 == nuevo.obtenerP3() && p4 == nuevo.obtenerP4();
        }
        else 
            resultado = false;
        return resultado;
    }
}
