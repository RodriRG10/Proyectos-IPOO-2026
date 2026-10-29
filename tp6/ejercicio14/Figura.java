package tp6.ejercicio14;

import parcialesviejos.parcial1_2025.Punto;

abstract public class Figura extends Punto {
    // Consultas
    abstract public float area();
    abstract public float perimetro();
    abstract public Punto centro();
    abstract public boolean equals(Figura f);
}
