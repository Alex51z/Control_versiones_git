import java.util.Scanner;

public class Principal {

	static Scanner sc= new Scanner(System.in);
	public static void main (String [] args) {
		boolean salir= false;
		
		Password caracteres= new Password ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
		
		System.out.println("Sin caracteres especiales");
		System.out.println("Tamaño de la contraseña");
		int tamaño= sc.nextInt();
		
		String pswd= caracteres.getPassword(tamaño);
		if (pswd.length()>10) {
			PasswordValiada(salir, tamaño, pswd);
			System.out.println(pswd+" Password fuerte: true");
		}else {
			PasswordValiada(salir, tamaño, pswd);
			System.out.println(pswd+" Password fuerte: false");
		}
		
		Password2 carateress= new Password2 ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789ñÑ");
		System.out.println("Con caracteres especiales");
		System.out.println("Tamaño de la contraseña");
		int tamaños= sc.nextInt();
		String pswds= carateress.getPassword(tamaños);
		System.out.println(pswds);
		if (pswds.length()>10) {
			PasswordValiadas(salir, tamaños, pswds);
			System.out.println(pswds+" Password fuerte: true");
		}else {
			PasswordValiadas(salir, tamaños, pswds);
			System.out.println(pswds+" Password fuerte: false");
		}
	
	}
	
	public static void PasswordValiadas(boolean salir, int tamaño, String pswd) {
		int Mayusculas=1;
		int Minusculas=2;
		int Numeros=1;
		int Char_especial=1;
		int contadorMayusculas=0;
		int contadorMinusculas=0;
		int contadorNumeros=0;
		int contadorEspecial=0;


		for (int i=0; i < pswd.length(); i++ ) {
		char c = pswd.charAt(i);
		if(Character.isUpperCase(c))
		contadorMayusculas++;
		else if(Character.isLowerCase(c))
		contadorMinusculas++;
		else if(Character.isDigit(c))
		contadorNumeros++;
		if(c>=33&&c<=46||c==64){
		contadorEspecial++;
		}

		}

		if (pswd.length() >= tamaño && contadorMayusculas >= Mayusculas && contadorMinusculas >= Minusculas && contadorNumeros >= Numeros && contadorEspecial >= Char_especial) {
			System.out.println("Contraseña válida");
			salir = true;
		}
		else {
			System.out.println("Tu contraseña no es valida necesita lo siguiente:");
			if (contadorMinusculas < Minusculas)
				System.out.println("Necesita al menos 2 minusculas");
				if (contadorMayusculas < Mayusculas)
					System.out.println("Necesita al menos una mayuscula");
					if (contadorNumeros < Numeros)
						System.out.println("Necesita al menos 1 número");
						if(contadorEspecial < Char_especial)
							System.out.println("Necesita al menos un carater especial");

		}while(!salir);
	}
	
	public static void PasswordValiada(boolean salir, int tamaño, String pswd) {
		int Mayusculas=1;
		int Minusculas=2;
		int Numeros=1;
		int Char_especial=1;
		int contadorMayusculas=0;
		int contadorMinusculas=0;
		int contadorNumeros=0;


		for (int i=0; i < pswd.length(); i++ ) {
		char c = pswd.charAt(i);
		if(Character.isUpperCase(c))
		contadorMayusculas++;
		else if(Character.isLowerCase(c))
		contadorMinusculas++;
		else if(Character.isDigit(c))
		contadorNumeros++;
		}

		if (pswd.length() >= tamaño && contadorMayusculas >= Mayusculas && contadorMinusculas >= Minusculas && contadorNumeros >= Numeros) {
			System.out.println("Contraseña válida");
			salir = true;
		}
		else {
			System.out.println("Tu contraseña no es valida necesita lo siguiente:");
			if (contadorMinusculas < Minusculas)
				System.out.println("Necesita al menos 2 minusculas");
				if (contadorMayusculas < Mayusculas)
					System.out.println("Necesita al menos una mayuscula");
					if (contadorNumeros < Numeros)
						System.out.println("Necesita al menos 1 número");
		}while(!salir);
	}	
}
