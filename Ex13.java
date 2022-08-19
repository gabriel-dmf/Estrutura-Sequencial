package Estrutura_Sequencial;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner entrada= new Scanner (System.in);
		
		float excesso =0;
		float multa =0;
		
		System.out.print("Insira quantos kilos de peixe foi pescado hoje:");
		float pescada = entrada.nextFloat();
		
		if (pescada > 50) {
			excesso =(pescada -50); 
			multa= excesso*4;
				
			System.out.println("Excesso de peso!");	
			System.out.println("Quantidade excedida: "+ excesso+ " kg.");
			System.out.println("Multa a pagar: "+(new DecimalFormat("#,##0.00").format(multa))+ " reais.");
		}else if (pescada == 50){
			System.out.println("Quantidade excedida: Zero");
			System.out.println("Multa a pagar: Zero");
		}else if (pescada<50) {
			System.out.println("Quantidade excedida: Negativo");
			System.out.println("Multa a pagar: Zero");
		}
		entrada.close();
	}

}
