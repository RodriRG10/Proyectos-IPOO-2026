package tp6.ejercicio5;

public class RubricaAdmimistrador extends RubricaLider {

    // Instancia
    protected int proyectos;
    // Constructor
    public RubricaAdmimistrador(int l, int c, int a, int r, int go, int ga, int p){
        super(l,c,a,r,go,ga);
        proyectos = p;
    }
    // Comandos
    public void aumentarProyectos(){
        proyectos++;
    }
    // Consultas
    public int obtenerProyectos(){
        return proyectos;
    }
    public String toString(){
        return super.toString() + "Proyectos" +proyectos;
    }
    public float productividad(){
        return promedio() * 4 + proyectos * 10;
    }
}
