import java.util.Scanner;
public class Atv_5 {
	
	
		public static void main(String[] args) {
			int codigo;
			String nome, cargo = "",per= "";
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira o codigo:");
			codigo = ler.nextInt();
			System.out.println("Insira o nome:");
			nome = ler.next();
			switch (codigo) {
			  case 1:
			    per = "50%";
			    cargo ="Escriturário";
			    break;
			  case 2:
				  per = "35%";
				  cargo ="Secretário";
			    break;
			  case 3:
				  per = "20%";
				  cargo ="Caixa";
			    break;
			  case 4:
				  per = "10%";
				  cargo ="Gerente";
			    break;
			  case 5:
				  per = "Não tem aumento";
				  cargo ="Diretor";
			    break;
			}
			System.out.println(nome+", cargo: "+cargo+" tera o aumento de: "+per);
			
			}
			
}

