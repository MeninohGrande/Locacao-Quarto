package aplication;

import java.util.Scanner;

import entities.Locacao;

public class Aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locacao[] lc = new Locacao[10];
		int cont = 0;
		
		do {
			for(int i = 0; i <lc.length; i++) {
					
					System.out.println("Qual quarto deseja alugar? ");
					System.out.print("Opção disponiveis: ");
				
					String numQuarto = "1 2 3 4 5 6 7 8 9 10 ";
						for(int q = 0; q < lc.length; q++) {
							if (lc[q] != null) {
							numQuarto =	numQuarto.replace(lc[q].getNumQuarto() + " ", "X ");
							}
						}
					cont++;
					System.out.print(numQuarto.trim());
					System.out.println();
					System.out.print("Numero do quarto: ");
						int nQuarto = sc.nextInt();
					System.out.print("Nome: ");
						String nome = sc.next();
					System.out.print("Mail: ");
						String mail = sc.next();
						
					lc[i] = new Locacao(i, nQuarto, nome, mail);
					// System.out.println("Confirme: " + numQuarto.replace(lc[i].getNumQuarto() + " ", "reposto"));
				}
		}while (cont < lc.length);
		
		for(int p = 0; p < lc.length; p++) {
			System.out.println("Aluguel: 	#" + (p+1));
			System.out.println("Nome: 		" + lc[p].getUser().getNome());
			System.out.println("Email: 		" + lc[p].getUser().getMail());
			System.out.println("Quarto: 	#" + (lc[p].getNumQuarto()));
			System.out.println("##############");
		}
		
		sc.close();
	
	}
	
	
}
