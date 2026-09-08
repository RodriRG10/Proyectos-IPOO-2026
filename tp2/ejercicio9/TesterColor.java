package tp2.ejercicio9;

public class TesterColor {
    public static void main(String [] args){
        Color c1 = new Color(0,0,0);
        Color c2 = new Color();
        System.out.println("Se utilizan los dos tipos de constructores disponibles de la clase");
        System.out.println("cambiamos el valor de todos los colores del connstructor c1, esperamos que de 150 todos");
        c1.variar(150);
        System.out.println("Resultado obtenido es " +c1.obtenerAzul() +" " +c1.obtenerVerde() +" " +c1.obtenerRojo());
        System.out.println("Probando si es gris el color, resultado esperado true");
        System.out.println(c1.esGris());
        System.out.println("Vamos a probar equals, resultado esperado false");
        System.out.println(c1.equals(c2));
        System.out.println("Vamos a probar clone, resultado esperado que de 150 todos");
        Color c3 = c1.clone();
        System.out.println(c3.toString() +c1.toString());

        
    }
    
}
