package ejecutable;

import controlador.Controlador;
import modelo.Salario;
import vista.VentanaPrincipal;

public class CreacionCarros 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Salario miCarro = null;
        Controlador miControlador = new Controlador(miVentana, miCarro);
    }
}