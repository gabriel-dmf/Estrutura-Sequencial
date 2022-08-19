package Estrutura_Sequencial;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o tamanho da �rea a ser pintada em metros quadrados: ");
		float tamanho = entrada.nextFloat();
		
		float cobertura = (tamanho/6);
		float lata = (cobertura/18);
		float galao = (float) (cobertura/3.6);
		double valortotallata= (lata*80);
		double valortotalgalao = (galao*25);
		
		System.out.println("A quantidade de latas necess�rias para pintar "+tamanho+ " m�. � de :  " + (Math.round(lata*100.0)/100.0) +" latas.");
		System.out.println("Valor total para latas: "+(new DecimalFormat("#,##0.00").format(valortotallata)));
		System.out.println("A quantidade de latas necess�rias para pintar "+tamanho+ " m�. � de :  " + (Math.round(galao*100.0)/100.0) +" gal�es.");
		System.out.println("Valor total para gal�es : "+(new DecimalFormat("#,##0.00").format(valortotalgalao)));

		entrada.close();
	}

}
