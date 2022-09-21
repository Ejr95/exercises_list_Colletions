/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

package list;

import java.util.*;

public class CalculadorDeTemperatura 
{
	public static void main(String[] args)
	{
		List<Double> mediaTemperatura = new ArrayList<>();
		
		mediaTemperatura.add(30d);
		mediaTemperatura.add(20d);
		mediaTemperatura.add(18d);
		mediaTemperatura.add(35d);
		mediaTemperatura.add(34d);
		mediaTemperatura.add(32d);
		
		Iterator<Double> iterator = mediaTemperatura.iterator();
		double soma =0;
		while(iterator.hasNext())
		{
			double next = iterator.next();
			 soma += next;
					
		}
		double media = soma/6;
		System.out.println(media);
		
		  System.out.print("Temperaturas acima da média: ");
		  
		mediaTemperatura.stream().filter( temperatura -> temperatura > media)
		.forEach(temperatura -> System.out.printf("%.2f\n", temperatura));
		
		int cont = 0;
		
		 System.out.println("\n\nMeses das temperaturas acima da média: ");
		 
	        Iterator<Double> iteratorDois = mediaTemperatura.iterator();
		while(iteratorDois.hasNext())
		{
			double next = iteratorDois.next();
			
			if(next>media)
			{
			switch (cont)
			{
				case 0 :
					 System.out.printf("1 - janeiro: %.1f\n ", next);
                     break;
                case 1 : 
                	System.out.printf("2 - fevereiro: %.1f\n", next);
                    break;
                case 2 : 
                	System.out.printf("3 - março: %.1f\n", next);
                    break;
                case 3 : 
                	 System.out.printf("4 - abril: %.1f\n", next);
                     break;
                case 4 :
                	 System.out.printf("5 - maio: %.1f\n", next);
                     break;
                case 5 :
                	 System.out.printf("6 - junho: %.1f\n", next);
                     break;
                default:
                	 System.out.println("Não houve temperatura acima da média.");
			}
			
			}	
			cont++;	
		}
			
		
		
	
		
		
		
		
		
		
		
	}
}
