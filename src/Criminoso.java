package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
public class Criminoso 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		List <String> respostas = new ArrayList<>();
		System.out.println("\"Telefonou para a vítima?\"");
		respostas.add(scanner.next().toUpperCase()  );
		
		System.out.println("\"Esteve no local do crime?\"");
		respostas.add(scanner.next().toUpperCase());
		
		System.out.println("\"Mora perto da vítima?\"");
		respostas.add(scanner.next().toUpperCase());
		
		System.out.println("\"Devia para a vítima?\"");
		respostas.add(scanner.next().toUpperCase());
		
		System.out.println("\"Já trabalhou com a vítima?\"");
		respostas.add(scanner.next().toUpperCase());
		
		Iterator<String> it = respostas.iterator();
		
		int contSim =0;
		int contNao = 0;
		while(it.hasNext())
		{
			String next = it.next();
			
			if(next.equals("SIM") )
			{
				contSim++;
			}
			
			
		}
		
		if(contSim == 2)
		{
			System.out.println("Suspeita");
		}else if (contSim >2 & contSim <=4)
		{
			System.out.println("Cúmplice");
		}else if (contSim==5)
		{
			System.out.println("Assassina");
		}
		else 
		{
			System.out.println("Inocente");
		}
		
		
		
		
		
	}

}
