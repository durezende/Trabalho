import java.util.Scanner;

public class TF2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário: ");
		double salario = sc.nextDouble();
		System.out.println("Digite a quantidade de quilowats gasta: ");
		double qw = sc.nextDouble();
		
		double r = salario/7;
		
		double pqw = (1*r)/100;
		System.out.println("O valor em reais de cada quilowatt é:" + " R$" + pqw);
		
		double conta = (pqw*qw);
		System.out.println("O valor em reais a ser pago é: " + " R$" + conta);
		
		conta = (conta - conta*10/100);
		System.out.println("O valor em reais a ser pago com desconto: " + " R$" + conta);
		
		
		
		sc.close();
	}
}


