import java.util.Scanner;

class Employee {                                    // Experiment 06
    //Defining the employee class with atttributes
    int employee_id;
    String employee_name;
    double employee_sal;
    int employee_age;

    //Static variable to keep track of the total number of employees
    private static int totalEmployees = 0;

    //Constructor to initialize an employee object and to increase the count
    public Employee() {
        totalEmployees++;
    }

    //Instance method to accept employee details
    public void acceptEmployeeDetails(Scanner scanner) {
        
        // Employee ID +Validation
        while (true) {
            System.out.print("Enter Employee ID: ");
            try {
                this.employee_id = Integer.parseInt(scanner.nextLine());
                break; // Exit loop if successful
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter Valid Integer for ID");
            }
        }

        //Employee Name
        System.out.print("Enter Employee Name: ");
        this.employee_name = scanner.nextLine();

        // Employee Salary + Validation
        while (true) {
            System.out.print("Enter Employee Salary: ");
            try {
                this.employee_sal = Double.parseDouble(scanner.nextLine());
                break; // Exit loop if successful
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for the salary.");
            }
        }

        // Employee Age + Validation
        while (true) {
            System.out.print("Enter Employee Age: ");
            try {
                this.employee_age = Integer.parseInt(scanner.nextLine());
                break; // Exit loop if successful
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for the age.");
            }
        }
    }

    //  Instance method to display all employee details
    public void displayEmployeeDetails() {
        System.out.println("-------------------------------------------");
        System.out.println("Employee ID: " + this.employee_id);
        System.out.println("Employee Name: " + this.employee_name);
        System.out.println("Employee Salary: " + this.employee_sal);
        System.out.println("Employee Age: " + this.employee_age);
    }

    //  Static method to print the total count of employees
    public static void printTotalCount() {
        System.out.println("------------------------------------");
        System.out.println("Total number of employees: " + totalEmployees);
    }

    // Instance method to increment salary by Rs. 20000
    public void incrementSalary() {
        this.employee_sal += 20000;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEmployees = 0;
        // Validating the number of employees
        while (true) {
            System.out.print("Enter the number of employees: ");
            try {
                numEmployees = Integer.parseInt(scanner.nextLine());
                if (numEmployees > 0) {
                    break; // Exit loop if input is a positive integer
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        //Creation of array of employee objects
        Employee[] employees = new Employee[numEmployees];

        // Loop to create and accept details for each employee object
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("\nEntering details for Employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].acceptEmployeeDetails(scanner);
        }

        // Display all employee details
        System.out.println("\n----- Displaying All Employee Details -----");
        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
        }

        // Total count of employees
        Employee.printTotalCount();

        // Salary Increment for all employee
        System.out.println("\n----- Incrementing Salary by Rs. 20000 -----");
        for (Employee emp : employees) {
            emp.incrementSalary();
        }

        // Updated Info of All Employees
        System.out.println("\n----- Displaying Updated Employee Details -----");
        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
        }

        scanner.close();
    }
}
