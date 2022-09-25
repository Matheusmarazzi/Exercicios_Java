import java.util.Scanner;
public class Atv_7 {
	
	
		public static void main(String[] args) {
			double n1,n2,n3,n4,EX, media1,media2;
			String nome;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira a nome:");
			nome = ler.next();
			System.out.println("Insira a nota 1:");
			n1 = ler.nextDouble();
			System.out.println("Insira a nota 2:");
			n2 = ler.nextDouble();
			System.out.println("Insira a nota 3:");
			n3 = ler.nextDouble();
			System.out.println("Insira a nota 4:");
			n4 = ler.nextDouble();
			media1 = (n1+n2+n3+n4)/4;
			if(media1 >=7) {
				System.out.println(nome+" aprovado com a media:"+media1);
			}else {
				System.out.println("Digite a nota de exame:");
				EX = ler.nextDouble();
				media2 = (media1 + EX)/2;
				if(media2 >= 5){
					System.out.println(nome+" Aprovado no exame com a media:"+media2);
				}else {
					System.out.println(nome+" Reprovado no exame com a media:"+media2);
				}
			}
			
			
			}
			
}

