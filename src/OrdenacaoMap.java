package list;
import java.util.*;
import java.util.Map;

public class OrdenacaoMap 
{
	public static void main(String[] args) 
	{
		System.out.println("---Ordem Aleatória com somente autor e livro ---");
		HashMap<String , Livro> meusLivros = new HashMap<>();
		meusLivros.put("Harari,Yuval", new Livro("21 lições para o século 21", 432));
		meusLivros.put("Hawking,Stephen", new Livro("Uma breve história do tempo", 425));
		meusLivros.put("Duhigg,Charles", new Livro("O poder do hábito", 408));
		
		for ( java.util.Map.Entry<String,Livro> entry : meusLivros.entrySet() )
		{
			System.out.println("-----Nome do autor e livro ---"+ entry.getKey()+"--" +entry.getValue().getNome());
		}
		
		System.out.println("Ordem de inserção");
		Map<String , Livro> meusLivros2 = new LinkedHashMap<>();
		meusLivros2.put("Harari,Yuval", new Livro("21 lições para o século 21", 432));
		meusLivros2.put("Hawking,Stephen", new Livro("Uma breve história do tempo", 425));
		meusLivros2.put("Duhigg,Charles", new Livro("O poder do hábito", 408));
		System.out.println(meusLivros2);
		
		System.out.println("---Ordem alfabética autores---");
		
		Map<String , Livro> meusLivros3 = new TreeMap<>() ;
		meusLivros3.put("Harari,Yuval", new Livro("21 lições para o século 21", 432));
		meusLivros3.put("Hawking,Stephen", new Livro("Uma breve história do tempo", 425));
		meusLivros3.put("Duhigg,Charles", new Livro("O poder do hábito", 408));
		
		for ( java.util.Map.Entry<String,Livro> entry : meusLivros3.entrySet() )
		{
			System.out.println("-----Nome do autor e livro ---"+ entry.getValue().getNome()+"--" +entry.getValue().getPaginas());
		}
		
		System.out.println("-----Ordem alfabetica nome dos livros---");
		
		Set<Map.Entry<String , Livro>> livroSet = new TreeSet<>(new ComparatorNomeLivro ());
		livroSet.addAll(meusLivros.entrySet());
		System.out.println(livroSet);
		
		System.out.println("-----Ordem Páginas dos livros---");
		Set<Map.Entry<String , Livro>> livroSet2 = new TreeSet<>(new ComparatorPaginas ());
		livroSet2.addAll(meusLivros.entrySet());
		System.out.println(livroSet2);
		
	}
}

class Livro 
{
	private String nome ;
	private Integer paginas ;
	
	public Livro(String nome, Integer paginas) 
	{
		super();
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() 
	{
		return nome;
	}


	public Integer getPaginas() 
	{
		return paginas;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}

	@Override
	public String toString() 
	{
		return " livro-----nome = " + nome + ", paginas = " + paginas + "----------";
	}


	
}

	 class ComparatorNomeLivro implements Comparator<Map.Entry<String , Livro>  >
	 {

		@Override
		public int compare(java.util.Map.Entry<String, Livro> o1, java.util.Map.Entry<String, Livro> o2)
		{
			
			return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
		}
		 
	 }
	 
	 class ComparatorPaginas implements Comparator<Map.Entry<String , Livro> >
	 {

		@Override
		public int compare(java.util.Map.Entry<String, Livro> o1, java.util.Map.Entry<String, Livro> o2) 
		{
			
			
			return o1.getValue().getPaginas().compareTo(o2.getValue().getPaginas())	;
		}
		 
	 }


	

