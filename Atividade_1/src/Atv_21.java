

import java.util.Scanner;
public class Atv_21 {
	
	
		public static void main(String[] args) {
			double n1,n2, n3,med_ex, apr;
			
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite  a nota 1:");
			n1 = ler.nextDouble();
			System.out.println("Digite  a nota 2:");
			n2 = ler.nextDouble();
			System.out.println("Digite  a nota 3:");
			n3 = ler.nextDouble();
			System.out.println("Digite  a media de exercicio:");
			med_ex = ler.nextDouble();
			apr = (n1+n2*2+n3*3+med_ex)/7; 
			if(apr > 9.0) {
				System.out.println(" conceito: A");
			}else if(apr >= 7.5 && apr < 9.0) {
				System.out.println(" conceito: B");
			}else if(apr >= 6.0 && apr < 7.5) {
				System.out.println(" conceito: C");
			}else if(apr < 6.0) {
				System.out.println(" conceito: D");
			}
			
		}
			
}


