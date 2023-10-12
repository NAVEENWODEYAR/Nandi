package com.nandi.collectors;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class CollectorsMethods4 
{
	// 1. Creating Map: toMap()
	static void mapUsingColln(List<Integer> list)
	{
		System.out.println("\nA Map is an object that maps keys to values.\n");
		Map<Integer, Integer> intMap = list.stream().collect(Collectors.toMap(Function.identity(), Integer::intValue));
		System.out.println(intMap);
	}
	
	// 2. Summing Integers: summingInt()
	static void sumOfInt(List<Integer> list)
	{
		Integer sum = list.stream().collect(Collectors.summingInt(n->n));
		System.out.println("Sum of numbers present in the list,"+sum);
	}
	
	// 3. Summarizing Integer: summarizingInt()
	static void summary(List<Integer> list)
	{
		System.out.println("\nIt gives all the major arithmetic operation values of the values present in the collection like the average of all values, "
				+ "minimum value, maximum values, count, and sum of all values.\n");
		
		DoubleSummaryStatistics summary = list.parallelStream().collect(Collectors.summarizingDouble(n->n));
		System.out.println("\n1 Sum of the list->"+summary.getSum());
		System.out.println("\n2 Minimum value of the list->"+summary.getMin());
		System.out.println("\n3 Maximun value of the list->"+summary.getMax());
		System.out.println("\n4 Average vale of the list->"+summary.getAverage());
		System.out.println("\n5 Sum of elements in the list->"+summary.getCount());
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\nCollectors is a final class that extends the Object class.\n");
	
		List<Integer> intList = List.of(1,2,3,4,5);
		System.out.println(intList);
		System.out.println("\n******\n");
		mapUsingColln(intList);
		System.out.println("\n******\n");
		sumOfInt(intList);
		summary(intList);
	}
}
