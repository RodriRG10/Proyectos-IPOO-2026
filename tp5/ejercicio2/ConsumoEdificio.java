package tp5.ejercicio2;

public class ConsumoEdificio {

    /*La clase ConsumoEdificio modela una tabla de objetos de clase MedicionServicios.
    Impleméntela considerando que desde las clases cliente, el primer piso se denota con 1. */

    // Instancia
    private MedicionSerivicios [] consumoXPiso;
    // Constructor
    public ConsumoEdificio(int cantPisos){
        consumoXPiso = new MedicionSerivicios[cantPisos - 1]; 
    }
    // Comandos
    public boolean registrarConsumo(int p, MedicionSerivicios m){
        boolean resultado = false;
        if(p > 0 && p <= consumoXPiso.length){
            consumoXPiso[p-1] = m;
            resultado = true;
        }
        return resultado;
    }
    public boolean eliminarConsumo(int p){
        boolean resultado = false;
        if(p > 0 && p <= consumoXPiso.length){
            consumoXPiso[p-1] = null;
            resultado = true;
        }
        return resultado;
    }
    public void eliminarCeros(){
        for(int i = 0; i < consumoXPiso.length; i++)
            if (consumoXPiso[i] != null) 
                if (consumoXPiso[i].costoTotal() == 0) 
                    consumoXPiso[i] = null;
                else 
                    if ((consumoXPiso[i].obtenerAgua() == 0 && consumoXPiso[i].obtenerGas() == 0) ||  (consumoXPiso[i].obtenerElectricidad() == 0 && consumoXPiso[i].obtenerAgua() == 0) || (consumoXPiso[i].obtenerElectricidad() == 0 && consumoXPiso[i].obtenerGas() == 0)) 
                        consumoXPiso[i] = null;       
    }
    
