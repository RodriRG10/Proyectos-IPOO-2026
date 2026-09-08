package tp3.ejercicio6;
import tp2.ejercicio10.Jugador;

public class Equipo {
    // Atribustos instancia
    private String nombre;
    private Jugador capitan;
    private int pG;
    private int pE;
    private int pP;
    private int gFavor;
    private int gContra;
    // Constructor
    public Equipo(String nom, Jugador cap){
        nombre = nom;
        capitan = cap;
        pG = 0;
        pE = 0;
        pP = 0;
        gFavor = 0;
        gContra = 0;
    }
    // Comandos
    public void incrementarPG(boolean jugoElCap){
        pG+=1;
        if (jugoElCap)
            capitan.aumentarUnPartido();
    }
    public void incrementarPE(boolean jugoElCap){
        pE+=1;
        if (jugoElCap)
            capitan.aumentarUnPartido();
    }
    public void incrementarPP(boolean jugoElCap){
        pP+=1;
        if (jugoElCap)
            capitan.aumentarUnPartido();
    }
    public void aumentarGFavor(int total, int delCap){
        gFavor+=total;
        if (delCap >= 0)
            capitan.aumentarGoles(delCap);
    }
    public void aumentarGcontra(int total){
        gContra+=total;
    }
    // Consultas
    public String obtenerNombre(){
        return nombre;
    }
    public Jugador obtenerCapitan(){
        return capitan;
    }
    public int obtenerPG(){
        return pG;
    }
    public int obtenerPE(){
        return pE;
    }
    public int obtenerPP(){
        return pP;
    }
    public int obtenerGFavor(){
        return gFavor;
    }
    public int obtenerGContra(){
        return gContra;
    }
    public int obtenerPartidos(){
        return pG+pE+pP;
    }
    public int obtenerPuntos(){
        return pG*3+pE;
    }
    public Equipo mejorPuntaje(Equipo e){
        Equipo mejor = this;
        if(this.obtenerPuntos() < e.obtenerPuntos())
            mejor = e;
        else 
            if(this.obtenerPuntos() == e.obtenerPuntos() && this.obtenerGFavor() < e.obtenerGFavor())
                mejor = e;
            else
                if(this.obtenerGFavor() == e.obtenerGFavor() && this.obtenerGContra() > e.obtenerGContra())
                    mejor = e;
        return mejor;
    }
    public Jugador capitanConMasGoles(Equipo e){
        Jugador resultado;
        if(capitan.obtenerGolesConvertidos() > e.obtenerCapitan().obtenerGolesConvertidos())
            resultado = this.capitan;
        else
            resultado = e.obtenerCapitan();
        return resultado;
    }
    public String toString(){
        return "Nombre: "+nombre+"\nCapitan: "+capitan.obtenerNombre()+"\nPG: "+pG+"\nPE: "+pE+"\nPP: "+pP+"\nGFavor: "+gFavor+"\nGContra: "+gContra;
    }
    public boolean equals(Equipo e){
        return nombre == e.obtenerNombre() && capitan.equals(e.obtenerCapitan()) && pG == e.obtenerPG() && pE == e.obtenerPE() && pP == e.obtenerPP() && gFavor == e.obtenerGFavor() && gContra == e.obtenerGContra();
    }
}
    
    

