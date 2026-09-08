package tp2.ejercicio8;

public class Fecha {
    // Atributos instancia
    private int dia;
    private int mes;
    private int anio;
    // Constructor
    public Fecha(int d, int m, int a){
        dia = d;
        mes = m;
        anio = a;
    }
    // Comandos
    public void establecerDia(int d){
        dia = d;
    }
    public void establecerMes(int m){
        mes = m;
    }
    public void establecerAnio(int a){
        anio = a;
    }
    // Consultas
    public int obtenerDia(){
        return dia;
    }
    public int obtenerMes(){
        return mes;
    }
    public int obtenerAnio(){
        return anio;
    }
    public boolean esBisiesto(){
        boolean resultado = false;
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
            resultado = true;
        }
        return resultado;
    }
    public boolean esAnterior(Fecha f){
        boolean resultado = false;
        if (anio < f.obtenerAnio()){
            resultado = true;
        } 
        else 
            if (anio == f.obtenerAnio() && mes < f.obtenerMes()){
            resultado = true;
        } 
        else 
            if (anio == f.obtenerAnio() && mes == f.obtenerMes() && dia < f.obtenerDia()){
            resultado = true;
        }
        return resultado;
    }
    public boolean mismoAnio(Fecha f){
        boolean resultado = false;
        if (anio == f.obtenerAnio()){
            resultado = true;
        }
        return resultado;
    }
    public boolean equals(Fecha f){
        boolean resultado = false;
        if (anio == f.obtenerAnio() && mes == f.obtenerMes() && dia == f.obtenerDia()){
            resultado = true;
        }
        return resultado;
    }
    public String toString(){
        return dia + "/" + mes + "/" + anio;
    }
}

