package list;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SerieFavorita
{
	public static void main(String[] args) 
	{
		Set<Serie> minhasSeries = new HashSet<>();
		minhasSeries.add( new Serie("Breakking Bad", "Drama", 50)  );
		minhasSeries.add(new Serie("Friends", "Comedia", 20));
		minhasSeries.add(new Serie("Vampire Dies", "Drama", 50));
		
		Set<Serie> minhasSeries2 = new LinkedHashSet <>();
		minhasSeries2.add( new Serie("Breakking Bad", "Drama", 50)  );
		minhasSeries2.add(new Serie("Friends", "Comedia", 20));
		minhasSeries2.add(new Serie("Vampire Dies", "Drama", 50));
		for (Serie serie : minhasSeries2) System.out.println(serie);
		
		Set<Serie> minhasSeries3 = new TreeSet<>();
		minhasSeries3.add( new Serie("Breakking Bad", "Drama", 50)  );
		minhasSeries3.add(new Serie("Friends", "Comedia", 20));
		minhasSeries3.add(new Serie("Vampire Dies", "Ficticio", 50));
		
		System.out.println("Series em ordem de episodio : ");
		for (Serie serie3 : minhasSeries3) System.out.println(serie3);
		
		System.out.println("Series em ordem de Nome-Genero-Tempo Episodio : ");
				Set<Serie> minhasSeries4 = new TreeSet< >(new ComparatorNomeGeneroTempo());
				minhasSeries4.add( new Serie("Breakking Bad", "Drama", 50)  );
				minhasSeries4.add(new Serie("Vampire Dies", "Ficticio", 50));	
				minhasSeries4.add(new Serie("Friends", "Comedia", 20));
				
				for (Serie serie : minhasSeries4) System.out.println(serie);
					
				
				
				
	}
}




class Serie implements Comparable<Serie>
{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Serie(String nome, String genero, Integer tempoEpisodio)
	{
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome()
{
		return nome;
	}

	public String getGenero()
	{
		return genero;
	}

	public Integer getTempoEpisodio() 
	{
		return tempoEpisodio;
	}

	@Override
	public String toString() 
	{
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	@Override
	public int compareTo(Serie o) 
	{
		int tempEp = Integer.compare(this.getTempoEpisodio(), o.getTempoEpisodio());
		
		if(tempEp !=0)return tempEp;
		
		return this.getGenero().compareTo(o.getGenero()); 
	}
	
	
}

 class  ComparatorNomeGeneroTempo implements Comparator<Serie>
 {

	@Override
	public int compare(Serie o1, Serie o2) {
		int nome = o1.getNome().compareTo(o2.getNome());
		if(nome!=0)return nome ;
		
		int genero = o1.getGenero().compareTo(o2.getGenero());
		if(genero!= 0 ) return genero;
		
		int tempo = o1.getTempoEpisodio().compareTo(o2.getTempoEpisodio());
		
		
		return 0;
	}
	 
 }

