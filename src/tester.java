import Items.*;

import java.util.ArrayList;
import java.util.List;



 
public class tester{
    public static void main(String[] args){

       

        Requerimiento new_req = new Requerimiento();
        new_req.crearNuevoItem("Ver a Pedro",true);
        new_req.crearNuevoItem("Llamar a Pedro",false);
       
       
        //before delete item
         System.out.println("\nEstos son los elementos \n");
         new_req.verItems(); 
       
         new_req.verestadoTareas();
         new_req.eliminarTarea(1);
         //after delete item

          System.out.println("\nEstos son los elementos \n");
         new_req.verItems(); 
         new_req.verestadoTareas();   
   
        }
}


