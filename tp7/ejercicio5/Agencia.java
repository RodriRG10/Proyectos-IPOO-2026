package tp7.ejercicio5;
import tp6.ejercicio7.Alojamiento;
import tp6.ejercicio7.Habitacion;
import tp6.ejercicio7.Departamento;


public class Agencia {

    // Instancia
    protected Alojamiento [] alojamientos;
    // Constructor
    public Agencia(int n){
        alojamientos = new Alojamiento[n];
    }
    // Comandos
    public boolean insertarAlojamiento(Alojamiento a, int pos){
        boolean resultado = false;
        for(int i = 0; i < alojamientos.length && !resultado; i++)
            if(alojamientos[i].obtenerId() == a.obtenerId())
                resultado = true;
        if(resultado)
            resultado = false;
        else {
            alojamientos[pos] = a;
            resultado = true;
        }
        return resultado;
    }
    public void eliminarAlojamiento(int pos){
        alojamientos[pos] = null;
    }
    public void eliminarAlojamiento(Alojamiento aloj){
        boolean resultado = false;
        for(int i = 0; i < alojamientos.length && !resultado; i++)
            if(alojamientos[i].obtenerId() == aloj.obtenerId()){
                alojamientos[i] = null;
                resultado = true;
            }
    }

    // Consultas
    public int cantAlojamientos(){
        int cant = 0;
        for(int i = 0; i < alojamientos.length; i++)
            if(alojamientos[i] != null)
                cant++;
        return cant;
    }
    public int tamanioTabla(){
        return alojamientos.length;
    }
    public Alojamiento recuperarAlojamiento(int pos){
        return alojamientos[pos];
    }
    public int recuperarPosicion(Alojamiento aloj){
        int resultado = -1;
        for(int i = 0; i < alojamientos.length && resultado == -1; i++)
            if(alojamientos[i].obtenerId() == aloj.obtenerId())
                resultado = i;
        return  resultado;
    }
    public Alojamiento estaAlojamiento(int c){
        Alojamiento resultado = null;
        for(int i = 0; i < alojamientos.length && resultado == null; i++)
            if(alojamientos[i].obtenerId() == c)
                resultado = alojamientos[i];
        return resultado;
    }
    public boolean estaLlena(){
        return tamanioTabla() == cantAlojamientos();
    }
    public boolean hayAlojamientos(){
        return cantAlojamientos() > 0;
    }
    public Agencia menorCosto(float c, int n, int p){
        Agencia resultado = new Agencia(tamanioTabla());
        int cant = 0;
        int ultimaPos = 0;
        for(int i = 0; i < alojamientos.length && cant <= n; i++){
            if(alojamientos[i] != null && alojamientos[i].costoDiario(i) > c){
                cant++;
                ultimaPos = i;
            }
            else
                cant = 0;
        }
        if(cant == n){
            for(int i = ultimaPos - n + 1; i <= ultimaPos; i++)
                resultado.insertarAlojamiento(alojamientos[i], i);
        }
        return resultado;
    }
}
