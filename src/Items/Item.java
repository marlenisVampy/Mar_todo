package Items;
import java.util.*;
import java.util.List;



public class Item
{

    private String NombreItem;
    private boolean estado;

    public Item(String NombreItem,boolean estado )
    {
        this.NombreItem = NombreItem;
        this.estado = estado;
    }

    public String getNombreItem(){return NombreItem;}
    public boolean getestadoItem(){return estado;}
    
  /*  public void verItem() {
         System.out.println("\nEstos son los elementos \n");
         for( int i = 0 ; i < ejemploLista.size(); ++i ) { 
                   System.out.println( ejemploLista.get(i).getNombreItem() + " " + ejemploLista.get(i).getestadoItem());
         } 
     }*/


          
}

