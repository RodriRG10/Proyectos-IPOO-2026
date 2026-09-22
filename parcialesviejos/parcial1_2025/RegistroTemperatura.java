package parcialesviejos.parcial1_2025;

public class RegistroTemperatura {
    // Instancia 
    private float [] reg;
    // Constructor
    public RegistroTemperatura(){
        reg = new float[12];
    }
    // Comandos
    public void establecerTemp(int mes, float temp){
        reg[mes-1] = temp;
    }
    public int mesMasCaluroso(){
        int MasCalor = -1;
        for (int i = 0; i < reg.length; i++)
            if(reg[i] >= MasCalor)
                MasCalor = i;
        return MasCalor;
    }
    public boolean exactamenteNbajoCero(int n){
        int cant = 0;
        for (int i = 0; i < reg.length && cant < n; i++)
            if (reg[i] < 0)
                cant++;
        return cant >= n;
    }
}
