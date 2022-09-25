import java.util.Scanner;
public class Atv_11 {
	
	
		public static void main(String[] args) {
			int A, B, C;
			
			
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira o numero 1:");
			A = ler.nextInt();
			System.out.println("Insira o numero 2:");
			B = ler.nextInt();
			System.out.println("Insira o numero 3:");
			C = ler.nextInt();
			
			if(A < B && B < C) {
				System.out.println(A+ "," +B+","+C);
			}else if(A < C && C < B){
				System.out.println(A+ "," +C+","+B);
			}else if(B < A && A < C){
				System.out.println(B+ "," +A+","+C);
			}else if(B < C && C < A){
				System.out.println(B+ "," +C+","+A);
			}else if(C < A && A < B){
				System.out.println(C+ "," +A+","+B);
			}else if(C < B && B < A){
				System.out.println(C+ "," +B+","+A);
			}
			
			
			
			
		
	}
}

