package Estrutura_Sequencial;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o primeiro n�mero: ");
		float num1 = entrada.nextFloat();
		System.out.print("Insira o segundo n�mero: ");
		float num2 = entrada.nextFloat();
		System.out.print("Insira o terceiro n�mero: ");
		float num3 = entrada.nextFloat();
		
		
		System.out.println("O produto do dobro do primeiro n�mero com metade do segundo �: "+ ((2*num1)*(num2/2)));
		System.out.println("A soma do triplo do primeiro com o terceiro �: "+((3*num1)+num3)+".");
		System.out.println("O terceiro n�mero elevado ao cubo �: "+ (Math.pow(num3, 3)));
	
		entrada.close();
	}

}
