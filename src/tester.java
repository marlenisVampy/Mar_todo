import Items.*;

import java.util.ArrayList;
import java.util.List;



 
public class tester{
    public static void main(String[] args){

        /*List<Item> ejemploLista = new ArrayList<Item>();
        ejemploLista.add(new Item("Ver a Pedro",true));
        ejemploLista.add(new Item("pagarle a José",false));
        ejemploLista.add(new Item("Llamar a Pedro",true));
        */
        //System.out.println(ejemploLista);

        Requerimiento new_req = new Requerimiento();
        new_req.crearNuevoItem("Ver a Pedro",true);
        new_req.crearNuevoItem("Llamar a Pedro",false);
       /* Requerimiento new_req1 = new Requerimiento();
        new_req1.crearNuevoItem("LLamar a Pedro",false);*/

       //Requerimiento new_req = new Requerimiento(ejemploLista);
       
        //before delete item
         System.out.println("\nEstos son los elementos \n");
         new_req.verItems(); 
       
         new_req.verestadoTareas();
         new_req.eliminarTarea(1);
         //after deleter item

          System.out.println("\nEstos son los elementos \n");
         new_req.verItems(); 
         new_req.verestadoTareas();


        /* for( int i = 0 ; i < ejemploLista.size(); ++i ) { 
                   System.out.println( ejemploLista.get(i).getNombreItem() + "   ,   " + ejemploLista.get(i).getestadoItem());
         }  */
        
/* 
//it works
List<String> ejemploLista = new ArrayList<String>();
      ejemploLista.add("Juan");
      ejemploLista.add("Pedro");
      ejemploLista.add("José");
      ejemploLista.add("María");
      ejemploLista.add("Sofía");

      
      System.out.println(ejemploLista.size());*/
        }
}


 /*Vector<Item> listaA = new Vector<Item> ();

    listaA.add(new Item("Sleep 8 hours"));
    listaA.add(new Item("Do my homework"));


        Requerimiento new_req = new Requerimiento(listaA);

        new_req.verItems();*/



  /*  Pantalla miPantalla = new Pantalla();
        miPantalla.menuPrincipal(); */

     /*
        Vector<Lista> listaC = new Vector<Lista> ();
        Vector<Lista> listaE = new Vector<Lista> ();
        Vector<Lista> listaT = new Vector<Lista> ();

        listaC.add(new Lista("Lista_Compras"));
        listaC.add(new Lista("Lista_Ejercicio"));
        listaC.add(new Lista("Lista_TAreas"));

        
          }
              System.out.println("\nTengo las siguientes Listas");

           int size =  listaC.size();  
                
         for( int i = 0 ; i < size ; ++i ) { 

                  System.out.println(listaC.get(i).getNombreLista()); */
         /*import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;*/