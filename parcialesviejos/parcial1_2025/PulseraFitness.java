package parcialesviejos.parcial1_2025;

public class PulseraFitness {
    // Clase
    private static final int minPasos = 1000;
    // Instacia
    private int [] registro;
    // Constructor
    public PulseraFitness(int n){
        registro = new int[n];
    }
    // Comandos
    public void establecerCantPasos(int d, int pasos){
        if(d >= 0 && d < registro.length)
            registro[d] = pasos;
    }
    // Consultas
    public int obtenerCantDias(){
        return registro.length;
    }
    public int cantPasos(int d){
        int pasos = -1;
        if(d >= 0 && d < obtenerCantDias())
            pasos = registro[d];

    }
