import Tareas.*;

import java.util.ArrayList;
import java.util.List;



 
public class tester{
    public static void main(String[] args){

       

        Lista new_Lista = new Lista();
        new_Lista.crearNuevaTarea("Ver a Pedro",true);
        new_Lista.crearNuevaTarea("Llamar a Pedro",false);
       
       
        //before delete item
         System.out.println("\nEstos son los elementos \n");
         new_Lista.verTareas(); 
       
         new_Lista.verestadoTareas();
         new_Lista.eliminarTarea(1);
         //after delete item

          System.out.println("\nEstos son los elementos \n");
         new_Lista.verTareas(); 
         new_Lista.verestadoTareas();   
   
        }
}


