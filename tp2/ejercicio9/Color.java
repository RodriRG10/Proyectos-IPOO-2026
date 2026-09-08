package tp2.ejercicio9;

public class Color {
    // Atributos Instancia
    private int rojo;
    private int verde;
    private int azul;
    // Constructor
    public Color(){ //Este constructor por defecto crea un color blanco
        rojo = 255;
        verde = 255;
        azul = 255;
    }
    public Color(int r, int a, int v){
        if (r >= 0 && r <= 255 && a >= 0 && a <= 255 && v >= 0 && v <= 255){
            rojo = r;
            verde = a;
            azul = v;
        }
        else{
            rojo = 255;
            verde = 255;
            azul = 255;
        }
    }
    // Comandos
    public void variar(int val){
        rojo += val;
        verde += val;
        azul += val;
        if (rojo < 0){
            rojo = 0;
        }
        if (verde < 0){
            verde = 0;
        }
        if (azul < 0){
            azul = 0;
        }
        if (rojo > 255){
            rojo = 255;
        }
        if (verde > 255){
            verde = 255;
        }
        if (azul > 255){
            azul = 255;
        }
    }
    public void variarRojo(int val){
        if (rojo+val >= 0 && rojo+val <= 255){
            rojo += val;
        }
    }
    public void variarVerde(int val){
        if (verde+val >= 0 && verde+val <= 255){
            verde += val;
        }
    }
    public void variarAzul(int val){
        if (azul+val >= 0 && azul+val <= 255){
            azul += val;
        }
    }
    public void establecerRojo(int r){
        if (r >= 0 && r <= 255){
            rojo = r;
        }
    }
    public void establecerVerde(int v){
        if (v >= 0 && v <= 255){
            verde = v;
        }
    }
    public void establecerAzul(int a){
        if (a >= 0 && a <= 255){
            azul = a;
        }
    }
    public void copy(Color c){
        if (c != null){
            rojo = c.obtenerRojo();
            verde = c.obtenerVerde();
            azul = c.obtenerAzul();
        }
    }
    // Consultas
    public int obtenerRojo(){
        return rojo;
    }
    public int obtenerVerde(){
        return verde;
    }
    public int obtenerAzul(){
        return azul;
    }
    public boolean esRojo(){
        return (rojo == 255 && verde == 0 && azul == 0);
    }
    public boolean esGris(){
        return (rojo == 50 && verde == 50 && azul == 50) || (rojo == 150 && verde == 150 && azul == 150);
    }
    public boolean esNegro(){
        return (rojo == 0 && verde == 0 && azul == 0);
    }
    public Color Complemento(){
        Color c = new Color();
        c.establecerRojo(255 - rojo);
        c.establecerVerde(255 - verde);
        c.establecerAzul(255 - azul);
        return c;
    }
    public boolean equals(Color c){
        if (c == null)
            return false;
        else 
            return rojo == c.obtenerRojo() && verde == c.obtenerVerde() && azul == c.obtenerAzul();
    }
    public Color clone(){
        Color c = new Color();
        c.establecerRojo(rojo);
        c.establecerVerde(verde);
        c.establecerAzul(azul);
        return c;
    } 
    public String toString(){
        return "Azul" +this.obtenerAzul() +"Rojo" +rojo +"Verde" +verde; 
    }
}
