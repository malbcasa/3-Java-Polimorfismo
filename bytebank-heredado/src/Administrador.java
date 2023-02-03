
public class Administrador extends Funcionario implements Autenticable{ 

	//private String clave;
	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}
	
	@Override
	public void setClave(String clave) {
		//this.clave = clave;
		this.util.setClave(clave);
	}
	 	
	public boolean iniciarSesion(String clave) {
		//return this.clave == clave;
		return this.util.iniciarSesion(clave);
	}
	
	//@Override
	public double getBonificacion() {
		return this.getSalario();
	}

}
