package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Salario;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Salario model;
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Salario pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        
        if(comando.equals("crear"))
        {   
            //Validar datos entrada
            try
            {
                String FechaNacimiento = venPrin.miPanelEntradaDatos.getFechadeNacimiento();
                String FechaIngreso = venPrin.miPanelEntradaDatos.getFechaIngreso();
            
                
            
                //Creación del objeto tipo Carro
                model = new Salario(FechaNacimiento, FechaIngreso);
                
                venPrin.miPanelResultado.mostrarResultado("Se mostrará los datos del usuario");
                venPrin.miPanelResultado.mostrarResultado("Su fecha de nacimiento es: " + model.getFechaNacimiento());
                venPrin.miPanelResultado.mostrarResultado("Su fecha de ingreso es: " + model.getFechaIngreso());
                
                //Desactivar boton crear
                venPrin.miPanelOperaciones.desactivarBotonCrear();
                //Activar botones
                venPrin.miPanelOperaciones.activarBotones();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        
        if(comando.equals("mover"))
        {   
            venPrin.crearDialogoMover();
            this.venPrin.miDialogoMoverCarro.agregarOyentesBotones(this);  
        }
        
        
    }    
}