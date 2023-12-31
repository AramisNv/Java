package entedidades;

// Primero tengo que dar la instruccion de que quiero heredar con la palabra extends
public class Empleado extends Persona {
	
//	1. Atributos o propiedades
	
	public String numEmpleado;
	public String nss;
	public String puesto;
	
	
	
	
	//	2. Constructor con parametros (Heredamos "la mitad" del constructor de Persona
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono);//Nos indica que heredamos (super)
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	
	//3. Metodo para imprimirInformacion empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Numero Empleado: " + numEmpleado);
        System.out.println("Numero Seguro Social: " + nss);
        System.out.println("Puesto: " + puesto);
    }//cierre mostrarInformacin
	
	
	

}
	


