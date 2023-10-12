package com.nandi.collectors;

import java.util.*;
import java.util.stream.*;

public class CollectorsMethods2 
{

	// 1. Averaging long: averagingLong(),Finds the average value of a collection of long values.
	static void averageInList(List<Integer> list)
	{
		System.out.println("\n It will return a double value, not long value,\n");
//		Double avg = list.stream().collect(Collectors.averagingLong(n-> n*2));
		Double avg = list.stream().collect(Collectors.averagingLong(null));
		System.out.println("\nAverage value in the list,"+avg);
	}
	public static void main(String[] args) 
	{
		System.out.println("\nCollectors is a final class that extends the Object class.\n");
	
		List<Integer> intList = List.of(1,2,3,4,5);
		System.out.println("\n******\n");
		averageInList(intList);
		System.out.println("\n******\n");
		System.out.println("\n******\n");
		System.out.println("\n******\n");
	}
}
