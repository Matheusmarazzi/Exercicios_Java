import java.util.Scanner;
public class Atv_22 {
		public static void main(String[] args) {
			double sal_b, vendas, comissao;
			
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira o salario base:");
			sal_b = ler.nextDouble();
			System.out.println("Insira o valor de vendas:");
			vendas = ler.nextDouble();
			
			if(vendas <= 1500.00) {
				comissao = vendas * 0.03;
				sal_b = sal_b + comissao;
				System.out.println("o salario total é: "+sal_b);
			}else if(vendas > 1500.00) {
				comissao = vendas * 0.05;
				sal_b = sal_b + comissao;
				System.out.println("o salario total é: "+sal_b);
			}
			
		}
			
}

