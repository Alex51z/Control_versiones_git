
public class Objeto {

private static String caracteres;
	
	public Objeto(String caracteres) {
		super();
		this.caracteres = caracteres;
	}


	public String getCaracteres() {
		return caracteres;
	}

	public void setCaracteres(String caracteres) {
		this.caracteres = caracteres;
	}

	public static String getPassword(int length) {
		String pswd = "";
 
		for (int i = 0; i < length; i++) {
			pswd+=(caracteres.charAt((int)(Math.random() * caracteres.length())));
		}
 
		return pswd;
	}
}
