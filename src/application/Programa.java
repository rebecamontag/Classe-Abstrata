package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PagadorImposto;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<PagadorImposto> lista = new ArrayList<>();
		
		double acm = 0;
		
		
		System.out.print("Digite o número de contribuintes: ");
		int contribuintes = sc.nextInt();
		
		for (int i = 1; i <= contribuintes; i++) {
			System.out.println("Dados do #" + i + " contribuinte:");
			System.out.print("Pessoa física ou pessoa jurídica (f/j)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			double renda = sc.nextDouble();
				if(resp == 'f') {
					System.out.print("Gasto com saúde: ");
					double gasto = sc.nextDouble();
					lista.add(new PessoaFisica(nome, renda, gasto));
				} else {
					System.out.print("Número de funcionários: ");
					int num = sc.nextInt();
					lista.add(new PessoaJuridica(nome, renda, num));
				}
		}
		
		System.out.println();
		System.out.println("TAXAS:");
		for(PagadorImposto p : lista) {
			System.out.println(p.getNome() + ": $ " + String.format("%.2f", p.taxa()));
		}
		
		System.out.println();
		for(PagadorImposto p : lista) {
			acm += p.taxa();
		}
		System.out.print("Total de Taxas: $ " + String.format("%.2f",acm));
		
		
		sc.close();

	}

}
