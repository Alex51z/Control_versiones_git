import java.util.Scanner;

public class Principal {

	static Scanner sc= new Scanner(System.in);
	public static void main (String [] args) {
	
		Password caracteres= new Password ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
		
		System.out.println("Tamaño de la contraseña");
		int tamaño= sc.nextInt();
		
		String pswd= caracteres.getPassword(tamaño);
		System.out.println(pswd);
		
		Password2 carateress= new Password2 ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789ñÑ");
		
		System.out.println("Tamaño de la contraseña");
		int tamaños= sc.nextInt();
		String pswds= carateress.getPassword(tamaños);
		System.out.println(pswds);
	}	
}
