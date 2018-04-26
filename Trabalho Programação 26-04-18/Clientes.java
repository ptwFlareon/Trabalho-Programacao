import java.util.Scanner;

public class Clientes {
	String[] aCliente;
	
	public Clientes() {
		System.out.println("Exercicio 1");
		int qtdClientes =0;
		Scanner scan = new Scanner(System.in);
		while (qtdClientes<1) {
			System.out.println("Digite o numero de clientes (-1 para cancelar):");
			qtdClientes = scan.nextInt();
			if (qtdClientes == -1) {
				break;
			} else if (qtdClientes <1) {
				qtdClientes = 0;
			}
		}
		
		if (qtdClientes == -1) {
			System.out.println("PROGRAMA ENCERRADO");
		} else {
			aCliente = new String[qtdClientes];
			String nomeDigitado = "";
			for (int i = 0; i < qtdClientes; i++) {
				
				boolean pass = false;
				while (!pass) {
					System.out.println("Digite o nome do cliente ("+i+") (-1 para cancelar):");
					nomeDigitado = scan.next();
					if (nomeDigitado.equals("-1")) {
						break;
					} else if (nomeDigitado.length() < 2) {
						System.out.println("O nome deve ter 2 ou mais digitos :D");
						nomeDigitado = "";
					} else {
						aCliente[i] = nomeDigitado;
						System.out.println("Cadastrado com sucesso");
						nomeDigitado= "";
						pass = true;
					}
				}
				
				if (nomeDigitado.equals("-1")) {
					break;
				}
				
			}
			
			if (nomeDigitado.equals("-1")) {
				System.out.println("PROGRAMA ENCERRADO");
			} else {
				for (int i=0; i < qtdClientes; i++) {
					System.out.println(i+" -> "+ aCliente[i]);
				}
			}
		}
	}
}