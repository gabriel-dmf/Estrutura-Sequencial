package Estrutura_Sequencial;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner (System.in);

		System.out.print("Insira o valor da sua hora trabalhada: ");
		float valorhora = entrada.nextFloat();
		System.out.print("Insira quantas horas você trabalhou este mês: ");
		float horatrabalhada = entrada.nextFloat();
		
		double salario= valorhora*horatrabalhada;
		double salarioinss = (salario/100)*8;
		double salariosind = (salario/100)*5;
		double salarioirpf = (salario/100)*11;
		double descontos = (salarioinss+salarioirpf+salariosind);
		
		System.out.println("Salário Bruto: R$: "+ (new DecimalFormat("#,##0.00").format(salario)+ " reais"));
		System.out.println("Descontos: ");
		System.out.println("Imposto de renda: R$: "+ (new DecimalFormat("#,##0.00").format(salarioirpf)+ " reais"));
		System.out.println("Inss: R$: "+ (new DecimalFormat("#,##0.00").format(salarioinss)+ " reais"));
		System.out.println("Sindicato: R$: "+(new DecimalFormat("#,##0.00").format (salariosind)+ " reais"));
		System.out.println("Descontos: R$: "+ (new DecimalFormat("#,##0.00").format (descontos)+ " reais"));
		System.out.println("Salário líquido: R$: "+ (new DecimalFormat("#,##0.00").format(salario-descontos)+ " reais"));
		
		entrada.close();
	}

}
