public class Racional {

    // Instancia
    private int num;
    private int den;
    // Constructor
    public Racional(int n, int d){
        num = n;
        den = d;
    }
    // Comandos
    public void establecerNum(int n){
        num = n;
    }
    public void establecerDen(int d){
        den = d;
    }
    public void copy(Racional r){
        num = r.obtenerNum();
        den = r.obtenerDen();
    }
    public void quePasa(Racional r1, Racional r2){
        Racional aux;
        if (num == 0){
            aux = r1;
            r1 = r2;
            r2 = aux;  }
        else
            r1 = r2;
    }
    
    // Consultas
    public int obtenerNum(){
        return num;
    }
    public int obtenerDen(){
        return den;
    }
    public String toString(){
        return num + "/" + den;
    }
    public boolean equals(Racional rac){
        return num == rac.obtenerNum() && den == rac.obtenerDen();
    }
    public Racional clone(){
        Racional aux = new Racional(num, den);
        return aux;
    }

    
}
