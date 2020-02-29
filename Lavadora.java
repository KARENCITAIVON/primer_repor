package electrodomesticos;
/**
 * Esta es la clase superior y esta orientada a objetos
 * @author: Karen Sepulveda
 * @ version: 28/02/2020
 */
public class Lavadora extends Electrodomesticos {               // sub clase Lavadora
	/** contructor padre
	 */
	public Lavadora ( double preBase, String col, char conEnerg, int pes) {
		super (preBase, col, conEnerg, pes);                    // atributos heredados, llama clase padre
	}
	
	 public Lavadora (double preBase,int pes) {                // constructor peso y precio demas por defecto
		this ( preBase, "blanco", 'F', pes ) ;
			
	}
		/** otro contructor 
		 */
	public void Lavadora (int Car ) {                        // constructor carga
	
	Carga = Car ;                                              // atributo propio, constante
	
	}
    /**Cierre del constructor
     */
	 /** Metodos sub clase
	  */
	public static int Carga ;
	 /** @return devuelve carga
	  */
	public int getCarga() {                                    // metodo get de carga
		return Carga;
	}       	
	
	public void estableceCarga(int c) {                    
		Carga = c;
		
	}
	 /** @return devuelve precio base +carga
	  */
	public int DamePeso () {
	int pesoLavadora = super.DamePeso() ;
	return pesoLavadora + Carga;
		
		
	} 
	/** contructor por defecto
	 */
    public void Lavadora () {                                   // constructor vacio
        /**Cierre del constructor
         */ 	
    }
	

}	


