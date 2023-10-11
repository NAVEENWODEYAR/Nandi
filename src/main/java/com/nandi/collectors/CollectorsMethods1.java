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
	
	public static void main(String[] args) 
	{
		System.out.println("\nCollectors is a final class that extends the Object class.\n");
	
		List<Integer> intList = List.of(1,2,3,4,5,4,3,2);
		System.out.println("\n******\n");
		oddEvenList(intList);
		System.out.println("\n******\n");
		System.out.println("\n******\n");
	}

}
