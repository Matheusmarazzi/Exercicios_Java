
import java.util.Scanner;
public class Atv_1 {
	
	
		public static void main(String[] args) {
			int num;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira um numero:");
			num = ler.nextInt();
			if(num > 0) {
				System.out.println("Seu numero é positivo");
			}else {
				System.out.println("Seu numero é negativo");
			}
			
			
		
	}
}
