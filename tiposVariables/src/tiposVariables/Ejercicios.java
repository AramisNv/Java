package tiposVariables;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Hola mundo");
		//Tipos de datos:
		
//		byte : Sirve para representar un valor númerico de 8 bits
		
		byte salas = 10;
		System.out.println(salas);
		
//		short: Sirve para representar un valor númerico de 16 bits
		
		short asientos = 1120;
		System.out.println(asientos);
		
//		int: Sirve para representar un valor númerico de 32 bits
		
		int dulces =  3476;
		System.out.println(dulces);
		
//		long: Sirve para representar un valor númerico de 64 bits. Debe llevar una l al final
		
		long clientes = 313600l;
		System.out.println(clientes);
		
//		Datos que pueden tener punto decimal
		
//	Float: nos sirve para almacenar un valor númerico de 23 bits, debe llevar una f al final
		
		float palomitas = 35.5f ;
		System.out.println (palomitas+ "kg");
		
//		double : Sirve para representar un valor numerico de 64 bits, debe llevar una d al final
		
		double ganancia = 23770880.7d;
		System.out.println("$" + ganancia);
		
//		boolean: Sirve para representar valores booleanos y solamente tiene dos salidas, verdaderos y falso
		
//		char: Sirve para representar un caracter o un numero(pero solamente uno)
		
//		casting o casteo: Sirve para realizar una conversión de tipos de datos a uno más grande o pequeño, incluso 
//		a uno diferente
		
		double num = 59.7d;
		//casteo a entero
		int numInt = (int) num;
		System.out.println( numInt);
		
		Long  numlog = (long)num;
		System.out.println("long" + numlog);
		
//		De string a long
		String cantidad = "85";
		String precio = "59.7";
		int cantEntero = Integer.parseInt(cantidad);
		double precioDouble = Double.parseDouble(precio);
		System.out.println("El valor de la compra es: $"+ (cantEntero * precioDouble));
		
//		Operadores aritmeticos
		
		int dias = 28;
		dias = dias / 2;
		System.out.println("dias " + dias);
		
//		Operadores Incremento y decremento
		
		int p = 0;
		p++;
		p++;
		p++;
		System.out.println(p);
		
/*		Operadores Relacionales
		== Compara si un operador es igual a otro
		!= diferente a 
		>Mayor que
		<Menor que 
		> = mayor o igual
		<= Menor o igual que */
		
		int a = 10;
		int b = 15;
		boolean resultado;
		resultado = a == b ;
		System.out.println("El resultado de la operacion es " + resultado);
		
		
	
	
		
		
		
		
		

	
		
		
		
		
	}


}