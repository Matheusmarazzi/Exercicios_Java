import java.util.Scanner;
public class Atv_6 {
	
	
		public static void main(String[] args) {
			int A, B, res ;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira o primeiro numero:");
			A = ler.nextInt();
			System.out.println("Insira o segundo numero:");
			B = ler.nextInt();
			if(A > B){
				res = A - B;
			}else{ 
				res = B - A;
			}
			System.out.println("A diferença dos numeros é: "+res);
		}
	}

