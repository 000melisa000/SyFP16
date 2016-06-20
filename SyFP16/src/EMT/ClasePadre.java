/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EMT;

/**
 *
 * @author melisa
 */
public class ClasePadre implements Ipadre 
{

    @Override
    public String getHoyNoCircula() 
    {
        System.out.println("hoy no circulan los vehiculos con engomado");
        return"";
        
    }
    public String getByPlaca( String digi) 
    {
        if (digi == "1" || digi== "2"){return "jueves";}
        if (digi == "5" || digi == "6"){return "lunes";}
        if (digi == "7" || digi == "8"){return "martes";}
        if (digi == "3" || digi == "4"){return "miercoles";}
        if (digi == "9" || digi == "0"){return "viernes";}
        return "";
    }
    public String getTerminacionPlaca(String day) 
    {
        if(day == "lunes"){return "5,6";}
        if(day == "martes"){return "7,8";}
        if(day == "miercoles"){return "3,4";}
        if(day == "jueves"){return "1,2";}
        if(day == "viernes"){return "9,0";}
        return "";
    }
    
    public String getColor( String color) 
    {
        if(color == "amarillo"){return "lunes";}
        if(color == "rosa"){return "martes";}
        if(color == "rojo"){return "miercoles";}
        if(color == "verde"){return "jueves";}
        if(color == "azul"){return "viernes";}
        return"";
    }
}
