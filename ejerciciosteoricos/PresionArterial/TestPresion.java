package ejerciciosteoricos.PresionArterial;
public class TestPresion {
    public static void main(String a []) {
        PresionArterial mDia;
        PresionArterial mNoche;
        mDia = new PresionArterial(115, 60);
        mNoche = new PresionArterial(110, 62);
        int p1 = mDia.obtenerPulso();
        int p2 = mNoche.obtenerPulso();
        System.out.println("pulso en la medicion del dia " +p1);
        System.out.println("pulso en la medicion de la noche " +p2);    
    }
}

