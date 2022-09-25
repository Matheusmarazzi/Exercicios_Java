import java.util.Scanner;
public class Atv_3 {
	
	
		public static void main(String[] args) {
			int h;
			double res = 0;
			String sex;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira seu sexo:");
			sex = ler.next();
			System.out.println("Insira sua altura em metros:");
			h = ler.nextInt();
			if(sex.equals("feminino")) {
				res = (62.1 * h) - 44.7;
			}else if(sex.equals("masculino")) {
				res = (72.7 * h) - 58;
			}
			System.out.println("Seu peso ideal é:"+res);
			
			
			
		
	}
}

