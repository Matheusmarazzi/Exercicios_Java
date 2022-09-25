import java.util.Scanner;
public class Atv_24 {
	
	
		public static void main(String[] args) {
			int H1, H2, M1,M2, m_velho=0, h_velho=0, m_novo=0,h_novo=0, soma1, soma2 ;
				
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira a idade do homem 1:");
			H1 = ler.nextInt();
			System.out.println("Insira a idade do homem 2:");
			H2 = ler.nextInt();
			System.out.println("Insira a idade da mulher 1:");
			M1 = ler.nextInt();
			System.out.println("Insira a idade da mulher 2:");
			M2 = ler.nextInt();
			if (H1 > H2) {
				h_velho = H1;
				h_novo = H2;
			}else {
				h_velho = H2;
				h_novo = H1;
			}
			if (M1 > M2) {
				m_velho = M1;
				m_novo = M2;
			}else {
				m_velho = M2;
				m_novo = M1;
			}
			soma1 = h_velho + m_novo;
			soma2 = m_velho + h_novo;
			System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: "+soma1);
			System.out.println("A soma da idade da mulher mais velha com o homem mais novo é: "+soma2);
			
			
			
			
			
			
		
	}
}

