package modelo;

public class Salario 
{
    //--------------------------
    //Atributos
    //--------------------------
    private static int doblesalario = 1000000;
    private static int auxilioTransporte = 117000;
    private String FechaNacimiento;
    private String FechaIngreso;
    private int salario;
    
    //--------------------------
    //Métodos
    //--------------------------
    
    //Constructor
    
    public Salario(String pFechaNacimiento, String pFechaIngreso)
    {
        this.FechaNacimiento = pFechaNacimiento;
        this.FechaIngreso = pFechaIngreso;  

    }
    
    public String getFechaNacimiento()
    {
        return this.FechaNacimiento;
    }

    public String getFechaIngreso()
    {
        return this.FechaIngreso;
    }

    public void setFechaNacimiento(String pFechaNacimiento)
    {
        this.FechaNacimiento = pFechaNacimiento;
    }

    public void setFechaIngreso(String pFechaIngreso)
    {
        this.FechaIngreso = pFechaIngreso;
    }

    public void cantidadSalario()
    {
        if(salario<doblesalario)
        {
            salario += auxilioTransporte;
        }
        else 
        {
            salario += 0;
        }
        
    }
    public String toString()
    {
        return "";
    }
}