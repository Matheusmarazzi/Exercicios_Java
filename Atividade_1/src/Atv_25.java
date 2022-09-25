import java.util.Scanner;
public class Atv_25 {
	
	
		public static void main(String[] args) {
			int kilosma, kilosmo, totalki;
			double per, total,totalma,totalmo, desc;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira a quantidade em kilos do morango: ");
			kilosmo = ler.nextInt();
			System.out.println("Insira a quantidade em kilos da maca: ");
			kilosma = ler.nextInt();
			if(kilosma< 5) {
				totalma = kilosma * 1.80;
				System.out.println("total a pagar pela maçã é: "+totalma);
			}else{
				totalma = kilosma * 1.50;
				System.out.println("total a pagar pela maçã é: "+totalma);
			}
			if(kilosmo< 5) {
				totalmo = kilosmo * 2.50;
				System.out.println("total a pagar pelo morango é: "+totalmo);
			}else{
				totalmo = kilosmo * 2.20;
				System.out.println("total a pagar pelo morango é: "+totalmo);
			}
			totalki = kilosma + kilosmo;
			total = totalma + totalmo;
			if(totalki > 8 || total > 25.00) {
				desc = total * 0.10;
				total = total - desc;
			}
			System.out.println("total a pagar é: "+total);
		}
			
}

