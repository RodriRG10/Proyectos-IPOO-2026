package tp2.ejercicio10;


public class Jugador {
    // Atributos Instancia
    private String nombre;
    private int nroCmaiseta;
    private int posicion;
    private int golesConvertidos;
    private int partidosJugados;
    // Constructor
    public Jugador(String nom){ 
        this.nombre=nom;
        this.nroCmaiseta=0;
        this.posicion=0;
        this.golesConvertidos=0;
        this.partidosJugados=0;
    }
    // Comandos
    public void establecerNroCamiseta(int n){
        nroCmaiseta=n;
    }
    public void establecerPosicion(int n){
        posicion=n;
    }
    public void establecerGolesConvertidos(int n){
        golesConvertidos=n;
    }
    public void establecerPartidosJugados(int n){
        partidosJugados=n;
    }
    public void aumentarGoles(int n){
        golesConvertidos+=n;
    }
    public void aumentarUnPartido(){
        partidosJugados++;
    }
    // Consultas
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerNroCamiseta(){
        return nroCmaiseta;
    }
    public int obtenerPosicion(){
        return posicion;
    }
    public int obtenerGolesConvertidos(){
        return golesConvertidos;
    }
    public int obtenerPartidosJugados(){
        return partidosJugados;
    }
    public int promedioGolesXpart(){
        return golesConvertidos/partidosJugados;
    }
    public boolean masGoles(Jugador j){
        return golesConvertidos>j.obtenerGolesConvertidos();
    }
    public Jugador jugConMasGoles(Jugador j){
        if (this.golesConvertidos > j.obtenerGolesConvertidos())
            return this;
        else 
            return j;
        
    }
    public String toString(){
        return "Nombre: "+nombre+" Nro Camiseta: "+nroCmaiseta+" Posicion: "+posicion+" Goles Convertidos: "+golesConvertidos+" Partidos Jugados: "+partidosJugados;
    }
    public Jugador clone(){
        Jugador clon = new Jugador(nombre);
        clon.establecerNroCamiseta(nroCmaiseta);
        clon.establecerPosicion(posicion);
        clon.establecerGolesConvertidos(golesConvertidos);
        clon.establecerPartidosJugados(partidosJugados);
        return clon;
    }
    public boolean equals(Jugador j){
        return nombre == j.obtenerNombre() && nroCmaiseta == j.obtenerNroCamiseta() && posicion == j.obtenerPosicion() && golesConvertidos == j.obtenerGolesConvertidos() && partidosJugados == j.obtenerPartidosJugados();
    }
}
