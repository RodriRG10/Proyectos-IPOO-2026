package tp5.ejercicio2;

public class MedicionSerivicios {

    // Instancia
    private int gas;
    private int agua;
    private int electricidad;
    // Constructor
    public MedicionSerivicios(int g, int a, int e){
        gas = g;
        agua = a;
        electricidad = e;
    }
    // Comandos
    public void establecerGas(int g){
        gas = g;
    }
    public void establecerAgua(int a){
        agua = a;
    }
    public void establecerElectricidad(int e){
        electricidad = e;
    }
    // Consultas
    public int obtenerGas(){
        return gas;
    }
    public int obtenerAgua(){
        return agua;
    }
    public int obtenerElectricidad(){
        return electricidad;
    }
    public float costoTotal(){
        return (gas * 1.5f) + (agua * 0.5f) + (electricidad * 2.0f);
    }
    
}
