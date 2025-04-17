package com.employeedetails;

import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// ✅ 1. How many male and female employees are there in the organization?

public class EmployeeAnalysis {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeData.getEmployees();
		
		
		 System.out.println();
			System.out.println();			
			
			System.out.println("--------Find Highest Paid Employee In Each Department -------------");
			
			
			Map<String, Object> collect8 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
					
					
					Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));
	
	System.out.println("Highest Paid employee in each department :"+ collect8);
	
	

		Map<String, Long> data = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println("male and female employees are there in the organization :" + data);

		// male and female employees are there in the organization :{Female=5, Male=5}

		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------");

		System.out.println("name of all departments in the organization :");

		Map<String, Long> departmentCount = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println("All department count :" + departmentCount);

		// All department count :{Sales=3, Development=3, HR=2, Marketing=2}

		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------");

		System.out.println("-------name of all departments in the organization-----------");

		List<String> collect = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());

		System.out.println("Name of all the departments :" + collect);

		// Name of all the departments :[Development, Sales, HR, Marketing]

		List<String> collect2 = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());

		System.out.println();
		System.out.println();

		System.out.println("Name of the departments available :" + collect2);
		// [Development, Sales, HR, Marketing]
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		
		
		System.out.println("-------- average age of male and female employees -----------------");
		
		Map<String, Double> averageAge = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		
		
		System.out.println("Average Age :"+ averageAge);
		
		// Average Age :{Female=26.8, Male=31.8}

		System.out.println();
		System.out.println();
		
		System.out.println("--- highest paid employee in the organization ---------------");
		
		
		Optional<Employee> max = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
		
		System.out.println("Maximum salary in an organisation :"+max);
		
		
		
		Optional<Employee> min = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
		
		System.out.println("Maximum salary in an organisation :"+max);
		
		
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		
		
		System.out.println("---- names of all employees who have joined after 2015 ---------------");
		
		 employees.stream().filter(emp->emp.getSalary()>=2021).map(emp->emp.getName()).
		 
		 forEach(a->System.out.print(a));
		
		
	// 	System.out.println("Employers joined after 2015 :"+ empJoined2015);
		 
		 
		 System.out.println();
			System.out.println();
			System.out.println("-----------------------------------------------------------");
			
		 
		 System.out.println("----  Count the number of employees in each department ------");
		 
		 Map<String, Long> numberOfEmp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		 
		System.out.println("Number of employers in each department :"+ numberOfEmp);
		
		// Number of employers in each department :{Sales=3, Development=3, HR=2, Marketing=2}
		
		
		
		 System.out.println();
			System.out.println();
			System.out.println("-----------------------------------------------------------");
			
			System.out.println(" ---  average salary of each department ------------------");
			
			Map<String, Double> department = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

			System.out.println(" Average Salary : "+department);
			
			

			 System.out.println();
				System.out.println();
				System.out.println("-----------------------------------------------------------");
				
				System.out.println(" ---  second highest salary :  ------------------");
				
				
				OptionalDouble secondHighestSalary = employees.stream().mapToDouble(Employee::getSalary).distinct().sorted().limit(2).findFirst();
		
		
				System.out.println(secondHighestSalary);
				
				 System.out.println();
					System.out.println();
					System.out.println("-----------------------------------------------------------");
					
				
				
				System.out.println("---- details of the youngest male employee in the Development ------  ");
				
				
				Optional<Employee> youngestMale = employees.stream()
						.filter(e->e.getGender().equalsIgnoreCase("MALE") && e.getDepartment().equals("Development"))
				        .min(Comparator.comparingInt(Employee::getAge));
		
		
				System.out.println("Youngest Male employee in the data :"+ youngestMale);
				
				// Youngest Male employee in the data :Optional[Employee{id=1, name='John', age=28, gender='Male', department='Development', salary=60000.0, joiningDate=2018-06-23}]

		
				 System.out.println();
					System.out.println();
					System.out.println("-----------------------------------------------------------");
					
					
					System.out.println("--------  most working experience in the organization ---------------------- ");
					
					
					Optional<Employee> min2 = employees.stream().min(Comparator.comparing(Employee::getSalary));
					
					
					System.out.println("Most experienced employee in the organisation :"+ min2);
					
					
					
					// Most experienced employee in the organisation :Optional[Employee{id=6, name='Sophia', age=22, gender='Female', department='Marketing', salary=40000.0, joiningDate=2021-07-19}]

		

					 System.out.println();
						System.out.println();
						System.out.println("-----------------------------------------------------------");
						
						
						System.out.println(" -----  male and female employees are there in the Sales team ------------ ");
						
						
						Map<String, Long> maleFemaleEmployers = employees.stream()
								.filter(datea->datea.getDepartment().equalsIgnoreCase("Sales"))
						        .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
						
						System.out.println(maleFemaleEmployers);
						
						// {Female=1, Male=2}
						
						
						 System.out.println();
							System.out.println();
							System.out.println("-----------------------------------------------------------");
						
						System.out.println(" ----- names of all employees in each department -------------");
						
						
						Map<String, List<String>> empDepartmentNamesPrinting = employees.stream()
								
								.collect(Collectors.groupingBy(Employee::getDepartment, 
										
										                  Collectors.mapping(Employee::getName,Collectors.toList())));
						
						
						System.out.println(empDepartmentNamesPrinting);
						
						
						// {Sales=[Alex, David, Ava], Development=[John, Jane, Chris], HR=[Emma, Liam], Marketing=[Sophia, Olivia]}

						
						// {Sales=3, Development=3, HR=2, Marketing=2}

						
						 System.out.println();
							System.out.println();
							System.out.println("-----------------------------------------------------------");
						
							System.out.println(" ----- What is the average salary and total salary of the whole organization -------------");
							
							DoubleSummaryStatistics summaryStatistics = employees.stream().mapToDouble(Employee::getSalary).summaryStatistics();
						
							System.out.println("Average Salary of employers :"+ summaryStatistics.getAverage());
							System.out.println("Total Salary of employers :"+ summaryStatistics.getCount());
							
							
							// Average Salary of employers :61800.0
//							Total Salary of employers :10
						
							
							 System.out.println();
								System.out.println();
								System.out.println("-----------------------------------------------------------");
							
								System.out.println("------------ Separate the employees who are younger or equal to 25 years"
										+ " from those employees who are older than 25 years------------------ ");
								
								
								
								Map<Boolean, List<Employee>> collect3 = employees.stream()
										                                 .collect(Collectors.partitioningBy(age->age.getAge()>=29));
								
								System.out.println("-----------------------------------------------------------");
								
								Map<Boolean, List<Employee>> collect4 = employees.stream().collect(Collectors.partitioningBy(agea->agea.getAge()<25));
								
								
								System.out.println(collect3);
								System.out.println("-----------------------------------------------------------");

								System.out.println(" employers data < 25 :"+collect4);
								System.out.println("--------------- Minimum Age --------------------------------------------");

					
		

						        Optional<Employee> youngestEmployee = employees.stream()
						                .min(Comparator.comparingInt(Employee::getAge));

						        youngestEmployee.ifPresent(System.out::println);
						        
						        
						        
						        System.out.println();
								System.out.println();
						        
						        System.out.println("---- Sorted Employees Based On Name. --------------");
						       Stream<Employee> sorted = employees.stream().sorted(Comparator.comparing(Employee:: getName));
		

						        System.out.println("Sorted employees based on name :"+ sorted.toList());
						        
						        
						        System.out.println();
								System.out.println();
								
								System.out.println("----------------Sorted based on salary -------------------------------------------");
								
								
								List<Employee> collect5 = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
								

								System.out.println("Sorted data based on salary :"+ collect5);
								
								 System.out.println();
									System.out.println(); System.out.println();
									System.out.println();
									
									
									System.out.println("------ Sorted salary and print the data in the reverse format  ------------- ");
									
									List<Employee> collect6 = employees.stream()
									.sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
							
									
									System.out.println(" Sorted salary based on reversing order :"+ collect6);

									 System.out.println();
										System.out.println();
										
										
										
										System.out.println("------------- Top 3 employers in the reverse order --------------");
										
										List<Employee> collect7 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3)
										.collect(Collectors.toList());
										
										System.out.println(" Top 3 employers sorted :"+ collect7);
									
									
									

										System.out.println("----- Count Number Of Employees with Specific Age (e.g., Age 30). -----");
										
										
										
										long count = employees.stream().filter(data1-> data1.getAge()>=30).count();
										System.out.println("Emplyers of age 30 having emplpyers count : "+count);
										
										
										
										
										
										
										System.out.println();
										System.out.println();
										
										
										
										System.out.println("--- Find Employee With Specific Name (e.g., 'John').------------");
										
										
										List<Employee> collect9 = employees.stream().filter(namee->namee.getName().equalsIgnoreCase("John"))
										.collect(Collectors.toList());
										
										System.out.println("John employee name details :"+ collect9);
										
										
										System.out.println();
										System.out.println();
										
										System.out.println("------ Find Out Max And Min Age Of Employee List. -------------");
										
										
										IntSummaryStatistics summaryStatistics2 = employees.stream().mapToInt(Employee::getAge).summaryStatistics();
												
									
										System.out.println("Maximum Age :"+summaryStatistics2.getMax());
										System.out.println("Minimum Age :"+ summaryStatistics2.getMin());
										
										
										
										System.out.println(" ------ Increase Salary By 10% For All Employees. -----------");
										
										
									List<Employee> dataaa=	employees.stream().map(employee->new Employee(
												
												employee.getId(),
												employee.getName(),
												employee.getAge(),
												employee.getGender(),
												employee.getDepartment(),
												employee.getSalary() * 1.1,
												employee.getJoiningDate()
												
												)).collect(Collectors.toList());
									
									
									System.out.println(" Salary increased by 10 % of an each employee :"+ dataaa);
									
								
								
	}

}
