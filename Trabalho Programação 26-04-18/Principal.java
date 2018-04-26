import java.util.Scanner;
public class Principal {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int exerciseNumber = -1;
		while (exerciseNumber != 0) {
			System.out.println("Digite o exercício que quer abrir:");
			System.out.println("01 - Exercício 1 - clientes!");
			System.out.println("02 - Exercício 2 - nome e email!");
			System.out.println("03 - Exercício 3 - media das notas!");
			System.out.println("00 - Encerra");
			
			exerciseNumber = scan.nextInt();
			System.out.println("");
			
			switch (exerciseNumber) {
				case 1: Clientes exercicio1 = new Clientes();
					break;
			
				case 2: Contatos exercicio2 = new Contatos();
					break;

				case 3: Media exercicio3 = new Media();
					break;
					
				case 0: System.out.println("Encerrando!");
					exerciseNumber = 0;
					break;
			
				default: System.out.println("Exercício inválido!");
					break;
				
			}
		}
	}
	
	
}