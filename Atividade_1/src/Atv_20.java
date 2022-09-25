
import java.util.Scanner;
public class Atv_20 {
	
	
		public static void main(String[] args) {
			int gols1,gols2;
			String time1, time2;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite  o nome do primeiro time:");
			time1 = ler.next();
			System.out.println("Digite  a quantidade de gols desse time:");
			gols1 = ler.nextInt();
			
			System.out.println("Digite  o nome do segundo time:");
			time2 = ler.next();
			System.out.println("Digite  a quantidade de gols desse time:");
			gols2 = ler.nextInt();
			
			if(gols1 > gols2) {
			System.out.println(time1+" é o vencedor!!");
			}else if(gols1 < gols2) {
				System.out.println(time2+" é o vencedor!!");
			}else {
				System.out.println(" EMPATE");
			}
			
		}
			
}

