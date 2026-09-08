package tp2.ejercicio2;
import java.util.Scanner;
public class TesterPoliza {
    public static void main(String[] args){
        int Poliza = 0;
        float i = 0, r = 0;
        Scanner teclado = new Scanner(System.in);
        while (i <= 0 || r <= 0 || Poliza <= 0) {
            System.out.println("Ingrese el numero de poliza: ");
            Poliza = teclado.nextInt();
            System.out.println("Ingrese el monto de incendio: ");
            i = teclado.nextFloat();
            System.out.println("Ingrese el monto de robo: ");
            r = teclado.nextFloat();
        }
        Poliza p1 = new Poliza(Poliza, i, r);
        p1.actualizarPorcentaje(20);
        System.out.println(p1.obtenerRobo());
        System.out.println(p1.obtenerIncendio());
        p1.desactivar();
        p1.actualizarPorcentaje(10);
        System.out.println(p1.obtenerRobo());
        System.out.println(p1.obtenerIncendio());
        p1.activar();
        System.out.println("El numero de la poliza es: " + p1.obtenerNroPoliza());
        System.out.println("El costo de la poliza es: " + p1.CostoPoliza());
        System.out.println("La poliza esta activa: " + p1.estaActiva());
        teclado.close();
    }
}
