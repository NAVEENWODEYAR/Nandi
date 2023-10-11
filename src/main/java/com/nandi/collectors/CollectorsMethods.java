package com.nandi.collectors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsMethods 
{

	//1. toList(),It is used to accumulate elements into a list. It will create a new list (It will not change the current list).
	static void listFromcolln(List<Integer> list)
	{
		System.out.println("\n" +list+" \n");
		list.stream()
			.map(num -> num+10)
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}
	
	// 2. toSet(), It is used to accumulate elements into a set, It will remove all the duplicate entries.
	static void setFromColln(List<Integer> intList)
	{
		System.out.println("\n" +intList+" \n");
		Set<Integer> collect = intList.stream().collect(Collectors.toSet());
		System.out.println("\n" +collect+" \n");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\nCollectors is a final class that extends the Object class.\n");
		System.out.println("\nIt provides reduction operations, such as accumulating elements into collections, summarizing elements according to various criteria, etc."
				+ "\n Java Collectors class provides various methods to deal with elements.n");
		
		List<Integer> intList = List.of(1,2,3,4,5,4,3,2);
		System.out.println("\n******\n");
		listFromcolln(intList);
		System.out.println("\n******\n");
		setFromColln(intList);
		System.out.println("\n******\n");
	}

}
