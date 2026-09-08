package tp2.ejercicio4;

public class Refugio {
    // Atributos Clase
    private static int capacidadAlacena = 20;
    private static int cantidadCamas = 10;
    // Atributos Instancia
    private int alimentos;
    private int bebidas;
    private int camas;
    // Constructor
    public Refugio(int a, int b, int c){
        if (a + b > capacidadAlacena){
            alimentos = capacidadAlacena / 2;
            bebidas = capacidadAlacena / 2;
        }
        else{
            alimentos = a;
            bebidas = b;
        }
        if (c > cantidadCamas)
            camas = cantidadCamas;
        else
            camas = c; 
    }
    // Comandos
    public void consumirAlimento(){
        alimentos--;
    }
    public void consumirBebida(){
        bebidas--;
    }
    public boolean ocuparCama(){
        boolean resultado = false;
        if (camas > 0){
            camas++;
            resultado = true;
        }
        return resultado;
    }
    public boolean desocuparCama(){
        boolean resultado = false;
        if (camas > 0){
            camas--;
            resultado = true;
        }
        return resultado;
    }
    public boolean reponerAlimentos(int n){
        boolean resultado = false;
        if (n > 0 && alimentos + n <= capacidadAlacena){
            alimentos += n;
            resultado = true;
        }
        return resultado; 
    }
    public boolean reponerBebidas(int n){
        boolean resultado = false;
        if (n > 0 && bebidas + n <= capacidadAlacena){
            bebidas += n;
            resultado = true;
        }
        return resultado; 
    }
    // Consultas
    public int obtenerAlimentos(){
        return alimentos;
    }
    public int obtenerBebidas(){
        return bebidas;
    }
    public int obtenerCamas(){
        return camas;
    }
    public int CapacidadAlacena(){
        return capacidadAlacena;
    }
    public boolean esHabitable(){
        boolean resultado = false;
        if (camas > 0 || alimentos > 0 || bebidas > 0){
            resultado = true;
        }
        return resultado; 
    }
    public int disponibilidad(){
        return cantidadCamas;
    }
    public int diasSupervivencia(){
        int resultado;
        if (alimentos < bebidas)
            resultado = bebidas;
        else
            resultado = alimentos;
        
            return resultado;
    }
    public boolean mayorAlimentos(Refugio r){
        boolean resultado = false;
        if (r != null &&  alimentos > r.obtenerAlimentos()){
            resultado = true;
        }
        return resultado;
    }
    public boolean equals(Refugio r){
        boolean resultado = false;
        if (r != null && alimentos == r.obtenerAlimentos() && bebidas == r.obtenerBebidas() && camas == r.obtenerCamas()){
            resultado = true;
        }
        return resultado;
    }
    public Refugio clone(){
        return new Refugio(alimentos, bebidas,camas);
    }
    public String toString(){
        return "Alimentos: " + alimentos + " Bebidas: " + bebidas + " Camas: " + camas;
    }
}   
