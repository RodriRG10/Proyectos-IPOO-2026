package tp9;

// Import carpetas y clases necesarias
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.*;
public class MiBoton extends JButton{


    // Constructor
    public MiBoton(String texto){
        super(texto);
        setPreferredSize(new Dimension(124, 124));
        setSize(150, 124);
        setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.GREEN, 3, false),null));
    }
}
