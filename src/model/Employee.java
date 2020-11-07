package model;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary = 300_000.0;
    private boolean isArmenian;
    private int birthDate;
    private String position;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate){
        //At the age of 65, the employee will be retired.
        if(birthDate >= 1955){
            this.birthDate = birthDate;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isArmenian() {
        return isArmenian;
    }

    public void setArmenian(boolean armenian) {
        isArmenian = armenian;
    }

    public void printEmployeeFullName() {
        System.out.println("The employee full name is: " + firstName + " " + lastName);
    }
}
