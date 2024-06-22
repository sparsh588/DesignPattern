package FactoryDesignPattern;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = EmployeeFactory.getEmployee("Web Developer");
		System.out.println(emp1.getSalary());
		Employee emp2 = EmployeeFactory.getEmployee("Backend Developer");
		System.out.println(emp2.getSalary());

	}

}
