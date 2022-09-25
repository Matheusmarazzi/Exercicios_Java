import java.util.Scanner;
public class Atv_14 {
	
	
		public static void main(String[] args) {
			int ano_at, nasc;
			
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira o ano atual:");
			ano_at = ler.nextInt();
			System.out.println("Insira o ano de nascimento:");
			nasc = ler.nextInt();
			if((ano_at - nasc) < 18) {
				System.out.println("Voce não podera votar esse ano.");
			
			
				}else {
				System.out.println("Voce podera votar esse ano.");
				}
			}
			
}

