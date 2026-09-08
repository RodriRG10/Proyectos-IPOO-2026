package tp3.ejercicio3;
import tp2.ejercicio8.Libro;
import tp2.ejercicio8.Fecha;

public class TesterPrestamo {
    public static void main(String[] args){
        // Creo libros
        Libro l1 = new Libro("El Principito", "Antoine de Saint-Exupéry", "Editorial XYZ", 'A');
        Libro l2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Editorial ABC", 'B');
        // Creo fechas
        Fecha f1 = new Fecha(1, 1, 2023);
        Fecha f2 = new Fecha(15, 1, 2023);
        Fecha f3 = new Fecha(10, 1, 2023);
        Fecha f4 = new Fecha(20, 1, 2023);
        // Creo prestamos
        Prestamo p1 = new Prestamo(l1, f1, f2, "Juan");
        Prestamo p2 = new Prestamo(l2, f3, f4, "Maria");
        // Pruebo metodos
        System.out.println("Libro del prestamo 1: " + p1.obtenerLibro().obtenerNombre());
        System.out.println("Fecha de prestamo del prestamo 2: " + p2.obtenerFechaPrestamo().obtenerDia() + "/" + p2.obtenerFechaPrestamo().obtenerMes() + "/" + p2.obtenerFechaPrestamo().obtenerAnio());
        System.out.println("Prestamo 1 esta atrasado? " + p1.estaAtrasado(new Fecha(16, 1, 2023)));
        System.out.println("Prestamo mas antiguo: " + p1.masAntiguo(p2).obtenerSocio());
    }
    
    
}
