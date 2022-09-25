import java.util.Scanner;
public class Atv_23 {
	
	
		public static void main(String[] args) {
			int litros;
			String tipo;
			double per, total, desc;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira o tipo de combustivel: ");
			tipo = ler.next();
			System.out.println("Insira a quantidade em litros: ");
			litros = ler.nextInt();
			if(tipo.equals("gasolina") && litros < 20) {
				per = 0.04;
				total = litros * 2.20;
				desc = total * per;
				total = total - desc;
				System.out.println("total a pagar é: "+total);
			}else if(tipo.equals("gasolina") && litros > 20) {
				per = 0.06;
				total = litros * 2.20;
				desc = total * per;
				total = total - desc;
				System.out.println("total a pagar é: "+total);
			}else if(tipo.equals("alcool") && litros < 20) {
				per = 0.03;
				total = litros * 1.90;
				desc = total * per;
				total = total - desc;
				System.out.println("total a pagar é: "+total);
			}else if(tipo.equals("alcool") && litros > 20) {
				per = 0.05;
				total = litros * 1.90;
				desc = total * per;
				total = total - desc;
				System.out.println("total a pagar é: "+total);
			}
			
			
			}
			
}

