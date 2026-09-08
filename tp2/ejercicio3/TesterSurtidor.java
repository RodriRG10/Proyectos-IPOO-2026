package tp2.ejercicio3;
import java.util.Scanner;

public class TesterSurtidor {
    public static void main (String []args){
        int a;
        Surtidor s = new Surtidor();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Testeando clase surtidor verificar servicios de la clase");
        System.out.println("Ingrese la cantidad que quiere extraer de gasoil");
        a = teclado.nextInt();
        while (a <= 0)
            System.out.println("Ingresar un numero positivo");
        s.extraerGasoil(a);
        System.out.println();
        //falta terminarlo


   }
    
}
    