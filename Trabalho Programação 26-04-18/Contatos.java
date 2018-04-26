import java.util.Scanner;

public class Contatos {
	String[][] aContatos;
	
	public Contatos() {
		System.out.println("Exercício 2");
		int qtdContatos =0;
		Scanner scan = new Scanner(System.in);
		while (qtdContatos<1) {
			System.out.println("Digite o numero de contatos (-1 para cancelar):");
			qtdContatos = scan.nextInt();
			if (qtdContatos == -1) {
				break;
			} else if (qtdContatos <1) {
				qtdContatos = 0;
			}
		}
		
		if (qtdContatos == -1) {
			System.out.println("PROGRAMA ENCERRADO");
		} else {
			aContatos = new String[qtdContatos][2];
			String nomeDigitado = "";
			String[] suporteString = {"nome","e-mail"};
			for (int i = 0; i < qtdContatos; i++) {
				
				for (int y =0; y < 2; y++) {
					boolean pass = false;
					while (!pass) {
						System.out.println("Digite o "+suporteString[y]+" do contato ("+i+") (-1 para cancelar):");
						nomeDigitado = scan.next();
						if (nomeDigitado.equals("-1")) {
							break;
						} else if (nomeDigitado.length() < 2 && y==0) {
							System.out.println("O nome deve ter 2 ou mais digitos :D");
							nomeDigitado = "";
						} else if (!nomeDigitado.contains("@") && y==1) {
							System.out.println("O e-mail deve possuir '@'!");
							nomeDigitado = "";
						} else {
							aContatos[i][y] = nomeDigitado;
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
					break;
				}
			}
			
			if (nomeDigitado.equals("-1")) {
				System.out.println("PROGRAMA ENCERRADO");
			} else {
				for (int i=0; i < qtdContatos; i++) {
					System.out.println(i+" -> "+ aContatos[i][0] + " ~~ " + aContatos[i][1]);
				}
			}
		}
	}
}