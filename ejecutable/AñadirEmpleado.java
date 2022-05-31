package ejecutable;

import controlador.Controlador;
import modelo.DatosEmpleado;
import vista.VentanaPrincipal;

public class AñadirEmpleado {
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        DatosEmpleado miDatosEmpleado = null;
        Controlador miControlador = new Controlador(miVentana,miDatosEmpleado);
    }    
}
