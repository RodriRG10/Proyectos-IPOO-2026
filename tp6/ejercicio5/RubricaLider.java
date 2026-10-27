package tp6.ejercicio5;

public class RubricaLider extends Rubrica {

    // Instancia
    protected int gestionConflictos;
    protected int gestionCambios;
    // Constructor
    public RubricaLider(int l, int c, int a, int r, int go, int ga){
        super(l,c,a,r);
        gestionConflictos = go;
        gestionCambios = ga;
    }
    // Comanos
    public void establecerConflictos(int p){
        gestionConflictos = p;
    }
    public void establerCambios(int p){
        gestionCambios = p;
    }
    // Consultas
    public int obtenerConflictos(){
        return gestionConflictos;
    }
    public int obtenerCambios(){
        return gestionCambios;
    }
    public String toString(){
        return super.toString() + " Gestio de conflictos" +gestionConflictos + " Gestion de cambios" +gestionCambios;
    }
    public int total(){
        return super.total() + gestionCambios + gestionConflictos;
    }
    public float promedio(){
        return (float)total() / 5;
    }
}
