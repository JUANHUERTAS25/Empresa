package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultado;
    public DialogoDatosEmpleado miDialogoDatosEmpleado;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        
        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,380,190);
        add(miPanelEntradaDatos);
       
        
        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,380,80);
        add(miPanelOperaciones);
        
        //Creación y adición del PanelOperaciones
        miPanelResultado = new PanelResultados();
        miPanelResultado.setBounds(10,320,380,250);
        add(miPanelResultado);
        
        miDialogoDatosEmpleado = null;
        
        //Caracteristicas de la ventana
        setTitle("Empresa");
        setSize(400,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    //Crear ventana dialogo Empleados
    public void crearDialogoDatosEmpleado()
    {
        miDialogoDatosEmpleado = new DialogoDatosEmpleado();
    }
}
