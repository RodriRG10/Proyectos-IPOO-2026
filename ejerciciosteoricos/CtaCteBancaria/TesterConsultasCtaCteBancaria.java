package ejerciciosteoricos.CtaCteBancaria;
public class TesterConsultasCtaCteBancaria {
    public static void main(String a []) {
        CuentaBancaria cb;                           //creo todas las variables que voy a usar en el main
        boolean e1, puedeExtraer;
        int c1;
        String t1;                           
        cb = new CuentaBancaria(111, 1000); //genera la cuenta bancaria con codigo 111 y saldo 1000
        cb.depositar(500);                      //se hace asi porque es un void la funcion depositar, no retorna nada
        puedeExtraer = cb.extraer(1);           //se crea asi la expresion porque tiene devolver un valor
        c1 = cb.obtenerCodigo();                    //tiene que poner tipo dato, variable y luego el = y la funcion que retorna un value
        e1 = cb.enDescubierto();
        t1 = cb.toString();
        System.out.println("saldo de la cuenta bancaria " +cb.obtenerSaldo());
        System.out.println("tiene permitido estraer la cantidad de dinero que solicto: " +puedeExtraer);
        System.out.println("codigo de la cuenta bancaria " +c1);
        System.out.println("la cuenta cb está en descubierto: " +e1);
        System.out.println("representación de la cuenta cb: " +t1);
    }
}
