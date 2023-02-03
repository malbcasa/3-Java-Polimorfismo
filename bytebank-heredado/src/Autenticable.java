
public abstract interface Autenticable {

	//private String clave;
	
	public abstract void setClave (String clave);/* {
		this.clave = clave;
	}*/
	
	public abstract boolean iniciarSesion(String clave);/* {
		return clave == "12345";
	}*/

}
