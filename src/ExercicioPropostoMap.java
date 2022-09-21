package list;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;;

public class ExercicioPropostoMap
{
	public static void main(String[] args) 
	{
		Map<Integer, Contado> agenda = new HashMap<>();
		agenda.put(3, new Contado("Mel", 1224343));
		agenda.put(1, new Contado("Elizeu", 1224343));
		agenda.put(5, new Contado("Aline", 1224343));
		
		System.out.println("--Ordem Aleatória--");
		for (java.util.Map.Entry<Integer, Contado > entries : agenda.entrySet())
		System.out.println( entries.getValue().getNome()+"-"+ entries.getValue().getNumero()  );
		
		System.out.println("--Ordem de Inserção--");	
		
		Map<Integer, Contado> agenda1 = new LinkedHashMap<>();
		agenda1.put(5, new Contado("Aline", 1224343));
		agenda1.put(1, new Contado("Elizeu", 145345454));
		agenda1.put(3, new Contado("Mel", 94347382));
		
		for (java.util.Map.Entry<Integer, Contado > entries : agenda1.entrySet())
		System.out.println( entries.getValue().getNome()+"-"+ entries.getValue().getNumero()  );
		
		System.out.println("--Ordem de Id--");
		Map<Integer, Contado> agenda2 = new TreeMap<>(agenda1);
		System.out.println(agenda2);
		
		System.out.println("--Ordem numero de Telefone--");
		Set<Map.Entry<Integer , Contado>> agenda3 = new TreeSet<>(new ComparatorNumero ());
		agenda3.addAll(agenda1.entrySet());
		
		for (java.util.Map.Entry<Integer, Contado > entries : agenda3)
			System.out.println( entries.getValue().getNome()+"-"+ entries.getValue().getNumero()  );
		
		System.out.println("--Ordem numero de Telefone segunda forma--");
		
		Set<Map.Entry<Integer , Contado>> agenda4 = new TreeSet<>( new Comparator<Map.Entry<Integer , Contado>>(){

			@Override
			public int compare(Entry<Integer, Contado> cont1, Entry<Integer, Contado> cont2)
			{
				return  Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero() );
				
			}
		}  );
				agenda4.addAll(agenda3);
				
				System.out.println(agenda4);
		
		
				/*Set<Map.Entry<Integer , Contado>> agenda5 = new TreeSet<>(Comparator.comparing(
						new Function<Map.Entry<Integer , Contado>, Integer >() {

							@Override
							public Integer apply(Entry<Integer, Contado> cont) 
							{
								
								return cont.getValue().getNumero();				
							}
				} ) );

			agenda5.addAll(agenda3);	
			System.out.println(agenda5);*/
				
				Set<Map.Entry<Integer , Contado>> agenda5 = new TreeSet<>(Comparator.comparing(
						 cont -> cont.getValue().getNumero()));				
				agenda5.addAll(agenda3);	
				System.out.println("Usando Lamba"+"--"+agenda5);
				
				
				System.out.println("Ordem nome - Contato");
				
				Set<Map.Entry<Integer, Contado>> agenda6 = new TreeSet<>(Comparator.comparing(
						nome -> nome.getValue().getNome() ));
				agenda6.addAll(agenda3);
				for ( Map.Entry<Integer , Contado> entries : agenda6)  System.out.println("Ordem nome e contato : "+
				 entries.getValue().getNome()+"--"+ entries.getValue().getNumero());
				
				
				
				
				
				
		
	}
}
	

	class Contado
	{
		private String nome ;
		private Integer numero ;
		
		public Contado(String nome, Integer numero)
		{
			super();
			this.nome = nome;
			this.numero = numero;
		}

		public String getNome()
		{
			return nome;
		}

		public Integer getNumero() 
		{
			return numero;
		}

		@Override
		public String toString() 
		{
			return "Contado [nome=" + nome + ", numero=" + numero + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(nome, numero);
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
			Contado other = (Contado) obj;
			return Objects.equals(nome, other.nome) && Objects.equals(numero, other.numero);
		}
		
	}
	
	class ComparatorNumero implements Comparator< java.util.Map.Entry<Integer, Contado > >
	{

		@Override
		public int compare(Entry<Integer, Contado> o1, Entry<Integer, Contado> o2) 
		{
			Integer comparadorInteger = o1.getValue().getNumero().compareTo(o2.getValue().getNumero());
			if(comparadorInteger !=0)return comparadorInteger;
			
			return 0;
		}
		
	}

	
	
	