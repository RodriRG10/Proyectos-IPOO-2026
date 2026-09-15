package tp4.ejercicio4;
import tp2.ejercicio5.Sensor;

public class FilaSennsores {
    // Instancia
    private Sensor[]fs;
    // Constructor
    public FilaSennsores(int cant){
        fs = new Sensor [cant];
    }
    // Comandos
    public void establecerSensor(int p, Sensor s){
        if(p > 0 && p <= fs.length){
            fs[p-1] = s;
        }
    }
    public void intercambiar(int p1, int p2){
        if(p1 > 0 && p1 < fs.length && p2 > 0 && p2 <= fs.length){
            fs[p1-1] = obtenerSensor(p2);
            fs[p2-1] = obtenerSensor(p1);
        }
    }
    

    // Consultas 
    public Sensor obtenerSensor(int p){
        Sensor aux = null;
        if(p > 0 && p <= fs.length)
            aux = fs[p-1];
        return aux;
    }
    public boolean posicionValida(int p){
        boolean resultado = false;
        if(p > 0 && p <= fs.length)
            resultado = true;
        return resultado;
    }
    public int cantFila(){
        return fs.length;
    }
    public int cantSensores(){
        int cant = 0;
        for(int i = 0; i < fs.length; i++)
            if(fs[i] != null)
                cant++;
        return cant;
    }
    public int cantidadRiesgo(){
        int cnat = 0;
        for(int i = 0; i < fs.length; i++)

    }
    public boolean hayNRiesgo(int n){
        boolean resultado = false;
        for(int i = 0; i < fs.length && !resultado; i++){
            if(fs[i] )
        }
    }
    


    
}
