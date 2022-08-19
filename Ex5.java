package Estrutura_Sequencial;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira a distância em metros para ser convertida: ");
		int metro = entrada.nextInt();
		
		System.out.println("A medida em centímetros é: "+(metro*100)+" cm.");
		
		entrada.close();
		
	}

}
