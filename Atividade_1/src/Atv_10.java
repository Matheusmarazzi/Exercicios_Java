import java.util.Scanner;
public class Atv_10 {
	
	
		public static void main(String[] args) {
			int num;
			
			
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira o numero:");
			num = ler.nextInt();
			
			if(num > 0) {
				System.out.println(num);
			}else{
				num = (num-num)-num;
				System.out.println(num);
			}
			
			
			
			
		
	}
}

