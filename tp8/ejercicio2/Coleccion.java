package tp8.ejercicio2;

public class Coleccion {

    // Instancia
    protected Elemento[] col;
    protected int cant;

    // Constructor
    public Coleccion (int max){
        col = new Elemento[max];
        cant = 0;
    }

    // Comandos
    public void insertar(Elemento e){
        if (cant < col.length){
            col[cant] = e;
            cant++;
        }
    }
    public void eliminar(Elemento e){
        boolean res = false;
        for(int i = 0; i < cant && !res; i++){
            if(col[i].esEquivalente(e)){
                col[i] = col[cant - 1];
                cant--;
                res = true;
            }
        }
    }
    public void ordenada(){ // Ordena coleccion por metodo shake sort
        int izq = 0;
        int der = cant - 1;
        boolean ordenado = false;
        while(izq < der && !ordenado){ // Mientras no este ordenado y no se crucen los indices
            for(int i = izq; i < der; i++){ // Recorre de izquierda a derecha
                if(col[i].esMayor(col[i + 1])){
                    Elemento aux = col[i]; 
                    col[i] = col[i + 1];
                    col[i + 1] = aux;
                    ordenado = false;
                }
            }
            der--;
            for(int i = der; i > izq; i--){ // Recorre de derecha a izquierda
                if(col[i - 1].esMayor(col[i])){
                    Elemento aux = col[i - 1]; 
                    col[i - 1] = col[i];
                    col[i] = aux;
                    ordenado = false;
                }
            }
            izq++;  
        }
    }

    // Consultas
    public boolean estaLlena(){
        return cant == col.length;
    }
    public boolean hayElemenntos(){
        return cant > 0;
    }
    public int cantElementos(){
        return cant;
    }
    public boolean existePosicion(int p){
        return p >= 0 && p < cant;
    }
    public Elemento recuperarElemento(int p){
        Elemento e = null;
        if(p >= 0 && p < cant){
            e = col[p];
        }
        return e;
    }
    public boolean estaElemento(Elemento e){
        boolean res = false;
        for(int i = 0; i < cant && !res; i++){
            if(col[i].esEquivalente(e)){
                res = true;
            }
        }
        return res;
    }

}
