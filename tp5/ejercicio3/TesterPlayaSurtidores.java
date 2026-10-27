package tp5.ejercicio3;
import tp2.ejercicio3.Surtidor;

public class TesterPlayaSurtidores {

    public static void main(String[] args) {
        System.out.println("=== INICIO DE PRUEBAS PLAYA SURTIDORES ===\n");

        testLlenaDepositos();
        testAgrupaSurtidores();
        testMismosNulos();
        testNLigados();

        System.out.println("\n=== FIN DE PRUEBAS ===");
    }

    private static void testLlenaDepositos() {
        System.out.println("--- Prueba: llenaDepositos() ---");
        PlayaSurtidores playa = new PlayaSurtidores(4);
        
        Surtidor s1 = new Surtidor();
        Surtidor s2 = new Surtidor();
        
        // Vaciamos parcialmente algunos depósitos
        s1.extraerGasoil(100);
        s2.extraerSuper(200);

        playa.establecerSurtidor(s1, 0);
        playa.establecerSurtidor(s2, 2); // Posición 1 queda nula a propósito

        System.out.println("Litros s1 antes: Gasoil=" + s1.obtenerLitrosGasoil() + ", Super=" + s1.obtenerLitrosSuper() + ", Premium=" + s1.obtenerLitrosPremium());
        
        playa.llenaDepositos(); // Debe llenar s1 y s2 ignorando los nulos sin lanzar NullPointerException

        System.out.println("Litros s1 después: Gasoil=" + s1.obtenerLitrosGasoil() + ", Super=" + s1.obtenerLitrosSuper() + ", Premium=" + s1.obtenerLitrosPremium());
        System.out.println("Surtidores con carga máxima: " + playa.cantMaximaCarga() + " (esperado: 2)");
        System.out.println();
    }

    private static void testAgrupaSurtidores() {
        System.out.println("--- Prueba: agrupaSurtidores() ---");
        // Creamos estructura con huecos dispersos: [s1, null, s2, null, s3]
        PlayaSurtidores playa = new PlayaSurtidores(5);
        Surtidor s1 = new Surtidor();
        Surtidor s2 = new Surtidor();
        Surtidor s3 = new Surtidor();

        playa.establecerSurtidor(s1, 0);
        playa.establecerSurtidor(s2, 2);
        playa.establecerSurtidor(s3, 4);

        System.out.println("Surtidores antes de agrupar: " + contarSurtidores(playa));
        playa.agrupaSurtidores(); // Debe dejar ligados consecutivos al principio: [s1, s2, s3, null, null]

        boolean ok = (playa.obtenerSurtidor(0) != null) &&
                     (playa.obtenerSurtidor(1) != null) &&
                     (playa.obtenerSurtidor(2) != null) &&
                     (playa.obtenerSurtidor(3) == null) &&
                     (playa.obtenerSurtidor(4) == null);

        System.out.println("¿Estructura agrupada correctamente?: " + ok);
        System.out.println();
    }

    private static void testMismosNulos() {
        System.out.println("--- Prueba: mismosNulos() ---");
        PlayaSurtidores p1 = new PlayaSurtidores(4);
        PlayaSurtidores p2 = new PlayaSurtidores(4);
        PlayaSurtidores p3 = new PlayaSurtidores(3); // Distinto tamaño

        Surtidor s = new Surtidor();

        // Ambas tienen nulos en posiciones 1 y 3[cite: 1]
        p1.establecerSurtidor(s, 0);
        p1.establecerSurtidor(s, 2);

        p2.establecerSurtidor(s, 0);
        p2.establecerSurtidor(s, 2);

        System.out.println("¿p1 y p2 tienen mismos nulos?: " + p1.mismosNulos(p2) + " (esperado: true)");

        // Cambiamos un elemento en p2 para desalinear nulos
        p2.establecerSurtidor(s, 1);
        System.out.println("¿p1 y p2 desalineados tienen mismos nulos?: " + p1.mismosNulos(p2) + " (esperado: false)");

        // Comparación con distinta longitud
        System.out.println("¿p1 y p3 (distinta capacidad) tienen mismos nulos?: " + p1.mismosNulos(p3) + " (esperado: false)");
        System.out.println();
    }

    private static void testNLigados() {
        System.out.println("--- Prueba: nLigados(n) ---");
        // Caso: [s, s, s, null, s, s, null] -> Secuencias consecutivas de tamaño 3 y tamaño 2[cite: 1]
        PlayaSurtidores playa = new PlayaSurtidores(7);
        Surtidor s = new Surtidor();

        playa.establecerSurtidor(s, 0);
        playa.establecerSurtidor(s, 1);
        playa.establecerSurtidor(s, 2); // Secuencia 1 (longitud 3)[cite: 1]

        playa.establecerSurtidor(s, 4);
        playa.establecerSurtidor(s, 5); // Secuencia 2 (longitud 2)[cite: 1]

        // 1. Caso secuencia de al menos 2 (debe retornar la primera secuencia de al menos 2)[cite: 1]
        PlayaSurtidores res2 = playa.nLigados(2);
        System.out.println("nLigados(2) - ¿Generó playa resultado?: " + (res2 != null));
        if (res2 != null) {
            System.out.println("nLigados(2) - Cantidad de posiciones/surtidores: " + res2.cantSurtidores());
        }

        // 2. Caso secuencia de al menos 3 (debe retornar la primera secuencia)[cite: 1]
        PlayaSurtidores res3 = playa.nLigados(3);
        System.out.println("nLigados(3) - ¿Encontró secuencia?: " + (res3 != null));

        // 3. Caso secuencia inexistente (al menos 4 consecutivas)[cite: 1]
        PlayaSurtidores res4 = playa.nLigados(4);
        System.out.println("nLigados(4) - Resultado para n mayor al existente: " + (res4 == null ? "null (Correcto)" : "Error"));
        System.out.println();
    }

    // Método auxiliar para imprimir el estado de las posiciones
    private static String contarSurtidores(PlayaSurtidores p) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < p.cantPosiciones(); i++) {
            sb.append(p.obtenerSurtidor(i) != null ? "S" : "null");
            if (i < p.cantPosiciones() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}