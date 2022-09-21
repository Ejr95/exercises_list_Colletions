package list;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UsandoStream 
{
	public static void main(String[] args)
	{
		List<String> numeros = Arrays.asList ("1","94","11","12","77","23","86","54","90","2");
		
		System.out.println("--Imprima os elementos da lista--");
		
		numeros.forEach(System.out::println);
		
		System.out.println("--Pegue os 5 primeiros números e bote dentro de um set--");
		
		numeros.stream().limit(5).collect( Collectors.toSet()).forEach(System.out::println); 
		
		System.out.println("--Transforme a lista para o tipo inteiro--");
		
		List<Integer> list =  numeros.stream()
		.map(Integer::parseInt)
		.collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("--Pegue os numeros pares e maiores que 2 e coloque em uma lista--");
		
		 numeros.stream()
		.map(Integer :: parseInt)
		.filter(n -> n>2 && n%2==0)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		 
		System.out.println("--Informe a média--");
		 
		 numeros.stream()
		 .mapToInt(Integer :: parseInt)
		 .average()
		 .ifPresent(System.out::println);
		
		 System.out.println("--Remova os valores impares--");
		 
		 list.removeIf( n -> n%2 !=0 );
		 System.out.println(list);
		 
		 
	}
	

}
