package list;
import java.security.DrbgParameters.NextBytes;
import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class CoresArcoIres 
{
	public static void main(String[] args)
	{
		Set<String> cores = new HashSet<>();
		
		cores.add("azul");
		cores.add("vermelho");
		cores.add("verde");
		cores.add("amarelo");
		cores.add("laranja");
		
		System.out.println(cores.toString());
		
		int quantidadeCores = cores.size();
		System.out.println("Quantidade de cores : "+quantidadeCores);
		
		Set<String> coresTreeSet = new TreeSet<>();

		coresTreeSet.add("azul");
		coresTreeSet.add("vermelho");
		coresTreeSet.add("verde");
		coresTreeSet.add("amarelo");
		coresTreeSet.add("laranja");
		System.out.println("Cores em ordem Alfabetica : "+coresTreeSet);
		
		List<String> coresliSet = new ArrayList<>() ;
		coresliSet.add("azul");
		coresliSet.add("vermelho");
		coresliSet.add("verde");
		coresliSet.add("amarelo");
		coresliSet.add("laranja");
		Collections.reverse(coresliSet) ;
		System.out.println("cores na ordem inversa da que foi informada :  "+coresliSet   );
		
		System.out.println("Cores que começam com V : ");
		
		for (String cor : coresliSet)
		{
			if (cor.startsWith("v")) System.out.println(cor);
		}
		
		
		
		Iterator<String> iterator = coresliSet.iterator();
		
		while(iterator.hasNext())
		{
			String nextString = iterator.next();
			if(!nextString.startsWith("v")) iterator.remove();
			
		}
		
		System.out.println("Cores restantes : "+coresliSet );
		
		coresliSet.clear();
		System.out.println("Lista esta vazia ? "+ coresliSet.isEmpty());
		
		
		
	}
}
