package tp8.ejercicio2;

public class Alumno extends Elemento {

    // Atributos
    private int nroIngreso;
    private String nombre;
    private float promedio;

    // Constructor
    public Alumno(int i, String n, float p){
        nroIngreso = i;
        nombre = n;
        promedio = p; 
    }

    // Consultas
    public int obtenerNroIngreso(){
        return nroIngreso;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public float obtenerPromedio(){
        return promedio;
    }
    public boolean esEquivalente(Elemento e){
        Alumno a = (Alumno) e;
        return nroIngreso == a.obtenerNroIngreso() && nombre.equals(a.obtenerNombre()) && promedio == a.obtenerPromedio();
    }
    public boolean esMayor(Elemento e){
        Alumno a = (Alumno) e;
        return promedio > a.obtenerPromedio();
    }


}
