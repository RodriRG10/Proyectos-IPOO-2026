package tp5.ejercicio4;
import tp2.ejercicio4.Refugio; 

public class ColeccionRefugio {

    // Instacia
    protected Refugio [] col;
    protected int cant;
    // Constructor
    public ColeccionRefugio(int n){
        col = new Refugio[n];
        cant = 0;
    }
    // Comandos
    public void insertarRefugio(Refugio r){
        if(cant < col.length){
            col[cant] = r;
            cant++;
        }
    }
    public void eliminarEscasaSupervivencia(){

    }

    // Consultas
    public int tamanoColeccion(){
        return col.length;
    }
    public int cantRefugios(){
        return cant;
    }
    public  boolean estaLlena(){
        return cant == tamanoColeccion();
    }
    public Refugio obtenerRefugio(int pos){
        Refugio r = null;
        if(0 <= pos && pos < cantRefugios())
            r = col[pos];
        return r;
    }
    public boolean hayNSeguidosHabitables(int n){
        int cant = 0;
        for(int i = 0; i < cant && cant < n; i++){
            if(col[i].esHabitable()){
                cant++;
            }
            else 
                cant = 0;
        }
        return cant >= n;
    }
    public boolean equals(ColeccionRefugio c){
        boolean resultado = false;
        if (c != null){
            resultado = cantRefugios() == c.cantRefugios() && tamanoColeccion() == c.tamanoColeccion();
            for(int i = 0; i < cant && resultado; i++)
                if(!(col[i].equals(c.obtenerRefugio(i))))
                    resultado = false;
        }
        return resultado;
    }
    

    
}
