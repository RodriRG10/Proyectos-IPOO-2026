package tp5.ejercicio4;
import tp2.ejercicio4.Refugio;

public class Territorio {

    // Instancia
    protected Refugio [][] tablero;
    // Constructor
    public Territorio(int nf, int nc){
        tablero = new Refugio[nf][nc];
    }
    // Comandos
    public boolean establecerRefugio(Refugio r, int f, int c){
        boolean resultado = false;
        if(r != null && f >= 0 && f < cantFilas() && c >= 0 && c < cantColumnas()){
            tablero[f][c] = r;
            resultado = true;
        }
        return resultado;
    }
    // Consultas
    public int cantFilas(){
        return tablero.length;
    }
    public int cantColumnas(){
        return tablero[0].length;
    }
    public int cantRefugio(){
        int cont = 0;
        for(int i = 0; i < cantFilas(); i++)
            for(int j = 0; j < cantColumnas(); j++)
                if(tablero[i][j] != null)
                    cont++;
        return cont;
    }
    public int filaMasPoblada(){
        int cant = 0; int filaP = 0; int mayor = 0;
        for(int i = 0; i < cantFilas(); i++){
            for(int j = 0; j < cantColumnas(); j++)
                if(tablero[i][j] != null)
                    cant++;
            if(mayor < cant){
                mayor = cant;
                filaP = i;
            }
            cant = 0;  
        }
        return filaP;
    }
    public boolean maximoNRefugiosHabitables(int f, int n){
        int cant = 0;
        // ASUMO QUE F Y N SON PARAMETROS VALIDOS
        for(int j = 0; j < cantColumnas() && cant <= n; j++)
            if(tablero[f][j].esHabitable())
                cant++;
        return cant <= n;       
    }
    public int cantConDisponibilidadMayor(int m){
        int cant = 0;
        boolean es = false;
        // ASUMO QUE M ES UN PARAMETRO VALIDO
        for(int j = 0; j < cantColumnas(); j++){
            for(int i= 0; i < cantFilas() && !es; i++)
                if(tablero[i][j].disponibilidad() > m){
                    es = true;
                    cant++;
                }
            es = false;
        }
        return cant;
    }
    public boolean territorioEspejo(){
        boolean resultado = false;
        if(cantColumnas() % 2 == 1){
            resultado = true;
            for(int i = 0; i < cantFilas() && resultado;i++){
                if(!(tablero[i][cantColumnas()/2].equals(tablero[i][(cantColumnas()/2) +2])))
                    resultado = false;
            }
        }
        return resultado;
    }
    public ColeccionRefugio coleccionFila(){
        boolean corte = false;
        ColeccionRefugio nuevo = new ColeccionRefugio(cantFilas());
        for (int i = 0; i < cantFilas(); i++){
            for (int j = 0; j < cantColumnas() && !corte; j++)
                if(tablero[i][j] != null){
                    nuevo.insertarRefugio(tablero[i][j]);
                    corte = true;
                }
            corte = false;
        }
    }
    public Territorio clone(){
        Territorio nuevo = new Territorio(cantFilas(), cantColumnas());
        for (int i = 0; i < cantFilas(); i++)
            for (int j = 0; j < cantColumnas(); j++)
                nuevo.establecerRefugio(tablero[i][j].clone(),i,j);
        return nuevo;
    }
    
}
