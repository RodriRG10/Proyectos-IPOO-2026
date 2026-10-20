package tp4.ejercicio4;
import tp2.ejercicio5.Sensor;

public class FilaSensores {
    // Instancia
    private Sensor[]fs;
    // Constructor
    public FilaSensores(int cant){
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
        int cant = 0;
        for(int i = 0; i < fs.length; i++)
            if(fs[i].riesgo())
                cant++;
        return cant;
    }
    public boolean hayNRiesgo(int n){
        int resultado = 0;
        for(int i = 0; i < fs.length && resultado < n; i++)
            if(fs[i].riesgo())
                resultado++;
        return resultado >= n;
    }
    public boolean dosConsecutivosEmergencia(){
        boolean resultado = false;
        for(int i = 0; i < cantFila() - 1 && !resultado; i++)
            if(fs[i].emergencia() && fs[i + 1].emergencia())
                resultado = true;
        return resultado;
    }
    public boolean equals(FilaSensores a){ //superficial
        return fs == a.fs;
    }
    public FilaSensores clone(){ //profudnidad
        FilaSensores nuevo = new FilaSensores(cantFila());
        for(int i = 0; i < cantFila(); i++)
            nuevo.establecerSensor(i,fs[i].clone());
        return nuevo;
    } 
     
}

