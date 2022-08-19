package Estrutura_Sequencial;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);
		
		System.out.print("Informe um número inteiro:");
		int num = entrada.nextInt();
		System.out.println("O número informado foi o "+num);
		
		entrada.close();
		
	}

}
