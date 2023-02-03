
public class SistemaInterno {

	private String clave = "12345";
	
	public boolean autentica(Autenticable au) {
		boolean puedeIniciarSesion = au.iniciarSesion(this.clave);
		if(puedeIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		}else {
			System.out.println("Error en login");
			return false;
		}
	}
}
