package ciclosYCondicionales;
import java.util.Scanner;

public class condicionalesHotelCalifornia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingresa la edad: ");

        byte edad = scan.nextByte();

        if(edad<18) {
            System.out.println("Es menor de edad");
        }else {
            System.out.println("Es adulto");
        }

        //Todo Incluido
        System.out.println("Por favor, ingresa si tienes paquete 'todo Incluido'(true o false):");

        boolean todoIncluido = scan.nextBoolean();

        if(todoIncluido) {
            System.out.println("Todo lo que puedas comer y beber");
        }else {
            System.out.println("Ordena a la carta");
        }

        //Buffet
        System.out.println("Por favor, ingresa si tienes paquete 'buffet' (true o false)");

        boolean buffet = scan.nextBoolean();

        if(buffet) {
            System.out.println("Todo lo que puedas comer");
        }else {
            System.out.println("Ordena a la carta");
        }

        //Valet Parking
        System.out.println("Por favor, ingresa si tienes auto (true o false)");

        boolean tieneAuto = scan.nextBoolean();

        if(tieneAuto) {
            System.out.println("Tenemos servicio de valet parking a tu disposicion");
        }else {
            System.out.println("disfruta la noche, sin auto");
        }
        //Pet Friendly
        System.out.println("Por favor, ingresa si tienes mascota (true o false)");
        boolean tieneMascota = scan.nextBoolean();

        if(tieneMascota) {
            System.out.println("Nuestras instalaciones son pet Friendly");
        }else {
            System.out.println("disfruta la noche, sin mascota");
        }

        scan.close();
        
        

        	
        
       
		
		
		
		
		
		
		

	}//Cierre del método main

}//Cierre de la clase condicionales
