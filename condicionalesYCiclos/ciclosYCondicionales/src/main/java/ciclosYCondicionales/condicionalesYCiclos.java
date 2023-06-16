package ciclosYCondicionales;
import java.util.Scanner;


public class condicionalesYCiclos {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub

		/*
		 * Condicionales
		 * 
		 * 
		 * if
		 * else
		 * else if
		 * switch
		 */
	
	
		System.out.println("Programa para calcular la hora");
		
		Scanner valorIngresado = new Scanner(System.in);
		
		System.out.println("Por favor ingrese una hora en formato 24 horas: ");
		int hora =  valorIngresado.nextInt();
		
		
		if(hora >= 0 && hora <= 23) {			
			if(hora>=7 && hora <=11) { //que es una hora valida
				System.out.println("Buenos dias solecito");
			}else if (hora >= 12 && hora <= 18) {
				System.out.println("Buenas tardes, que calor hace");
			}else if (hora >= 19 && hora <24) {
				System.out.println("Buenas noches, a mimir");
			}else {
				System.out.println("Es de madrugada, no es bueno 				desvelarse");}			
		}else {
			System.out.println("Hora mal ingresada");
		}
		
		valorIngresado.close();
		
		
		
//      Condicional Switch
        
        
      int opcion = 1;
      switch (opcion) 
      {
      case 1:
      	System.out.println("Bienvenido al servicio de reservas");
      	break;
      	
      case 2:
          System.out.println("Bienvenido al servicio de check-in");
          break;
      
      case 3:
      	System.out.println("Bienvenido al servicio de check-out");
          break;
      	
      default: 
          System.out.println("OPCION INVALIDA");
          break;
      }//Cierre del switch
      
      //Ejemplo de sWITCh anidado
      
//      int entradaDeDato = 5;
//      
//      switch (entradaDeDato) {
//      case 1:
//      	switch (otraOpcion) {
//      	case 1: System.out.println("Esta es la primera opcion, del primer caso");
//      	break;
//      	case 2 :
//      		System.out.println("Esta es la segunda opcion del primer caso");
//      		break;
//      		default:
//      			System.out.println("Opcion invalida");
////      	}cierre del switch interno
//      			
//      }//Cierre del switch en general
//      	





		
		

	}

}
