package main;

import model.Employee;

public class Main {

    public static void main(String[] args) {

        //Bubble sort (analyze and implement bubble sort)
        int[] array = {5, 1, 9, 3, 8, 2};

        System.out.print("\nBubble sort the following array: ");
        for(int x: array){
            System.out.print(x + " ");
        }

        System.out.print("\nThe bubble sorted array is: ");

        int temp = 0;

        for(int i=0;i<array.length;i++) {
            for (int j = 1; j < array.length-i; j++) {
                if (array[j-1] > array[j]) {
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int x: array){
            System.out.print(x + " ");
        }

        System.out.println("\n");

        //Create Logical Structures (As big as possible) from your life and print them in main function.

        Employee employee = new Employee();

        employee.setFirstName("Maga");
        System.out.println("The employee first name is: " + employee.getFirstName());
        System.out.println("The employee last name is: " + employee.getLastName());
        employee.setLastName("SH");

        System.out.println("The employee full name is: " + employee.getFirstName() + " " + employee.getLastName());
        //or
        employee.printEmployeeFullName();

        System.out.println("\nThe employee salary is " + employee.getSalary());
        employee.setSalary(600_000.0);
        System.out.println("The employee salary is " + employee.getSalary());

        System.out.println("\nThe employee is Armenian? statement is " + employee.isArmenian());
        employee.setArmenian(true);
        System.out.println("The employee is Armenian? statement is " + employee.isArmenian());

        System.out.println();

        Employee employee2 = new Employee();
        employee2.setFirstName("Sos");
        employee2.setLastName("Matevosyan");

        employee.printEmployeeFullName();
        employee2.printEmployeeFullName();

        System.out.println("\nThe employee was born in " + employee.getBirthDate());
        employee.setBirthDate(-12);
        System.out.println("The employee was born in " + employee.getBirthDate());
        employee.setBirthDate(1991);
        System.out.println("The employee was born in " + employee.getBirthDate());

        System.out.println("\nThe employee position is: " + employee.getPosition());
        employee.setPosition("QA Engineer");
        System.out.println("The employee position is: " + employee.getPosition());
    }
}
