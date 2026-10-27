package tp4.ejercicio5;

public class Tester {
    public static void main(String[] args) {
        GrillaReales grilla = new GrillaReales(3, 3);
        grilla.establecerReal(0, 0, 1.0f);
        grilla.establecerReal(0, 1, 2.0f);
        grilla.establecerReal(0, 2, 3.0f);
        grilla.establecerReal(1, 0, 4.0f);
        grilla.establecerReal(1, 1, 5.0f);
        grilla.establecerReal(1, 2, 6.0f);
        grilla.establecerReal(2, 0, 7.0f);
        grilla.establecerReal(2, 1, 8.0f);
        grilla.establecerReal(2, 2, 9.0f);

        System.out.println("Total de la grilla: " + grilla.total());
        System.out.println("Total de la columna 1: " + grilla.totalColumna(1));

        grilla.reemplazar(5.0f, 10.0f);
        System.out.println("Total de la grilla después de reemplazar: " + grilla.total());

        boolean intercambiado = grilla.intercambiarFilas(0, 2);
        System.out.println("Filas intercambiadas: " + intercambiado);
        GrillaReales transpuesta = grilla.transpuesta();
        System.out.println("Total de la transpuesta: " + transpuesta.total());
        System.out.println("¿Es transpuesta? " + grilla.esTranspuesta(transpuesta));
        grilla.equals(transpuesta);
        System.out.println("¿Son iguales? " + grilla.equals(transpuesta));
    }
    
}
