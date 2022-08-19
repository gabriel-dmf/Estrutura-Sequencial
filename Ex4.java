package Estrutura_Sequencial;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		
		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o primeiro nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Insira o segundo nota: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Insira a terceira nota: ");
		float nota3 = entrada.nextFloat();
		System.out.print("Insira a quarta nota: ");
		float nota4 = entrada.nextFloat();
		
		float media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A soma dos dois números é: "+ media);
	
		entrada.close();
	}

}
