package tp6.ejercicio1;

public class Tester {

    public static void main(String[] args) {
        PlanBase b1, b2, b3;
        EnNube b4;
        b1 = new PlanBase(10000, 50);
        b2 = new PromocionPymes(1000, 50);
        b3 = new EnNube(2000, 60, 3000);
        b4 = new EnNube(1000, 50, 2500);
        System.out.println("Esperamos que nos retorne 100100");
        System.out.println(b1.costoPlan());
        System.out.println("Esperamos que nos retorne 50 y 20120");
        System.out.println(b2.costoPlan()+" "+b3.costoPlan());
        System.out.println("Esperamos que nos retorne 10100 y 16050");
        System.out.println(b4.costoPlan()+" "+b4.costoPlan(6));
    }
    
}
