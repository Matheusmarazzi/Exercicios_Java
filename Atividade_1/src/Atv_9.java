import java.util.Scanner;
public class Atv_9 {
	
	
		public static void main(String[] args) {
			double sal,desc = 0, res, sal_real;
			 			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite o seu salario: ");
			sal = ler.nextDouble();
			if(sal >1200.01 && sal < 2500.00) {
				desc = 0.08;
			}else if(sal > 2500.01) {
				desc = 0.12;
			}
			res = sal * desc;
			sal_real = sal - res;
			System.out.println("O valor do imposto é "+res);
			System.out.println("O valor do salario descontado o imposto "+(sal_real));
		}
			
}

