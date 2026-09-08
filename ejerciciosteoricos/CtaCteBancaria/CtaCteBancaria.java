package ejerciciosteoricos.CtaCteBancaria;
class CuentaBancaria {
    //Atributos de clase
    /*Define el monto máximo que se puede extraer sin fondos en la
    cuenta*/
    private static final int maxDescubierto=1000;
    //Atributos de Instancia
    /*El codigo se establece al crear la cuenta corriente bancaria y no
    cambia. El saldo va a ser siempre mayor a -maxDescubierto*/
    private int codigo;
    private float saldo;
    //Constructores
    public CuentaBancaria(int cod) {
    //Requiere cod mayor a 0
      codigo = cod; saldo = 0;
    }
    public CuentaBancaria(int cod, float sal) {
    //Requiere cod y sal mayores a 0
      codigo = cod; saldo = sal;
    }
    //Comandos
    public void depositar(float mto){
    //Requiere mto mayor a 0
      saldo+=mto;
    }
    public boolean extraer(float mto){
    /*Requiere mto mayor a 0. Si el mto es mayor a saldo+maxDescubierto
    retorna false y la extracción no se realiza, sino modifica el saldo
    y retorna true */
    boolean puede = true;
    if (saldo+maxDescubierto >= mto)
      saldo=saldo-mto;
    else
      puede = false;
      return puede;
    }
    //Consultas
    public int obtenerCodigo(){
      return codigo;
    }
    public float obtenerSaldo(){
      return saldo;
    }
    public float obtenerMaxDescubierto(){
      return maxDescubierto;
    }
    public boolean enDescubierto(){
      return saldo < 0;
    }
    public String toString(){
      return "el codigo de la cuenta es: " + codigo + " y el saldo es: " + saldo;
    } 
}