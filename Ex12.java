package Estrutura_Sequencial;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira a sua altura: ");
		float altura = entrada.nextFloat();
		System.out.print("Digite o seu sexo: 1- Homem  2- Mulher");
		int sexo = entrada.nextInt();
		
		double pesoideal=0;
		
		if(sexo==1) {
			pesoideal= (72.7* altura)-58; 
		}else if(sexo == 2){
			pesoideal = (62.1*altura)-44.7;
		}
		System.out.println("O seu peso ideal é: "+pesoideal);
	
		entrada.close();
	}

}
