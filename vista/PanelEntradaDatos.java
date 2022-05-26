package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbColor;
    private JLabel lbPosX;
    private JLabel lbPosY;
    private JTextField tfFechaNacimiento;
    private JTextField tfFechaIngreso;
    
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/carro.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,220,176);
        add(lbImagen);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbColor = new JLabel("Nombre = ");
        lbColor.setBounds(230,10,60,20);
        add(lbColor);
        
        lbPosX = new JLabel("Fecha de nacimiento = ");
        lbPosX.setBounds(230,40,60,20);
        add(lbPosX);
        
        lbPosY = new JLabel("Fecha de ingreso a la empresa = ");
        lbPosY.setBounds(230,70,60,20);
        add(lbPosY);
        
        //Creación y adición de campos de texto
        tfFechaNacimiento = new JTextField();
        tfFechaNacimiento.setBounds(300, 40, 60, 20);
        add(tfFechaNacimiento);
        
        tfFechaIngreso = new JTextField();
        tfFechaIngreso.setBounds(300, 70, 60, 20);
        add(tfFechaIngreso);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getFechadeNacimiento()
    {
        return tfFechaNacimiento.getText();
    }
    
    public String getFechaIngreso()
    {
        return tfFechaIngreso.getText();
    }
    
    
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfFechaNacimiento.setText("");
        tfFechaIngreso.setText("");
    }
}