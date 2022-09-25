import java.util.Scanner;
public class Atv_13 {
	
	
		public static void main(String[] args) {
			int A, B, C,D;
				
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira o numero 1:");
			A = ler.nextInt();
			System.out.println("Insira o numero 2:");
			B = ler.nextInt();
			System.out.println("Insira o numero 3:");
			C = ler.nextInt();
			System.out.println("Insira o numero 4:");
			D = ler.nextInt();
			if((A % 2) == 0 || (A % 3) == 0){
				System.out.println(A);
			}
			if((B % 2) == 0 || (B % 3) == 0){
				System.out.println(B);
			}
			if((C % 2) == 0 || (C % 3) == 0){
				System.out.println(C);
			}
			if((D % 2) == 0 || (D % 3) == 0){
				System.out.println(D);
			}
			
			
			
			
			
			
		
	}
}

