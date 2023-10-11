package com.nandi.collectors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsMethods 
{

	private static LinkedList<Integer> collect;

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
	
	// 3. toCollection(),We can accumulate data in any specific collection as well.
	static void collnUsingStream(List<Integer> lst)
	{
		System.out.println("\n" +lst+" \n");
		var arrLst = lst.stream().collect(Collectors.toCollection(ArrayList<Integer>::new));
		System.out.println(arrLst);
	}
	
	// 4.Counting elements: Counting()
	static void countElements(List<Integer> lst)
	{
		System.out.println("\n" +lst+" \n");
		Long collect2 = lst.parallelStream().collect(Collectors.counting());
		System.out.println(collect2);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\nCollectors is a final class that extends the Object class.\n");
		System.out.println("\nIt provides reduction operations, such as accumulating elements into collections, summarizing elements according to various criteria, etc."
				+ "\n Java Collectors class provides various methods to deal with elements.n");
		
		List<Integer> intList = List.of(1,2,3,4,5,4,3,2);
//		System.out.println("\n******\n");
//		listFromcolln(intList);
//		System.out.println("\n******\n");
//		setFromColln(intList);
//		System.out.println("\n******\n");
//		collnUsingStream(intList);
		System.out.println("\n******\n");
		countElements(intList);
		System.out.println("\n******\n");
		System.out.println("\n******\n");
	}

}
