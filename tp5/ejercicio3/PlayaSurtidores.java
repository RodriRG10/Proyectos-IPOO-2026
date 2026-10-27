package tp5.ejercicio3;
import tp2.ejercicio3.Surtidor;

public class PlayaSurtidores {

    // Instacia 
    public Surtidor [] tabla;
    // Constructor
    public PlayaSurtidores(int n){
        tabla = new Surtidor[n];
    }
    public PlayaSurtidores(){
        tabla = new Surtidor[10];
    }
    // Comandos
    public void establecerSurtidor(Surtidor s, int p){
        tabla[p] = s;
    }
    public void establecerSurtidor(Surtidor s){
        boolean resultado = false;
        for(int i = 0; i < cantPosiciones() && !resultado; i++)
            if(tabla[i] == null){
                tabla[i] = s;
                resultado = true;
            }
    }
    public void llenaDepositos(){
        for(int i = 0; i < cantPosiciones(); i++)
            if(tabla[i] != null){
                tabla[i].llenarDepositoGasoil();
                tabla[i].llenarDepositoPremium();
                tabla[i].llenarDepositoSuper();
            }         
    }
    public void agrupaSurtidores(){
        int posLibre = 0; 
        // Recorremos todo el arreglo de surtidores
        for (int i = 0; i < cantPosiciones(); i++) {
            // Si encontramos una referencia ligada (un surtidor que no es null)
            if (tabla[i] != null) {
                // Si el surtidor no está ya en la posición correcta, lo movemos
                if (i != posLibre) {
                    tabla[posLibre] = tabla[i];
                    tabla[i] = null; // Dejamos la posición vieja en null
                }
                // Avanzamos el puntero de escritura a la siguiente posición libre
                posLibre++;
            }
        }
    }
    public int cantPosiciones(){
        return tabla.length;
    }
    public int cantSurtidores(){
        int cant = 0;
        for(int i = 0; i < cantPosiciones();i++)
            if(tabla[i] != null)
                cant++;
        return cant;
    }
    public Surtidor obtenerSurtidor(int p){
        return tabla[p];
    }
    public int cantMaximaCarga(){
        int cant = 0;
        for (int i = 0; i < cantPosiciones(); i++)
            if(tabla[i] != null && tabla[i].obtenerLitrosGasoil() == tabla[i].obtenerMaximaCarga() &&tabla[i].obtenerLitrosSuper() == tabla[i].obtenerMaximaCarga() && tabla[i].obtenerLitrosPremium() == tabla[i].obtenerMaximaCarga())
                cant++;
        return cant;
    }
    public boolean mismosNulos(PlayaSurtidores ps){
        boolean resultado = true;
        for (int i = 0; i < cantPosiciones() && resultado; i++)
            if ((tabla[i] == null) != (ps.obtenerSurtidor(i) == null))
                resultado = false;
        return resultado;
    }
    public PlayaSurtidores clone(){
        PlayaSurtidores nuevo = new PlayaSurtidores(cantPosiciones());
        for (int i = 0; i < cantPosiciones(); i++)
            if(tabla[i] != null)
                nuevo.establecerSurtidor(tabla[i],i);
        return nuevo;     
    }
    public PlayaSurtidores nLigados(int n){
        int cant = 0;
        int ultimo = 0;
        int inicio = 0;
        PlayaSurtidores nuevo = null;
        for (int i = 0; i < cantPosiciones() && cant < n; i++){
            if (tabla[i] != null)
                cant++;
            else
                cant = 0;
            ultimo = i;
        }
        if (cant >= n){
            inicio = ultimo - n + 1;
            nuevo = new PlayaSurtidores(n);
            int k = 0;
            for (int i = inicio; i <= ultimo; i++){
                nuevo.establecerSurtidor(tabla[i],k);
                k++;
            }
        }
        return nuevo;
    }  
}