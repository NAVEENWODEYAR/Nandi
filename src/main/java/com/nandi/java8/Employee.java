package com.nandi.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee
{
	   private int empId;
	   private String empName;
	   private int empAge;
	   private String empGender;
	   private String empDepartment;
	   private int empYearOfJoining;
	   private double empSalary;
}
