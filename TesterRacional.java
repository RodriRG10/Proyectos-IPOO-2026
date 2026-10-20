
public class TesterRacional {
public static void main(String[] args) {
Racional rac1 = new Racional (0,1);

Racional rac2 = new Racional (1,4);

Racional rac3 = new Racional (2,3);

rac1.quePasa(rac2,rac3);

System.out.println (rac2.obtenerNum()+" " +rac3.obtenerNum());
    
}
}
