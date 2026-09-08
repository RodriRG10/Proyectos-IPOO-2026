package ejerciciosteoricos.CtaCteBancaria;
import java.util.Scanner;
public class TestConsola {
    public static void main(String []args) {
        Scanner teclado = new Scanner(System.in); //crea un objeto de la clase Scanner para leer la entrada del usuario

        System.out.println("Ingrese el codigo de la cuenta bancaria: "); //pide al usuario que ingrese el codigo de la cuenta bancaria
        int codigo = teclado.nextInt();

        CuentaBancaria cb = new CuentaBancaria(codigo, 0);
        System.out.println("Su saldo actual es: " + cb.obtenerSaldo()); //muestra el saldo actual de la cuenta bancaria
        
        System.out.println("Ingrese cuanto dinero desea depositar: "); //pide al usuario que ingrese el monto a depositar
        float montoDeposito = teclado.nextFloat();
        cb.depositar(montoDeposito);
        System.out.println("Su saldo actual es: " + cb.obtenerSaldo()); //muestra el saldo actual de la cuenta bancaria
        
        System.out.println("Ingrese el monto a extraer: "); //pide al usuario que ingrese el monto a extraer
        float montoExtraccion = teclado.nextFloat();
        boolean puedeExtraer = cb.extraer(montoExtraccion);
        System.out.println("saldo de la cuenta bancaria " + cb.obtenerSaldo());
        System.out.println("tiene permitido extraer la cantidad de dinero que solicitó: " + puedeExtraer); //comprobación de si el usuario puede extraer el dinero solicitado
        teclado.close();
    }
}
