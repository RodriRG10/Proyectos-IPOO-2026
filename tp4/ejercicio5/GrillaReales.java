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
        boolean resultado = false;
        if (0 <= f1 && f1 < cantFilas() && 0 <= f2 && f2 < cantFilas()){
            float[] aux = grilla[f1];
            grilla[f1] = grilla[f2];
            grilla[f2] = aux;
            resultado = true; 
        }
        return resultado;
    }
    // Consultas
    public float obtenerReal(int f, int c){
        return grilla[f][c];
    }
    public int cantFilas(){
        return grilla.length;
    }
    public int cantColumnas(){
        return grilla[0].length;
    }
    public float total(){
        float total = 0;
        for (int i = 0; i < cantFilas(); i++)
            for (int j = 0; j < cantColumnas(); j++)
                total += grilla[i][j];
        return total;
    }
    public float totalColumna(int c){
        float total = 0;
        for (int i = 0; i < cantFilas(); i++)
            total += grilla[i][c];
        return total;
    }
    public boolean estaNum(float r){
        boolean resultado = false;
        for(int i = 0; i < cantFilas() && !resultado; i++)
            for (int j = 0; j < cantColumnas() && !resultado; j++)
                if (grilla[i][j] == r)
                    resultado = true;
        return resultado;
    }
    public int cantidadMayores(float r){
        int cant = 0;
        for (int i = 0; i < cantFilas(); i++)
            for (int j = 0; j < cantColumnas(); j++)
                if (grilla[i][j] > r)
                    cant++;
        return cant;
    }
    public boolean esFilaCreciente(int f){
        boolean resultado = true;
        for(int j = 0; j < cantColumnas() - 1 && resultado; j++)
            if (grilla[f][j] > grilla[f][j+1])
                resultado = false;
        return resultado;
    }
    public boolean hayNMayoresConsecutivos(int n, float r){
        int cant = 0;
        if (n > 0 && n <= cantColumnas()){
            for (int i = 0; i < cantFilas() && cant < n; i++)
                for (int j = 0; j < cantColumnas() && cant < n; j++)
                    if (grilla[i][j] > r)
                        cant++;
                    else
                        cant = 0;
        }
        return cant >= n;
    }
    public boolean esTranspuesta(GrillaReales g){
        boolean resultado = true;
        if (g != null && cantFilas() == g.cantColumnas() && cantColumnas() == g.cantFilas()){
            for (int i = 0; i < cantFilas() && resultado; i++)
                for (int j = 0; j < cantColumnas() && resultado; j++)
                    if (grilla[i][j] != g.obtenerReal(j,i))
                        resultado = false;
        }
        else
            resultado = false;
        return resultado;
    }
    public GrillaReales transpuesta(){
        GrillaReales g = new GrillaReales(cantColumnas(), cantFilas());
        for (int i = 0; i < cantFilas(); i++)
            for (int j = 0; j < cantColumnas(); j++)
                g.establecerReal(j, i, grilla[i][j]);
        return g;
    }
}
