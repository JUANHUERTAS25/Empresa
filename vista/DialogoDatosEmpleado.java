package vista;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoDatosEmpleado extends JDialog
{
    //----------------------
    //Atributos
    //----------------------
    private JLabel lbTitulo;
    private JLabel lbNombre;
    private JLabel lbCantidadSalarios;
    private JLabel lbFechaNacimiento;
    private JLabel lbDia;
    private JLabel lbMes;
    private JLabel lbAño;
    private JLabel lbFechaIngreso;
    private JTextField txNombre;
    private JTextField txCantidadSalarios;
    private JTextField txDia;
    private JTextField txMes;
    private JTextField txAño;
    private JTextField txDia2;
    private JTextField txMes2;
    private JTextField txAño2;
    public JButton btAceptar;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public DialogoDatosEmpleado()
    {
        //Definición del contenedor de la ventana
        setLayout(null);

        //Creación y adición de elementos
        lbTitulo = new JLabel("Datos empleado",JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitulo.setBounds(150,10,300,20);
        add(lbTitulo);

        lbNombre= new JLabel("Nombre = ",JLabel.RIGHT);
        lbNombre.setFont(new Font("Arial", Font.BOLD, 15));
        lbNombre.setBounds(10,50,100,20);
        add(lbNombre);
        
        lbCantidadSalarios= new JLabel("Ingresar Salario = ",JLabel.RIGHT);
        lbCantidadSalarios.setFont(new Font("Arial", Font.BOLD, 15));
        lbCantidadSalarios.setBounds(10,90,155,20);
        add(lbCantidadSalarios);

        lbFechaNacimiento= new JLabel("Fecha de Nacimiento = ",JLabel.RIGHT);
        lbFechaNacimiento.setFont(new Font("Arial", Font.BOLD, 15));
        lbFechaNacimiento.setBounds(10,135,195,20);
        add(lbFechaNacimiento);

        lbDia= new JLabel("Dia ",JLabel.RIGHT);
        lbDia.setFont(new Font("Arial", Font.BOLD, 15));
        lbDia.setBounds(240,115,60,20);
        add(lbDia);

        lbMes= new JLabel("Mes ",JLabel.RIGHT);
        lbMes.setFont(new Font("Arial", Font.BOLD, 15));
        lbMes.setBounds(330,115,60,20);
        add(lbMes);

        lbAño= new JLabel("Año ",JLabel.RIGHT);
        lbAño.setFont(new Font("Arial", Font.BOLD, 15));
        lbAño.setBounds(400,115,60,20);
        add(lbAño);

        lbFechaIngreso= new JLabel("Fecha de ingreso = ",JLabel.RIGHT);
        lbFechaIngreso.setFont(new Font("Arial", Font.BOLD, 15));
        lbFechaIngreso.setBounds(10,175,170,20);
        add(lbFechaIngreso);

        txNombre= new JTextField();
        txNombre.setFont(new Font("Arial", Font.BOLD, 15));
        txNombre.setBounds(115,45,100,25);
        add(txNombre);
        
        txCantidadSalarios= new JTextField();
        txCantidadSalarios.setFont(new Font("Arial", Font.BOLD, 15));
        txCantidadSalarios.setBounds(170,85,100,25);
        add(txCantidadSalarios);

        txDia= new JTextField();
        txDia.setFont(new Font("Arial", Font.BOLD, 15));
        txDia.setBounds(270,135,30,20);
        add(txDia);

        txMes= new JTextField();
        txMes.setFont(new Font("Arial", Font.BOLD, 15));
        txMes.setBounds(355,135,30,20);
        add(txMes);

        txAño= new JTextField();
        txAño.setFont(new Font("Arial", Font.BOLD, 15));
        txAño.setBounds(425,135,50,20);
        add(txAño);

        txDia2= new JTextField();
        txDia2.setFont(new Font("Arial", Font.BOLD, 15));
        txDia2.setBounds(270,175,30,20);
        add(txDia2);

        txMes2= new JTextField();
        txMes2.setFont(new Font("Arial", Font.BOLD, 15));
        txMes2.setBounds(355,175,30,20);
        add(txMes2);

        txAño2= new JTextField();
        txAño2.setFont(new Font("Arial", Font.BOLD, 15));
        txAño2.setBounds(425,175,50,20);
        add(txAño2);

        // Creación de botón aceptar
        btAceptar = new JButton("Aceptar");
        btAceptar.setFont(new Font("Arial", Font.BOLD, 25));
        btAceptar.setBounds(200,250,200,25);
        btAceptar.setActionCommand("aceptar");
        add(btAceptar);

        //Caracteristicas de la ventana
        setTitle("Datos empleado");
        setSize(600,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    public String getNombre()
    {
        return txNombre.getText();
    }
    
    public String getCantidadSalario2()
    {
        return txCantidadSalarios.getText();
    }
    
    public String getDia()
    {
        return txDia.getText();
    }

    

    public String getMes()
    {
        return txMes.getText();
    }

    public String getAño()
    {
        return txAño.getText();
    }

    public String getDia2()
    {
        return txDia2.getText();
    }

    public String getMes2()
    {
        return txMes2.getText();
    }

    public String getAño2()
    {
        return txAño2.getText();
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAceptar.addActionListener(pAL);
    }
    
    public void cerrarDialogo()
    {
        this.dispose();
    }               
}
