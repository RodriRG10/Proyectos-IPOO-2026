package tp6.ejercicio7;

public class Departamento extends Alojamiento {

    // Instacia
    protected int ambientes;
    protected boolean balcon;
    // Constructor
    public Departamento(int id, int p, int a, boolean b){
        super(id,p);
        ambientes = a;
        balcon = b;
    }
    // Consultas
    public int cantAmbientes(){
        return ambientes;
    }
    public boolean tieneBalcon(){
        return balcon;
    }
    public float costoDiario(int p){
        float resultado = ambientes * p;
        if(tieneBalcon())
            resultado = resultado + 150;
        return resultado;
    }
    
}
