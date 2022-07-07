import java.util.Scanner;

public class TF1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite algo para ser invertido: ");
		String n = sc.nextLine();// "texto"
								 //  01234	
		int frase = n.length();
		
		
		for(int i=frase-1; i >= 0; i--) {
			System.out.printf("%c ", n.charAt(i));
		}
		
				
		sc.close();
	}
}
