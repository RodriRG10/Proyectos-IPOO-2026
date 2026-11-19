package tp9;
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.border.*;
class Dos_Botones_Grilla extends JFrame {
/*Objetos Gráficos*/
  private MiEtiqueta etiqueta;
  private MiBoton  botonPerro, botonGato;
  private JPanel panelControl, panelImagen;
  
  public Dos_Botones_Grilla() {
//Establece los valores de los atributos del frame
     setLayout(new GridLayout(1,2));
     setSize(420, 300);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
//Arma los paneles
     armaPanelBotones();
     armaPanelImagen();
     
//Inserta los paneles en el panel del frame	    
     getContentPane().add(panelControl);
     getContentPane().add(panelImagen);	 
}

private void armaPanelBotones(){

  panelControl = new JPanel();
  panelControl.setBackground(Color.GRAY);
  botonPerro = new MiBoton("Perro");
  botonGato = new MiBoton("Gato");
  // OyenteBotonP oyentePerro = new OyenteBotonP();
  // botonPerro.addActionListener(oyentePerro);
  OyenteBotonG oyenteGato = new OyenteBotonG();
  botonGato.addActionListener(oyenteGato);
  
  
//Insertar los botones en el panel de control
  panelControl.add(botonPerro);
  panelControl.add(botonGato);

/*PUNTO 3 DEL PRACTICO 
 Modifique la clase Dos_Botones_Grilla del proyecto Mascotas de modo que:
• Inicialmente la etiqueta muestre la imagen del perro llamado “Jack”
• Cuando el usuario oprime el botón “Gato” la GUI muestra la imagen del gato llamado Tom */ 



  
}
 
private void armaPanelImagen(){
  panelImagen = new JPanel();
  etiqueta = new MiEtiqueta();
  panelImagen.add(etiqueta);
  etiqueta.setIcon(new ImageIcon("perro.gif"));
  etiqueta.setText("Jack");
  getContentPane().add(etiqueta);

}

 
/*private class OyenteBotonP implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    etiqueta.setIcon(new ImageIcon("perro.gif"));
    etiqueta.setText("Jack");
   }  
}*/
 private class OyenteBotonG implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    etiqueta.setIcon(new ImageIcon("gato.gif"));
    etiqueta.setText("Tom");
   }  
 }
}