package Estrutura_Sequencial;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o tamanho da área a ser pintada em metros quadrados: ");
		float tamanho = entrada.nextFloat();
		
		float cobertura = (tamanho/3);
		float tinta = (cobertura/18);
		double valortotal= (tinta*80);
		
		System.out.println("A quantidade de latas necessárias para pintar "+tamanho+ " m². é de :  " + (Math.round(tinta*100.0)/100.0) +" latas.");
		System.out.println("Valor total: "+(new DecimalFormat("#,##0.00").format(valortotal)));
	
		entrada.close();
	}

}
