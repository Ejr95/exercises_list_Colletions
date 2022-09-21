package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args)
	{
	
		Scanner scan = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		{{	
			
			System.out.println("Informe respectivamente, o nome, sexo e idade.");
			pessoas.add(new Pessoa(scan.next(), scan.next(), scan.nextInt()));
			System.out.println("Informe respectivamente, o nome, sexo e idade.");
			pessoas.add(new Pessoa(scan.next(), scan.next(), scan.nextInt()));
			System.out.println("Informe respectivamente, o nome, sexo e idade.");
			pessoas.add(new Pessoa(scan.next(), scan.next(), scan.nextInt()));
		}};
		System.out.println(pessoas);
		
		
		
		scan.close();
		
		
		
		
	}

}

	class Pessoa
	{
		private String nome;
		private String sexo;
		private Integer idade;
		public Pessoa(String nome, String sexo, Integer idade) {
			super();
			this.nome = nome;
			this.sexo = sexo;
			this.idade = idade;
		}
		public String getNome() {
			return nome;
		}
		public String getSexo() {
			return sexo;
		}
		public Integer getIdade() {
			return idade;
		}
		@Override
		public String toString() {
			return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
		}
		
		
		
	}