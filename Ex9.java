package Estrutura_Sequencial;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira a temperatura em Farenheit para ser convertida: ");
		float Farenheit = entrada.nextFloat();
			
		System.out.println("A temperatura Farenheit convertida em Celsius é: "+(5*(Farenheit-32)/9)+ " Celsius");
		
		entrada.close();
	}

}
