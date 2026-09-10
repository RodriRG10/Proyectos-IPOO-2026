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
        
    }


    
}
