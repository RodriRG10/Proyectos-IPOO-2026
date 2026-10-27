package tp6.ejercicio6;
import tp2.ejercicio4.Refugio;

public class RefugioVip extends Refugio {

    // Clase
    protected static int capacidadSillones = 10;
    // Instancia
    protected int sillones;
    // Constructor
    public RefugioVip(int a, int b, int c, int s){
        super(a,b,c);
        sillones = s;
    }
    // Comandos
    public boolean ocuparSillon(){
        boolean resultado = false;
        if (sillones < capacidadSillones){
            sillones++;
            resultado = true;
        }
        return resultado;
    }
    public boolean desocuparSillon(){
        boolean resultado = false;
        if(sillones >= 1){
            sillones--;
            resultado = true;
        }
        return resultado;
    }
    //Consultas
    public int obtenerSillones(){
        return sillones;
    }
    public int disponibilidad(){
        return super.disponibilidad() + sillones;
    }
    public RefugioVip clone(){
        RefugioVip nuevo = new RefugioVip(alimentos, bebidas, camas, sillones);
        return nuevo;
    }
    
}
