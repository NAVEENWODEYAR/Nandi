package com.nandi.collectors;

import java.util.*;
import java.util.stream.*;

public class CollectorsMethods2 
{

	// 1. Averaging long: averagingLong(),Finds the average value of a collection of long values.
	static void avgLong(List<Integer> list)
	{
		System.out.println("\n It will return a double value, not long value,\n");
		Double avgLong = list.stream().collect(Collectors.averagingLong(n-> n+1));
		System.out.println("\nAverage long value in the list,"+avgLong);
	}
	
	//2. Averaging int: averagingInt(),Finds the average value of a collection of integer values.
	static void avgInt(List<Integer> list)
	{
		System.out.println("It will return a Double value, not an int value.");
		Double avgInt = list.parallelStream().collect(Collectors.averagingInt(num -> num+1));
		System.out.println("\n Average int value in the list,"+avgInt);
	}
	
	//3. Averaging Double: averagingDouble(),Finds the average value of a collection of double values.
	static void avgDouble(List<Integer> list)
	{
		Double avgDouble = list.parallelStream().collect(Collectors.averagingDouble(num-> num+1));
		System.out.println("\n Average double value in the list,"+avgDouble);
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\nCollectors is a final class that extends the Object class.\n");
	
		List<Integer> intList = List.of(1,2,3,4,5);
		System.out.println(intList);
		System.out.println("\n******\n");
		avgLong(intList);
		System.out.println("\n******\n");
		avgInt(intList);
		System.out.println("\n******\n");
		avgDouble(intList);
		System.out.println("\n******\n");
	}
}
