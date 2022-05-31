package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.DatosEmpleado;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private DatosEmpleado model;
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, DatosEmpleado pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if(comando.equals("crear"))
        {   
            venPrin.crearDialogoDatosEmpleado();
            this.venPrin.miDialogoDatosEmpleado.btAceptar.addActionListener(this);
            venPrin.miPanelOperaciones.activarBotones();
        }
        
        if(comando.equals("aceptar"))
        {
            try{
        
            String Nombre = venPrin.miDialogoDatosEmpleado.getNombre();
            int CantidadSalarios = Integer.parseInt(venPrin.miDialogoDatosEmpleado.getCantidadSalario2());
            int Dia = Integer.parseInt(venPrin.miDialogoDatosEmpleado.getDia());
            int Mes = Integer.parseInt(venPrin.miDialogoDatosEmpleado.getMes());
            int Año = Integer.parseInt(venPrin.miDialogoDatosEmpleado.getAño());
            int Dia2 = Integer.parseInt(venPrin.miDialogoDatosEmpleado.getDia2());
            int Mes2 = Integer.parseInt(venPrin.miDialogoDatosEmpleado.getMes2());
            int Año2 = Integer.parseInt(venPrin.miDialogoDatosEmpleado.getAño2());
            
            model = new DatosEmpleado(Nombre, CantidadSalarios, Dia, Mes, Año, Dia2, Mes2, Año2);
            venPrin.miPanelResultado.mostrarResultado("Los datos del empleado son los siguientes: \nNombre = " + model.getNombre() + "\n Salario = " + model.getCantidadSalario() + "\n Fecha cumpleaños = " + model.getDia() + "/" + model.getMes() + "/" + model.getAño()+ "\n Fecha ingreso = " + model.getDia2() + "/" + model.getMes2() + "/" + model.getAño2());
            venPrin.miDialogoDatosEmpleado.cerrarDialogo();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error en datos de entrada", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        if(comando.equals("auxilio"))
        {
            model.auxilioTransporte();
            venPrin.miPanelResultado.mostrarResultado("\nSu salario ahora es de: " + model.getCantidadSalario());            
        }
        if(comando.equals("edad"))
        {
            model.edad();
            venPrin.miPanelResultado.mostrarResultado("\nLa edad del empleado es: " + model.getAño());
        }
        if(comando.equals("antiguedad"))
        {
            model.antiguedad();
            venPrin.miPanelResultado.mostrarResultado("\nLa antiguedad del empleado es: " + model.getAño2());
        }
        if(comando.equals("borrar"))
        {
            venPrin.miPanelResultado.borrar();
        }        
        
    }
}
