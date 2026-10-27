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
    private int 
    
}
