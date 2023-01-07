package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Colaborador;
import entities.terceirizado;

public class administraçãoColaborador {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		List <Colaborador> list = new ArrayList<>();
		
		System.out.print("Digite o numero de funcionarios: ");
		int n = leitor.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Dados do funcionario #" + i + ":" );
			System.out.print("O funcionario e terceirizado(S/N)? ");
			char ch = leitor.next().charAt(0);
			System.out.print("Nome: ");
			leitor.nextLine();
			String nome = leitor.nextLine();
			System.out.print("Horas: ");
			int horas = leitor.nextInt();
			System.out.print("Valor por hora? ");
			double valorPorHora = leitor.nextDouble();
			if (ch == 'S') {
				System.out.println("Cobrança adicional");
				double cobrançaAdicional = leitor.nextDouble();
				list.add(new terceirizado(nome, horas, valorPorHora, cobrançaAdicional));
			}
			else {
				list.add(new Colaborador(nome, horas, valorPorHora));
			}
		}
		System.out.println();
		System.out.println("PAGAMENTO:");
		for(Colaborador co: list) {
			System.out.println(co.getNome() + " - $ " + String.format("%.2f", co.pagamento()));
		}
		
		
		
		
		leitor.close();
	}

}
