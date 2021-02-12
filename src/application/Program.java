package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.funcionario;
import entities.funcionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<funcionario> list = new ArrayList<>();
		
		System.out.print("Digite o número de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionario #" + i + ":" );
			System.out.print("O funcionario é terceirizado (s/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.println("Valor por hora: ");
			double valorPorHoras = sc.nextDouble();
			if(ch == 'y') {
				System.out.println("valor adicional: ");
				double valorAdicional = sc.nextDouble(); 
				list.add(new funcionarioTerceirizado(nome, horas, valorPorHoras, valorAdicional));
			}
			else {
				list.add(new funcionario(nome, horas, valorPorHoras));
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		for(funcionario fun : list) {
			System.out.println(fun.getNome() + " - $" + String.format("%.2f", fun.pagamento()));
		}
		
		sc.close();

	}

}
