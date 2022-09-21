package list;
import java.security.KeyStore.Entry;
import java.util.*;

public class Map 
{
	

	public static void main(String[] args)
	{
		
		HashMap<String, Double> carrosHashMap = new HashMap<>();
		carrosHashMap.put("Uno", 10.2);
		carrosHashMap.put("Ford", 17.2);
		carrosHashMap.put("Volvo", 19.2);
		carrosHashMap.put("Fiesta", 14.2);
		carrosHashMap.put("Mobi", 9.2);
		
		System.out.println("-------------Exibindo modelos-------"+ carrosHashMap.keySet());
		
		System.out.println("Modelo mais econômico");
		
		Double valorMaisEco = Collections.min(carrosHashMap.values());
		
	   Set<java.util.Map.Entry<String, Double>> entries = carrosHashMap.entrySet();
		
		for ( java.util.Map.Entry<String, Double> entry : entries)
		{
			if(entry.getValue().equals(valorMaisEco)) System.out.println("Modelo mais Eco :"+ entry.getKey()+" "+ entry.getValue()  );
		}
		
		System.out.println("---------Modelo menos economico-----");
		
		double valorMenosEco = Collections.max(carrosHashMap.values());
		 Set<java.util.Map.Entry<String, Double>> entries2 =carrosHashMap.entrySet();
		
		 for (java.util.Map.Entry<String, Double> entry : entries2) 
		 {
			if(entry.getValue().equals(valorMenosEco) ) System.out.println("Modelo menos economico : "+ entry.getKey() +"---"+entry.getValue() );
		 }
		
		 System.out.println("Soma dos consumos : ");
		 
		 Iterator<Double> iterator = carrosHashMap.values().iterator();
		 double soma = 0;
		 while(iterator.hasNext())
		 {
			 double next = iterator.next();
			 soma +=next;
		 }
		 System.out.println("Soma dos consumos : "+ soma);
		 
		 System.out.println("-----Removendo modelo com consumo maior que 19---");
		 
		 Iterator<Double> iterator2 = carrosHashMap.values().iterator();
		
		 while(iterator2.hasNext())
		 { 
			 if( iterator2.next().equals(19.2) ) iterator2.remove(); 
			 
		 }
		 
		 System.out.println("=====Modelos restantes===="+carrosHashMap);
		 
		 
		 
		
	}
}
