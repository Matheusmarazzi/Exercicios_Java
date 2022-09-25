import java.util.Scanner;
public class Atv_8 {
	
	
		public static void main(String[] args) {
			int idade1, idade2,idade3;
			double media;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira a idade da pessoa 1:");
			idade1 = ler.nextInt();
			System.out.println("Insira a idade da pessoa 2:");
			idade2 = ler.nextInt();
			System.out.println("Insira a idade da pessoa 3:");
			idade3 = ler.nextInt();
			media = (idade1+idade2+idade3)/3;
			if(media >= 50) {
				System.out.println(" media maior que 50 anos");
				
			}else {
				System.out.println(" media menor que 50 anos");
			}
			
			
			
			}
			
}


