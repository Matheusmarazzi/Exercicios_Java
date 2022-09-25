import java.util.Scanner;
public class Atv_4 {
	
	
		public static void main(String[] args) {
			int idade;
			String categoria;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira a idade:");
			idade = ler.nextInt();
			if(idade >= 5 && idade <= 7){
				categoria = "Infantil A";
			}else if (idade >= 8 && idade <= 11 ){
				categoria = "Infantil B";
			}else if(idade >= 12 && idade <= 13 ){
				categoria = "juvenil A";
			}else if(idade >= 14 && idade <= 17){
				categoria = "juvenil B";
			}else if(idade >= 18){
				categoria = "adulto";
			}else{
				categoria = "idade invalida";
			}
			System.out.println(" sua categoria é:"+categoria);
			
			
			}
			
}

