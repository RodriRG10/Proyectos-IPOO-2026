package parcialesviejos.parcial1_2025;

public class Sensor {
    // Instancia
    private int temperatura;
    private int humedad;
    private int viento;
    // Constructor
    public Sensor(int t, int h, int viento){
        temperatura = t;
        humedad = h;
        this.viento = viento;
    }
    // Comandos
    public void establecerTemperatura(int t){
        temperatura = t;
    }
    public void establecerHumedad(int h){
        humedad = h;
    }
    public void establecerViento(int v){
        viento = v;
    }
    public void copy(Sensor s){
        temperatura = s.obtenerTemperatura();
        humedad = s.obtenerHumedad();
        viento = s.obtenerViento();
    }
    // Consultas
    public int obtenerTemperatura(){
        return temperatura;
    }
    public int obtenerHumedad(){
        return humedad;
    }
    public int obtenerViento(){
        return viento;
    }
    public boolean equals(Sensor s){
        return (temperatura == s.obtenerTemperatura() && humedad == s.obtenerHumedad() && viento == s.obtenerViento());
    }
    public Sensor clone(){
        Sensor s = new Sensor(temperatura, humedad, viento);
        return s;
    }

    public static void main(String[] args) {
        Sensor s1 = new Sensor(20, 50, 10);
        Sensor s2 = new Sensor(25, 60, 15);
        Sensor s3;
        System.out.println("Sensor 1: Temperatura = " + s1.obtenerTemperatura() + ", Humedad = " + s1.obtenerHumedad() + ", Viento = " + s1.obtenerViento());
        System.out.println("Sensor 2: Temperatura = " + s2.obtenerTemperatura() + ", Humedad = " + s2.obtenerHumedad() + ", Viento = " + s2.obtenerViento());
        System.out.println("¿Son iguales? " + s1.equals(s2));
        s1.copy(s2);
        s3 = s1.clone();
        System.out.println("Después de copiar Sensor 2 a Sensor 1:");
        System.out.println("Sensor 1: Temperatura = " + s1.obtenerTemperatura() + ", Humedad = " + s1.obtenerHumedad() + ", Viento = " + s1.obtenerViento());
        System.out.println("¿Son iguales? " + s1.equals(s2));
        System.out.println("Sensor 3 (clon de Sensor 1): Temperatura = " + s3.obtenerTemperatura() + ", Humedad = " + s3.obtenerHumedad() + ", Viento = " + s3.obtenerViento());
        System.out.println("¿Sensor 1 es igual a Sensor 3? " + s1.equals(s3));
    }


    
}
