package com.nandi.collectors;

import java.util.*;
import java.util.stream.*;

public class CollectorsMethods1 
{

	// 1.Partitioning a list: partitioningBy(),It is used for partitioning a list into 2 lists and adding it to the map, 1 that satisfies a given condition and another which does not satisfy 
	static void oddEvenList(List<Integer> lst)
	{
		System.out.println("Original list\n");
		Map<Boolean, List<Integer>> intList = lst.stream().collect(Collectors.partitioningBy(num -> num%2 == 0));
		System.out.println(intList);
	}
	
	// 2. Creating unmodifiable list: toUnmodifiableList()
	static void unmodifiableLst(List<Integer> lst)
	{
		System.out.println("Original list\n");
		lst.iterator().forEachRemaining(System.out::println);
		
		List<Integer> unmodifiableList = lst.parallelStream().distinct().collect(Collectors.toUnmodifiableList());
		try 
		{
			unmodifiableList.add(2);
		} 
		catch (Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	// 3. Creating unmodifiable set: toUnmodifiableSet().,
	static void unmodifiableLSet(List<Integer> list)
	{
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		set.add(34);
		System.out.println(set);
		System.out.println("***********\n");
		Set<Integer> unmodifiableLSet = list.parallelStream().collect(Collectors.toUnmodifiableSet());
		System.out.println(unmodifiableLSet);
	}
	
	// 4.Joining elements: joining()
	static void strJoining()
	{
		List<String> names = Arrays.asList("Ammie","Bailey","Candy","Denly");
		System.out.println("\n"+names+"\n");
		String collect = names.stream().collect(Collectors.joining(",", "{", "}"));
		System.out.println("After joining the string"+collect);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\nCollectors is a final class that extends the Object class.\n");
	
		List<Integer> intList = List.of(1,2,3,4,5,4,3,21);
		System.out.println("\n******\n");
		oddEvenList(intList);
		System.out.println("\n******\n");
		unmodifiableLst(intList);
		System.out.println("\n******\n");
		unmodifiableLSet(intList);
		System.out.println("\n******\n");
		strJoining();
	}
}
