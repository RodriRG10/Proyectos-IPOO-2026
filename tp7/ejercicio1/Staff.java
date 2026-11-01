package tp7.ejercicio1;
import tp6.ejercicio5.Rubrica;

public class Staff {

    // Instancia
    protected Rubrica[] s;
    protected int cant;
    // Constructor
    public Staff(int max){
        s = new Rubrica[max];
        cant = 0;
    }
    // Comandos
    public boolean agregarRubrica(Rubrica r){
        boolean resultado = false;
        if(r != null && !estaLlena()){
            s[cant] = r;
            cant++;
            resultado = true;
        }
        return resultado;
    }
    public void eliminar(int p){
        for(int i = 0; i < cantRubricag(); i++){
            if(s[i].productividad() < p){
                s[i] = s[cant - 1];
                s[cant - 1] = null;
                cant--;
                i--;
            }
        }
    }
    // Consultas
    public boolean estaLlena(){
        return cant == cantPosiciones();
    }
    public int cantPosiciones(){
        return s.length;
    }
    public int cantRubrica(){
        return cant;
    }
    public Rubrica obtenerRubrica(int p){
        return s[p];
    }
    public int contarMayor(int p){
        int cant = 0;
        for(int i = 0; i < cant; i++){
            if(s[i].productividad() > p){
                cant++;
            }
        }
        return cant;
    }
    public Staff totalMayor(int t){
        Staff n = new Staff(cantPosiciones());
        for(int i = 0; i < cant; i++){
            if(s[i].total() > t){
                n.agregarRubrica(s[i]);
            }
        }
        return n;
    }
}
