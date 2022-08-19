package Estrutura_Sequencial;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o comprimento do quadrado em metros: ");
		float comprimento = entrada.nextFloat();
		
		System.out.print("Insira a largura do quadrado em metros: ");
		float largura = entrada.nextFloat();
		
		System.out.println("A área do quadrado é: "+(comprimento*largura)+ " m²");
		
		entrada.close();
	}

}
