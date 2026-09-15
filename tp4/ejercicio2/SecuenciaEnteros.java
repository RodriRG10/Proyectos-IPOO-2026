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
        boolean resultado = false;
        boolean resultado2 = false;
        for (int i = 0; i < sec.length && !resultado; i++)
            if (sec[i] == n){
                resultado = true;
                sec[i] = 0;
        
        for (int i = sec.length -1; i > -1 && !resultado2; i--)
            if (sec[i] == n){
                resultado2 = true;
                sec[i] = 0;
            }
    }


    
}
