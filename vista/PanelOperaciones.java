package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    public JButton bCrear;
    public JButton bAuxilioTransporte;
    public JButton bEdad;
    public JButton bAntiguedad;
    public JButton bBorrar;
    


    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contenedor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de los botones
        bCrear = new JButton("Añadir");
        bCrear.setFont(new Font("Arial", BOLD, 12));
        bCrear.setBounds(10,20,90,20);
        add(bCrear);
        bCrear.setActionCommand("crear");

        bAuxilioTransporte = new JButton("Transporte");
        bAuxilioTransporte.setFont(new Font("Arial", BOLD, 12));
        bAuxilioTransporte.setBounds(105,20,110,20);
        add(bAuxilioTransporte);
        bAuxilioTransporte.setActionCommand("auxilio");
        bAuxilioTransporte.setEnabled(false);

        bEdad = new JButton("Edad");
        bEdad.setFont(new Font("Arial", BOLD, 12));
        bEdad.setBounds(220,20,70,20);
        add(bEdad);
        bEdad.setActionCommand("edad");
        bEdad.setEnabled(false);

        bAntiguedad = new JButton("Antiguedad");
        bAntiguedad.setFont(new Font("Arial", BOLD, 12));
        bAntiguedad.setBounds(295,20,75,20);
        add(bAntiguedad);
        bAntiguedad.setActionCommand("antiguedad");
        bAntiguedad.setEnabled(false);

        bBorrar = new JButton("Borrar");
        bBorrar.setFont(new Font("Arial", BOLD, 12));
        bBorrar.setBounds(170,50,80,20);
        add(bBorrar);
        bBorrar.setActionCommand("borrar");
        bBorrar.setEnabled(false);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        bCrear.addActionListener(pAL);
        bAuxilioTransporte.addActionListener(pAL);
        bEdad.addActionListener(pAL);
        bAntiguedad.addActionListener(pAL);
        bBorrar.addActionListener(pAL);
    }
     
    public void activarBotones()
    {
        bAuxilioTransporte.setEnabled(true);
        bEdad.setEnabled(true);
        bAntiguedad.setEnabled(true);
        bBorrar.setEnabled(true);
    }
}