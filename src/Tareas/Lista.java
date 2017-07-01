package Tareas;

import java.util.*;
import java.util.List;

public class Lista
{
		private List<Tarea> new_it = new ArrayList<Tarea>();
		private int completada= 0,pendiente =0,total=0;

public Lista()
{}
public Lista(List<Tarea> new_Tarea)
{
	new_it = new_Tarea;
}
	

	public void crearNuevaTarea(String NombreTarea,boolean estado)
	{
		//new_it = new ArrayList<Tarea>();
		new_it.add(new Tarea(NombreTarea,estado));
	}
	 public void verestadoTareas()
	 {
	 		for ( int k = 0; k <= new_it.size() - 1; k++) {
           
            if(new_it.get(k).getestadoTarea() == true)
            {
            		completada++;
            }else
            	if(new_it.get(k).getestadoTarea()== false)
            		{pendiente++;}
            		
            	}
           
        /*System.out.println("\n\n Lista de tareas:( " + completada + "  Completadas," + pendiente+
         " pendientes,"+ new_it.size() +" Totales)");*/
				//reiniciando los contadores
             completada= 0;
             pendiente =0;
             total=0;
              }

	 

	public void verTareas()
	{
		
		for( int i = 0 ; i < new_it.size(); ++i ) { 
                   System.out.println( (i+1)+ " "+ new_it.get(i).getNombreTarea() + "   ,   " + new_it.get(i).getestadoTarea());
         }  
        
	}
	public void eliminarTarea(int posicion)
	{	int j=0;
		for(  j = 0 ; j < new_it.size(); ++j ) { 
             new_it.remove(j);
         }  
       	}

}

