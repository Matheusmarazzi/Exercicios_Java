import java.util.Scanner;
public class Atv_12 {
	
	
		public static void main(String[] args) {
			int A, B, C,D,E, maior=0, menor=0;
			
			
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira o numero 1:");
			A = ler.nextInt();
			System.out.println("Insira o numero 2:");
			B = ler.nextInt();
			System.out.println("Insira o numero 3:");
			C = ler.nextInt();
			System.out.println("Insira o numero 4:");
			D = ler.nextInt();
			System.out.println("Insira o numero 5:");
			E = ler.nextInt();
			
			if(A < B && A < C && A < D && A < E ) {
				menor = A;	
			}
			if(A > B && A > C && A > D && A > E ) {
				maior = A;	
			}
			if(B < A && B < C && B < D && B < E ) {
				menor = B;	
			}
			if(B > A && B > C && B > D && B > E ) {
				maior = B;	
			}
			if(C < A && C < B && C < D && C < E ) {
				menor = C;	
			}
			if(C > A && C > B && C > D && C > E ) {
				maior = C;	
			}
			if(D < A && D < B && D < C && D < E ) {
				menor = D;	
			}
			if(D > A && D > B && D > C && D > E ) {
				maior = D;	
			}
			if(E < A && E < B && E < D && E < C ) {
				menor = E;	
			}
			if(E > A && E > B && E > C && E > D ) {
				maior = E;	
			}
			System.out.println("maior: "+maior);
			System.out.println("menor: "+menor);
			
			
			
			
			
			
		
	}
}

