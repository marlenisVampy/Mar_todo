package Tareas;
import java.util.*;
import java.util.List;



public class Tarea
{

    private String NombreTarea;
    private boolean estado;

    public Tarea(String NombreTarea,boolean estado )
    {
        this.NombreTarea = NombreTarea;
        this.estado = estado;
    }

    public String getNombreTarea(){return NombreTarea;}
    public boolean getestadoTarea(){return estado;}
    
          
}

