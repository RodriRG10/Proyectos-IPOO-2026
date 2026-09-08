package tp2.ejercicio3;

public class TesterSurtidorGasoil {
    public static void main (String []args){
        Surtidor s = new Surtidor();
        System.out.println("Testeando clase surtidor especificamente de gasoil");
        System.out.println("A continuacion testea servicio de extraer");
        s.extraerGasoil(18000);
        System.out.println("Ahora el resultado esperado de cantGasoil seria 2000");
        System.out.println("el resultado que da gasoil despues de extraer combustible es " +s.obtenerLitrosGasoil());
        System.out.println("Probar que la consulta depositosLlenos ande bien, resultado esperado falso");
        System.out.println("El resultado que da la consulta depositosLlenos es " +s.depositosLlenos());
    }
    
}
    