package electrodomesticos;
/**
 * Esta es la clase superior y esta orientada a objetos
 * @author: Karen Sepulveda
 * @ version: 28/02/2020
 */
/**  super clase Electrodomesticos
 */
	public class Electrodomesticos {             // super clase electrodomesticos

	public double precio_base;                //  atributos heredables
	public String color; 
	public char consumo_energia;
	public int peso;
	
/** contructor super clase
 */
	public Electrodomesticos ( double preBase, String col, char conEnerg, int pes) {  // constructor todos los atributos
	precio_base = preBase ;
	color = col ;
	consumo_energia = conEnerg ;
	peso = pes ;
	
	precio_base = 100.000;
	}
	
	 public Electrodomesticos (double preBase,int pes) {  // constructor peso y precio demas por defecto
		this ( preBase, "blanco", 'F', pes ) ;
	}
	 /** Metodos super clase
	  */
	 /** @return devuelve precio base
	  */ 
	public double DamePrecio_base() {                       // metodo get atributos
		return precio_base;
	}
	 /** @return devuelve color
	  */
	public String DameColor() {                             // metodo get atributos
		return color;
	}

	public void setColor(String color) {                       
		this.color = ("blanco");
		this.color = ("negro");
		this.color = ("rojo");
		this.color = ("azul");
	}
	 /** @return devuelve consumo de energia
	  */
	public char DameConsumo_energia() {                     // metodo get atributos
		return consumo_energia;
	}

	public void setConsumo_energia(char consumo_energia) {
		this.consumo_energia ='A' ;  
		this.consumo_energia ='B' ;
		this.consumo_energia ='C' ;
		this.consumo_energia ='D' ;
		this.consumo_energia ='E' ;
		this.consumo_energia ='F' ;
	}
	 /** @return devuelve peso
	  */
	public int DamePeso() {                                 // metodo get atributos
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	/** contructor por defecto
	 */
    public void Electrodomesticos () {                        // constructor vacio
    	
    }
	
	
	
}


