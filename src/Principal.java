import java.util.Scanner;

public class Principal {

	static Scanner sc= new Scanner(System.in);
	public static void main (String [] args) {
	
		Password caracteres= new Password ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
		
		System.out.println("Tama�o de la contrase�a");
		int tama�o= sc.nextInt();
		
		String pswd= caracteres.getPassword(tama�o);
		System.out.println(pswd);
		
		Password2 carateress= new Password2 ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789��");
		
		System.out.println("Tama�o de la contrase�a");
		int tama�os= sc.nextInt();
		String pswds= carateress.getPassword(tama�os);
		System.out.println(pswds);
	}	
}
