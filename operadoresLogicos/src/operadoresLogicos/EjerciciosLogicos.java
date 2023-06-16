package operadoresLogicos;

public class EjerciciosLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		
//		Los operadores lógicos se utilizan para combinar valores boolean y nos devuelven un resultado verdadero, falso o nulo
		
//		&& and (Y)
//		|| or (O)
//		! not (no)
		
		int a = 5;
		
        int b = 3;
		
	
//	Aplicamos operador not, lo cual niega toda la operacion, dandonos true
    System.out.println(!(a>b) && b>a);
	
//	Aplicamos operador and y nos da false, ya que uno no es cierta
	System.out.println(a > b && b> a);
	
//		Aplicamos operador or 
    System.out.println(a > b || b> a);
		
		
	
		
		

	}

}
