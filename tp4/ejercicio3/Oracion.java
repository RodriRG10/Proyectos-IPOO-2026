package tp4.ejercicio3;

public class Oracion {
    // Instacia
    private String []s;
    // Constructor
    /*Oracion(str: String). Requiere que:
    - la cadena stresté formada por una o más palabras separadas por al menos un blanco
    - comienza con una palabra y termina con un blanco
    - cada palabra de la oración esté formada por una o más letras mayúsculas */
    public Oracion(String str){
        s = new String [longitud()];
    }


    // Comandos
    /*reducirBlancos(). Reemplaza las secuencias de dos o más blancos por un solo blanco, excepto al
    final de la oración. */
    public void reducirBlancos(){
        for(int i = 0; i < s.length; i++)
            if (s[i] == " " && s[i+1] == " ")
                
    }







    /*establecerLetra(pos:entero, l:char). Requieren que la posición
    possea válida y l sea una letra mayúscula o un espacio en blanco. */




    // Consultas
    /*obtenerLetra(pos:entero):char Requieren que la posición
    possea válida y l sea una letra mayúscula o un espacio en blanco.*/



    /*esLetra(pos:entero):boolean. Retorna verdadero siempre que pos sea una posición válida y en
    esa posición se haya asignado una letra, sino retorna falso.*/





    /*esPrimeraPalabra(pos:entero):boolean. Retorna verdadero siempre que pos sea una posición
    válida, en esa posición se haya asignado una letra y sea la primera de una palabra. */




    public int longitud(){
        return s.length;
    }







}
