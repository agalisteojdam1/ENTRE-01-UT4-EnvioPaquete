
/**
 *  Un objeto de esta clase representa un envío de varios paquetes,
 *  máximo tres
 *  
 * 
 * @author - Asier Galisteo  
 *  
 */
public class Envio
{
    private final double PRECIO_KILO = 2.2;  // precio coste envío Kg. en euros
    private Paquete paquete1;
    private Paquete paquete2;
    private Paquete paquete3;

    /**
     * Constructor  
     * Inicializa los paquetes a null (inicialmente
     * el envío no tiene paquetes)
     */
    public Envio()    {
        this.paquete1 = new Paquete();
        this.paquete2 = new Paquete();
        this.paquete3 = new Paquete();

    }

    /**
     * accesor para el paquete1
     */
    public Paquete getPaquete1() {
        return paquete1;

    }

    /**
     * accesor para el paquete2
     */
    public Paquete getPaquete2() {
        return paquete2;

    }

    /**
     * accesor para el paquete3
     */
    public Paquete getPaquete3() {
        return paquete3;

    }

    /**
     * Devuelve el nº de paquetes en el envío
     * (dependerá de cuántos paquetes estén a null)
     */
    public int getNumeroPaquetes() {
        int numPaquetes = 0;
        if(paquete1 != null){
            numPaquetes++; 
        }
        
        if(paquete2 != null){
            numPaquetes++;
        }
        
        if(paquete3 != null){
            numPaquetes++;
        }
        return numPaquetes;

    }

    /**
     * Devuelve true si el envío está completo, false en otro caso
     * (tiene exactamente 3 paquetes)
     */
    public boolean envioCompleto() {
        if(getNumeroPaquetes() == 3){
            return true;
        }
        return false;

    }

    /**
     * Se añade un nuevo paquete al envío
     * Si el envío está completo se muestra
     * el mensaje "No se admiten más paquetes en el envío"
     * Si no está completo se añade el paquete al envío teniendo en cuenta
     * si se añade como primero, segundo o tercero (no han de quedar huecos)
     */
    public void addPaquete(Paquete paquete) {
        //TODO
        if (envioCompleto()){
            System.out.println("No se admiten más paquetes en el envío");
        }
    }

    /**
     * Calcula y devuelve el coste total del envío
     * 
     * Para calcular el coste:
     *      - se obtiene el peso facturable de cada paquete 
     *      - se suman los pesos facturables de todos los paquetes del envío
     *      - se calcula el coste en euros según el precio del Kg 
     *      (cada Kg. no completo se cobra entero, 5.8 Kg. se cobran como 6, 5.3 Kg. se cobran como 6)
     *     
     *  
     */
    public double calcularCosteTotalEnvio() {
        double pesoFacturableTotal = 0;
        switch(getNumeroPaquetes()){
            case 1: pesoFacturableTotal = paquete1.calcularPesoFacturable();
            break;
            case 2: pesoFacturableTotal = paquete1.calcularPesoFacturable() + paquete2.calcularPesoFacturable();
            break;
            case 3: pesoFacturableTotal = paquete1.calcularPesoFacturable() + paquete2.calcularPesoFacturable() + paquete3.calcularPesoFacturable();
            break;
        }
        double costeTotal = Math.round(pesoFacturableTotal) * PRECIO_KILO;

        return costeTotal;

    }

    /**
     * Representación textual del envío
     * con el formato exacto indicado
     * (leer enunciado)
     */
    public String toString() {
        //TODO
        return null;
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Envio
     */
    public void print() {
        System.out.println(this.toString());
    }

}
