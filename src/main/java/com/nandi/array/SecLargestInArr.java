package com.nandi.array;

import java.util.Arrays;

public class SecLargestInArr 
{
	static void secLargest(int[] names)
	{
		int largest = 0;
		int secLargest = 0;
		
		for(int i=0; i<names.length; i++)
		{
			if(names[i] > largest)
			{
				secLargest = largest;
				largest = names[i];
			}
			else if(names[i] > secLargest)
			{
				secLargest = names[i];
			}
		}
		System.out.println("\n 1. Largest element in the array," +largest+"\n 2. Second largest element in the array,"+secLargest);
	}
	public static void main(String[] args)
	{
		System.out.println("\n Collection of homogenous elements stored in contiguos memory locations\n");
		int[] marks = new int[5];
		for(int i=0; i<5; i++)
		{
			marks[i]= i; 
		}
		System.out.println(Arrays.toString(marks));
		secLargest(marks);
	}

}
