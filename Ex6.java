package Estrutura_Sequencial;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o raio para calcular a área do círculo: ");
		float raio = entrada.nextFloat();
		
		System.out.println("A área do círculo é: "+(3.14*(Math.pow(raio, raio))));
		
		entrada.close();
	}

}
