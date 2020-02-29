package electrodomesticos;
/**
 * Esta es la clase superior y esta orientada a objetos
 * @author: Karen Sepulveda
 * @ version: 28/02/2020
 */
public class Televisor extends Electrodomesticos {                      // subclase televisor
	/** contructor padre
	 */
	public Televisor(double preBase, String col, char consumEnerg, int pes) {  // atributos heredados, 
		super(preBase, col, consumEnerg, pes);
	    /**Cierre del constructor
	     */	
	}

	private static double resolucion ;        
	private static boolean sintonizador ;
	/** otro contructor 
	 */	
	public void Televisor (double resol, boolean sinton) {        // atributos propios 
		
		resolucion = resol ;
		sintonizador  = sinton ;
	}
    /**Cierre del constructor
     */
	public Televisor ( double resol, boolean sinton, double preBase, String col, char consumEnerg, int pes) {
		super (preBase, col, consumEnerg, pes);                      // constructor resolucion , sintonizador otros heredados
	}
	/** contructor por defecto
	 */
    public void Televisor () {                                   // constructor vacio
    	
    }
    /**Cierre del constructor
     */
	 /** Metodos sub clase
	  */
    public void comfirma_sintonizador(String sintonizador) {
    	
    	if (sintonizador == "si") {
    		this.sintonizador = true ;
    }
    	else {
    		this.sintonizador = false ;		
    	}	
    }
	 /** @return devuelve boolean si o no
	  */
    public String DimeSintonizador() {
    	return  (" si tiene sintonizador ");
    }
	 /** @return devuelve resolucion
	  */
	public static double getResolucion() {                          // metodo get resolucion
		return resolucion;
	}

	public static void setResolucion(double resolucion) {
		Televisor.resolucion = 20 ; 
	}

	 /** @return devuelve boolean si o no
	  */
	public static boolean isSintonizador() {                           // metodo get sintonizador
		return sintonizador;
	}

	public static void setSintonizador(boolean sintonizador) {
		Televisor.sintonizador = false ;
	}
	 /** @return devuelve precio base + 30 %
	  */
	public  double PrecioFinal() {                                    //metodo precio final
		
    	if (resolucion > 40 ) {
    		double PrecioFinal = precio_base + precio_base *( 100 /1.3) ;
    	}
    	if (sintonizador = true) {
    		double PrecioFinal = precio_base + 50 ;
    	}
    	return PrecioFinal();	
	}
}

