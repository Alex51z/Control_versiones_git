import java.util.Scanner;

public class Principal {

	static Scanner sc= new Scanner(System.in);
	public static void main (String [] args) {
	
		Objeto caracteres= new Objeto ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789ñÑ");
		
		System.out.println("Tamaño de la contraseña");
		int tamaño= sc.nextInt();
		
		String pswd= caracteres.getPassword(tamaño);
		System.out.println(pswd);
	}	
}
