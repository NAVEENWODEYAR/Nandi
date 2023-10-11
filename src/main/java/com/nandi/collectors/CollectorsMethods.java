package com.nandi.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsMethods 
{

	// toList()
	static void listFromcolln(List<Integer> list)
	{
		System.out.println("\n" +list+" \n");
		list.stream()
			.map(num -> num+10)
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\nCollectors is a final class that extends the Object class.\n");
		System.out.println("\nIt provides reduction operations, such as accumulating elements into collections, summarizing elements according to various criteria, etc."
				+ "\n Java Collectors class provides various methods to deal with elements.n");
		
		List<Integer> intList = List.of(1,2,3,4,5);
		System.out.println("\n******\n");
		listFromcolln(intList);
	}

}
