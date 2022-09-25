import java.util.Scanner;
public class Atv_19 {
	
	
		public static void main(String[] args) {
			int Qtde;
			double pag, preco;
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite quantas maças quer comprar:");
			Qtde = ler.nextInt();
			if(Qtde < 12) {
				preco = 1.30;
				pag = Qtde * preco;
				
			System.out.println(" valor a pagar R$"+pag);
			}else {
				preco = 1.00;
				pag = Qtde * preco;
				
			System.out.println(" valor a pagar R$"+pag);
			}
			
		}
			
}

