package FactoryDesignPattern;

public class BackendDeveloper implements Employee {

	@Override
	public int getSalary() {
		System.out.println("Backend Developer");
		return 50000;
	}

}
