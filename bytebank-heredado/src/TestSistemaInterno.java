
public class TestSistemaInterno {
	
	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		gerente1.setClave("12345");
		Administrador admin = new Administrador();
		admin.setClave("2222");
		//Autenticable au = new Gerente();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}

}
