package com.nandi.java8;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeImpl
{
	public static void main(String[] args) 
	{
		System.out.println("\n*** Employee Management System ******");
//		List<Employee> employeeList = new ArrayList<>(50);
		var employeeList = new ArrayList<Employee>();
		
			employeeList.add(new Employee(111, "Jolly", 18, "Female", "HR", 2011, 25000.0));
			employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
			employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
			employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
			employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
			employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
			employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
			employeeList.add(new Employee(188, "Wade", 31, "Male", "Product Development", 2015, 34500.0));
			employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
			employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
			employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
			employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
			employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
			employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
			employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
			employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
			employeeList.add(new Employee(277, "Vasu", 25, "Male", "Product Development", 2012, 125700.0));
	
//			employeeList.forEach(System.out::println);
			/**
			//  1.How many male and female employees are there in the organization?
				System.out.println("\n Gender count in the organization,");
					Map<String, Long> genderCount = employeeList.stream()
										.collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.counting()));
				System.out.println(genderCount);
			
			// 2. Print the name of all departments in the organization?
				System.out.println("\n Departments available in the organization,");
						employeeList.stream()	
									.map(Employee::getEmpDepartment)
									.distinct()
									.forEach(System.out::println);
			
			// 3. What is the average age of male and female employees?
				System.out.println("\n Average age of employees");
					Map<String, Double> avgAge = employeeList.parallelStream()
										.collect(Collectors.groupingBy(Employee::getEmpGender,Collectors.averagingDouble(Employee::getEmpAge)));
				System.out.println(avgAge);
			
			// 4.Get the details of highest paid employee in the organization?
				System.out.println("\n Highest paid employee in the organization,");
					Optional<Employee> maxSal = employeeList.stream().max(Comparator.comparing(Employee::getEmpSalary));
						System.out.println(maxSal.get());
				
				
			// 5. Get the names of all employees who have joined after 2015?	
				System.out.println("\n Employees joined after 2015");
					employeeList.parallelStream()
									.filter(emp -> emp.getEmpYearOfJoining() > 2015)
									.map(emp-> emp.getEmpName())
									.forEach(System.out::println);
			*/
			// 6. Count the number of employees in each department?
				System.out.println("\n Employees count in each department,");
					employeeList.parallelStream()	
									.collect(Collectors.groupingBy(Employee::getEmpDepartment, Collectors.counting()))
									.entrySet()
									.forEach(System.out::println);
	
	}
}
