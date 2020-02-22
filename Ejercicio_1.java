package ejercicios_prueba;//PROMEDIO 3 NOTAS
import java.util.*;
public class Ejercicio_1 {

	public static void main(String[] args) {	
		
	Scanner entrada = new Scanner (System.in);	
	
    System.out.println ("ingrese notas sin puntos ni comas");
    System.out.println ("ingrese primera nota, y presione enter");
    int nota1 = entrada.nextInt();
    
    System.out.println ("ingrese segunda nota, y presione enter");
    int nota2 = entrada.nextInt();
    
    System.out.println ("ingrese tercera nota, y presione enter");
    int nota3 = entrada.nextInt();
    
    System.out.println ("su promedio es  "+(nota1+nota2+nota3)/3);
    
	}

}


