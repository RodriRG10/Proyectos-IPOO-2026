package parcialesviejos.parcial1_2025;

public class Atlantis {
    public Atlantis clone(){
        Atlantis nuevo = new Atlantis(cap.clone());
        nuevo.combustible = this.combustible;
        nuevo.enOrbita = this.enOrbita;
        return nuevo;
    }
    
    
}
