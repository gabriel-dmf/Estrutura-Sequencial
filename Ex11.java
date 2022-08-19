package Estrutura_Sequencial;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in);

		double pesoideal=0;
		
		System.out.print("Insira a sua altura: ");
		float altura = entrada.nextFloat();
				
		pesoideal= (72.7* altura)-58; 
		System.out.println("O seu peso ideal é: "+pesoideal);
	
		entrada.close();
	}

}
