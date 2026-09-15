package tp4.ejercicio2;

public class SecuenciaEnteros {
    // Instacia
    private int [] sec;
    // Constructor
    public SecuenciaEnteros(int cant){
        sec = new int[cant];
    }
    // Comandos
    public void establecerEntero(int p, int n){
        sec[p] = n;
    }
    public void reemplazar(int n1, int n2){
        for (int i = 0; i < sec.length; i++)
            if (sec[i] == n1)
                sec[i] = n2;

        
    }
    public void reemplazar(int n){
        boolean r1, r2;
        r1 = false;
        r2 = false;
        for(int i = 0; i < sec.length && !r1; i++)
            if(sec[i] == n){
                r1 = true;
                sec[i] = 0;
            }
        for (int i = sec.length -1; i > -1 && !r2; i--)
            if (sec[i] == n){
                r2 = true;
                sec[i] = 0;
            }
    }
    
    public boolean intercambiar(int p1, int p2){
        boolean resultado = false;
        if (0 <= p1 && cantElementos() > p2){
            sec[p1] = obtenerEntero(p2);
            sec[p2] = obtenerEntero(p1);
            resultado = true;
        }
        return resultado;
    }
    // public boolean copy


    // Consultas
    public int obtenerEntero(int p){
        return sec[p];
    }
    public int cantElementos(){
        return sec.length;
    }
    public int total(){
        int suma = 0;
        for (int i = 0; i < cantElementos(); i++)
            suma += sec[i];
        return suma;
    }
    public boolean estaNum(int n){
        boolean resultado = false;
        for (int i = 0; i < cantElementos() && !resultado; i++)
            if (sec[i] == n)
                resultado = true;
        return resultado;    
    }
    public int cantidadMayores(int n){
        int cant = 0;
        for (int i = 0; i < cantElementos(); i++)
            if (sec[i] > n)
                cant++;
        return cant;
    }
    public boolean mitadMayores(int n){
        int cant = 0;
        boolean resultado = false;
        for (int i = 0; i < cantElementos(); i++)
            if (sec[i] > n)
                cant++;
        if (cant > cantElementos())
            resultado = true;
        return resultado;
    }
}
