package tp4.ejercicio6;
import tp2.ejercicio5.Sensor;

public class TableroSensores {
    // Instancia
    private Sensor [][] grilla;
    // Constructor
    public TableroSensores(int cantFil, int cantCol){
        grilla = new Sensor[cantFil][cantCol];
    }
    // Comandos
    public void establecerSensor(int f, int c, Sensor s){
        if (s != null)
            grilla[f][c] = s;
    }
    public void intercambiar(int f1, int f2){
        Sensor aux = null;
        for (int j = 0; j < cantColumnas(); j++){
            aux = grilla[f1][j];
            grilla[f1][j] = grilla[f2][j];
            grilla[f2][j] = aux;
        }
    }
    public void copy(TableroSensores t){
        if (t != null && this.cantFilas() == t.cantFilas() && this.cantColumnas() == t.cantColumnas()){
            for (int i = 0; i < cantFilas(); i++)
                for (int j = 0; j < cantColumnas(); j++)
                    grilla[i][j] = t.obtenerSensor(i,j);
        }
    }
    // Consultas
    public int cantFilas(){
        return grilla.length;
    }
    public int cantColumnas(){
        return grilla[0].length;
    }
    public Sensor obtenerSensor(int f, int c){
        return grilla[f][c];
    }
    

    
}
