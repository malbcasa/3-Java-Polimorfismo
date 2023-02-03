
public class Gerente extends Funcionario implements Autenticable {

	//private String clave;
	private AutenticacionUtil util;
	
	public Gerente() {
		this.util = new AutenticacionUtil();
	}
	
	public void setClave (String clave) {
		//this.clave = clave;
		this.util.setClave(clave);
	}
	
	@Override
	public boolean iniciarSesion(String clave) {
		//return this.clave == clave;
		return this.util.iniciarSesion(clave);
	}
	
	// Sobreescritura de metodo
	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		return 2000; // super.getSalario() + super.getSalario()*0.5;
	}
}
