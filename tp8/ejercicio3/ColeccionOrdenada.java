package tp8.ejercicio3;
import tp8.ejercicio2.Elemento;

public class ColeccionOrdenada {

    // Atributos
    protected Elemento[] t;
    protected int cant;

    // Constructor
    public ColeccionOrdenada(int max){
        t = new Elemento[max];
        cant = 0;
    }

    // Comandos
    public void insertar(Elemento e){
        boolean res = false;
        int pos = cant;
        for(int i = 0; i < cant && !res; i++){
            if(t[i].esMayor(e)){
                while(pos > i){
                    t[pos] = t[pos - 1];
                    pos--;
                }
                t[i] = e;
                cant++;
                res = true;
            }
        }
        if(!res && cant < t.length){
            t[cant] = e;
            cant++;
        }
    }
    public void eliminar(Elemento e){
        boolean res = false;
        for(int i = 0; i < cant && !res; i++){
            if(t[i].esEquivalente(e)){
                int pos = i;
                while(pos < cant - 1){
                    t[pos] = t[pos + 1];
                    pos++;
                }
                t[cant - 1] = null;
                cant--;
                res = true;
            }
        }
    }

    // Consultas
    public boolean estaLlena(){
        return cant == t.length;
    }
    public boolean hayElemento(Elemento e){
        boolean res = false;
        for(int i = 0; i < cant && !res; i++){
            if(t[i].esEquivalente(e)){
                res = true;
            }
        }
        return res;
    }
    public int cantElementos(){
        return cant;
    }
    public boolean existePosicion(int pos){
        return pos >= 0 && pos < cant;
    }
    public Elemento recuperarElemento(int pos){
        Elemento res = null;
        if(existePosicion(pos)){
            res = t[pos];
        }
        return res;
    }
    public boolean estaElemento(Elemento e){ //Aplicar busqueda binaria
        boolean res = false;
        int ini = 0;
        int fin = cant - 1;
        int mitad = 0;
        while (!res && ini <= fin){
            mitad = (ini + fin) / 2;
            if(t[mitad].esEquivalente(e)){
                res = true;
            }
            else if(t[mitad].esMayor(e)){
                fin = mitad - 1;
            }
            else {
                ini = mitad + 1;
            }
        }
        return res;
    }
    public ColeccionOrdenada intercalar(ColeccionOrdenada c){
        ColeccionOrdenada co = new ColeccionOrdenada(cant + c.cantElementos());
        int i = 0;
        int j = 0;
        while (i < cant && j < c.cantElementos()){
            if(t[i].esMayor(c.recuperarElemento(j))){
                co.insertar(c.recuperarElemento(j));
                j++;
            }
            else {
                co.insertar(t[i]);
                i++;
            }
        }
        while (i < cant){
            co.insertar(t[i]);
            i++;
        }
        while (j < c.cantElementos()){
            co.insertar(c.recuperarElemento(j));
            j++;
        }
        return co;
    }
}
