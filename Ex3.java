package Estrutura_Sequencial;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o primeiro n�mero: ");
		int num1 = entrada.nextInt();
		System.out.print("Insira o segundo n�mero: ");
		int num2 = entrada.nextInt();
		
		int soma = num1+num2;
		System.out.println("A soma dos dois n�meros �: "+ soma);
		
		entrada.close();
		
	}

}
