package parcialesviejos.parcial1_2025;
import parcialesviejos.parcial1_2025.Sensor;

public class EstacionMeteorologica {
    private int codigo;
    private boolean activa;
    private Sensor sensor;
    public EstacionMeteorologica(int cod, Sensor s){
        activa = true;
        codigo = cod;
        sensor = s;
    }
    public void establecerCodigo(int cod){
        codigo = cod;
    }
    public void establecerSensor(Sensor s){
        sensor = s;
    }
    public void activar(){
        activa = true;
    }
    public void desactivar(){
        activa = false;
    }
    public void copy(EstacionMeteorologica e){
        if (e != null){
            codigo = e.obtenerCodigo();
            activa = e.estaActiva();
            sensor.copy(e.obtenerSensor());
        }
    }
    public int obtenerCodigo(){
        return codigo;
    }
    public boolean estaActiva(){
        return activa;
    }
    public Sensor obtenerSensor(){
        return sensor;
    }
    public EstacionMeteorologica clone(){
        EstacionMeteorologica nuevo = new  EstacionMeteorologica(codigo, sensor);
        nuevo.activa = this.activa;
        return nuevo;
    }
    public EstacionMeteorologica obtenerEstacionConMayorTemperatura(EstacionMeteorologica e){
    // Bloque 1: Comparación de Temperatura
    EstacionMeteorologica estacionResultado = this; // Valor por defecto
    if (obtenerCodigo() > e.obtenerCodigo()) {
        estacionResultado = this;
    } else if (e.obtenerCodigo() > this.obtenerCodigo()) {
        estacionResultado = e;
    } 
    // Bloque 2: Comparación de Humedad (solo si las temperaturas son iguales)
    if (this.obtenerSensor().obtenerTemperatura() == e.obtenerSensor().obtenerTemperatura()) {
        if (this.obtenerSensor().obtenerHumedad() > e.obtenerSensor().obtenerHumedad()) {
            estacionResultado = this;
        } else if (e.obtenerSensor().obtenerHumedad() > this.obtenerSensor().obtenerHumedad()) {
            estacionResultado = e;
        } else {
            // Empate total: vuelve a asegurar que retorne la receptora
            estacionResultado = this;
        }
    }

    // Único punto de fuga al final
    return estacionResultado;
    
}
