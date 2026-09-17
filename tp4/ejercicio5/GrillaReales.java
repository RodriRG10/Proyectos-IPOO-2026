package tp4.ejercicio5;

public class GrillaReales {
    // Instancia
    private float [][] grilla;
    // Constructor
    public GrillaReales(int f, int c){
        grilla = new float[f][c];
    }
    // Comandos
    public void establecerReal(int f, int c, float r){
        grilla[f][c] = r;
    }
    public void reemplazar(float r1, float r2){
        for (int i = 0; i < grilla.length; i++) //for de las filas
            for (int j = 0; j < grilla[0].length; j++) //for de las columnas
                if (grilla[i][j] == r1)
                    grilla[i][j] = r2;
    }
    public void reemplazar(float r1, float r2, int f){
        boolean resultado = false;
        for (int i = grilla[f].length -1; i >= 0 && !resultado; i--)
            if (grilla[f][i] == r1){
                grilla[f][i] = r2;
                resultado = true;
            }     
    }
    public boolean intercambiarFilas(int f1, int f2){

    }
    // Consultas






    

}
