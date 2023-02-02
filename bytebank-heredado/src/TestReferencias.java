
public class TestReferencias {
	
	public static void main(String[] args) {
		//Elemento más genérico puede ser adaptado
		//		al elemento más genérico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		// funcionario.iniciarSesion(); No compila
		
	}

}
