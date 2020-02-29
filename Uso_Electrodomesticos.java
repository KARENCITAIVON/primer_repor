package electrodomesticos;
/**
 * Esta es la clase superior y esta orientada a objetos
 * @author: Karen Sepulveda
 * @ version: 28/02/2020
 */

public class Uso_Electrodomesticos {                                                // clase ejecutable

	public static void main(String[] args) {                                        // metodo main
		 /** array electrodomesticos
		  */
		Lavadora Fensa = new Lavadora (100.000,"blanco",'B',15) ;                   // objeto clase Lavadora

		Televisor LG = new Televisor (100.000,"negro",'A',5) ;                      // objeto clase Televisor
		
		Electrodomesticos[] misElectrodomesticos = new Electrodomesticos[10];            // array 10 elemntos
		
		misElectrodomesticos [0] = new Electrodomesticos (100.000,"blanco",'A',15);	
		misElectrodomesticos [1] = new Electrodomesticos (100.000,"Azul",'F',20);	
		misElectrodomesticos [2] = new Electrodomesticos (100.000,"rojo",'C',18);	
		misElectrodomesticos [3] = new Electrodomesticos (100.000,"blanco",'F',25);	
		misElectrodomesticos [4] = new Electrodomesticos (100.000,"negro",'F',15);	
		misElectrodomesticos [5] = new Electrodomesticos (100.000,"blanco",'D',15);	
		misElectrodomesticos [6] = new Lavadora (100.000,"roja",'A',25);
		misElectrodomesticos [7] = new Televisor (100.000,"negro",'B',15);
		misElectrodomesticos [8] = Fensa;	                                            // polimorfismo. principio de sustitucion
		misElectrodomesticos [9] = LG;
		 /** fin array electrodomesticos
		  */	
		if (Fensa instanceof Electrodomesticos)   {                                      // operador instanceof
			System.out.println( "este es tipo lavadora"); 
		}
		if (LG instanceof Electrodomesticos)       {                                      // operador instanceof
			System.out.println( "este es tipo televisor"); 
		}                                   
			for (Electrodomesticos e : misElectrodomesticos) {
			e.DamePrecio_base () ;
		}
			for (Electrodomesticos e : misElectrodomesticos) {
				e.DameColor () ;	
		}
			for (Electrodomesticos e : misElectrodomesticos) {
				e.DameConsumo_energia() ;	
		}
			for (Electrodomesticos e : misElectrodomesticos) {
				e.DamePeso() ;	
		}	
	
		System.out.println("precioFinal");
}
	
}	