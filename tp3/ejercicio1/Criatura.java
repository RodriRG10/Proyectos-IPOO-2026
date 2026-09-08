package tp3.ejercicio1;
import tp2.ejercicio4.Refugio;

public class Criatura {
    // Atributos clase
    private static int maxEnergia = 100;
    private static int minEnergia = 0;
    private static int consumoEnergia = 10;
    // Atributos instancia
    private int energia;
    private Refugio refugio;
    private boolean despierto;
    private int caminatas;
    // Constructor
    public Criatura(Refugio r){
        refugio = r;
        energia = maxEnergia;
        despierto = true;
        caminatas = 0;
    }
    // Comandos
    public boolean comer(){
        boolean resultado = false;
        if(despierto && refugio.obtenerAlimentos() > 0 && energia < maxEnergia){
            energia += 1;
            refugio.consumirAlimento();
            resultado = true;
        }
        return resultado;
    }
    public boolean beber(){
        boolean resultado = false;
        if(despierto && refugio.obtenerBebidas() > 0 && energia < maxEnergia){
            energia += 1;
            refugio.consumirBebida();
            resultado = true;
        }
        return resultado;
    }
    public boolean dormir(){
        if(despierto && refugio.obtenerCamas() < 10){
            refugio.ocuparCama();
            despierto = false;
        }
        return despierto;  //algo raro hay aca
    }
    public boolean despertar(){
        if (despierto == false){
            despierto = true;
            refugio.desocuparCama();
            caminatas = 0;
        }
        return despierto;
    }
    public boolean caminar(){
        if (despierto && energia > minEnergia){
            energia -= consumoEnergia;
            caminatas++;
        }
        if (caminatas > 3){
            if (refugio.obtenerCamas() < 10){
                refugio.ocuparCama();
                despierto = false;
            }
            else{
                energia = minEnergia;
                caminatas = 3;
            }
        }
        return despierto;
    }
    // Consultas
    public int obtenerEnergia(){
        return energia;
    }
    public int obtenerCaminatas(){
        return caminatas;
    }
    public int obtenerHumor(){
        int humor = 1;
        if(refugio.esHabitable() == false){
            humor = 1;
        }
        else 
            if (energia <= 40){
            humor = 1;
        }
        else 
            if (energia > 40 && energia <= 70){
            humor = 2;
        }
        else 
            if (energia > 70){
            humor = 3;
        }
        return humor;
    }
    public Refugio obtenerRefugio(){
        return refugio;
    }
    public boolean estaDormido(){
        return !despierto; //algo raro hay aca
    }
    public boolean mayorEnergia(Criatura c){
        boolean resultado = false;
        if (energia > c.obtenerEnergia()){
            resultado = true;
        }
        return resultado;
    }
    public String toString(){
        return "Energia: " + energia + ", Caminatas: " + caminatas + ", Despierto: " + despierto + ", Humor: " + obtenerHumor() + ", Refugio: [" + refugio.toString() + "]";
    }
}
