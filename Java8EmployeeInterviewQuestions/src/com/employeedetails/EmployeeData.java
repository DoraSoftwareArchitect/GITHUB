package com.employeedetails;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "John", 28, "Male", "Development", 60000, LocalDate.of(2018, 6, 23)),
                new Employee(2, "Jane", 24, "Female", "Development", 75000, LocalDate.of(2020, 11, 15)),
                new Employee(3, "Alex", 30, "Male", "Sales", 50000, LocalDate.of(2015, 4, 10)),
                new Employee(4, "Emma", 35, "Female", "HR", 90000, LocalDate.of(2010, 1, 1)),
                new Employee(5, "Chris", 40, "Male", "Development", 85000, LocalDate.of(2005, 5, 5)),
                new Employee(6, "Sophia", 22, "Female", "Marketing", 40000, LocalDate.of(2021, 7, 19)),
                new Employee(7, "David", 29, "Male", "Sales", 45000, LocalDate.of(2019, 2, 28)),
                new Employee(8, "Olivia", 27, "Female", "Marketing", 55000, LocalDate.of(2017, 8, 22)),
                new Employee(9, "Liam", 32, "Male", "HR", 70000, LocalDate.of(2013, 3, 5)),
                new Employee(10, "Ava", 26, "Female", "Sales", 48000, LocalDate.of(2016, 10, 3))
        );
    }
}
