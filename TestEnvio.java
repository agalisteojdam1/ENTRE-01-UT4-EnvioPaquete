
/**
 *  Esta clase es el punto de entrada a la aplicación.
 * 
 * @author -Asier Galisteo 
 * 
 */
public class TestEnvio
{
     

    /**
     *  
     */
    public static void main(String[] args){
         Paquete paquete1 = new Paquete();
         Paquete paquete2 = new Paquete(40,60,40);
         Envio envio = new Envio();
         envio.addPaquete(paquete1);
         envio.addPaquete(paquete2);
         System.out.println(envio.toString());
         
         Paquete paquete3 = new Paquete(new Dimension(50,50,70),13);
         envio.addPaquete(paquete3);
         System.out.println("-----------------------------------------------------");
         System.out.println(envio.toString());
         System.out.println("\n-----------------------------------------------------");
         
         paquete2.obtenerCopia();
         envio.addPaquete(paquete2.obtenerCopia());
         
    }
}
