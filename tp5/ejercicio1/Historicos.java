package tp5.ejercicio1;
import tp2.ejercicio10.Jugador;

public class Historicos {

    // Instancia
    private Jugador[] jugadoresHistoricos;
    private int cant;
    // Constructor
    public Historicos(int n){
        jugadoresHistoricos = new Jugador[n];
        cant = 0;
    }
    // Comandos
    public void establecerJugador(Jugador j){
        jugadoresHistoricos[cant] = j;
        cant++;
    }
    public void ordenar(){ // Ordena el arreglo de jugadores por nro de camiseta
        for (int i = 0; i < cant - 1; i++)
            for (int j = 0; j < cant - 1; j++)
                if (jugadoresHistoricos[j].obtenerNroCamiseta() > jugadoresHistoricos[j +1].obtenerNroCamiseta()){
                    Jugador aux = jugadoresHistoricos[j];
                    jugadoresHistoricos[j] = jugadoresHistoricos[j + 1];
                    jugadoresHistoricos[j + 1] = aux;
                }
    }
    // Consultas
    public boolean estaLleno(){
        return cant == jugadoresHistoricos.length;
    }
    public int cantPosiciones(){
        return jugadoresHistoricos.length;
    }
    public int cantJugadores(){
        return cant;
    }
    public Jugador obtenerJugador(int p){
        return jugadoresHistoricos[p];
    }
    public boolean mMayores(int g, int m){
        int resultado = 0;
        for (int i = 0; i < cant && resultado <= m; i++)
            if (jugadoresHistoricos[i].obtenerGolesConvertidos() > g)
                resultado++;
        return resultado == m;
    }
    public boolean alMneosMMayores(int g, int m){
        int resultado = 0;
        for (int i = 0; i < cant && resultado < m; i++)
            if (jugadoresHistoricos[i].obtenerGolesConvertidos() > g)
                resultado++;
        return resultado >= m;
    }
    public Historicos goleadores(int g){
        Historicos resultado = new Historicos(cant);
        for (int i = 0; i < cant; i++)
            if (jugadoresHistoricos[i].obtenerGolesConvertidos() > g)
                resultado.establecerJugador(jugadoresHistoricos[i]);
        return resultado;
    }


}
