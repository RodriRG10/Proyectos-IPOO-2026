package tp5.ejercicio5;
import tp2.ejercicio2.Poliza;

public class PolizasOrdenas {
    
    // Instancia
    protected Poliza[] polOrd;
    protected int n;
    // Constructor
    public PolizasOrdenas(int max){
        polOrd = new Poliza[max];
    }
    // Comandos
    public void insertar(Poliza pol){
        boolean resultado = false;
        int pos = n; 
        
        
        for(int i = 0; i < n && !resultado; i++){
            if(polOrd[i].obtenerNroPoliza() > pol.obtenerNroPoliza()){
                while(pos > i){
                    polOrd[pos] = polOrd[pos - 1];
                    pos--;
                }
                polOrd[i] = pol;
                n++;
                resultado = true;
            }
        }
        if(!resultado){
            polOrd[n] = pol;
            n++;
        }
    }
    public void eliminar(int nroPolizaALaborrar) {
        boolean resultado = false;

        // Recorremos buscando la póliza exacta
        for (int i = 0; i < n && !resultado; i++) {
        
            // 1. Encontramos la póliza que queremos borrar
            if (polOrd[i].obtenerNroPoliza() == nroPolizaALaborrar) {
                int pos = i;

                // 2. Desplazamos hacia la izquierda para "pisar" el elemento borrado
                // Vamos desde la posición actual hasta el penúltimo elemento válido
                while (pos < n - 1) {
                    polOrd[pos] = polOrd[pos + 1];
                    pos++;
                }
            // 3. Limpiamos la última posición que ahora quedó duplicada o libre
            polOrd[n - 1] = null; 
            // 4. Actualizamos el estado y el contador
            n--;
            resultado = true;
            }
        }
    }

    public void actualizar(int d, int h, int p){
        for(int i = 0; i < n; i++){
            if(polOrd[i].obtenerCostoPoliza() > d && polOrd[i].obtenerCostoPoliza() < h){
                polOrd[i].actualizarPorcentaje(p);
            }
        }
    }
    public void copy(PolizasOrdenas p){
        if(p != null && cantElementos() == p.cantElementos()){
            for(int i = 0; i < cantElementos(); i++){
                polOrd[i] = p.obtenerPoliza(i);
            }
        }
    }
    // Consultas
    public int cantPolizas(){
        return n;
    }
    public int cantElementos(){
        return polOrd.length;
    }
    public boolean estaLlena(){
        return n == cantElementos();
    }
    public boolean existePoliza(int nro){
        boolean resultado = false;
        for(int i = 0; i < n && !resultado; i++){
            if(polOrd[i].obtenerNroPoliza() == nro){
                resultado = true;
            }
        }
        return resultado;
    }
    public boolean existePoliza(Poliza pol){
        boolean resultado = false;
        int ini = 0;
        int fin = n - 1;
        int mitad = 0;
        while (!resultado && ini <= fin){
            mitad = (ini + fin) / 2;
            if(polOrd[mitad].obtenerNroPoliza() == pol.obtenerNroPoliza()){
                resultado = true;
            }
            else if(polOrd[mitad].obtenerNroPoliza() < pol.obtenerNroPoliza()){
                ini = mitad + 1;
            }
            else {
                fin = mitad - 1;
            }
        }
        return resultado;
    }
    public Poliza obtenerPoliza(int pos){
        return polOrd[pos];
    }
    public PolizasOrdenas intercalar(PolizasOrdenas p){
        PolizasOrdenas po = new PolizasOrdenas(cantPolizas() + p.cantPolizas());
        int i = 0;
        int j = 0;
        while (i < cantPolizas() && j < p.cantPolizas()){
            if(polOrd[i].obtenerNroPoliza() <= p.obtenerPoliza(j).obtenerNroPoliza()){
                po.insertar(polOrd[i]);
                i++;
            }
            else {
                po.insertar(p.obtenerPoliza(j));
                j++;
            }
            }
        while (i < cantPolizas()){
            po.insertar(polOrd[i]);
            i++;
            }
        while (j < p.cantPolizas()){
            po.insertar(p.obtenerPoliza(j));
            j++;
            }
        return po;
        }  
    }
    


