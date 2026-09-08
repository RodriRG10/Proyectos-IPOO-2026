package tp3.ejercicio3;
import tp2.ejercicio8.Libro;
import tp2.ejercicio8.Fecha;

public class Prestamo {
    // Atributos instancia
    private Libro libro;
    private String socio;
    private Fecha fechaPrestamo;
    private Fecha fechaDevolucion;
    private boolean devuelto;
    // Constructor
    public Prestamo(Libro l, Fecha fp, Fecha fd, String s){
        libro = l;
        fechaPrestamo = fp;
        fechaDevolucion = fd;
        socio = s;
        // devuelto = false; DUDAS
    }
    // Consultas
    public Libro obtenerLibro(){
        return libro;
    }
    public Fecha obtenerFechaPrestamo(){
        return fechaPrestamo;
    }
    public Fecha obtenerFechaDevolucion(){
        return fechaDevolucion;
    }
    public boolean estaDevuelto(){
        return devuelto;
    }
    public String obtenerSocio(){
        return socio;
    }
    public boolean estaAtrasado(Fecha hoy){
        if(devuelto == false && hoy.esAnterior(fechaDevolucion)){
            return true;
        }
        else{
            return false;
        }
    }
    public Prestamo masAntiguo(Prestamo p){
        Prestamo resultado = null;
        if (fechaPrestamo.esAnterior(p.obtenerFechaPrestamo())){
            resultado = this;
        }
        else{
            resultado = p;
        }
        return resultado;
    }
    public boolean equals(Prestamo p){
        boolean resultado = false;
        if (socio == p.obtenerSocio() && libro.equals(p.obtenerLibro()) && fechaPrestamo.equals(p.obtenerFechaPrestamo()) && fechaDevolucion.equals(p.obtenerFechaDevolucion())){
            resultado = true;
        }
        return resultado;
    }
    public String toString(){
        return "Libro: "+ libro.toString() + "Socio: "+ socio + "Fecha prestamo: "+ fechaPrestamo.toString() + "Fecha devolucion: "+ fechaDevolucion.toString() + "Devuelto: "+ devuelto;
    }


}
