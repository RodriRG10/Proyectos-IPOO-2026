package tp8.ejercicio2;

public class TesterColeccion {
    
    public static void main(String[] args) {
        Coleccion c = new Coleccion(5);
        Alumno a1 = new Alumno(1, "Juan", 8.5f);
        Alumno a2 = new Alumno(2, "Maria", 9.0f);
        Alumno a3 = new Alumno(3, "Pedro", 7.5f);
        Alumno a4 = new Alumno(4, "Ana", 8.0f);
        Alumno a5 = new Alumno(5, "Luis", 9.5f);

        c.insertar(a1);
        c.insertar(a2);
        c.insertar(a3);
        c.insertar(a4);
        c.insertar(a5);

        System.out.println("Coleccion antes de ordenar:");
        for (int i = 0; i < c.cant; i++) {
            Alumno alumno = (Alumno) c.col[i];
            System.out.println(alumno.obtenerNombre() + " - " + alumno.obtenerPromedio());
        }

        c.ordenada();

        System.out.println("Coleccion despues de ordenar:");
        for (int i = 0; i < c.cant; i++) {
            Alumno alumno = (Alumno) c.col[i];
            System.out.println(alumno.obtenerNombre() + " - " + alumno.obtenerPromedio());
        }
    }
}
