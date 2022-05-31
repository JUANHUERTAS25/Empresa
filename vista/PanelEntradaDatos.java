package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //Atributos
    private JLabel lbImagen;
    private ImageIcon iImagen;

    //Métodos

    /*Método Constructor */

    public PanelEntradaDatos()
    {
        //Definicion del contenedor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/empresa2.jpg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,378,185);
        add(lbImagen);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("EMPRESA");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
}
