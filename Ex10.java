package Estrutura_Sequencial;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o primeiro número: ");
		float num1 = entrada.nextFloat();
		System.out.print("Insira o segundo número: ");
		float num2 = entrada.nextFloat();
		System.out.print("Insira o terceiro número: ");
		float num3 = entrada.nextFloat();
		
		
		System.out.println("O produto do dobro do primeiro número com metade do segundo é: "+ ((2*num1)*(num2/2)));
		System.out.println("A soma do triplo do primeiro com o terceiro é: "+((3*num1)+num3)+".");
		System.out.println("O terceiro número elevado ao cubo é: "+ (Math.pow(num3, 3)));
	
		entrada.close();
	}

}
