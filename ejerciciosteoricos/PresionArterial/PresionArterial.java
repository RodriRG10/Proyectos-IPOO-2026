package ejerciciosteoricos.PresionArterial;
public class PresionArterial {
    //Atributos de clase
    private static final int unmbralMax = 120;
    private static final int unmbralMin = 80;
    //Atributos de instancia
    private int maxima;
    private int minima;
    //Constructor
    public PresionArterial(int max, int mi) {
        this.maxima = max;
        this.minima = mi;
    }
    //Consultores
    public int obtenerMaxima() {
        return maxima;
    }
    public int obtenerMinima() {
        return minima;
    }
    public double obtenerMinimaKP() {
        return minima * 0.13;
    }
    public double obtenerMaximaKP() {
        return maxima * 0.13;
    }
    public int obtenerPulso() {
        return maxima - minima;
    }
    public boolean armaHipertension() {
        return maxima > unmbralMax || minima > unmbralMin;
    }
}