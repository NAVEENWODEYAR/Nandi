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
	
	public static void main(String[] args) 
	{
		System.out.println("\nCollectors is a final class that extends the Object class.\n");
	
		List<Integer> intList = List.of(1,2,3,4,5);
		System.out.println(intList);
		System.out.println("\n******\n");
		mapUsingColln(intList);
		System.out.println("\n******\n");
		sumOfInt(intList);
	}
}
