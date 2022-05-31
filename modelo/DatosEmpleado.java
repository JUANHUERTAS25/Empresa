package modelo;


public class DatosEmpleado {
     //--------------------------
    //Atributos
    //--------------------------
    private String Nombre;
    private int cantidadSalarios;
    private int dia;
    private int mes;
    private int año;
    private int dia2;
    private int mes2;
    private int año2;

    
    //--------------------------
    //Métodos
    //--------------------------
    
    //Constructor
    public DatosEmpleado(String pNombre,int pCantidadSalarios, int pDia, int pMes, int pAño, int pDia2, int pMes2, int pAño2)
    {
        this.Nombre = pNombre;
        this.cantidadSalarios = pCantidadSalarios;
        this.dia = pDia;
        this.mes = pMes;
        this.año = pAño;
        this.dia2 = pDia2;
        this.mes2 = pMes2;
        this.año2 = pAño2; 
    }


    public String getNombre()
    {
        return this.Nombre;
    }

    public int getCantidadSalario()
    {
        return this.cantidadSalarios;
    }

    public int getDia()
    {
        return this.dia;
    }
    
    public int getMes()
    {
        return this.mes;
    }

    public int getAño()
    {
        return this.año;
    }

    public int getDia2()
    {
        return this.dia2;
    }
    
    public int getMes2()
    {
        return this.mes2;
    }

    public int getAño2()
    {
        return this.año2;
    }


    public void setNombre(String pNombre)
    {
        this.Nombre = pNombre;
    }

    public void setCantidadSalarios(int pCantidadSalarios)
    {
        this.cantidadSalarios = pCantidadSalarios;
    }

    public void setDia(int pDia)
    {
        this.dia = pDia;
    }
    
    public void setMes(int pMes)
    {
        this.mes = pMes;
    }

    public void setAño(int pAño)
    {
        this.año = pAño;
    }

    public void setDia2(int pDia2)
    {
        this.dia2 = pDia2;
    }
    
    public void setMes2(int pMes2)
    {
        this.mes2 = pMes2;
    }

    public void setAño2(int pAño2)
    {
        this.año2 = pAño2;
    }

    public void auxilioTransporte()
    {
        if(getCantidadSalario()<= 2000000)
        {
            setCantidadSalarios(getCantidadSalario()+117000);
        }
        else
        {
            setCantidadSalarios(getCantidadSalario());
        }
    }

    public void edad()
    {
       setAño(2022-getAño());
    }

    public void antiguedad()
    {
       setAño2(2022-getAño2()); 
    }
}
