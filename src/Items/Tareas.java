package Items;

import java.util.*;
import java.util.List;

public class Tareas
{
		private List<Item> new_it = new ArrayList<Item>();
		private int completada= 0,pendiente =0,total=0;

public Tareas()
{}
public Tareas(List<Item> new_item)
{
	new_it = new_item;
}
	

	public void crearNuevoTarea(String NombreItem,boolean estado)
	{
		//new_it = new ArrayList<Item>();
		new_it.add(new Item(NombreItem,estado));
		System.out.println("\n ** Nuevo tarea agregada");

	}
	 public void verestadoTareas()
	 {
	 		//int k = 0;
		 for ( int k = 0; k <= new_it.size() - 1; k++) {
           
            if(new_it.get(k).getestadoItem() == true)
            {
            		completada++;
            }else
            	if(new_it.get(k).getestadoItem()== false)
            		{pendiente++;}
            		
            	}
           
        System.out.println("\n\n Lista de tareas:( " + completada + "  Completadas," + pendiente+
         " pendientes,"+ new_it.size() +" Totales)");
				//reiniciando los contadores
             completada= 0;
             pendiente =0;
             total=0;
              }

	 

	public void verTareas()
	{
		System.out.println("\n\t\t Estos son los elementos \n");
		System.out.println("\nTarea      ||    Estado \n");

		for( int i = 0 ; i < new_it.size(); ++i ) { 
                   System.out.println( (i+1)+ " "+ new_it.get(i).getNombreItem() + "   ,   " + new_it.get(i).getestadoItem());
         }  
        
	}
	public void eliminarTarea(int posicion)
	{	int j=0;
		for(  j = 0 ; j < new_it.size(); ++j ) { 
             new_it.remove(j);
         }  
         System.out.println("\n ** Se ha eliminado una tarea " + (j+1));		
	}

}

