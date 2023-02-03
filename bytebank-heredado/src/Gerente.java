
public class Gerente extends Funcionario implements Autenticable {

	private String clave;
	
	public void setClave (String clave) {
		this.clave = clave;
	}
	
	@Override
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
	
	// Sobreescritura de metodo
	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		return 2000; // super.getSalario() + super.getSalario()*0.5;
	}
}
