
import java.util.Scanner;
public class Atv_2 {
	
	
		public static void main(String[] args) {
			int num, res;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira um numero:");
			num = ler.nextInt();
			res = num % 2;
			if(res == 0) {
				System.out.println("Seu numero é par");
			}else {
				System.out.println("Seu numero é impar");
			}
			
			
		
	}
}
