package tp3.ejercicio8;

public class Vehiculo {
    // Instacia
    private Hora ingreso;
    private Hora egreso;
    private int numero;
    private String patente;
    // Constructor
    // El constructor establece el horario de ingreso distinto de null, la patente y el número de la cochera.
    // Asigna null al horario de egreso
    public Vehiculo(Hora i, int n, String p){
        ingreso = i;
        numero = n;
        patente = p;
        egreso = null;
    }
    // Comandos 
    public void egresaVehiculo(Hora c){
        egreso = c;
    }
    public void copy(Vehiculo v){
        ingreso.copy(v.obtenerIngreso());
        egreso.copy(v.obtenerEgreso());
        numero = v.obtenerNumero();
        patente = v.obtenerPatente();
    }
    // Consultas 
    public Hora obtenerIngreso(){
        return ingreso;
    }
    public Hora obtenerEgreso(){
        return egreso;
    }
    public int obtenerNumero(){
        return numero;
    }
    public String obtenerPatente(){
        return patente;
    }
    public int obteneraCobrar(Tarifa t){
        int cobro;
        if (egreso == null)
            cobro = 0;
        else 
            if (egreso.diferenciaMinutos(ingreso) <= 15)
                cobro = t.obtenerT15();
            else 
                if (egreso.diferenciaMinutos(ingreso) <= 30)
                    cobro = t.obtenerT30();
                else
                    if (egreso.diferenciaMinutos(ingreso) <= 60)
                        cobro = t.obtenerT60();
                    else
                        cobro = t.obtenerTFija();
        return cobro;
    }
    /*public int obteneraCobrar(Tarifa t){
        int cobro;
        if (egreso == null)
            cobro = 0;
        else 
            if (ingreso.obtenerHora() != egreso.obtenerHora()){
                if (ingreso.obtenerMinutos()-egreso.obtenerMinutos() <= 15)
                    cobro = t.obtenerT15();
                else
                    if (ingreso.obtenerMinutos()-egreso.obtenerMinutos() <= 30)
                        cobro = t.obtenerT30();
                    else 
                        if(ingreso.obtenerMinutos()-egreso.obtenerMinutos() <= 60)
                            cobro = t.obtenerT60();
            }
            else 
                cobro = t.obtenerTFija();
        return cobro;/* */
    
    public boolean equals(Vehiculo c){
        return patente == c.obtenerPatente() && numero == c.obtenerNumero() && ingreso.equals(c.obtenerIngreso()) && egreso.equals(c.obtenerEgreso());
    }
    /*public boolean anterior(Vehiculo v){ 
        boolean resultado;
        if (ingreso.obtenerHora() < v.obtenerIngreso().obtenerHora())
            resultado = true;
        else 
            if (ingreso.obtenerHora() == v.obtenerIngreso().obtenerHora() && ingreso.obtenerMinutos() < v.obtenerIngreso().obtenerHora())
                resultado = true;
            else 
                resultado = false;/* */
    public boolean anterior(Vehiculo v){
        return ingreso.anterior(v.obtenerIngreso());
    }
}
